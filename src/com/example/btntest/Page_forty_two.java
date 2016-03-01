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

	ImageButton btnNext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_forty_two);


		btnNext = (ImageButton)findViewById(R.id.thirty_four_BtnNext);
		
		
		final ImageButton call = (ImageButton)findViewById(R.id.imageButton7);
		call.setOnClickListener(new View.OnClickListener() {

			
			
			@Override
			public void onClick(View v) {

				DialogSimple();
				// TODO Auto-generated method stub

			}
		});
		
		btnNext.setOnClickListener(new OnClickListener() {
			
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
