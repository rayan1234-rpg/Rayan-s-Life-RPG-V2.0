package com.rayangame.rpg;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Color;
public class MainActivity extends Activity {
  private WebView web;
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    getWindow().setStatusBarColor(Color.rgb(8,6,17));
    getWindow().setNavigationBarColor(Color.rgb(5,4,11));
    web = new WebView(this);
    web.setBackgroundColor(Color.rgb(7,5,13));
    WebSettings s=web.getSettings();
    s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true); s.setAllowContentAccess(true);
    s.setMediaPlaybackRequiresUserGesture(true);
    web.setWebChromeClient(new WebChromeClient());
    web.loadUrl("file:///android_asset/index.html");
    setContentView(web);
  }
  @Override public void onBackPressed() {
    if(web!=null && web.canGoBack()) web.goBack(); else super.onBackPressed();
  }
}