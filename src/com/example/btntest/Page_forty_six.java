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

public class Page_forty_six extends Activity implements OnClickListener{

    ImageButton btn_change;
    ImageButton btnNext;
    ImageButton btnprev;

    int i =1;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_forty_six);
         
        btn_change = (ImageButton)findViewById(R.id.btnClick);

        btnNext = (ImageButton)findViewById(R.id.thirty_four_BtnNext);
        btnprev = (ImageButton)findViewById(R.id.BtnPrev);
        
        btn_change.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				btn_change.setSelected(true);
				i =0;

				// TODO Auto-generated method stub

			}
		});
        
        btnNext.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if( i==1){
					DialogSimple();
				}

				else{
					
					Intent intent = new Intent(getApplicationContext(), Page_forty_eight.class);
					startActivity(intent);
					finish();
				}

				// TODO Auto-generated method stub

			}
		});
        
        btnprev.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_forty_five.class);
				startActivity(intent);
				finish();
			}
		});
        
        
    }
 
    
 
    
    private void DialogSimple(){
		
		 AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		    alt_bld.setMessage("약속의 의미로 '엄지 꾹!' 눌러보자!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
		        
		    	public void onClick(DialogInterface dialog, int id) {
		            
		    		dialog.cancel();
		        }
		    	
		        });
		    
		    AlertDialog alert = alt_bld.create();		    
		    alert.show();
		
	}




	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}




}
  