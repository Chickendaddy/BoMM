package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_SixTeen extends Activity {

	ImageButton BtnNext;
	ImageButton BtnPrev;
	Handler mHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.page_sixteen);

		TextView textView = (TextView) findViewById(R.id.textView1);

		textView.setText("���ݺ���\n\n�� ������ ���İ� �����\n\n�� �����ΰ� �����ϱ� ����\n\n'�� ������ �극��ũ��'\n\n�����ڽ��ϴ�.\n\n"
				+ "�� ������ �극��ũ��\n\n �� 6�ܰ�� �̷���� �ֽ��ϴ�.\n\n");
		
		
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

		BtnNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
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
