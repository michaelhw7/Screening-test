package com.michael.suitmedia;

import java.util.ArrayList;
import java.util.Random;

import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.ListView;

public class Page3 extends Activity {

	/*ListView lEvent;
    Adapter adapter1;
    public  Event event1 = null;
    public  ArrayList<Event> aEventModel = new ArrayList<Event>();
    Resources res;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		event1 = this;
		setDataForListView();
		res = getResources();
		lEvent = (ListView)findViewById(R.id.lEvent);
		adapter1 = new Adapter(event1, aEventModel, res);
        lEvent.setAdapter(adapter1);
	}
	private void setDataForListView() {
		// TODO Auto-generated method stub  
		 for (int i = 0; i < 20; i++) {
			 final Event eModel = new Event();
			 eModel.setName("Name Event"+i);
			 Random r = new Random();
			 int x = r.nextInt(3 - 0 + 1) + 0;
			 eModel.setImage("image"+x);
			 eModel.setTanggal("14-02-200"+i);
			 aEventModel.add(eModel);
         }
    }
	public void onItemClick(int mPosition){
		Event1 eventModel = (Event1)aEventModel.get(mPosition);
		SharedPreferences.Editor editor = getSharedPreferences("prefs", MODE_PRIVATE).edit();
		editor.putString("EventName", eventModel.getName());
		editor.commit();
		startActivity(new Intent(Event.this, MainActivity.class));
		finish();

	}*/
}
