package com.sample.model;

import java.sql.Date;

public class BoardVo {
	private int idx;
	private String title, content, writer;
	private Date writerDate;
	
	public BoardVo() {}

	public BoardVo(int idx, String title, String content, String writer, Date writerDate) {
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writerDate = writerDate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getWriterDate() {
		return writerDate;
	}

	public void setWriterDate(Date writerDate) {
		this.writerDate = writerDate;
	}

	@Override
	public String toString() {
		return "BoardVo [idx=" + idx + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", writerDate=" + writerDate + "]";
	}
	
}
