package com.example.btntest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Page_forty_two extends Activity{

	Button forty_two_nextBtn;
	
	TextView step6_title;
	TextView forty_two_txt1;
	TextView forty_two_txt2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_forty_two);


		forty_two_nextBtn = (Button)findViewById(R.id.forty_two_nextBtn);
		
		step6_title = (TextView)findViewById(R.id.step6_title);
		forty_two_txt1 = (TextView)findViewById(R.id.forty_two_txt1);
		forty_two_txt2 = (TextView)findViewById(R.id.forty_two_txt2);
		
		//String name = Globals.getInstance().getName();
		String name = "null";
		
		String str = getString(R.string.step6_title);
		//StringBuilder strBuildr = new StringBuilder(str);
		//strBuildr.insert(0, name);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 8, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		step6_title.setText(sps);
		
		
		//final ImageButton call = (ImageButton)findViewById(R.id.imageButton7);
		//call.setOnClickListener(new View.OnClickListener() {

			
	/*		
			@Override
			public void onClick(View v) {

				DialogSimple();
				// TODO Auto-generated method stub

			}
		});
*/
		forty_two_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_forty_four.class);
				startActivity(intent);
				finish();
			}
		});
		
		
		

	}
	
	private void DialogSimple(){
		
		 AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		    alt_bld.setMessage("여러분을 돕기 위해 119로 \n 전화연결을 합니다.").setCancelable(false).setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
		        
		    	public void onClick(DialogInterface dialog, int id) {
		            
		    		dialog.cancel();
		        }
		    	
		        }).setNegativeButton("OK", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int id) {
		            
		        	   Intent intent = new Intent( Intent.ACTION_DIAL );
		               intent.setData( Uri.parse( "tel:1588-9191" ) );
		               startActivity( intent );
		            	
		        	}
		        });
		    AlertDialog alert = alt_bld.create();
		    // Title for AlertDialog
		    //alert.setTitle("Title");
		    // Icon for AlertDialog
		    
		    alert.show();
		
	}

	
	
	
	

}
