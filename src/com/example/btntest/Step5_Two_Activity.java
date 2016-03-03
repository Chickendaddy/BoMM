package com.example.btntest;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Step5_Two_Activity extends Activity {
	private LinearLayout mLayout;
	private Button btn_search;
	private EditText edit_search;
	TextView txtPhone1;

	private ImageButton imgbtn_next;
	private ImageButton imgbtn_prev;
	
	Button step5_nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step5__two);

		mLayout = (LinearLayout) findViewById(R.id.bg);
		btn_search = (Button) findViewById(R.id.btn_search);
		edit_search = (EditText) findViewById(R.id.edit_search);
		mLayout.setBackgroundColor(Color.rgb(255, 255, 255));
		//imgbtn_next = (ImageButton) findViewById(R.id.imgbtn_Next);
		//imgbtn_prev = (ImageButton) findViewById(R.id.imgbtn_Prev);

		step5_nextBtn = (Button)findViewById(R.id.step5_nextBtn);
		
		txtPhone1 = (TextView) findViewById(R.id.txt_2);
		btn_search.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = edit_search.getText().toString();

				if (str.length() < 1) {
					Toast.makeText(getApplicationContext(), "내용을 입력해주세요.", Toast.LENGTH_LONG).show();
				} else {
					Intent intent = new Intent(Step5_Two_Activity.this, Webview_Activity.class);
					intent.putExtra("name", str);
					startActivity(intent);
				}

			}
		});
		
		step5_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_forty_two.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();
				
			}
		});
/*
		imgbtn_next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_forty_two.class);
				startActivity(intent);
				finish();
				
			}
		});

		imgbtn_prev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Step5_Two_Activity.this, Step5_One_Activity.class);
				startActivity(intent);
				finish();
			}
		});
*/
		TextView tv = (TextView) findViewById(R.id.txt_1);
		tv.setText(Html.fromHtml("<a href = \"https://www.cyber1388.kr:447/new/index.asp\">한국청소년상담전화"));
		tv.setMovementMethod(LinkMovementMethod.getInstance());

		TextView tv1 = (TextView) findViewById(R.id.txt_3);
		tv1.setText(Html.fromHtml("<a href = \"http://www.lifeline.or.kr\">한국생명의전화"));
		tv1.setMovementMethod(LinkMovementMethod.getInstance());

		TextView tv2 = (TextView) findViewById(R.id.txt_5);
		tv2.setText(Html.fromHtml("<a href = \"http://www.counselling.or.kr\">자살예방핫라인"));
		tv2.setMovementMethod(LinkMovementMethod.getInstance());
		Linkify.addLinks(txtPhone1, Linkify.PHONE_NUMBERS);

		TextView txtPhone2 = (TextView) findViewById(R.id.txt_4);
		Linkify.addLinks(txtPhone2, Linkify.PHONE_NUMBERS);

		TextView txtPhone3 = (TextView) findViewById(R.id.txt_6);
		Linkify.addLinks(txtPhone3, Linkify.PHONE_NUMBERS);

	}

}
