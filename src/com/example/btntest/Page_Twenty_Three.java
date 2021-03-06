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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_Twenty_Three extends Activity {

	TextView txt_title;
	TextView txt_text;
	TextView txt_text2;
	DialogInterface mPopupDlg = null;
	Button btn;
	ImageButton btn_next;
	ImageButton btn_prev;

	EditText edit1;
	EditText edit2;

	Handler mHandler;

	Button twenty_three_examBtn;
	Button twenty_three_nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_twenty_three);

		mHandler = new Handler();
		// btn_next = (ImageButton) findViewById(R.id.btn_next);
		// btn_prev = (ImageButton) findViewById(R.id.btn_prev);

		txt_title = (TextView) findViewById(R.id.txt_step_2_title);
		txt_text = (TextView) findViewById(R.id.txt_text);
		txt_text2 = (TextView) findViewById(R.id.text_info);

		// btn = (Button) findViewById(R.id.button1);

		edit1 = (EditText) findViewById(R.id.editText1);
		edit2 = (EditText) findViewById(R.id.editText2);

		twenty_three_examBtn = (Button) findViewById(R.id.twenty_three_examBtn);
		twenty_three_nextBtn = (Button) findViewById(R.id.twenty_three_nextBtn);

		// String name = Globals.getInstance().getName();
		String name = "null";

		String str = getString(R.string.step_2_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 8, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		txt_title.setText(sps);

		String str1 = getString(R.string.step_2_text_part1);
		SpannableStringBuilder sps1 = new SpannableStringBuilder();
		SpannableString ss1 = new SpannableString(str1);
		ss1.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 20, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 20, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps1.append(ss1);
		txt_text.setText(sps1);
		txt_text.append(name);
		txt_text.append(getString(R.string.step_2_text_part2));

		StringBuilder strBuild = new StringBuilder(getString(R.string.step_2_text_part3));
		strBuild.insert(32, name);

		txt_text2.setText(strBuild);

		txt_text.setBackgroundColor(Color.WHITE);
		txt_text2.setBackgroundColor(Color.WHITE);

		twenty_three_nextBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (edit1.getText().toString() != null && edit2.getText().toString() != null) {
					Globals.getInstance().setList_1(edit1.getText().toString());
					Globals.getInstance().setList_2(edit2.getText().toString());
				}

				Intent intent = new Intent(Page_Twenty_Three.this, Step2_two.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();

			}
		});
		/*
		 * btn_next.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub
		 * 
		 * if (edit1.getText().toString() != null && edit2.getText().toString()
		 * != null) {
		 * Globals.getInstance().setList_1(edit1.getText().toString());
		 * Globals.getInstance().setList_2(edit2.getText().toString()); }
		 * 
		 * Intent intent = new Intent(Page_Twenty_Three.this, Step2_two.class);
		 * startActivity(intent);
		 * overridePendingTransition(R.anim.slide_in_right, 0); finish();
		 * 
		 * } });
		 * 
		 * btn_prev.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View arg0) { // TODO Auto-generated
		 * method stub
		 * 
		 * Intent intent = new Intent(Page_Twenty_Three.this,
		 * Page_Twenty_Two.class); startActivity(intent);
		 * overridePendingTransition(R.anim.slide_left, 0); finish();
		 * 
		 * } });
		 * 
		 */

		twenty_three_examBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				LayoutInflater inflater = getLayoutInflater();
				final View dialogView = inflater.inflate(R.layout.ex_dialog, null);
				dialogView.setBackgroundColor(Color.WHITE);
				Button exit_examBtn = (Button) dialogView.findViewById(R.id.exit_examBtn);

				exit_examBtn.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						mPopupDlg.dismiss();
					}
				});

				AlertDialog.Builder buider = new AlertDialog.Builder(v.getContext()); // AlertDialog.Builder

				buider.setView(dialogView); //

				AlertDialog dialog = buider.create();

				dialog.setCanceledOnTouchOutside(false);
				mPopupDlg = buider.show();
			}
		});

	}
	/*
	 * @Override public boolean onTouchEvent(MotionEvent event) { // TODO
	 * Auto-generated method stub
	 * 
	 * int action = event.getAction();
	 * 
	 * switch (action) {
	 * 
	 * case MotionEvent.ACTION_DOWN: // 화면을 터치했을때
	 * btn_prev.setVisibility(View.VISIBLE);
	 * btn_next.setVisibility(View.VISIBLE); break;
	 * 
	 * case MotionEvent.ACTION_UP: // 화면을 터치했다 땠을때
	 * btn_prev.setVisibility(View.VISIBLE);
	 * btn_next.setVisibility(View.VISIBLE); break;
	 * 
	 * case MotionEvent.ACTION_MOVE: // 화면을 터치하고 이동할때
	 * btn_prev.setVisibility(View.VISIBLE);
	 * btn_next.setVisibility(View.VISIBLE); break;
	 * 
	 * } mHandler.postDelayed(new Runnable() { // Do Something
	 * 
	 * @Override public void run() { // TODO Auto-generated method stub
	 * btn_prev.setVisibility(View.INVISIBLE);
	 * btn_next.setVisibility(View.INVISIBLE); } }, 2000); // 1000ms return
	 * super.onTouchEvent(event); }
	 */
}
