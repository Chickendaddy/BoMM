package com.example.btntest;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Step2_two extends Activity {
	TextView txt_title;
	TextView txt_text;
	ListView list;
	ArrayAdapter<SampleItem> adapter;
	List<SampleItem> Item;
	ImageButton next;
	ImageButton prev;
	Button select;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step2_two);

		adapter = new SampleAdapter(this);
		adapter.add(new SampleItem("��Ʈ��Ī"));
		adapter.add(new SampleItem("�ٳѱ�"));
		adapter.add(new SampleItem("������ ���� �ֺ��� �Ȱų� �ٱ�"));
		adapter.add(new SampleItem("�����ϴ� �뷡 ���"));
		adapter.add(new SampleItem("�ֽ� ���� ���� ���"));
		adapter.add(new SampleItem("�뷡 �����鼭 ������ ���� �θ���"));
		adapter.add(new SampleItem("���� �뷡 �����鼭 �ӽÿ��� ��������"));
		adapter.add(new SampleItem("���� �����ϴ� ���,����,���� ���α׷� ��û Ȥ�� ���ͳ����� �ٽú���"));
		adapter.add(new SampleItem("�ڹ̵�,���� Ȥ�� SF ��ȭ �� ���ͳ����� �ٿ�޾� ����"));
		adapter.add(new SampleItem("���ͳ� �����ϰų� �α��ִ� ���� ����"));
		adapter.add(new SampleItem("���ͳ� ���θ����� �Ż� �����ϱ�"));
		adapter.add(new SampleItem("�¶��� ���� �ϱ�"));
		adapter.add(new SampleItem("�޴������� ���� ����Ʈ ������ ���ֱ�� ���ٰ� ���ڱ�"));
		adapter.add(new SampleItem("�׳� ���ڱ�"));
		adapter.add(new SampleItem("���� �����ϴ� �������� ����� ���� ä�� �ϱ� �Ẹ��"));
		adapter.add(new SampleItem("�̷� ���� ����� ����غ��鼭 �������� �κе��� ��ü������ ������ ����"));
		adapter.add(new SampleItem("ȭ���� ������ ū �Ҹ��� ���ϸ鼭 ���� ���������"));
		adapter.add(new SampleItem("�Ҹ��ѹ� ũ��! ��������"));
		adapter.add(new SampleItem("�ֿϵ����� �ִٸ�, �ֿϵ��� ���ְ� ����ֱ�"));
		adapter.add(new SampleItem("������ ���� ������ ���� �غ���"));

		txt_title = (TextView) findViewById(R.id.txt_step_2_two_title);
		txt_text = (TextView) findViewById(R.id.txt_text);
		list = (ListView) findViewById(R.id.list);
		next = (ImageButton) findViewById(R.id.btn_next2);

		String str = getString(R.string.step_2_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 8, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		txt_title.setText(sps);

		String str2 = getString(R.string.step_2_two_text);
		StringBuilder strBuildr = new StringBuilder(str2);
		strBuildr.insert(76, " _____");
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(strBuildr);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 46, 69, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss2.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 46, 69, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		txt_text.setText(sps2);

		txt_text.setBackgroundColor(Color.WHITE);

		list.setAdapter(adapter);
		list.setBackgroundColor(Color.WHITE);

		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Step2_two.this, Step2_List_Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
		prev = (ImageButton)findViewById(R.id.btn_perv2);
		
		prev.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(Step2_two.this, Page_Twenty_Three.class);
				startActivity(intent);
				finish();
				
			}
		});
		
		select = (Button)findViewById(R.id.btn_select);

	}

	private class SampleItem {
		public String name;

		public SampleItem(String name) {
			this.name = name;
		}
	}

	public class SampleAdapter extends ArrayAdapter<SampleItem> {

		public SampleAdapter(Context context) {
			super(context, 0);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
			}
			CheckBox box = (CheckBox) convertView.findViewById(R.id.checkBox1);

			TextView txt_name = (TextView) convertView.findViewById(R.id.txt_ddd);
			txt_name.setText(getItem(position).name);
			txt_name.setTextColor(Color.BLACK);
			
			select.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
				}
			});

			return convertView;
		}
	}

}
