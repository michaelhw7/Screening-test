package com.michael.suitmedia;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText nama;
	Button nxt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		nama = (EditText)findViewById(R.id.name);
		nxt = (Button)findViewById(R.id.next);
		
		nxt.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(nama.getText().toString().equals("")){
					AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
					alert.setTitle("Error!");
					alert.setMessage("Nama harus di isi!");
					alert.setPositiveButton("OK", null);
					alert.show();
				}else{
					Intent pindah = new Intent(MainActivity.this, Page2.class);
					String namauser = nama.getText().toString();
					pindah.putExtra("namanya", namauser);
					startActivity(pindah);
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
