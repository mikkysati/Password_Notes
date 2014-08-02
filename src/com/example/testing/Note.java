package com.example.testing;

import java.util.UUID;


public class Note {
	private String mTitle;
	private String mContent;
	private UUID mId;
	
	public Note() {
		//Generate unique identifier for each note
		mId = UUID.randomUUID();
	}
	
	public UUID getId() {
		return mId;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}
	
	public String getContent() {
		return mContent;
	}

	public void setContent(String content) {
		mContent = content;
	}

	@Override
	public String toString() {
	return mTitle;
	}
	
}
