package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_Thirty_Foru extends Activity{

	TextView thirty_four_txt1;
	TextView thirty_four_txt2;
	TextView thirty_four_txt4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_thirty_four);
		
		TextView text = (TextView)findViewById(R.id.txt_step_4_title);
		TextView text2 = (TextView)findViewById(R.id.thirty_four_txt3);
		TextView txt_text = (TextView)findViewById(R.id.txt_text4);
		ImageButton thirty_four_BtnNext = (ImageButton)findViewById(R.id.thirty_four_BtnNext);
		
		String str = getString(R.string.step_4_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#FFB90F")), 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);
		
		String str2 = getString(R.string.thirty_four_txt3);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 65, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		text2.setText(sps2);
		
		thirty_four_txt1 = (TextView)findViewById(R.id.thirty_four_txt1);
		thirty_four_txt2 = (TextView)findViewById(R.id.thirty_four_txt2);
		thirty_four_txt4 = (TextView)findViewById(R.id.thirty_four_txt4);
		
		thirty_four_txt1.setText("���������� �ڻ� ������ ���ӵȴٸ�...                              ");
		thirty_four_txt2.setText("���� ģ���� ����, _______ģ���� ���� �� �ִ� ����� ���� ������ �ʿ����� �˷��� ���Դϴ�.");
		thirty_four_txt4.setText("�̷� ������ ��� ������ �� �ֽ��ϴ�.\n�׷��� ���� _______ģ���� �����̳� ģ������ �������� ���� ���ϰ� �ֽ��ϴ�.");
		
		thirty_four_BtnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_Thirty_Five.class);
				startActivity(intent);
				finish();
			}
		});
		
	}
	
}
