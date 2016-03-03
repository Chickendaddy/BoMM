package com.example.btntest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class Page_Fifty_Three extends Activity {
	TextView txt_list1;
	TextView txt_list2;
	ArrayAdapter<String> adapter;
	List<String> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page__fifty_three);

		list = new ArrayList<String>();
		list.add("Çæ~");
		list.add("¿­Æø");
		list.add("¿ô°Ü!");
		list.add("ÃÂ!");

		list.add("±íÀº ºýÄ§");
		list.add("Çàº¹ÇØ");
		list.add("½½Æâ¾î");
		list.add("¿ì¿ïÇØ");

		list.add("±íÀº ºýÄ§");
		list.add("Çàº¹ÇØ");
		list.add("½½Æâ¾î");
		list.add("¿ì¿ïÇØ");

		list.add("Â¯³ª~");
		list.add("¾ÆÆÍ¾î");
		list.add("¸Û~~");
		list.add("È²´ç");

		list.add("Â¯³ª~");
		list.add("¾ÆÆÍ¾î");
		list.add("¸Û~~");
		list.add("È²´ç");

		list.add("¿Ü·Î¿ü¾î");
		list.add("°¨µ¿ÀÌ¾ú³×");
		list.add("¿ÏÁ¸ ¾ï¿ï");
		list.add("¼³·¨³×");

		list.add("¹ö°Ì³×");
		list.add("°Á ¿ôÀÚ");
		list.add("ÁÁ¾Ò³×");
		list.add("°í¸¶¿ü¾î");

		list.add("±×³É±×·¨¾î");
		list.add("»ì¸¸ÇÏ³×");
		list.add("Çä!");
		list.add("µÆ´Ù±×·¡");

		list.add("±âºÐ ÃÖ°í");
		list.add("¤»¤»¤»");
		list.add("´«¹°³µ¾î");
		list.add("ÈÄÈ¸µÆ¾î");

		adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.dialog_layout, list);

		Button btn_next = (Button) findViewById(R.id.fifty_three_nextBtn);
		TextView text = (TextView) findViewById(R.id.fifty_three_text);

		String str = text.getText().toString();

		SpannableStringBuilder sps1 = new SpannableStringBuilder();
		SpannableString ss1 = new SpannableString(str);
		ss1.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 71, 96, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 71, 96, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss1.setSpan(new AbsoluteSizeSpan(55), 71, 96, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps1.append(ss1);
		text.setText(ss1);
		txt_list1 = (TextView) findViewById(R.id.btn_chose1);
		txt_list2 = (TextView) findViewById(R.id.btn_chose2);

		txt_list1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alertBuilder = new AlertDialog.Builder(Page_Fifty_Three.this);
				// ¹öÆ° »ý¼º

				// Adapter ¼ÂÆÃ
				alertBuilder.setAdapter(adapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

						// AlertDialog ¾È¿¡ ÀÖ´Â AlertDialog
						String strName = adapter.getItem(id);
						txt_list1.setText(strName);
					}
				});
				alertBuilder.show();
			}
		});

		txt_list2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alertBuilder = new AlertDialog.Builder(Page_Fifty_Three.this);
				// ¹öÆ° »ý¼º

				// Adapter ¼ÂÆÃ
				alertBuilder.setAdapter(adapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

						// AlertDialog ¾È¿¡ ÀÖ´Â AlertDialog
						String strName = adapter.getItem(id);
						txt_list2.setText(strName);
					}
				});
				alertBuilder.show();
			}
		});

		btn_next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Page_Fifty_Three.this, Page_Fifty_Fore.class);
				startActivity(intent);
			}
		});

	}

}
