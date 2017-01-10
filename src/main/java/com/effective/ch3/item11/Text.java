package com.effective.ch3.item11;

public class Text implements Cloneable {
	private String title;
	private String content;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Text() {
		super();
	}

	public Text(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
