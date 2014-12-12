package com.michael.suitmedia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Page2 extends Activity {
	
	TextView txt;
	Button event1, guest1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page2);
		
		txt = (TextView)findViewById(R.id.showName);
		event1 = (Button)findViewById(R.id.event);
		guest1 = (Button)findViewById(R.id.guest);
		
		Intent i = getIntent();
		String user = i.getStringExtra("namanya");
		txt.setText(user);
		
		event1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent z = new Intent(getApplicationContext(), Page3.class);
				startActivity(z);
			}
		});
		
		guest1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent a = new Intent(getApplicationContext(),Page4.class);
				startActivity(a);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page2, menu);
		return true;
	}

}
