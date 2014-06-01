package org.hnm736.spring;

import java.util.Date;

public class World {
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}

class SecondWorld extends World	{
	public Date getDate()	{
		return new Date();
	}
}