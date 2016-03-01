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
				"Ȥ�� _______ģ���� ������ �̷� ��Ȳ�� ����ǰų�\n ������ �� �� �ڻ� ������ ������ �� �� �ֽ��ϴ�.\n\n �� �� '��, �̷� �������� �� ���.. Ȥ�� ���� �𸣰� �� �ڽ��� ��ġ���� �ൿ���� �̾�"
						+ "�� �� �־�'��� ������ ������ ���� ���� �߿��մϴ�.\n\n");
		txt_text2.setText("�̷� �������� ����� ���� �� \n\n ��� �� �� �ִ� \n\n ______ģ������ ����� �������� \n\n 2�ܰ迡�� �Բ� ������ �����?");

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

		case MotionEvent.ACTION_DOWN: // ȭ���� ��ġ������
			BtnPrev.setVisibility(View.VISIBLE);
			BtnNext.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_UP: // ȭ���� ��ġ�ߴ� ������
			BtnPrev.setVisibility(View.VISIBLE);
			BtnNext.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_MOVE: // ȭ���� ��ġ�ϰ� �̵��Ҷ�
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
