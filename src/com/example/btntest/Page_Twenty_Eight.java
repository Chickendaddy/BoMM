package com.example.btntest;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.view.WindowManager;

public class Page_Twenty_Eight extends Activity{
	
	ListView listView;
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> list1 = new ArrayList<String>();
	DialogInterface mPopupDlg = null;
	
	Button btnAdd;
	Button btnMinus;
	
	ImageButton twenty_eight_nextBtn;
	ImageButton twenty_eight_prevBtn;
	
	ArrayAdapter<String> adapter;
	ArrayAdapter<String> adapter1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_twenty_eight);
		
		listView = (ListView) findViewById(R.id.listView1);
		btnAdd = (Button)findViewById(R.id.twenty_eight_Btn1);
		btnMinus = (Button)findViewById(R.id.twenty_eight_Btn2);
		Button twenty_eight_examBtn = (Button)findViewById(R.id.twenty_eight_examBtn);
		
		twenty_eight_prevBtn = (ImageButton)findViewById(R.id.twenty_eight_prevBtn);
		twenty_eight_nextBtn = (ImageButton)findViewById(R.id.twenty_eight_nextBtn);
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, list);
		
		Button twenty_eight_Btn1 = (Button)findViewById(R.id.twenty_eight_Btn1);
		
		TextView text = (TextView)findViewById(R.id.twenty_eight_txt1);
		TextView text2 = (TextView)findViewById(R.id.twenty_eight_txt3);
		TextView text3 = (TextView)findViewById(R.id.twenty_eight_txt4);
		
		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				String item = list.get(position);
			}
		});
		
		final EditText twenty_eight_EditTxt1 = (EditText)findViewById(R.id.twenty_eight_EditTxt1);
		
		btnAdd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = twenty_eight_EditTxt1.getText().toString();
				//Globals.getInstance().setList_1(str);
				list.add(str);
				adapter.notifyDataSetChanged();
				twenty_eight_EditTxt1.setText("");
			}
		});
		
		btnMinus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int pos = listView.getCheckedItemPosition();
				//Globals.getInstance().subList_1(pos);
				list.remove(pos);
				adapter.notifyDataSetChanged();
				listView.clearChoices();

				
			}
		});
		
		
		///////////////////////////////////////////////////
		
		String str = getString(R.string.twenty_eight_txt1);
		SpannableStringBuilder sps = new SpannableStringBuilder();
		SpannableString ss = new SpannableString(str);
		ss.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps.append(ss);
		text.setText(sps);
		
		String str2 = getString(R.string.twenty_eight_txt3);
		SpannableStringBuilder sps2 = new SpannableStringBuilder();
		SpannableString ss2 = new SpannableString(str2);
		ss2.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps2.append(ss2);
		text2.setText(sps2);
		
		String str3 = getString(R.string.step_3_title);
		SpannableStringBuilder sps3 = new SpannableStringBuilder();
		SpannableString ss3 = new SpannableString(str3);
		ss3.setSpan(new ForegroundColorSpan(Color.parseColor("#88b7d6")), 9, 29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		sps3.append(ss3);
		text3.setText(sps3);
		
		twenty_eight_examBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				LayoutInflater inflater = getLayoutInflater();
				final View dialogView = inflater.inflate(R.layout.twenty_eight_dialog, null);
				dialogView.setBackgroundColor(Color.rgb(52, 152, 219));
				Button _btn_exit = (Button) dialogView.findViewById(R.id.btn_exit);

				_btn_exit.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						mPopupDlg.dismiss();
					}
				});

				AlertDialog.Builder buider = new AlertDialog.Builder(v.getContext());
				buider.setView(dialogView);
				AlertDialog dialog = buider.create();
				dialog.setCanceledOnTouchOutside(false);
				mPopupDlg = buider.show();
				
			}
		});
		
		twenty_eight_nextBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(0 == getCount()){
				
					DialogSimple();
					
					return;
					
				}else{
					
					Globals.getInstance().setList_3(list.get(0));
					
					if(1 < list.size()){
						
						Globals.getInstance().setList_4(list.get(1));
						
					}
					
					
					Intent intent = new Intent(getApplicationContext(), Page_Thirty.class);
					startActivity(intent);
					finish();
					
				}
			}
		});
		
		twenty_eight_prevBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(getApplicationContext(), Page_Twenty_Seven.class);
				startActivity(intent);
				finish();
			}
		});
		
	}
	
	public int getCount() {

		return listView.getCount();
	}
	
	private void DialogSimple(){
		
		 AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
		    alt_bld.setMessage("내 맘에 꼭 드는 '어디서'를 작성해 볼까?").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
		        
		    	public void onClick(DialogInterface dialog, int id) {
		            
		    		dialog.cancel();
		        }
		    	
		        });
		    
		    AlertDialog alert = alt_bld.create();		    
		    alert.show();
		
	}

}
