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

public class Find_Activity extends Activity {

	private EditText edit_Email;
	private Button btn_find;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_);

		edit_Email = (EditText)findViewById(R.id.edit_Email);
		edit_Email.setFilters(new InputFilter[]{filterAlphaNum});
		
		btn_find = (Button) findViewById(R.id.btn_find);
		btn_find.setTextColor(Color.WHITE);
		
		btn_find.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(!edit_Email.getText().toString().equals(Globals.getInstance().getEmail())){
					
					Toast toast = Toast.makeText(getApplicationContext(), "등록된 이메일이 없습니다. 이메일을 확인해 주세요.", Toast.LENGTH_LONG);
					toast.show();
				
				}else{
					
					Toast toast = Toast.makeText(getApplicationContext(), "비밀번호는" + " " + Globals.getInstance().getPass() + " " + "입니다.", Toast.LENGTH_LONG);
					toast.show();
					
				}
				
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

}
