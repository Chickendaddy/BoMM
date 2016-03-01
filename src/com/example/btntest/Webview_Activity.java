package com.example.btntest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Webview_Activity extends Activity {

	private final Handler handler = new Handler();
	WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview_);

		webView = (WebView) findViewById(R.id.webView1);

		Intent intent = getIntent();
		String str = intent.getStringExtra("name");

		WebClient webClient = new WebClient();

		webView.setWebViewClient(new WebViewClient());
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://m.map.naver.com/");

	}

	@SuppressLint("SetJavaScriptEnabled")
	private class WebClient extends WebViewClient {

		public WebClient() {
			// TODO Auto-generated constructor stub
			webView.setWebViewClient(new WebViewClient());
			webView.getSettings().setJavaScriptEnabled(true);
			webView.loadUrl("http://m.map.naver.com/");
		}

		@Override
		public void onPageFinished(WebView view, String url) {
			// TODO Auto-generated method stub
			super.onPageFinished(view, url);
			String str = "[$]\\(\"._searchView\"\\).css\\(\"display\",\"block\"\\)";
			String str2 = "[$]\\('input\\[name=search_query\\]'\\).attr\\('value',\"¼ºµ¿±¸\"\\)";
			webView.loadUrl("javascript:" + str + str2);
		}

	}

}
