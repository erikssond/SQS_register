package com.example.sqs_register;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	int counter = 1;

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void sendMessage(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class); 
		EditText editText = (EditText) findViewById(R.id.activity_register_1); 
		String message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_2); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_3); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_4); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_4b); 
		message = editText.getText().toString(); 
		intent.putExtra("4b", message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_5); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_6); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_7); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_8); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_9); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		counter++;
		
		editText = (EditText) findViewById(R.id.activity_register_10); 
		message = editText.getText().toString(); 
		intent.putExtra(String.valueOf(counter), message);
		
		//intent.putExtra("sdsf", message);
		/*String s = String.valueOf(R.id.activity_register_comments);
		String a = String.valueOf(R.string.activity_register_comments);
		String d = String.valueOf(intent.getBundleExtra(String.valueOf(R.id.activity_register_comments)));*/
		startActivity(intent);
	}
}
