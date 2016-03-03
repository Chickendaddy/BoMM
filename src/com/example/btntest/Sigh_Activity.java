package com.example.btntest;

import java.util.regex.Pattern;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sigh_Activity extends Activity {

	private Button btn_sign;
	
	private EditText edit_name;
	private EditText edit_Email;
	private EditText edit_Pass;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sigh_);

		btn_sign = (Button) findViewById(R.id.btn_sign);
		btn_sign.setTextColor(Color.WHITE);
		
		edit_Email = (EditText)findViewById(R.id.edit_Email);
		edit_Email.setFilters(new InputFilter[]{filterAlphaNum});
		
		edit_Pass = (EditText)findViewById(R.id.edit_Pass);
		edit_Pass.setFilters(new InputFilter[]{filterNum});
		
		edit_name = (EditText) findViewById(R.id.edit_name);

		btn_sign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				
				if(edit_name.getText().toString().equals("")){
					
					Toast toast = Toast.makeText(getApplicationContext(), "이름을 입력해 주세요.", Toast.LENGTH_SHORT);
					toast.show();
					
				}else if(edit_Email.getText().toString().equals("")){
					
					Toast toast = Toast.makeText(getApplicationContext(), "이메일을 입력해 주세요.", Toast.LENGTH_SHORT);
					toast.show();
					
				}else if(edit_Pass.getText().toString().equals("")){
			
					Toast toast = Toast.makeText(getApplicationContext(), "비밀번호를 입력해 주세요.", Toast.LENGTH_SHORT);
					toast.show();
					
				}
				
				Globals.getInstance().setPersonInfo(edit_name.getText().toString(), 
						edit_Email.getText().toString(),edit_Pass.getText().toString());
				
				Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_LONG).show();
				finish();
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
