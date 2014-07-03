package com.example.test01;

import android.R.array;
import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int counter ;
	Button addButton ,subButton;
	TextView disView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addButton = (Button) findViewById(R.id.button1);
		subButton = (Button) findViewById(R.id.button2);
		disView = (TextView) findViewById(R.id.textView1);
		
		addButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				counter++; 
				disView.setText("this is " + counter);
			}
		});
		
		subButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				String s = String.valueOf(counter);
				disView.setText(s);
				
			}
		});

	}
	
}
