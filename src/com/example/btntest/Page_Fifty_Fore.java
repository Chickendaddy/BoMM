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

		final String a[] = { "'����ϰ� ȭ�� �Ϸ翴����, �� �����.. �������?'..", "'���� �� ���� ����? ����߾�.. �׷��� �� �ߵ��༭ ���ϴ�!'",
				"'���� �������.. ����~���� Ǯ�� ���� ������ ��ó���� �غ��� �� �?",
				"'�ʴ��ʴ����� ���� ����..�� ��⸦ ������ �� �� �ִ� ������ �ִٴ� �� ������..�� ��ȭ�غ�..'" };

		final String b[] = { "'��... �������.. �����Ϸ�..����ߴ�..'", "'���㾲��..������� ���� ������ �������ٲ�..�� ������ â �ѹ� �繫��! �غ���?'" };

		final String c[] = { "'�׳� �����ߴ� �Ϸ�! ������ �� �� ���� ����?'", "'���������� �׷��� ���ؼ� ���� �������? �ֽ�� :)" };

		final String d[] = { "'�׷��� ���� �Ϸ翴��.. �ֽ��..���ϵ� ��Ź��~'", "'������.. ���� �Ϸ� ������ ^^ ���� �� �� �ູ�������� ��� ��������?'" };

		final String e[] = { "���� ��� �ְ�~~! ���ϵ� ¯ ��հ� ������!'", "'��! ���� �Ϸ翴��..��� �׷� �� �־���? ���� ���ϵ� �� �ູ����^^'" };

		String G_name = "_______";// Globals.getInstance().getName();

		name.setText("���� ����� " + G_name + " ģ�� ������ �������ּ���.");

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
