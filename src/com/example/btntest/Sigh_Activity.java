package com.example.btntest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sigh_Activity extends Activity {

	private Button btn_sign;

	private EditText edit_name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sigh_);

		btn_sign = (Button) findViewById(R.id.btn_sign);
		edit_name = (EditText) findViewById(R.id.edit_name);

		btn_sign.setTextColor(Color.WHITE);

		btn_sign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Globals.getInstance().setName(edit_name.getText().toString());
				Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_LONG).show();
				// overridePendingTransition(R.anim.slide_in_right, 0);

				finish();
			}
		});
	}

}
