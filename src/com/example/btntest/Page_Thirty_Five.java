package com.example.btntest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.telephony.SmsManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Page_Thirty_Five extends Activity {

	TextView msg_txt;

	ImageButton thirty_five_personBtn1;
	ImageButton thirty_five_personBtn2;
	ImageButton thirty_five_personBtn3;

	TextView thirty_five_personName1;
	TextView thirty_five_personName2;
	TextView thirty_five_personName3;

	TextView thirty_five_personPhone1;
	TextView thirty_five_personPhone2;
	TextView thirty_five_personPhone3;

	Button thirty_five_smsBtn;
	ImageButton btn_next;
	ImageButton btn_prev;

	int flag;

	Handler mHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.page_thirty_five);

		TextView text = (TextView) findViewById(R.id.txt_step_5_title);
		TextView text2 = (TextView) findViewById(R.id.thirty_five_txt1);
		final TextView msg_txt = (TextView) findViewById(R.id.msg_txt);

		thirty_five_personBtn1 = (ImageButton) findViewById(R.id.thirty_five_personBtn1);
		thirty_five_personBtn2 = (ImageButton) findViewById(R.id.thirty_five_personBtn2);
		thirty_five_personBtn3 = (ImageButton) findViewById(R.id.thirty_five_personBtn3);

		thirty_five_personName1 = (TextView) findViewById(R.id.thirty_five_personName1);
		thirty_five_personName2 = (TextView) findViewById(R.id.thirty_five_personName2);
		thirty_five_personName3 = (TextView) findViewById(R.id.thirty_five_personName3);

		thirty_five_personPhone1 = (TextView) findViewById(R.id.thirty_five_personNumber1);
		thirty_five_personPhone2 = (TextView) findViewById(R.id.thirty_five_personNumber2);
		thirty_five_personPhone3 = (TextView) findViewById(R.id.thirty_five_personNumber3);

		thirty_five_smsBtn = (Button) findViewById(R.id.thirty_five_smsBtn);
		btn_next = (ImageButton) findViewById(R.id.thirty_fiveNext);
		btn_prev = (ImageButton) findViewById(R.id.BtnPrev);

		mHandler = new Handler();

		mHandler.postDelayed(new Runnable() {
			// Do Something
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn_prev.setVisibility(View.INVISIBLE);
				btn_next.setVisibility(View.INVISIBLE);
			}
		}, 2000); // 1000ms

		String str = getString(R.string.step_4_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#FFB90F")), 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);

		String str2 = getString(R.string.thirty_five_txt1);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#c5483b")), 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		text2.setText(sps2);

		TextView thirty_five_txt2 = (TextView) findViewById(R.id.thirty_five_txt2);
		thirty_five_txt2.setText("그들 역시 _______친구와 함께 이 위기를 극복하도록 저극적으로 도와줄 것입니다. _______친구는 충분히 도움 받을 자격이 있습니다."
				+ "많을 필요는 없습니다. 1명도 충분합니다.");

		thirty_five_personBtn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				flag = 0;

				getFriendInfo();
			}
		});

		thirty_five_personBtn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				flag = 1;

				getFriendInfo();

			}
		});

		thirty_five_personBtn3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				flag = 2;

				getFriendInfo();

			}
		});

		/* SMS 전송 */

		thirty_five_smsBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				sendSMS(thirty_five_personPhone1.getText().toString(), thirty_five_personPhone2.getText().toString(),
						thirty_five_personPhone3.getText().toString(), msg_txt.getText().toString());

			}
		});

		btn_next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Globals.getInstance().setPersonName2(thirty_five_personName1.getText().toString(),
						thirty_five_personName2.getText().toString(), thirty_five_personName3.getText().toString());

				Globals.getInstance().setPersonNumber2(thirty_five_personPhone1.getText().toString(),
						thirty_five_personPhone2.getText().toString(), thirty_five_personPhone3.getText().toString());

				Intent intent = new Intent(getApplicationContext(), Page_Thirty_Six.class);
				startActivity(intent);
				overridePendingTransition(R.anim.slide_in_right, 0);
				finish();

			}
		});
	}

	private void sendSMS(String phoneNumber1, String phoneNumber2, String phoneNumber3, String message) {

		if (phoneNumber1.equals("연락처") && phoneNumber2.equals("연락처") && phoneNumber3.equals("연락처")) {

			/* dialog */

			DialogSimple();

			return;

		}

		String SENT = "SMS_SENT";
		String DELIVERED = "SMS_DELIVERED";

		PendingIntent sentPI = PendingIntent.getBroadcast(this, 0, new Intent(SENT), 0);
		PendingIntent deliveredPI = PendingIntent.getBroadcast(this, 0, new Intent(DELIVERED), 0);

		registerReceiver(new BroadcastReceiver() {
			@Override
			public void onReceive(Context arg0, Intent arg1) {
				switch (getResultCode()) {
				case Activity.RESULT_OK:
					Toast.makeText(getApplicationContext(), "문자가 전송되었어요.", Toast.LENGTH_SHORT).show();
					break;
				case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
					Toast.makeText(getApplicationContext(), "Generic failure", Toast.LENGTH_SHORT).show();
					break;
				case SmsManager.RESULT_ERROR_NO_SERVICE:
					Toast.makeText(getApplicationContext(), "No service", Toast.LENGTH_SHORT).show();
					break;
				case SmsManager.RESULT_ERROR_NULL_PDU:
					Toast.makeText(getApplicationContext(), "Null PDU", Toast.LENGTH_SHORT).show();
					break;
				case SmsManager.RESULT_ERROR_RADIO_OFF:
					Toast.makeText(getApplicationContext(), "Radio off", Toast.LENGTH_SHORT).show();
					break;
				}
			}
		}, new IntentFilter(SENT));

		/*
		 * registerReceiver(new BroadcastReceiver(){
		 * 
		 * @Override public void onReceive(Context arg0, Intent arg1) { switch
		 * (getResultCode()) { case Activity.RESULT_OK:
		 * Toast.makeText(getBaseContext(), "문자가 전송",
		 * Toast.LENGTH_SHORT).show(); break; case Activity.RESULT_CANCELED:
		 * Toast.makeText(getBaseContext(), "SMS not delivered",
		 * Toast.LENGTH_SHORT).show(); break; } } }, new
		 * IntentFilter(DELIVERED));
		 */

		SmsManager sms = SmsManager.getDefault();

		if (!phoneNumber1.equals("연락처"))
			sms.sendTextMessage(phoneNumber1, null, message, null, null);
		Toast.makeText(getApplicationContext(), thirty_five_personName1.getText().toString() + "에게 문자가 전송되었어요.",
				Toast.LENGTH_SHORT).show();

		if (!phoneNumber2.equals("연락처"))
			sms.sendTextMessage(phoneNumber2, null, message, null, null);
		Toast.makeText(getApplicationContext(), thirty_five_personName2.getText().toString() + "에게 문자가 전송되었어요.",
				Toast.LENGTH_SHORT).show();

		if (!phoneNumber3.equals("연락처"))
			sms.sendTextMessage(phoneNumber3, null, message, null, null);
		Toast.makeText(getApplicationContext(), thirty_five_personName3.getText().toString() + "에게 문자가 전송되었어요.",
				Toast.LENGTH_SHORT).show();
	}

	private void DialogSimple() {

		AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		alt_bld.setMessage("1명도 충분해!").setCancelable(false).setPositiveButton("OK",
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int id) {

						dialog.cancel();
					}

				});

		AlertDialog alert = alt_bld.create();
		alert.show();

	}

	public void getFriendInfo() {

		Intent intent = new Intent(Intent.ACTION_PICK);
		intent.setData(ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
		startActivityForResult(intent, 0);

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub

		if (RESULT_OK == resultCode) {

			Cursor cursor = getContentResolver().query(data.getData(),
					new String[] { ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
							ContactsContract.CommonDataKinds.Phone.NUMBER },
					null, null, null);

			cursor.moveToFirst();
			String sName = cursor.getString(0);
			String sNumber = cursor.getString(1);
			cursor.close();

			switch (flag) {

			case 0:
				thirty_five_personName1.setText(sName);
				thirty_five_personPhone1.setText(sNumber);
				break;
			case 1:
				thirty_five_personName2.setText(sName);
				thirty_five_personPhone2.setText(sNumber);
				break;
			case 2:
				thirty_five_personName3.setText(sName);
				thirty_five_personPhone3.setText(sNumber);
				break;

			}
		}

		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub

		int action = event.getAction();

		switch (action) {

		case MotionEvent.ACTION_DOWN: // 화면을 터치했을때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_UP: // 화면을 터치했다 땠을때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		case MotionEvent.ACTION_MOVE: // 화면을 터치하고 이동할때
			btn_prev.setVisibility(View.VISIBLE);
			btn_next.setVisibility(View.VISIBLE);
			break;

		}
		mHandler.postDelayed(new Runnable() {
			// Do Something
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn_prev.setVisibility(View.INVISIBLE);
				btn_next.setVisibility(View.INVISIBLE);
			}
		}, 2000); // 1000ms
		return super.onTouchEvent(event);
	}

}
