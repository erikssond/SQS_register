package com.example.sqs_register;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);      
	    Bundle extras = getIntent().getExtras();
	    
	    TextView textView = new TextView(this);  
	    int counter = 1;
	    String value = "";

	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    /*value = extras.getString("4b");
	    textView.append(value);*/
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    /*counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);
	    
	    counter++; 
	    
	    value = extras.getString(String.valueOf(counter));
	    textView.append(value);*/
	    

	    setContentView(textView); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_display_message, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
