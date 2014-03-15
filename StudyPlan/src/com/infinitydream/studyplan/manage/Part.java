package com.infinitydream.studyplan.manage;

import java.sql.Time;

 

public class Part
{	
	//private
	private String title;
	private String note;
	private Time parttime;
	private PARTTYPE parttype;
	
	
	//public
	public static enum PARTTYPE
	{
		IMAGE,
		PDF,
		URL;
	}
	
	public Part(String ptitle, String pnote,PARTTYPE ptype)
	{
		parttime = new Time(0,0,0);
		parttype = ptype;
		title = ptitle;
		note = pnote;
	}
	
	public void setTime(int hours,int minutes,int seconds)
	{
		parttime.setHours(hours);
		parttime.setMinutes(minutes);
		parttime.setSeconds(seconds);
	}
	
	
}
