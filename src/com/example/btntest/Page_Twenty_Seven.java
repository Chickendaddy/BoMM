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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_Twenty_Seven extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_twenty_seven);
		
		TextView text = (TextView)findViewById(R.id.textView4);
		TextView txt_text = (TextView)findViewById(R.id.txt_text4);
		
		String str = getString(R.string.step_3_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 9, 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);
		
		SpannableStringBuilder sps1 = new SpannableStringBuilder();
		String str2 = getString(R.string.step_27_text);
		ss = new SpannableString(str2);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 50, 71, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 90, 108, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps1.append(ss);
		txt_text.setText(sps1);
		
		txt_text.setBackgroundColor(Color.WHITE);
		txt_text.setBackgroundColor(Color.WHITE);
		
		ImageButton twenty_seven_BtnNext = (ImageButton)findViewById(R.id.twenty_seven_BtnNext);
		
		twenty_seven_BtnNext.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				Intent intent = new Intent(getApplicationContext(), Page_Twenty_Eight.class);
				startActivity(intent);
				finish();
				
			}
		});
		
		
	}

	
	
}
