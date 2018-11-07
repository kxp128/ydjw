package com.ehootu.core.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

public class SystemInfoHandle {

	//获得系统运行时间
	public static String getSysRuntime(){
		String str=null;
		String runTime="";
		try {
			Runtime.getRuntime().exec("uptime");
			File file1 = new File("/proc/uptime");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
			if((str=br1.readLine())!=null){
				runTime = str.substring(0,str.indexOf(" ")).trim();
				long runTimes = (long)(Float.parseFloat(runTime)*1000);
				java.util.TimeZone tz = java.util.TimeZone.getTimeZone("ETC/GMT-8");
				java.util.TimeZone.setDefault(tz);
				SimpleDateFormat format = new  SimpleDateFormat("dd天HH小时mm分");
				runTime = format.format(new Date(runTimes));
				String days=runTime.substring(0, runTime.indexOf("天"));
				if(runTime.charAt(0)=='0'){
					runTime=runTime.substring(1);
					days=runTime.substring(0, runTime.indexOf("天"));
				}
				int day=Integer.parseInt(days)-1;
				runTime=day+"天"+runTime.substring(runTime.indexOf("天")+1);
			}
			java.util.TimeZone tz = java.util.TimeZone.getTimeZone("Etc/GMT-8");
			java.util.TimeZone.setDefault(tz);
			if(br1!=null){
				br1.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return runTime;
	}
	
	/**
	 * get memory by used info
	 * 
	 * @return int[] result
	 * result.length==4;int[0]=MemTotal;int[1]=MemFree;int[2]=SwapTotal;int[3]=SwapFree;
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static int[] getMemInfo() throws IOException, InterruptedException {
		File file = new File("/proc/meminfo");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));
		int[] result = new int[6];
		String str = null;
		StringTokenizer token = null;
		while((str = br.readLine()) != null) {
			token = new StringTokenizer(str);
	        if(!token.hasMoreTokens())
	            continue;
   
	        str = token.nextToken();
	        if(!token.hasMoreTokens())
	        	continue;
   
	        if(str.equalsIgnoreCase("MemTotal:"))
	        	result[0] = Integer.parseInt(token.nextToken());
	        else if(str.equalsIgnoreCase("MemFree:"))
	        	result[1] = Integer.parseInt(token.nextToken());
	        else if(str.equalsIgnoreCase("SwapTotal:"))
	        	result[2] = Integer.parseInt(token.nextToken());
	        else if(str.equalsIgnoreCase("SwapFree:"))
	        	result[3] = Integer.parseInt(token.nextToken());
	        else if(str.equalsIgnoreCase("Buffers:"))
	        	result[4] = Integer.parseInt(token.nextToken());
	        else if(str.equalsIgnoreCase("Cached:"))
	        	result[5] = Integer.parseInt(token.nextToken());
		}
	      br.close();
		return result;
	}

	/**
	 * get CPU by used info
	 * 
	 * @return float efficiency
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static float getCpuInfo() throws IOException, InterruptedException {
		File file = new File("/proc/stat");
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringTokenizer token = new StringTokenizer(br.readLine());
		token.nextToken();
	    long user1 = Long.parseLong(token.nextToken());
	    long nice1 = Long.parseLong(token.nextToken());
	    long sys1 = Long.parseLong(token.nextToken());
	    long idle1 = Long.parseLong(token.nextToken());
	    long iowait1 = Long.parseLong(token.nextToken());
	    long irq1 = Long.parseLong(token.nextToken());
	    long softirq1 = Long.parseLong(token.nextToken());
	    long totalOne = user1 + nice1 + sys1 + idle1 + iowait1 + irq1 + softirq1;
	    Thread.sleep(1000);
	    if(br!=null){
	    	br.close();
	    }
      
	    br = new BufferedReader(new FileReader(file));
	    token = new StringTokenizer(br.readLine());
	    token.nextToken();
	    long user2 = Long.parseLong(token.nextToken());
	    long nice2 = Long.parseLong(token.nextToken());
	    long sys2 = Long.parseLong(token.nextToken());
	    long idle2 = Long.parseLong(token.nextToken());
	    long iowait2 = Long.parseLong(token.nextToken());
	    long irq2 = Long.parseLong(token.nextToken());
	    long softirq2 = Long.parseLong(token.nextToken());
	    long totalTwo = user2 + nice2 + sys2 + idle2 + iowait2 + irq2 + softirq2;
	    if(br != null){
	    	br.close();
	    }
	    
	    float useCPURate = ((user2 +sys2+nice2) - (user1 + sys1+nice1))/(totalTwo - totalOne)*100;
	    //float userCPURate = (float)(idle1-idle2) / (totalOne-totalTwo) * 100;
	    return useCPURate;
//	    return (float)((user2 + sys2 + nice2) - (user1 + sys1 + nice1))/ (totalTwo - totalOne);
	}
	
	// 获得磁盘信息
	public static List<String[]> getDiskInfo() {
		List<String[]> diskList = new ArrayList<String[]>();
		String[] result = null;
		BufferedReader br = null;
		try {
			String[] cmds = {"/bin/sh","-c","df -h"};
			Process p = Runtime.getRuntime().exec(cmds);
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			br.readLine();
			String str = null;
			StringTokenizer token = null;
			String temp[] = (String[])null;
            StringBuffer tempBuff = new StringBuffer();
			while ((str = br.readLine()) != null) {
				temp = str.trim().split("\\s+");
	            if(temp.length > 0 && temp.length < 6) {
//	            if(temp.length == 1 || temp.length == 9 || temp.length == 10) {
	                tempBuff.append((new StringBuilder(String.valueOf(str))).append(" ").toString());
	                if(temp.length > 1 && temp.length < 6) {
//	                if(temp.length == 9 || temp.length == 10) {
	                	result = new String[6];
	                    token = new StringTokenizer(tempBuff.toString());
	                    if(token.hasMoreTokens()) {
	                        result[0] = token.nextToken();
	                        result[1] = token.nextToken();
	                        result[2] = token.nextToken();
	                        result[3] = token.nextToken();
	                        result[4] = token.nextToken();
	                        result[5] = token.nextToken();
	                    }
	                    diskList.add(result);
	                    tempBuff = new StringBuffer();
	                }
	            } else {
	            	result = new String[6];
	            	token = new StringTokenizer(str);
	            	if (token.hasMoreTokens()) {
	            		result[0] = token.nextToken();
	            		result[1] = token.nextToken();
	            		result[2] = token.nextToken();
	            		result[3] = token.nextToken();
	            		result[4] = token.nextToken();
	            		result[5] = token.nextToken();
	            	}
	            	diskList.add(result);
	            	result = null;
	            }
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return diskList;
	}
}
