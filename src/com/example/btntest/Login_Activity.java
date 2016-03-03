package com.example.btntest;

import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Login_Activity extends Activity {

	Button btn_login;
	ImageView btn_find;
	ImageView btn_sign;

	EditText email_txt;
	EditText pass_txt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_);

		btn_login = (Button) findViewById(R.id.btn_login);
		btn_find = (ImageView) findViewById(R.id.btn_find);
		btn_sign = (ImageView) findViewById(R.id.btn_sign);
		btn_login.setTextColor(Color.WHITE);
		
		email_txt = (EditText)findViewById(R.id.email_txt);
		email_txt.setFilters(new InputFilter[]{filterAlphaNum});
		pass_txt = (EditText)findViewById(R.id.pass_txt);	
		pass_txt.setFilters(new InputFilter[]{filterNum});
		

		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				if(email_txt.getText().toString().equals("")){
					
					Toast toast = Toast.makeText(getApplicationContext(), "�̸����� �Է��� �ּ���.", Toast.LENGTH_SHORT);
					toast.show();
					
					return;
					
				}else{
					
					if(!email_txt.getText().toString().equals(Globals.getInstance().getEmail())){
						
						Toast toast = Toast.makeText(getApplicationContext(), "��ϵ� �̸����� �����ϴ�. �̸����� Ȯ���� �ּ���.", Toast.LENGTH_SHORT);
						toast.show();
						
						return;
					}
					
				}
				
				if(pass_txt.getText().toString().equals("")){
					
					Toast toast = Toast.makeText(getApplicationContext(), "��й�ȣ�� �Է��� �ּ���.", Toast.LENGTH_SHORT);
					toast.show();
					
					return;
					
				}else{
					
					if(!pass_txt.getText().toString().equals(Globals.getInstance().getPass())){
						
						Toast toast = Toast.makeText(getApplicationContext(), "��й�ȣ�� Ʋ�Ƚ��ϴ�.", Toast.LENGTH_SHORT);
						toast.show();
						
						return;
						
					}
					
				}
					Intent intent = new Intent(Login_Activity.this, Door.class);
					startActivity(intent);
					finish();
			}
		});

		btn_sign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Login_Activity.this, Sign_Activity.class);
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
	
	protected InputFilter filterAlphaNum = new InputFilter() {
        public CharSequence filter(CharSequence source, int start, int end,
                                Spanned dest, int dstart, int dend) {

                Pattern ps = Pattern.compile("^[a-zA-Z0-9@]+$");
                if (!ps.matcher(source).matches()) {
                        return "";
                } 
                return null;
        } 
	}; 
	
	protected InputFilter filterNum = new InputFilter() {
        public CharSequence filter(CharSequence source, int start, int end,
                                Spanned dest, int dstart, int dend) {

                Pattern ps = Pattern.compile("^[0-9]+$");
                if (!ps.matcher(source).matches()) {
                        return "";
                } 
                return null;
        } 
	}; 

}
