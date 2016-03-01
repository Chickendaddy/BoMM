package com.example.btntest;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Page_Thirty extends Activity{

	int flag = 0;
	ListView listView;
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> list1 = new ArrayList<String>();
	
	Button btnAdd;
	Button btnMinus;

	ArrayAdapter<String> adapter;
	ArrayAdapter<String> adapter1;
	DialogInterface mPopupDlg = null;
	
	//ArrayList<AddrBean> beanList;
	//AddrBean bean;
	
	ImageButton thirty_personBtn1;
	ImageButton thirty_personBtn2;
	ImageButton thirty_personBtn3;
	
	TextView thirty_personName1;
	TextView thirty_personName2;
	TextView thirty_personName3;
	
	TextView thirty_personNumber1;
	TextView thirty_personNumber2;
	TextView thirty_personNumber3;
	
	ImageButton thirty_nextBtn;
	ImageButton thirty_prevBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_thirty);
		
		listView = (ListView) findViewById(R.id.thirty_listView);
		btnAdd = (Button) findViewById(R.id.thirty_addBtn);
		btnMinus = (Button) findViewById(R.id.thirty_minusBtn);
		Button examBtn = (Button)findViewById(R.id.thirty_examBtn);
		
		/* 연락처 버튼 */
		thirty_personBtn1 = (ImageButton)findViewById(R.id.thirty_personBtn1);
		thirty_personBtn2 = (ImageButton)findViewById(R.id.thirty_personBtn2);
		thirty_personBtn3 = (ImageButton)findViewById(R.id.thirty_personBtn3);
		
		thirty_personName1 = (TextView)findViewById(R.id.thirty_personName1);
		thirty_personName2 = (TextView)findViewById(R.id.thirty_personName2);
		thirty_personName3 = (TextView)findViewById(R.id.thirty_personName3);
		
		thirty_personNumber1 = (TextView)findViewById(R.id.thirty_personNumber1);
		thirty_personNumber2 = (TextView)findViewById(R.id.thirty_personNumber2);
		thirty_personNumber3 = (TextView)findViewById(R.id.thirty_personNumber3);
		
		thirty_nextBtn = (ImageButton)findViewById(R.id.thirty_nextBtn);
		thirty_prevBtn = (ImageButton)findViewById(R.id.thirty_prevBtn);
		
		TextView thirty_title = (TextView)findViewById(R.id.thirty_title);
		TextView thirty_txt1 = (TextView)findViewById(R.id.thirty_txt1);
		TextView thirty_txt3 = (TextView)findViewById(R.id.thirty_txt3);
		
		String str = getString(R.string.step_3_title);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 9, 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		thirty_title.setText(sps);
		
		String str2 = getString(R.string.thirty_txt1);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		thirty_txt1.setText(sps2);
		
		String str3 = getString(R.string.thirty_txt3);
		SpannableStringBuilder sps3 = new SpannableStringBuilder();
		SpannableString ss3 = new SpannableString(str3);
		ss3.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps3.append(ss3);
		thirty_txt3.setText(sps3);
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, list);
		
		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				String item = list.get(position);
			}
		});
		
		final EditText edit1 = (EditText)findViewById(R.id.thirty_editTxt); 
		
		btnAdd.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				String str = edit1.getText().toString();
				//Globals.getInstance().setList_1(str);
				list.add(str);
				adapter.notifyDataSetChanged();
				edit1.setText("");
				// TODO Auto-generated method stub

			}
		});
		
		btnMinus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				int pos = listView.getCheckedItemPosition();
				//Globals.getInstance().subList_1(pos);
				list.remove(pos);
				adapter.notifyDataSetChanged();
				listView.clearChoices();

				// TODO Auto-generated method stub

			}
		});
		
		examBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				LayoutInflater inflater = getLayoutInflater();
				final View dialogView = inflater.inflate(R.layout.thirty_dialog, null);
				dialogView.setBackgroundColor(Color.rgb(52, 152, 219));
				Button _btn_exit = (Button) dialogView.findViewById(R.id.btn_exit);

				_btn_exit.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						mPopupDlg.dismiss();
					}
				});

				AlertDialog.Builder buider = new AlertDialog.Builder(v.getContext()); // AlertDialog.Builder

				buider.setView(dialogView); 
				AlertDialog dialog = buider.create();
				dialog.setCanceledOnTouchOutside(false);
				mPopupDlg = buider.show();
				
			}
		});
		
		/* 연락처 가져오기 버튼 구현부 */	///////////////////////////////////////////////////////////////
		
		thirty_personBtn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				getFriendInfo();
				
			}
		});
		
		thirty_personBtn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				flag = 1;
				getFriendInfo();
			}
		});
		
		thirty_personBtn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				flag = 2;
				getFriendInfo();
			}
		});
		
		thirty_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(thirty_personName1.getText().equals("이름")){
					
					DialogSimple2();
					
					return;
					
				}else if(thirty_personName2.getText().equals("이름")){
					
					DialogSimple2();
					
					return;
					
				}else if(thirty_personName3.getText().equals("이름")){
					
					DialogSimple2();
					
					return;
					
				}
				
				if(0 == getCount()){
					
					DialogSimple();
					
					return;
					
				}
				
				Globals.getInstance().setPersonName(thirty_personName1.getText().toString(), thirty_personName2.getText().toString(), thirty_personName3.getText().toString());
				Globals.getInstance().setPersonNumber(thirty_personNumber1.getText().toString(), thirty_personNumber2.getText().toString(), thirty_personNumber3.getText().toString());
				Globals.getInstance().setDo1(list.get(0));
				
				if(1 < list.size()){
					
					Globals.getInstance().setDo2(list.get(1));
					
				}
				
				Intent intent = new Intent(getApplicationContext(), Page_Thirty_Three.class);
				startActivity(intent);
				finish();
				
			}
		});
		
		thirty_prevBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(getApplicationContext(), Page_Twenty_Eight.class);
				startActivity(intent);
				finish();
			}
		});
	}
	
	private void DialogSimple2(){
		
		 AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		    alt_bld.setMessage("누구와 할지 다시한번 곰곰히 생각해봐~").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
		        
		    	public void onClick(DialogInterface dialog, int id) {
		            
		    		dialog.cancel();
		        }
		    	
		        });
		    
		    AlertDialog alert = alt_bld.create();		    
		    alert.show();
		
	}
	
	private void DialogSimple(){
		
		 AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		    alt_bld.setMessage("무엇을 할지 꼭! 작성해 보자!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
		        
		    	public void onClick(DialogInterface dialog, int id) {
		            
		    		dialog.cancel();
		        }
		    	
		        });
		    
		    AlertDialog alert = alt_bld.create();		    
		    alert.show();
		
	}
	
	public int getCount() {

		return listView.getCount();
	}
	
	public void getFriendInfo(){
		
		Intent intent = new Intent(Intent.ACTION_PICK);
		intent.setData(ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
		startActivityForResult(intent, 0);

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		
		if(RESULT_OK == resultCode){
			
			Cursor cursor = getContentResolver().query(data.getData(), new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, 
					ContactsContract.CommonDataKinds.Phone.NUMBER}, null, null, null);
			
			cursor.moveToFirst();
			String sName = cursor.getString(0);
			String sNumber = cursor.getString(1);
			cursor.close();
			
			switch(flag){
				
			case 0 :
				thirty_personName1.setText(sName);
				thirty_personNumber1.setText(sNumber);
				break;
			case 1 :
				thirty_personName2.setText(sName);
				thirty_personNumber2.setText(sNumber);
				break;
			case 2 :
				thirty_personName3.setText(sName);
				thirty_personNumber3.setText(sNumber);
				break;
				
			}
		}
		
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	/*
	public void getAddr(){
		
		Cursor cursor = null;
		
		Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
		String phoneName = ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME;
		
		String[] ad = new String[]{
				
			ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER	
				
		};
		
		cursor = getContentResolver().query(uri, ad, null, null, phoneName);
		cursor.moveToFirst();
		
		while(cursor.moveToNext()){
			
			if(null != cursor.getString(1)){
				
				if(0 == list.size()){
					
					bean = new AddrBean();
					bean.setName(cursor.getString(0));
					bean.setNumber(cursor.getString(1));
					beanList.add(bean);
				}else{
					
					if(!beanList.get(beanList.size()-1).getNumber().equals(cursor.getString(1))){
					
						bean = new AddrBean();
						bean.setName(cursor.getString(0));
						bean.setNumber(cursor.getString(1));
						beanList.add(bean);
						
					}
					
				}
				
			}
			
		}
		
		
		
	}
	
	public class AddrBean{
		
		String name, phone;
		
		public void setName(String name){
			
			this.name = name;
			
		}
		
		public void setNumber(String phone){
			
			this.phone = phone;
			
		}
		
		public String getNumber(){
			
			return phone;
			
		}
		
	}
	*/
	
}
