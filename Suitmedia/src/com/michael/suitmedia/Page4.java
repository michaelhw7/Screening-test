package com.michael.suitmedia;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Page4 extends Activity {
	
	ProgressDialog dialog;
	JSONObject obj;
	ArrayList<Data> datas = new ArrayList<Data>(); 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page4);
		dialog = new ProgressDialog(this);
		new Process().execute("");
		final ListView listView = (ListView)findViewById(R.id.listView1);
		
		ArrayAdapter<Data> arrayAdap = new ArrayAdapter<Data>(this, android.R.layout.simple_list_item_1, datas);
		
		listView.setAdapter(arrayAdap);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page4, menu);
		return true;
	}
	
	public void setListData(){
		//set list dari array list
	}
	
	class Process extends AsyncTask<String,String,String>{
		protected void onPreExecute(){
			super.onPreExecute();
			dialog.setTitle("Getting data from server. . .");
			dialog.show();
		}

		@Override
		protected String doInBackground(String... params) {
			GetJSON get = new GetJSON();
			obj = get.getData("http://dry-sierra-6832.herokuapp.com/api/people");
			try{
				JSONObject temp = obj.getJSONObject("");
				for(int i=0;i<temp.length();i++){
					String id = temp.getString("ID");
					String fn = temp.getString("firstName");
					String dob = temp.getString("dob");
					Data d = new Data(id,fn,dob);
					datas.add(d);
				}
				
			}catch (JSONException e){
				e.printStackTrace();
			}
			return null;
		}
		
		protected void onPostExecute(String result){
			super.onPostExecute(result);
			dialog.dismiss();
			setListData();
		}
		
		
	}

}
