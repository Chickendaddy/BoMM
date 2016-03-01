package com.example.btntest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
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

public class Page_Thirty_Seven extends Activity{

	TextView thirty_seven_txt1;
	TextView thirty_seven_txt2;
	TextView thirty_seven_txt3;
	TextView thirty_seven_txt4;
	TextView thirty_seven_txt5;
	
	TextView thirty_seven_col1;
	TextView thirty_seven_col2;
	TextView thirty_seven_col3;
	TextView thirty_seven_col4;
	
	TextView thirty_seven_personName1;
	TextView thirty_seven_personName2;
	TextView thirty_seven_personName3;
	
	TextView thirty_seven_personNumber1;
	TextView thirty_seven_personNumber2;
	TextView thirty_seven_personNumber3;
	
	ImageButton thirty_seven_Btn1;
	ImageButton thirty_seven_Btn2;
	ImageButton thirty_seven_Btn3;
	ImageButton thirty_seven_Btn4;
	ImageButton thirty_seven_Btn5;
	
	Button thirty_seven_nextBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_thirty_seven);
		
		thirty_seven_txt1 = (TextView)findViewById(R.id.thirty_seven_txt1);
		thirty_seven_txt2 = (TextView)findViewById(R.id.thirty_seven_txt2);
		thirty_seven_txt3 = (TextView)findViewById(R.id.thirty_seven_txt3);
		thirty_seven_txt4 = (TextView)findViewById(R.id.thirty_seven_txt4);
		thirty_seven_txt5 = (TextView)findViewById(R.id.thirty_seven_txt5);
		
		thirty_seven_col1 = (TextView)findViewById(R.id.thirty_seven_col1);
		thirty_seven_col2 = (TextView)findViewById(R.id.thirty_seven_col2);
		thirty_seven_col3 = (TextView)findViewById(R.id.thirty_seven_col3);
		thirty_seven_col4 = (TextView)findViewById(R.id.thirty_seven_col4);
		
		thirty_seven_personName1 = (TextView)findViewById(R.id.thirty_seven_personName1);
		thirty_seven_personName2 = (TextView)findViewById(R.id.thirty_seven_personName2);
		thirty_seven_personName3 = (TextView)findViewById(R.id.thirty_seven_personName3);
		
		thirty_seven_personNumber1 = (TextView)findViewById(R.id.thirty_seven_personNumber1);
		thirty_seven_personNumber2 = (TextView)findViewById(R.id.thirty_seven_personNumber2);
		thirty_seven_personNumber3 = (TextView)findViewById(R.id.thirty_seven_personNumber3);
		
		ImageButton thirty_seven_Btn1 = (ImageButton)findViewById(R.id.thirty_seven_Btn1);
		ImageButton thirty_seven_Btn2 = (ImageButton)findViewById(R.id.thirty_seven_Btn2);
		ImageButton thirty_seven_Btn3 = (ImageButton)findViewById(R.id.thirty_seven_Btn3);
		ImageButton thirty_seven_Btn4 = (ImageButton)findViewById(R.id.thirty_seven_Btn4);
		ImageButton thirty_seven_Btn5 = (ImageButton)findViewById(R.id.thirty_seven_Btn5);
		
		thirty_seven_nextBtn = (Button)findViewById(R.id.thirty_seven_nextBtn);
		
		String str = getString(R.string.twenty_eight_txt1);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		thirty_seven_txt1.setText(sps);
		
		String str2 = getString(R.string.twenty_eight_txt3);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		thirty_seven_txt2.setText(sps2);
		
		String str3 = getString(R.string.thirty_txt1);
		SpannableStringBuilder sps3 = new SpannableStringBuilder();
		SpannableString ss3 = new SpannableString(str3);
		ss3.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps3.append(ss3);
		thirty_seven_txt3.setText(sps3);
		
		String str4 = getString(R.string.thirty_txt3);
		SpannableStringBuilder sps4 = new SpannableStringBuilder();
		SpannableString ss4 = new SpannableString(str4);
		ss4.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps4.append(ss4);
		thirty_seven_txt4.setText(sps4);
		
		String str5 = getString(R.string.thirty_seven_txt1);
		SpannableStringBuilder sps5 = new SpannableStringBuilder();
		SpannableString ss5 = new SpannableString(str5);
		ss5.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps5.append(ss5);
		thirty_seven_txt5.setText(sps5);
		
		String sequence = "▣  ";
		
		thirty_seven_col1.setText(sequence + Globals.getInstance().getList_3());
		
		if(null != Globals.getInstance().getList_4())		
			thirty_seven_col2.setText(sequence + Globals.getInstance().getList_4());
		else	
			thirty_seven_col2.setText(sequence);
		
		thirty_seven_col3.setText(sequence + Globals.getInstance().getDo1());
		
		if(null != Globals.getInstance().getList_4())		
			thirty_seven_col4.setText(sequence + Globals.getInstance().getDo2());
		else	
			thirty_seven_col4.setText(sequence);
		
		thirty_seven_personName1.setText(Globals.getInstance().getPersonName11());
		thirty_seven_personName2.setText(Globals.getInstance().getPersonName22());
		thirty_seven_personName3.setText(Globals.getInstance().getPersonName33());
		
		thirty_seven_personNumber1.setText(Globals.getInstance().getPersonNumber11());
		thirty_seven_personNumber2.setText(Globals.getInstance().getPersonNumber22());
		thirty_seven_personNumber3.setText(Globals.getInstance().getPersonNumber33());
		
		 thirty_seven_Btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				DialogSimple(thirty_seven_personName1.getText().toString(), thirty_seven_personNumber1.getText().toString());
				
			}
		});
		 
		 thirty_seven_Btn2.setOnClickListener(new OnClickListener() {
				
				@Override
			public void onClick(View arg0) {
					// TODO Auto-generated method stub
				
					DialogSimple(thirty_seven_personName2.getText().toString(), thirty_seven_personNumber2.getText().toString());
					
			}
		});
		 
		 thirty_seven_Btn3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					DialogSimple(thirty_seven_personName3.getText().toString(), thirty_seven_personNumber3.getText().toString());
			}
		});
		 
		 thirty_seven_Btn4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					Intent intent = new Intent( Intent.ACTION_DIAL );
					intent.setData( Uri.parse( "tel:1388" ) );
					startActivity( intent );
					
			}
		});
		 
		 thirty_seven_Btn5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent( Intent.ACTION_DIAL );
					intent.setData( Uri.parse( "tel:1588-9191" ) );
					startActivity( intent );
			}
		});
		 
		 /* Intent */	//////////////////////////////////////////////
		 
		 thirty_seven_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public void DialogSimple(final String name, final String number){
		
		 AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		    alt_bld.setMessage("도와줘! " + name).setCancelable(false).setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
		        
		    	public void onClick(DialogInterface dialog, int id) {
		            
		    		dialog.cancel();
		        }
		    	
		        }).setNegativeButton("OK", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int id) {
		            
		        	String msg = "제가 지금 힘들어요. 제 이야기를 들어주세요. 강압적이거나 다그치지 말고 그냥 들어주세요. 가까이 있다면 제 옆에 있어주길 부탁해요.";
		        	
		            SmsManager sms = SmsManager.getDefault();
		        	sms.sendTextMessage(number, null, msg, null, null);
		            Toast.makeText(getApplicationContext(), name + "에게 문자가 전송되었어요.", Toast.LENGTH_SHORT).show();
		      
		        	}
		        });
		    
		    AlertDialog alert = alt_bld.create();
		    alert.show();
		
	}

}
