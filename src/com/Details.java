package com;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class Details {
	
	Properties props;
	static InputStream in;
	private static String propertyfile = "/Monitor.properties";


	public static InputStream getPropertyfile() {
		in = Details.class.getResourceAsStream(propertyfile);
		return in;
	}
	
	
	
	public String getCMDurl()
	{
		String cmd="";
		try
		{
			props = new Properties();
			//props.load(new FileInputStream(propertyfile));
			props.load(getPropertyfile());
			cmd=props.getProperty("cmd");
		}
		catch(IOException io)
		{
			System.out.println("Exception in cbsurl : "+ io.toString() );
			io.printStackTrace();
		}
		return cmd;
	}
	
	
	
	public String getshellCommand()
	{
		String shellCommand="";
		try
		{
			props = new Properties();
			//props.load(new FileInputStream(propertyfile));
			props.load(getPropertyfile());
			shellCommand=props.getProperty("shellCommand");
		}
		catch(IOException io)
		{
			System.out.println("Exception in cbsusr : "+ io.toString() );
			io.printStackTrace();
		}
		return shellCommand;
	}
	
	
	
	
	
	
	
	public static Properties getProperty(){
		Properties prop = new Properties();
		
		try
		{
			prop.load(getPropertyfile());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return prop;
	}
	
}
