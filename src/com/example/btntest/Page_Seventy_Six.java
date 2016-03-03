package com.example.btntest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Page_Seventy_Six extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page__seventy__six);

		LinearLayout layout;
		layout = (LinearLayout) findViewById(R.id.bg);
		layout.setBackgroundColor(Color.WHITE);

		ImageButton move1 = (ImageButton) findViewById(R.id.move_1);
		ImageButton move2 = (ImageButton) findViewById(R.id.move2);
		ImageButton move3 = (ImageButton) findViewById(R.id.move3);
		ImageButton move4 = (ImageButton) findViewById(R.id.move4);
		ImageButton move5 = (ImageButton) findViewById(R.id.move5);
		move1.setOnClickListener(this);
		move2.setOnClickListener(this);
		move3.setOnClickListener(this);
		move4.setOnClickListener(this);
		move5.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int a = v.getId();

		switch (a) {
		case R.id.move_1:
			Intent i = new Intent(Intent.ACTION_VIEW);
			Uri u = Uri.parse(
					"http://www.work.go.kr/consltJobCarpa/jobPsyExamNew/jobPsyExamList.do?thisMenuId=M201200127");
			i.setData(u);
			startActivity(i);
			break;
		case R.id.move2:
			Intent i1 = new Intent(Intent.ACTION_VIEW);
			Uri u1 = Uri.parse("http://www.work.go.kr/consltJobCarpa/srch/jobInfoSrch/srchJobInfo.do");
			i1.setData(u1);
			startActivity(i1);
			break;
		case R.id.move3:
			Intent i2 = new Intent(Intent.ACTION_VIEW);
			Uri u2 = Uri.parse("http://www.work.go.kr/consltJobCarpa/videoInfo/videoInfoSrchList.do");
			i2.setData(u2);
			startActivity(i2);
			break;
		case R.id.move4:
			Intent i3 = new Intent(Intent.ACTION_VIEW);
			Uri u3 = Uri.parse(
					"http://www.work.go.kr/consltJobCarpa/jobPsyExamNew/conslt/jobPsyExamConsltList.do?thisMenuId=M201200129");
			i3.setData(u3);
			startActivity(i3);
			break;
		case R.id.move5:

			break;

		default:
			break;
		}
	}

}
