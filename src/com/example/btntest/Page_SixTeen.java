package com.example.btntest;

import com.example.btntest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_SixTeen extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_sixteen);
		
		TextView textView = (TextView)findViewById(R.id.textView1);
		
		textView.setText("���ݺ���\n\n�� ������ ���İ� �����\n\n�� �����ΰ� �����ϱ� ����\n\n'�� ������ �극��ũ��'\n\n�����ڽ��ϴ�.\n\n"
				+ "�� ������ �극��ũ��\n\n �� 6�ܰ�� �̷���� �ֽ��ϴ�.\n\n");
	
	
	
	ImageButton BtnNext = (ImageButton)findViewById(R.id.BtnNext);
	
	BtnNext.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent intent = new Intent(getApplicationContext(), MainActivity.class);
    		startActivity(intent);
    		finish();
			
			}
		});
	
	}
	
}
