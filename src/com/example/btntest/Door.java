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
			// 해당하는 page의 Fragment를 생성합니다.

			return PageFragment.create(position);
		}

		@Override
		public int getCount() {
			return 11; // 총 11개의 page를 보여줍니다.
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
				textView.setText("내 마음의 브레이크, 봄\n\n시작하면서...");

			} else if (1 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page2, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.sixText);
				textView.setText("요즈음, 참으로 힘든 날이었겠지요.\n\n누구보다 괴롭고, 또 외로웠을 겁니다. \n\n\n");

			} else if (2 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page3, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.sevenText);
				textView.setText("삶이 주는 고통으로부터 벗어나기 위해\n\n자살을 선택했지만,\n\n지금은 자살 시도가 " + Globals.getInstance().getName()
						+ " 친구에게는\n\n"
						+ "참을 수 없는 화,미움,우울,\n\n그리고 깊은 후회로 다가오겠지요.\n\n지금 일어나고 있는 모든 일들을...\n\n감당하기 벅찼을 겁니다.");

			} else if (3 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page4, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.eightText);
				textView.setText(
						"이렇게 힘들고 복잡한 상황에서\n\n " + Globals.getInstance().getName() + " 친구에게 해 줄 수 있는 말은 단 한가지.\n\n\n\n");

			} else if (4 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page5, container, false);

			} else if (5 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page6, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.tenText);
				textView.setText("지금은 충분히 슬퍼해도 됩니다.\n\n소리내어 꺽꺽 울어도 좋고\n\n크게 한번 소리질러도 좋습니다.");

			} else if (6 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page7, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.elevenText);
				textView.setText("이 또한 " + Globals.getInstance().getName()
						+ " 친구가\n\n힘든 시기를 이겨내고 회복해가는 과정입니다.\n\n그리고 회복을 하는 과정 동안 불쑥 끼어드는..\n\n"
						+ "죽고 싶다는 부정적인 생각이 들 때 \n\n " + Globals.getInstance().getName()
						+ " 친구 마음의 브레이크를 걸고\n\n제어할 수 있도록\n\n'내 마음의 브레이크,봄'어플리케이션이\n\n" + "많은 도움이 되었으면 하는 바람입니다.");

			} else if (7 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page8, container, false);
				TextView textView = (TextView) rootView.findViewById(R.id.twelveText);
				textView.setText(" " + Globals.getInstance().getName()
						+ " 친구가 힘든 상황에 부딪혀\n\n우울이나 무기력감 등의 부정적인 기분이\n\n죽고 싶다는 생각으로 이어질 때,");

			} else if (8 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page9, container, false);
				TextView textView1 = (TextView) rootView.findViewById(R.id.thirteenText1);
				TextView textView2 = (TextView) rootView.findViewById(R.id.thirteenText2);

				textView1.setText("본인 스스로 이런 감정들을\n통제하기 위해 사용할 수 있는");
				textView2.setText("\n " + Globals.getInstance().getName()
						+ " 친구만의\n\n 대처전략과 사회적 지지체계들의 모음입니다.\n\n또한 실제 자살을 시도한 사람들을 대상으로 하는\n\n"
						+ "치료 프로그램 중 하나로 활용되고 있습니다.");

			} else if (9 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page10, container, false);
				TextView textView1 = (TextView) rootView.findViewById(R.id.fourteenText1);
				TextView textView2 = (TextView) rootView.findViewById(R.id.fourteenText2);

				textView1.setText(
						" " + Globals.getInstance().getName() + " 친구 마음속의 부정적인 감정이나\n\n생각의 브레이크로 잘 작동하기 위해서는\n\n "
								+ Globals.getInstance().getName() + " 친구의 도움이 필요합니다.");
				textView2.setText("\n어렵지 않습니다");

			} else if (10 == mPageNumber) {

				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page11, container, false);
				TextView textView1 = (TextView) rootView.findViewById(R.id.fifteenText1);
				TextView textView2 = (TextView) rootView.findViewById(R.id.fifteenText2);

				textView1.setText(
						"'내 마음의 브레이크,봄' 어플리케이션에서\n\n제시하는 단계에 따라 생각해보면서\n\n자유롭게 적어보면 됩니다.\n\n망설이지 말고, 일단 시작해볼까요?");
				textView2.setTextSize(12);
				textView2.setText("'내 마음의 브레이크,봄' 어플리케이션의 내용들은 실제 자살을 시도했고\n이를 극복한 친구들의 이야기를 바탕으로 하고 있습니다.\n\n"
						+ "본 어플리케이션은 한양대학교 일반대학원 간호학과에서 개발하였으며,\n궁금한 사항이 있을 경우 chansfan@daum.net으로 문의해주세요.");

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
