package com.example.btntest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class Page_Fifty_Fore extends Activity {

	TextView name;
	TextView txt_staus;
	RadioButton man;
	RadioButton woman;
	SeekBar seek;
	ImageView img_person;
	Boolean person; // man: true, woman: false
	int mProgress;

	String[] a, b, c, d, e;
	int a1;
	Boolean b1, c1, d1, e1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page__fifty__fore);

		name = (TextView) findViewById(R.id.txt_name);
		man = (RadioButton) findViewById(R.id.man);
		woman = (RadioButton) findViewById(R.id.woman);
		seek = (SeekBar) findViewById(R.id.seekBar1);
		img_person = (ImageView) findViewById(R.id.img_person);
		txt_staus = (TextView) findViewById(R.id.txt_staus);

		man.setOnClickListener(optionOnClickListener);
		woman.setOnClickListener(optionOnClickListener);

		// init
		man.setChecked(true);
		person = true;
		seek.setProgress(50);
		img_person.setImageDrawable(getResources().getDrawable(R.drawable.man_3));
		a1 = 0;
		b1 = true;
		c1 = true;
		d1 = true;
		e1 = true;

		final String a[] = { "'우울하고 화난 하루였지만, 잘 버텼어.. 힘들었지?'..", "'오늘 애 많이 썼지? 고생했어.. 그래도 잘 견뎌줘서 장하다!'",
				"'많이 힘들었지.. 스투~레스 풀기 위해 나만의 대처전략 해보는 거 어때?",
				"'너덜너덜해진 너의 마음..속 얘기를 마음껏 할 수 있는 상담실이 있다는 것 잊지마..얼렁 전화해봐..'" };

		final String b[] = { "'휴... 힘들었네.. 오늘하루..고생했다..'", "'쓰담쓰담..힘들었던 너의 마음을 위로해줄께..내 마음의 창 한번 재무장! 해볼까?'" };

		final String c[] = { "'그냥 무난했던 하루! 내일은 좀 더 힘내 볼까?'", "'무난했지만 그러기 위해서 많이 노력했지? 애썼네 :)" };

		final String d[] = { "'그래도 좋은 하루였네.. 애썼어..내일도 부탁해~'", "'축하해.. 좋은 하루 보낸거 ^^ 내일 좀 더 행복해지려면 어떻게 보낼꺼야?'" };

		final String e[] = { "정말 기분 최고~~! 내일도 짱 재밌게 보내자!'", "'와! 좋은 하루였네..어떻게 그럴 수 있었어? ㅎㅎ 내일도 쭉 행복하자^^'" };

		String G_name = "_______";// Globals.getInstance().getName();

		name.setText("나의 기분을 " + G_name + " 친구 스스로 공감해주세요.");

		seek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				if (mProgress < 20) {
					switch (a1) {
					case 0:
						txt_staus.setText(a[0]);
						break;
					case 1:
						txt_staus.setText(a[1]);
						break;

					case 2:
						txt_staus.setText(a[2]);
						break;

					case 3:
						txt_staus.setText(a[3]);
						break;

					}
					if (a1 < 3) {
						a1++;
					} else {
						a1 = 0;
					}
				} else if (mProgress >= 20 && mProgress < 40) {
					if (b1 == true) {
						txt_staus.setText(b[0]);
						b1 = false;
					} else {
						txt_staus.setText(b[1]);
						b1 = true;
					}
				} else if (mProgress >= 40 && mProgress < 60) {
					if (c1 == true) {
						txt_staus.setText(c[0]);
						c1 = false;
					} else {
						txt_staus.setText(c[1]);
						c1 = true;
					}
				} else if (mProgress >= 60 && mProgress < 80) {
					if (d1 == true) {
						txt_staus.setText(d[0]);
						d1 = false;
					} else {
						txt_staus.setText(d[1]);
						d1 = true;
					}
				} else {
					if (e1 == true) {
						txt_staus.setText(e[0]);
						e1 = false;
					} else {
						txt_staus.setText(e[1]);
						e1 = true;
					}
				}

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
				mProgress = progress;

				if (progress < 20) {
					if (person == true) {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.man_5));

					} else {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.woman_5));
					}

				} else if (progress >= 20 && progress < 40) {
					if (person == true) {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.man_4));
					} else {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.woman_4));
					}
				} else if (progress >= 40 && progress < 60) {
					if (person == true) {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.man_3));
					} else {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.woman_3));
					}
				} else if (progress >= 60 && progress < 80) {
					if (person == true) {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.man_2));
					} else {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.woman_2));
					}
				} else {
					if (person == true) {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.man_1));
					} else {
						img_person.setImageDrawable(getResources().getDrawable(R.drawable.woman_1));
					}
				}

			}
		});
	}

	RadioButton.OnClickListener optionOnClickListener = new RadioButton.OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (man.isChecked()) {
				person = true;
			} else {
				person = false;
			}
		}
	};

}
