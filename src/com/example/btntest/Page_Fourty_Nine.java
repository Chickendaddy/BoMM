package com.example.btntest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Page_Fourty_Nine extends Activity{

	TextView fourty_nine_txt3;
	TextView fourty_nine_txt4;
	TextView fourty_nine_txt5;
	TextView fourty_nine_txt6;
	TextView fourty_nine_txt7;
	
	TextView fourty_nine_Name1;
	TextView fourty_nine_Name2;
	TextView fourty_nine_Name3;
	
	TextView fourty_nine_title1;
	TextView fourty_nine_title2;
	TextView fourty_nine_title3;
	TextView fourty_nine_title4;
	TextView fourty_nine_title5;
	TextView fourty_nine_title6;
	
	ImageButton fourty_nine_119;
	Button fourty_nine_saveBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_fourty_nine);
		
		fourty_nine_txt3 = (TextView)findViewById(R.id.fourty_nine_txt3);
		fourty_nine_txt4 = (TextView)findViewById(R.id.fourty_nine_txt4);
		fourty_nine_txt5 = (TextView)findViewById(R.id.fourty_nine_txt5);
		fourty_nine_txt6 = (TextView)findViewById(R.id.fourty_nine_txt6);
		fourty_nine_txt7 = (TextView)findViewById(R.id.fourty_nine_txt7);
		
		fourty_nine_Name1 = (TextView)findViewById(R.id.fourty_nine_Name1);
		fourty_nine_Name2 = (TextView)findViewById(R.id.fourty_nine_Name2);
		fourty_nine_Name3 = (TextView)findViewById(R.id.fourty_nine_Name3);
		
		fourty_nine_txt3.setText(Globals.getInstance().getList_1());
		fourty_nine_txt4.setText(Globals.getInstance().getList_2());
		fourty_nine_txt5.setText(Globals.getInstance().getList_3() + ", " + Globals.getInstance().getList_4());
		fourty_nine_txt6.setText(Globals.getInstance().getPersonName11() + ", " + Globals.getInstance().getPersonName22() + ", " + Globals.getInstance().getPersonName33());
		fourty_nine_txt7.setText(Globals.getInstance().getDo1() + ", " + Globals.getInstance().getDo2());
		
		fourty_nine_Name1.setText(Globals.getInstance().getPersonName11());
		fourty_nine_Name2.setText(Globals.getInstance().getPersonName22());
		fourty_nine_Name3.setText(Globals.getInstance().getPersonName33());
		
		fourty_nine_title1 = (TextView)findViewById(R.id.fourty_nine_title1);
		fourty_nine_title2 = (TextView)findViewById(R.id.fourty_nine_title2);
		fourty_nine_title3 = (TextView)findViewById(R.id.fourty_nine_title3);
		fourty_nine_title4 = (TextView)findViewById(R.id.fourty_nine_title4);
		fourty_nine_title5 = (TextView)findViewById(R.id.fourty_nine_title5);
		fourty_nine_title6 = (TextView)findViewById(R.id.fourty_nine_title6);
		
		fourty_nine_119 = (ImageButton)findViewById(R.id.fourty_nine_119);
		fourty_nine_saveBtn = (Button)findViewById(R.id.fourty_nine_saveBtn);
		
		String str = getString(R.string.fourty_nine_title1);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#c44e42")), 0, 26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		fourty_nine_title1.setText(sps);
		
		String str2 = getString(R.string.fourty_nine_title2);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		fourty_nine_title2.setText(sps2);
		
		String str3 = getString(R.string.fourty_nine_title3);
		SpannableStringBuilder sps3 = new SpannableStringBuilder();
		SpannableString ss3 = new SpannableString(str3);
		ss3.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps3.append(ss3);
		fourty_nine_title3.setText(sps3);
		
		String str4 = getString(R.string.fourty_nine_title4);
		SpannableStringBuilder sps4 = new SpannableStringBuilder();
		SpannableString ss4 = new SpannableString(str4);
		ss4.setSpan(new ForegroundColorSpan(Color.parseColor("#FFB90F")), 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps4.append(ss4);
		fourty_nine_title4.setText(sps4);
		
		String str5 = getString(R.string.fourty_nine_title5);
		SpannableStringBuilder sps5 = new SpannableStringBuilder();
		SpannableString ss5 = new SpannableString(str5);
		ss5.setSpan(new ForegroundColorSpan(Color.parseColor("#00CD00")), 0, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps5.append(ss5);
		fourty_nine_title5.setText(sps5);
		
		String str6 = getString(R.string.fourty_nine_title6);
		SpannableStringBuilder sps6 = new SpannableStringBuilder();
		SpannableString ss6 = new SpannableString(str6);
		ss6.setSpan(new ForegroundColorSpan(Color.parseColor("#c44e42")), 0, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps6.append(ss6);
		fourty_nine_title6.setText(sps6);
		
		fourty_nine_119.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				DialogSimple();
				
			}
		});
		
		fourty_nine_saveBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public void DialogSimple(){
		
		 AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		    alt_bld.setMessage("여러분을 돕기 위해 119로 전화연결을 합니다.").setCancelable(false).setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
		        
		    	public void onClick(DialogInterface dialog, int id) {
		            
		    		dialog.cancel();
		        }
		    	
		        }).setNegativeButton("OK", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int id) {
		        		
		        	 Intent intent = new Intent(Intent.ACTION_DIAL);
		             intent.setData(Uri.parse("tel:119"));
		             startActivity(intent);
		      
		        	}
		        });
		    
		    AlertDialog alert = alt_bld.create();
		    alert.show();
		
	}

	
	
}
