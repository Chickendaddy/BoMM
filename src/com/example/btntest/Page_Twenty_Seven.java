package com.example.btntest;

import android.app.Activity;
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

public class Page_Twenty_Seven extends Activity {

	ImageButton btn_next;
	ImageButton btn_prev;
	Handler mHandler;
	
	Button twenty_seven_nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.page_twenty_seven);

		//btn_next = (ImageButton) findViewById(R.id.twenty_seven_BtnNext);
		//btn_prev = (ImageButton) findViewById(R.id.BtnPrev);
		mHandler = new Handler();

		TextView text = (TextView) findViewById(R.id.textView4);
		TextView txt_text = (TextView) findViewById(R.id.txt_text4);
		
		twenty_seven_nextBtn = (Button)findViewById(R.id.twenty_seven_nextBtn);
		
		//String name = Globals.getInstance().getName();
		String name = " null";

		String str = getString(R.string.step_3_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 9, 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);

		SpannableStringBuilder sps1 = new SpannableStringBuilder();
		String str2 = getString(R.string.step_27_text);
		StringBuilder strBuildr = new StringBuilder(str2);
		strBuildr.insert(365, name);
		SpannableString ss1 = new SpannableString(strBuildr);
		ss1.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 50, 71, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 90, 108, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps1.append(ss1);
		txt_text.setText(sps1);

		txt_text.setBackgroundColor(Color.WHITE);
		txt_text.setBackgroundColor(Color.WHITE);
		
		twenty_seven_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_Twenty_Eight.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();
				
			}
		});
		
/*
		btn_next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(getApplicationContext(), Page_Twenty_Eight.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();

			}
		});

		btn_prev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(getApplicationContext(), Page_Twenty_Eight.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();

			}
		});
*/
	}
/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub

		int action = event.getAction();

		switch (action) {

		case MotionEvent.ACTION_DOWN: // 화면을 터치했을때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_UP: // 화면을 터치했다 땠을때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_MOVE: // 화면을 터치하고 이동할때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		}
		mHandler.postDelayed(new Runnable() {
			// Do Something
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn_prev.setVisibility(View.INVISIBLE);
				btn_next.setVisibility(View.INVISIBLE);
			}
		}, 2000); // 1000ms
		return super.onTouchEvent(event);
	}
*/
}
