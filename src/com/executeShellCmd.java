package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class executeShellCmd {
	public static void execShellCmd(String cmd) {
        try {
        	
        	//cmd ="nohup java -Dfile.encoding=ISO-8859-1 -jar mpass_Generic.jar &";
        	System.out.println("cmd is now"+cmd);
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(new String[] { "/bin/sh", "-c", cmd });
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = buf.readLine()) != null) {
                System.out.println("exec response: " + line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
}
//
//8 tomato
//200grm pnr
//kothimbir
//3 onion
//3 spoon butter
//2 blck crdm
//4 grn crdm
//bay leaf 2
//2 red chillies
//jera 1 chamch
//1 salt
//1 sugar
//1 grm masala
//1 kasoori methi
//1 jeera pwdr
//1.5 ginger garlic paste
//3 oil
//2 kashmiri
//3 green chillies
//cream
//
//
//8 tomato paste
//3 onion paste
//
//pan mg oil
//mg sagle khade masale
//gc paste
//butter
//onion
//salt 
//mg golden
//tomato
//
//mg jeera pwdr
//kshmiri
//garam masala
//kasoori

//kothimbir
//paneer
//cream
//
//5 mins
//
//red chillies
//
//papad

