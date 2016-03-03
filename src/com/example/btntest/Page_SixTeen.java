package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_SixTeen extends Activity {

	Button sixteen_nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.page_sixteen);

		sixteen_nextBtn = (Button)findViewById(R.id.sixteen_nextBtn);
		
		TextView textView = (TextView) findViewById(R.id.textView1);

		textView.setText("���ݺ���\n\n�� ������ ���İ� �����\n\n�� �����ΰ� �����ϱ� ����\n\n'�� ������ �극��ũ��'\n\n�����ڽ��ϴ�.\n\n"
				+ "�� ������ �극��ũ��\n\n �� 6�ܰ�� �̷���� �ֽ��ϴ�.\n\n");

		sixteen_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();
				
			}
		});
		
	}

}
