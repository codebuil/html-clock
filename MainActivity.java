package clocks.html.app;



import android.app.Activity;
import android.os.Bundle;

import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;
import android.widget.ListView;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.view.ViewGroup.LayoutParams;


public class MainActivity extends Activity
{
	boolean a;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        a=false;
		final EditText codes= (EditText) findViewById(R.id.codes);
		codes.setText( "<html><body  bgcolor='#00ff00' onload='setTimeout(myFunction, 100); '><h1><p id='demo'></p></h1><script>function myFunction() {document.getElementById(\"demo\").innerHTML = Date();setTimeout(myFunction, 1000);}</script></body></html>");

		WebView browser = (WebView) findViewById(R.id.webview);
		browser.getSettings().setJavaScriptEnabled(true);

		String pages= "<html><body  bgcolor='#00ff00' onload='setTimeout(myFunction, 100); '><h1><p id='demo'></p></h1><script>function myFunction() {document.getElementById(\"demo\").innerHTML = Date();setTimeout(myFunction, 1000);}</script></body></html>";
		browser.loadData(pages, "text/html", "UTF-8");



    }

	public void  onOk_click(View v) {
		a=!a;
		final EditText codes= (EditText) findViewById(R.id.codes);
		WebView browser = (WebView) findViewById(R.id.webview);

		String pages= codes.getText().toString();
		browser.loadData(pages, "text/html", "UTF-8");





		LayoutParams params = codes.getLayoutParams();

		if(a){
			codes.setVisibility(v.VISIBLE);
			params.height = 200;

			codes.setLayoutParams(params);
		}

		if(!a){
			codes.setVisibility(v.INVISIBLE);
			params.height = 0;

			codes.setLayoutParams(params);
		}

	}
}

