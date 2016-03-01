package com.example.btntest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class Find_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_);

		Button btn_find = (Button) findViewById(R.id.btn_find);
		btn_find.setTextColor(Color.WHITE);
	}

}
