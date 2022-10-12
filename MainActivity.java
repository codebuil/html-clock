package mydomain.HelloWorld;

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


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends Activity
{
	boolean a;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView browser = (WebView) findViewById(R.id.webview);
browser.getSettings().setJavaScriptEnabled(true);

String pages= "<html><body  bgcolor='#00ff00' onload='setTimeout(myFunction, 100); '><h1><p id='demo'></p></h1><script>function myFunction() {document.getElementById(\"demo\").innerHTML = Date();setTimeout(myFunction, 1000);}</script></body></html>";
browser.loadData(pages, "text/html", "UTF-8");


    }

	
}
