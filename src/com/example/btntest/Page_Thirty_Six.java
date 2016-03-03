package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_Thirty_Six extends Activity{

	TextView thirty_six_title;
	TextView thirty_six_txt1;
	TextView thirty_six_txt3;
	
	Button thirty_six_BtnNext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_thirty_six);
		
		thirty_six_title = (TextView)findViewById(R.id.thirty_six_title);
		thirty_six_txt1 = (TextView)findViewById(R.id.thirty_six_txt1);
		thirty_six_txt3 = (TextView)findViewById(R.id.thirty_six_txt3);
		
		thirty_six_BtnNext = (Button)findViewById(R.id.thirty_six_nextBtn);
		
		//String name = Globals.getInstance().getName();
		String name = "null";
		
		String str = getString(R.string.step_4_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#FFB90F")), 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		thirty_six_title.setText(sps);
		
		String str2 = getString(R.string.thirty_six_txt1);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 63, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		thirty_six_txt1.setText(sps2);
		
		///////////////////////
		String str3 = getString(R.string.thirty_six_txt3);
		StringBuilder strBuildr = new StringBuilder(str3);
		strBuildr.insert(3, name);
		SpannableStringBuilder sps3 = new SpannableStringBuilder();
		SpannableString ss3 = new SpannableString(strBuildr);
		ss3.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 28, 45, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps3.append(ss3);
		thirty_six_txt3.setText(sps3);
		
		thirty_six_BtnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_Thirty_Seven.class);
				startActivity(intent);
				finish();
				
			}
		});
	}
}
