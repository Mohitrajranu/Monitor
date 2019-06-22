package com;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class JavaRunCommand
{
  @SuppressWarnings("null")
public static void main(String[] args) 
  throws IOException, InterruptedException
  {
	  while(true){
	  try {
		    String line=null;
		    Details dtls = new Details();
			   String command=dtls.getCMDurl();
			  System.out.println("+++++++1"+command);
			  
		    String[] cmd = { "/bin/sh", "-c", command };
		    Process p = Runtime.getRuntime().exec(cmd);
		    BufferedReader in =
		            new BufferedReader(new InputStreamReader(p.getInputStream()));
		    int i=0;
		    while (true) {
		    	Thread.sleep(5000);
		    	line=in.readLine();
		        System.out.println("++++++++"+line); 
		       // if(line==null || line.equals("")){
		        ArrayList <String> linearr = new ArrayList<String>();
		        boolean b = false;
		       while(line!=null){ 
		    	   
		    	   System.out.println("in line add"+line);
		    	   //
		    	   linearr.add(line);
		    	   line=in.readLine();
		       }
		       System.out.println("linearr.size()"+linearr.size());
		       for(int k=0;k<linearr.size();k++)
		       {
		    	   System.out.println("in line for chck"+k);
		    	   String chck = linearr.get(k);
		    	   System.out.println("chck is"+chck);
		    	   if(chck.contains("java -Dfile.encoding=ISO-8859-1 -jar MobileBanking.jar"))
		    	   {
		    		   System.out.println("______________________false");
		    		  b=false;
		    	   }  
		    	   else{
		    		   System.out.println("__________________________true");
		    		   b=true;
		    	   }
		    	   
		       }
		       if(b)
		       {
		    	   System.out.println("in true"+b);
		    	   String shellCommand=dtls.getshellCommand();
		        	//String shellCommand = "/inf_kiosk/kiosk/KVGB/jars/KioskKVGB.sh ";
		        	executeShellCmd.execShellCmd(shellCommand);
		        	break;
		       }
		        //if(line.contains("java -Dfile.encoding=ISO-8859-1 -jar mpass_Generic.jar")){
//		       	 try {
//	                 Process proc = Runtime.getRuntime().exec("sh Gateway-start.sh"); //Whatever you want to execute
//	                 BufferedReader read = new BufferedReader(new InputStreamReader(
//	                         proc.getInputStream()));
//	                 try {
//	                     proc.waitFor();
//	                 } catch (InterruptedException e) {
//	                     System.out.println(e.getMessage());
//	                 }
//	                 while (read.ready()) {
//	                     System.out.println(read.readLine());
//	                 }
//	             } catch (IOException e) {
//	                 System.out.println(e.getMessage());
//	             }
//		        	
		        	
		        }
	  }
		    catch (Exception ex) {
			    ex.printStackTrace();
			}
	  }
		      /*  else {
		        	System.out.println("In else");
		        	i++;
		        	if(i==2){
		        	 String shellCommand=dtls.getshellCommand();
			        	//String shellCommand = "/inf_kiosk/kiosk/KVGB/jars/KioskKVGB.sh ";
			        	executeShellCmd.execShellCmd(shellCommand);
			        	i=0;
		        	}
//		        	String[] cmd1 = { "#!/bin/bash", "-c", "nohup java -jar IMPSALLBANKS1.jar &" };
//				    Process p1 = Runtime.getRuntime().exec(cmd1);
				    //System.out.println("In else");
		        	
		        	
		        }*/
	  
	  
		      
		   
	 
		    //in.close();
		
  
  }
}