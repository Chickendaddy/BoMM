package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_Thirty_Foru extends Activity {

	TextView thirty_four_txt1;
	TextView thirty_four_txt2;
	TextView thirty_four_txt4;
	ImageButton btn_next;
	ImageButton btn_prev;

	Button thirty_four_nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.page_thirty_four);

		TextView text = (TextView) findViewById(R.id.txt_step_4_title);
		TextView text2 = (TextView) findViewById(R.id.thirty_four_txt3);
		TextView txt_text = (TextView) findViewById(R.id.txt_text4);
		//btn_next = (ImageButton) findViewById(R.id.thirty_four_BtnNext);
		//btn_prev = (ImageButton) findViewById(R.id.BtnPrev);
		
		thirty_four_nextBtn = (Button)findViewById(R.id.thirty_four_nextBtn);
		
		String name = Globals.getInstance().getName();

		String str = getString(R.string.step_4_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#FFB90F")), 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);

		String str2 = getString(R.string.thirty_four_txt3);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 65, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		text2.setText(sps2);

		thirty_four_txt1 = (TextView) findViewById(R.id.thirty_four_txt1);
		thirty_four_txt2 = (TextView) findViewById(R.id.thirty_four_txt2);
		thirty_four_txt4 = (TextView) findViewById(R.id.thirty_four_txt4);

		thirty_four_txt1.setText("아직까지도 자살 생각이 지속된다면...                              ");
		thirty_four_txt2.setText("이제 친구나 가족, " + name + " 친구가 믿을 수 있는 사람들 에게 도움이 필요함을 알려할 때입니다.");
		thirty_four_txt4.setText("이런 생각이 들어 망설일 수 있습니다.\n그러나 실제 " + name + " 친구의 가족이나 친구들은 진정으로 돕길 원하고 있습니다.");

		thirty_four_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_Thirty_Five.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();
				
			}
		});
		
/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub

		int action = event.getAction();

		switch (action) {

		case MotionEvent.ACTION_DOWN: // 화면을 터치했을때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_UP: // 화면을 터치했다 땠을때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_MOVE: // 화면을 터치하고 이동할때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		}
		mHandler.postDelayed(new Runnable() {
			// Do Something
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn_prev.setVisibility(View.INVISIBLE);
				btn_next.setVisibility(View.INVISIBLE);
			}
		}, 2000); // 1000ms
		return super.onTouchEvent(event);
	}
*/

	}

	
}