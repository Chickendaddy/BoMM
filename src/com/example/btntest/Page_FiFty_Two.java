package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Page_FiFty_Two extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page__fi_fty__two);

		TextView text = (TextView) findViewById(R.id.txt_fifty_two_text);
		Button btn_next = (Button) findViewById(R.id.fifty_two_nextBtn);

		// String name = Globals.getInstance().getName();
		String name = "¿Ãµø∫Û";
		String str2 = getString(R.string.fifty_two_text);

		StringBuilder strBuildr = new StringBuilder(str2);
		strBuildr.insert(0, name);

		SpannableStringBuilder sps1 = new SpannableStringBuilder();
		SpannableString ss1 = new SpannableString(strBuildr);
		ss1.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 7, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 7, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new AbsoluteSizeSpan(55), 7, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps1.append(ss1);
		text.setText(ss1);

		btn_next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Page_FiFty_Two.this, Page_Fifty_Three.class);
				startActivity(intent);
			}
		});
	}

}
