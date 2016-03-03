package com.example.btntest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_Twenty extends Activity {

	ImageButton BtnNext;
	ImageButton BtnPrev;
	Handler mHandler;
	
	Button twenty_nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_twenty);
		//BtnNext = (ImageButton) findViewById(R.id.BtnNext);
		//BtnPrev = (ImageButton) findViewById(R.id.BtnPrev);
		mHandler = new Handler();

		TextView text = (TextView) findViewById(R.id.txt_step_1_topic);
		TextView txt_text = (TextView) findViewById(R.id.txt_text);
		final EditText edit_input = (EditText) findViewById(R.id.edit_input);
		
		twenty_nextBtn = (Button)findViewById(R.id.twenty_nextBtn);

		String str = getString(R.string.step_1_topic);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#c44e42")), 0, 26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);

		SpannableStringBuilder sps1 = new SpannableStringBuilder();
		String str2 = getString(R.string.step_20_text);
		ss = new SpannableString(str2);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#c44e42")), 0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps1.append(ss);
		txt_text.setText(sps1);

		txt_text.setBackgroundColor(Color.WHITE);
		edit_input.setBackgroundColor(Color.WHITE);
		
		twenty_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if (edit_input.getText().toString().equals("")) {

					DialogSimple();

				} else {

					Intent intent = new Intent(getApplicationContext(), Page_Twenty_Two.class);
					startActivity(intent);
					overridePendingTransition(R.anim.slide_in_right, 0);
					finish();

				}
				
			}
		});
/*
		BtnPrev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_left, 0);
				finish();

			}
		});

		BtnNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (edit_input.getText().toString().equals("")) {

					DialogSimple();

				} else {

					Intent intent = new Intent(getApplicationContext(), Page_Twenty_Two.class);
					startActivity(intent);
					overridePendingTransition(R.anim.slide_in_right, 0);
					finish();

				}

			}
		});
		
		*/
		
	}

	private void DialogSimple() {

		AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		alt_bld.setMessage("조금 더 생각해본 후 작성해 볼까요?").setCancelable(false)
				.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int id) {

						dialog.cancel();
					}

				}).setNegativeButton("OK", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

						Intent intent = new Intent(getApplicationContext(), Page_Twenty_Two.class);
						startActivity(intent);
						overridePendingTransition(R.anim.slide_in_right, 0);
						finish();

					}
				});
		AlertDialog alert = alt_bld.create();
		// Title for AlertDialog
		// alert.setTitle("Title");
		// Icon for AlertDialog

		alert.show();

	}
}
