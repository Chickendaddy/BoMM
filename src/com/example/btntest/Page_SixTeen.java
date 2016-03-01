package com.example.btntest;

import com.example.btntest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Page_SixTeen extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_sixteen);
		
		TextView textView = (TextView)findViewById(R.id.textView1);
		
		textView.setText("지금부터\n\n내 마음의 슬픔과 우울을\n\n나 스스로가 제어하기 위한\n\n'내 마음의 브레이크를'\n\n만들어보겠습니다.\n\n"
				+ "내 마음의 브레이크는\n\n 총 6단계로 이루어져 있습니다.\n\n");
	
	
	
	ImageButton BtnNext = (ImageButton)findViewById(R.id.BtnNext);
	
	BtnNext.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent intent = new Intent(getApplicationContext(), MainActivity.class);
    		startActivity(intent);
    		finish();
			
			}
		});
	
	}
	
}
