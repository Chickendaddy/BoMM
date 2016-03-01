package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Step2_List_Activity extends Activity {

	TextView list_1;
	TextView list_2;
	
	ImageButton prev;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step2__list_);

		list_1 = (TextView) findViewById(R.id.txt_list1);
		list_2 = (TextView) findViewById(R.id.txt_list2);

		list_1.setText(Globals.getInstance().getList_1());
		list_2.setText(Globals.getInstance().getList_2());
		
		//prev = (ImageButton)findViewById(R.id.btn_prev3);
		
		/*
		prev.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Step2_List_Activity.this, Step2_two.class);
				startActivity(intent);
				finish();
				
			}
		});
		
		*/
		
	}

}
