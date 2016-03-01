package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Login_Activity extends Activity {

	Button btn_login;
	ImageView btn_find;
	ImageView btn_sign;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_);

		btn_login = (Button) findViewById(R.id.btn_login);
		btn_find = (ImageView) findViewById(R.id.btn_find);
		btn_sign = (ImageView) findViewById(R.id.btn_sign);

		btn_login.setTextColor(Color.WHITE);

		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Login_Activity.this, Door.class);
				startActivity(intent);
				// overridePendingTransition(R.anim.slide_in_right, 0);
				finish();
			}
		});

		btn_sign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Login_Activity.this, Sigh_Activity.class);
				startActivity(intent);
			}
		});

		btn_find.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Login_Activity.this, Find_Activity.class);
				startActivity(intent);
			}
		});

	}

}
