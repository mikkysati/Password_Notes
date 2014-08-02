package com.example.testing;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

// to store values of notes
// this class is singleton
public class NoteLab {
	
	private static NoteLab sNoteLab;
	private Context mAppContext;
	private ArrayList<Note> mNotes;
	
	private NoteLab(Context appContext) {
		mAppContext = appContext;
		mNotes = new ArrayList<Note>();
		for (int i = 0; i < 100; i++) {
			Note c = new Note();
			c.setTitle("Note0 #" + i);
			mNotes.add(c);
			}
	}
	
	public static NoteLab get(Context c) {
		if(sNoteLab == null) {
			sNoteLab = new NoteLab(c.getApplicationContext());
		}
		return sNoteLab;
	}

	public ArrayList<Note> getNotes() {
		return mNotes;
	}
	
	public Note getNote(UUID id) {
		for (Note c : mNotes) {
		if (c.getId().equals(id))
		return c;
		}
		return null;
		}
	

}
