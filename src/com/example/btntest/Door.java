package com.example.btntest;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Contacts.SettingsColumns;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Door extends FragmentActivity {

	private ViewPager mViewPager;
	private PagerAdapter mPagerAdapter;
	static Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_door);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mPagerAdapter);
		mContext = this;

	}

	public class PagerAdapter extends FragmentStatePagerAdapter {

		public PagerAdapter(FragmentManager fm) {
			super(fm);
		}

		public Fragment getItem(int position) {
			// �ش��ϴ� page�� Fragment�� �����մϴ�.

			return PageFragment.create(position);
		}

		@Override
		public int getCount() {
			return 11; // �� 11���� page�� �����ݴϴ�.
		}
	}

	public static class PageFragment extends Fragment implements View.OnClickListener {

		private int mPageNumber;
		ViewGroup rootView;
		ImageButton prev;
		ImageButton next;

		public static PageFragment create(int pageNumber) {
			PageFragment fragment = new PageFragment();
			Bundle args = new Bundle();
			args.putInt("page", pageNumber);
			fragment.setArguments(args);
			return fragment;
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);

			mPageNumber = getArguments().getInt("page");

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

			if (0 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.fiveText);
				prev = (ImageButton) rootView.findViewById(R.id.imgbtn_prev);
				next = (ImageButton) rootView.findViewById(R.id.imgbtn_next);

				Handler mHandler = new Handler();
				mHandler.postDelayed(new Runnable() {
					// Do Something
					@Override
					public void run() {
						// TODO Auto-generated method stub
						prev.setVisibility(View.INVISIBLE);
						next.setVisibility(View.INVISIBLE);
					}
				}, 2000); // 1000ms
				textView.setText("�� ������ �극��ũ, ��\n\n�����ϸ鼭...");

			} else if (1 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page2, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.sixText);
				textView.setText("������, ������ ���� ���̾�������.\n\n�������� ���Ӱ�, �� �ܷο��� �̴ϴ�. \n\n\n");

			} else if (2 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page3, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.sevenText);
				textView.setText("���� �ִ� �������κ��� ����� ����\n\n�ڻ��� ����������,\n\n������ �ڻ� �õ��� " + Globals.getInstance().getName()
						+ " ģ�����Դ�\n\n"
						+ "���� �� ���� ȭ,�̿�,���,\n\n�׸��� ���� ��ȸ�� �ٰ���������.\n\n���� �Ͼ�� �ִ� ��� �ϵ���...\n\n�����ϱ� ��á�� �̴ϴ�.");

			} else if (3 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page4, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.eightText);
				textView.setText(
						"�̷��� ����� ������ ��Ȳ����\n\n " + Globals.getInstance().getName() + " ģ������ �� �� �� �ִ� ���� �� �Ѱ���.\n\n\n\n");

			} else if (4 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page5, container, false);

			} else if (5 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page6, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.tenText);
				textView.setText("������ ����� �����ص� �˴ϴ�.\n\n�Ҹ����� ���� �� ����\n\nũ�� �ѹ� �Ҹ������� �����ϴ�.");

			} else if (6 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page7, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.elevenText);
				textView.setText("�� ���� " + Globals.getInstance().getName()
						+ " ģ����\n\n���� �ñ⸦ �̰ܳ��� ȸ���ذ��� �����Դϴ�.\n\n�׸��� ȸ���� �ϴ� ���� ���� �Ҿ� ������..\n\n"
						+ "�װ� �ʹٴ� �������� ������ �� �� \n\n " + Globals.getInstance().getName()
						+ " ģ�� ������ �극��ũ�� �ɰ�\n\n������ �� �ֵ���\n\n'�� ������ �극��ũ,��'���ø����̼���\n\n" + "���� ������ �Ǿ����� �ϴ� �ٶ��Դϴ�.");

			} else if (7 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page8, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.twelveText);
				textView.setText(" " + Globals.getInstance().getName()
						+ " ģ���� ���� ��Ȳ�� �ε���\n\n����̳� ����°� ���� �������� �����\n\n�װ� �ʹٴ� �������� �̾��� ��,");

			} else if (8 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page9, container, false);
				TextView textView1 = (TextView) rootView.findViewById(R.id.thirteenText1);
				TextView textView2 = (TextView) rootView.findViewById(R.id.thirteenText2);

				textView1.setText("���� ������ �̷� ��������\n�����ϱ� ���� ����� �� �ִ�");
				textView2.setText("\n " + Globals.getInstance().getName()
						+ " ģ������\n\n ��ó������ ��ȸ�� ����ü����� �����Դϴ�.\n\n���� ���� �ڻ��� �õ��� ������� ������� �ϴ�\n\n"
						+ "ġ�� ���α׷� �� �ϳ��� Ȱ��ǰ� �ֽ��ϴ�.");

			} else if (9 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page10, container, false);
				TextView textView1 = (TextView) rootView.findViewById(R.id.fourteenText1);
				TextView textView2 = (TextView) rootView.findViewById(R.id.fourteenText2);

				textView1.setText(
						" " + Globals.getInstance().getName() + " ģ�� �������� �������� �����̳�\n\n������ �극��ũ�� �� �۵��ϱ� ���ؼ���\n\n "
								+ Globals.getInstance().getName() + " ģ���� ������ �ʿ��մϴ�.");
				textView2.setText("\n����� �ʽ��ϴ�");

			} else if (10 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page11, container, false);
				TextView textView1 = (TextView) rootView.findViewById(R.id.fifteenText1);
				TextView textView2 = (TextView) rootView.findViewById(R.id.fifteenText2);

				textView1.setText(
						"'�� ������ �극��ũ,��' ���ø����̼ǿ���\n\n�����ϴ� �ܰ迡 ���� �����غ��鼭\n\n�����Ӱ� ����� �˴ϴ�.\n\n�������� ����, �ϴ� �����غ����?");
				textView2.setTextSize(12);
				textView2.setText("'�� ������ �극��ũ,��' ���ø����̼��� ������� ���� �ڻ��� �õ��߰�\n�̸� �غ��� ģ������ �̾߱⸦ �������� �ϰ� �ֽ��ϴ�.\n\n"
						+ "�� ���ø����̼��� �Ѿ���б� �Ϲݴ��п� ��ȣ�а����� �����Ͽ�����,\n�ñ��� ������ ���� ��� chansfan@daum.net���� �������ּ���.");

				Button EnterBtn = (Button) rootView.findViewById(R.id.fifteenBtn);
				EnterBtn.setOnClickListener(this);

			}

			return rootView;

			// ((TextView)
			// rootView.findViewById(R.id.number)).setText(mPageNumber + "");

		}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			switch (v.getId()) {

			case R.id.fifteenBtn:

				Intent intent = new Intent(v.getContext(), Page_SixTeen.class);
				startActivity(intent);
				// Toast toast = Toast.makeText(mContext, "haha",
				// Toast.LENGTH_SHORT);
				// toast.show();
				getActivity().finish();
				break;

			}

		}
	}
}
