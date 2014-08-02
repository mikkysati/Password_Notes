package com.example.testing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	public Button button;
	public EditText edittext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//ToDo:1.Design an activity for creating a password
		//2. Create a good background image
		
		setContentView(R.layout.activity_main);
		
		edittext = (EditText) findViewById(R.id.text_password);
		button = (Button) findViewById(R.id.button);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//taking password from user
				String check = (String) edittext.getText().toString();
				
				//checking password
				if(check.equals("mikky")) {
					Intent i = new Intent(getApplicationContext(), ListActivity.class);
					startActivity(i);
					edittext.setText("");
				}
				// if password is wrong 
				else {
				Toast.makeText(getApplicationContext(),"Incorrect Password",Toast.LENGTH_SHORT).show();
				edittext.setText("");
				}
			}
		});
		
	}

	

}
