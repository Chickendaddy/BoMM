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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_Twenty_Two extends Activity {

	ImageButton BtnNext;
	ImageButton BtnPrev;
	Handler mHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.page_twenty_two);
		BtnNext = (ImageButton) findViewById(R.id.BtnNext);
		BtnPrev = (ImageButton) findViewById(R.id.BtnPrev);
		mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {
			// Do Something
			@Override
			public void run() {
				// TODO Auto-generated method stub
				BtnPrev.setVisibility(View.INVISIBLE);
				BtnNext.setVisibility(View.INVISIBLE);
			}
		}, 2000); // 1000ms

		TextView text = (TextView) findViewById(R.id.txt_step_1_topic);
		TextView txt_text = (TextView) findViewById(R.id.txt_text);
		TextView txt_text2 = (TextView) findViewById(R.id.textView22);
		final EditText edit_input = (EditText) findViewById(R.id.edit_input);

		String str = getString(R.string.step_1_topic);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#c44e42")), 0, 26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);

		txt_text.setText(
				"혹시 _______친구가 앞으로 이런 상황에 노출되거나\n 감정이 들 때 자살 생각이 불현듯 들 수 있습니다.\n\n 이 때 '아, 이런 감정들이 또 드네.. 혹시 나도 모르게 나 자신을 해치려는 행동으로 이어"
						+ "질 수 있어'라고 스스로 생각해 보는 것이 중요합니다.\n\n");
		txt_text2.setText("이런 생각에서 벗어나고 싶을 때 \n\n 즉시 할 수 있는 \n\n ______친구만의 방법이 무엇인지 \n\n 2단계에서 함께 생각해 볼까요?");

		txt_text.setBackgroundColor(Color.WHITE);

		BtnPrev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(getApplicationContext(), Page_Twenty.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_left, 0);
				finish();

			}
		});

		BtnNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), Page_Twenty_Three.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();

			}
		});
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub

		int action = event.getAction();

		switch (action) {

		case MotionEvent.ACTION_DOWN: // 화면을 터치했을때
			BtnPrev.setVisibility(View.VISIBLE);
			BtnNext.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_UP: // 화면을 터치했다 땠을때
			BtnPrev.setVisibility(View.VISIBLE);
			BtnNext.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_MOVE: // 화면을 터치하고 이동할때
			BtnPrev.setVisibility(View.VISIBLE);
			BtnNext.setVisibility(View.VISIBLE);
			break;

		}
		mHandler.postDelayed(new Runnable() {
			// Do Something
			@Override
			public void run() {
				// TODO Auto-generated method stub
				BtnPrev.setVisibility(View.INVISIBLE);
				BtnNext.setVisibility(View.INVISIBLE);
			}
		}, 2000); // 1000ms
		return super.onTouchEvent(event);
	}

}
