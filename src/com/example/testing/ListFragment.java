package com.example.testing;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class ListFragment extends Fragment {
	//to enter note through user 
	EditText mTitleField;
	Note mNote;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
	}

	//ToDo: 1.Create listview and gridview to enter data
	// 2.Code to store data
	// 3.Furter UI improvements
	// 4.Adding gestures and required menu
	// 5.Implement navigation drawer
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_list,parent,false);
		mTitleField = (EditText) v.findViewById (R.id.content);
		
		mTitleField.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(
			CharSequence c, int start, int before, int count) {
			mNote.setTitle(c.toString());
			}
			public void beforeTextChanged(
			CharSequence c, int start, int count, int after) {
			// This space intentionally left blank
			}
			public void afterTextChanged(Editable c) {
			// This one too
			}
			});
		
		

		return v;
	}
	
}
