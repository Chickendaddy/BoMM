package com.example.btntest;

import org.w3c.dom.Text;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Page_Seventy_zero extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page__seventy_zero);

		Button btn_search = (Button) findViewById(R.id.btn_search);
		Button btn_search2 = (Button) findViewById(R.id.btn_search2);

		final EditText edit1 = (EditText) findViewById(R.id.edit_search);
		final EditText edit2 = (EditText) findViewById(R.id.edit_search2);

		Button next = (Button) findViewById(R.id.nextBtn);

		TextView text = (TextView) findViewById(R.id.seventy_text);

		String str = text.getText().toString();

		SpannableStringBuilder sps1 = new SpannableStringBuilder();
		SpannableString ss1 = new SpannableString(str);
		ss1.setSpan(new ForegroundColorSpan(Color.parseColor("#2980b9")), 4, 64, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 4, 64, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps1.append(ss1);
		text.setText(sps1);

		btn_search.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = edit1.getText().toString();

				if (str.length() < 1) {
					Toast.makeText(getApplicationContext(), "내용을 입력해주세요.", Toast.LENGTH_LONG).show();
				} else {
					Intent intent = new Intent(Page_Seventy_zero.this, Webview_Activity.class);
					intent.putExtra("name", str);
					startActivity(intent);
				}

			}
		});

		btn_search2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = edit2.getText().toString();

				if (str.length() < 1) {
					Toast.makeText(getApplicationContext(), "내용을 입력해주세요.", Toast.LENGTH_LONG).show();
				} else {
					Intent intent = new Intent(Page_Seventy_zero.this, Webview_Activity.class);
					intent.putExtra("name", str);
					startActivity(intent);
				}

			}
		});

		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// 메인으로 ㄱㄱ
				Intent intent = new Intent(getApplicationContext(), Page_forty_two.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();///

			}
		});
	}

}
