package com.duxl.coordinator;

import android.webkit.WebSettings;
import android.webkit.WebView;

import com.duxl.coordinator.demo.R;

import butterknife.BindView;

/**
 * WebViewActivity
 * create by duxl 2020/7/21
 */
public class WebViewActivity extends BaseActivity {

    @BindView(R.id.webView)
    WebView mWebView;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_webview;
    }

    @Override
    public void initView() {
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);

        mWebView.loadUrl(getUrl());
    }

    protected String getUrl() {
        return "https://github.com/duxl/CoordinatorDemo";
    }
}
