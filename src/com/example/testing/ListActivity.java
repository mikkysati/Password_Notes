package com.example.testing;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.TextView;

public class ListActivity extends FragmentActivity {
	public static TextView view;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		//ToDo: Support for two plane layout
		// calling fragment library to support V2.3
		FragmentManager manager = getSupportFragmentManager();
		Fragment fragment = manager.findFragmentById(R.id.fragmentContainer);
		
		// creating list fragment
		if(fragment == null) {
			fragment = new ListFragment();
			manager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
			
		}
		
	
	
	}
	
	
	
	@Override
	public void onStop() {
		super.onStop();
		// closing the activity if screen is locked 
		finish();
		
	}

}



