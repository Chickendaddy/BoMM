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
		adapter.add(new SampleItem("스트레칭"));
		adapter.add(new SampleItem("줄넘기"));
		adapter.add(new SampleItem("가볍게 동네 주변을 걷거나 뛰기"));
		adapter.add(new SampleItem("수영,샌드백,숨차게 뛰기 등 격렬한 운동하기 "));
		adapter.add(new SampleItem("좋아하는 노래 듣기"));
		adapter.add(new SampleItem("최신 유행 음악 듣기"));
		adapter.add(new SampleItem("노래 들으면서 무작정 따라 부르기"));
		adapter.add(new SampleItem("슬픈 노래 들으면서 속시원히 울어버리기"));
		adapter.add(new SampleItem("요즘 유행하는 드라마,개그,예능 프로그램 시청 혹은 인터넷으로 다시보기"));
		adapter.add(new SampleItem("코미디,전쟁 혹은 SF영화 등 인터넷으로 다운받아 보기"));
		adapter.add(new SampleItem("인터넷 서핑하거나 인기있는 웹툰보기"));
		adapter.add(new SampleItem("인터넷 쇼핑몰에서 신상 구경하기"));
		adapter.add(new SampleItem("온라인 게임 하기"));
		adapter.add(new SampleItem("휴대폰으로 포털 사이트 뉴스나 연애기사 보다가 잠자기"));
		adapter.add(new SampleItem("그냥 잠자기"));
		adapter.add(new SampleItem("내가 생각하는 긍정적인 말들로 가득 채운 일기 써보기"));
		adapter.add(new SampleItem("미래 나의 모습을 상상해보면서 긍정적인 부분들을 구체적으로 끄적여 보기"));
		adapter.add(new SampleItem("화나는 생각을 큰소리로 욕하면서 적고 찢어버리기"));
		adapter.add(new SampleItem("소리한번 크게! 질러보기"));
		adapter.add(new SampleItem("애완동물이 있다면, 애완동물 밥주고 놀아주기"));
		adapter.add(new SampleItem("따뜻한 물로 샤워나 족욕 해보기"));

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
