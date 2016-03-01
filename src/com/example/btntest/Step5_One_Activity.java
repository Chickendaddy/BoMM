package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Step5_One_Activity extends Activity {
	TextView txt_text;
	TextView txt_title;
	ImageButton imgbtn_next;
	ImageButton imgbtn_prev;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step5__one);

		txt_text = (TextView) findViewById(R.id.txt_text);
		txt_title = (TextView) findViewById(R.id.txt_step_5_title);
		imgbtn_next = (ImageButton) findViewById(R.id.imgbtn_Next);
		imgbtn_prev = (ImageButton) findViewById(R.id.imgbtn_Prev);

		String txt_title1 = txt_title.getText().toString();
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(txt_title1);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#18a186")), 0, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		txt_title.setText(sps2);

		String str = getString(R.string.title_activity_step5__one_text);
		String str_text3 = getString(R.string.title_activity_step5__one_text3);

		StringBuilder strBuildr1 = new StringBuilder(str_text3);
		strBuildr1.insert(35, " _____");

		StringBuilder strBuildr = new StringBuilder(str);
		strBuildr.insert(0, " _____");
		String str1 = strBuildr + "\n" + "전문적인 의료진 혹은 심리상담사들의 도움이 필요한 때 입니다.\n\n";

		String str2 = str1 + strBuildr1;
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str2);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 77, 113, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 77, 113, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		txt_text.setText(sps);

		txt_text.setBackgroundColor(Color.WHITE);

		imgbtn_next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Step5_One_Activity.this, Step5_Two_Activity.class);
				startActivity(intent);
				finish();
			}
		});

	}

}
