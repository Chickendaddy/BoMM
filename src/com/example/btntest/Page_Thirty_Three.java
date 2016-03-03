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
import android.widget.Button;
import android.widget.TextView;

public class Page_Thirty_Three extends Activity{

	TextView thirty_three_txt1;
	TextView thirty_three_txt2;
	TextView thirty_three_txt3;
	TextView thirty_three_txt4;
	
	TextView thirty_col1;
	TextView thirty_col2;
	TextView thirty_col3;
	TextView thirty_col4;
	TextView thirty_col5;
	TextView thirty_col6;
	TextView thirty_col7;
	
	Button thirty_three_nextBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_thirty_three);
		
		thirty_three_txt1 = (TextView)findViewById(R.id.thirty_three_txt1);
		thirty_three_txt2 = (TextView)findViewById(R.id.thirty_three_txt2);
		thirty_three_txt3 = (TextView)findViewById(R.id.thirty_three_txt3);
		thirty_three_txt4 = (TextView)findViewById(R.id.thirty_three_txt4);
		
		thirty_col1 = (TextView)findViewById(R.id.thirty_col1);
		thirty_col2 = (TextView)findViewById(R.id.thirty_col2);
		thirty_col3 = (TextView)findViewById(R.id.thirty_col3);
		thirty_col4 = (TextView)findViewById(R.id.thirty_col4);
		thirty_col5 = (TextView)findViewById(R.id.thirty_col5);
		thirty_col6 = (TextView)findViewById(R.id.thirty_col6);
		thirty_col7 = (TextView)findViewById(R.id.thirty_col7);
		
		thirty_three_nextBtn = (Button)findViewById(R.id.thirty_three_nextBtn);
		
		String str = getString(R.string.twenty_eight_txt1);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		thirty_three_txt1.setText(sps);
		
		String str2 = getString(R.string.twenty_eight_txt3);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		thirty_three_txt2.setText(sps2);
		
		String str3 = getString(R.string.thirty_txt1);
		SpannableStringBuilder sps3 = new SpannableStringBuilder();
		SpannableString ss3 = new SpannableString(str3);
		ss3.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps3.append(ss3);
		thirty_three_txt3.setText(sps3);
		
		String str4 = getString(R.string.thirty_txt3);
		SpannableStringBuilder sps4 = new SpannableStringBuilder();
		SpannableString ss4 = new SpannableString(str4);
		ss4.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps4.append(ss4);
		thirty_three_txt4.setText(sps4);
		
		String sequence = "¢Ã  ";
		
		thirty_col1.setText(sequence + Globals.getInstance().getList_3());
		
		if(null != Globals.getInstance().getList_4())		
			thirty_col2.setText(sequence + Globals.getInstance().getList_4());
		else	
			thirty_col2.setText(sequence);

		String personName1 = sequence + Globals.getInstance().getPersonName11() + " " + Globals.getInstance().getPersonNumber11();
		String personName2 = sequence + Globals.getInstance().getPersonName22() + " " + Globals.getInstance().getPersonNumber33();
		String personName3 = sequence + Globals.getInstance().getPersonName33() + " " + Globals.getInstance().getPersonNumber33();
		
		thirty_col3.setText(personName1);
		thirty_col4.setText(personName2);
		thirty_col5.setText(personName3);
		thirty_col6.setText(sequence + Globals.getInstance().getDo1());
		
		if(null != Globals.getInstance().getDo2())
			thirty_col7.setText(sequence + Globals.getInstance().getDo2());
		else 
			thirty_col7.setText(sequence);
		
		thirty_three_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_Thirty_Foru.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();
				
			}
		});
		
	}


}
