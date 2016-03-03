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
		list.add("��~");
		list.add("����");
		list.add("����!");
		list.add("��!");

		list.add("���� ��ħ");
		list.add("�ູ��");
		list.add("�����");
		list.add("�����");

		list.add("���� ��ħ");
		list.add("�ູ��");
		list.add("�����");
		list.add("�����");

		list.add("¯��~");
		list.add("���;�");
		list.add("��~~");
		list.add("Ȳ��");

		list.add("¯��~");
		list.add("���;�");
		list.add("��~~");
		list.add("Ȳ��");

		list.add("�ܷο���");
		list.add("�����̾���");
		list.add("���� ���");
		list.add("������");

		list.add("���̳�");
		list.add("�� ����");
		list.add("���ҳ�");
		list.add("������");

		list.add("�׳ɱ׷���");
		list.add("�츸�ϳ�");
		list.add("��!");
		list.add("�ƴٱ׷�");

		list.add("��� �ְ�");
		list.add("������");
		list.add("��������");
		list.add("��ȸ�ƾ�");

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
				// ��ư ����

				// Adapter ����
				alertBuilder.setAdapter(adapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

						// AlertDialog �ȿ� �ִ� AlertDialog
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
				// ��ư ����

				// Adapter ����
				alertBuilder.setAdapter(adapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

						// AlertDialog �ȿ� �ִ� AlertDialog
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
