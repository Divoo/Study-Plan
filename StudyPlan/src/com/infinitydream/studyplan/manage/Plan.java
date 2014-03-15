package com.infinitydream.studyplan.manage;

import java.sql.Time;
import java.util.Vector;

import com.infinitydream.studyplan.manage.Part.PARTTYPE;

public class Plan
{
	//private
	private int id;
	private String title;
	private String info;
	private int rating;
	private String tags;
	private Time totaltime;
	private Time runtime;
	private Vector<Part> partslist;
	
	//public
	public Plan(int pid,String ptitle,String pinfo,int prate,String ptags)
	{
		id = pid;
		title = ptitle;
		info = pinfo;
		rating = prate;
		tags = ptags;
		
		totaltime = new Time(0,0,0);
		runtime = new Time(0,0,0);
		partslist = new Vector<Part>();
	}
	
	public void setRunTime(int hours,int minutes,int seconds)
	{
		runtime.setHours(hours);
		runtime.setMinutes(minutes);
		runtime.setSeconds(seconds);
	}
	
	public void addPart(String ptitle, String pnote,PARTTYPE ptype,int hours,int minutes,int seconds)
	{
		Part newpart = new Part(ptitle,pnote,ptype);
		newpart.setTime(hours, minutes, seconds);
		partslist.add(newpart);
		
	}
}
