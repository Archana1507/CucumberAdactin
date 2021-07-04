package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {
//	public static void generateJvmreport(String jsonpath) {
//		File a=new File(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\JvmReports");
//		Configuration c=new Configuration(a,"Adactin Hotel Webpage");
//		c.addClassifications("platform name", "Windows 7");
//		c.addClassifications("Browser name", "Google Chrome");
//		c.addClassifications("Browser Version", "91");
//        c.addClassifications("Sprint time", "24");
//        
//        List<String>list=new ArrayList<String>();
//		list.add(jsonpath);
//		ReportBuilder r=new ReportBuilder(list,c);
//	    r.generateReports();


public static void generateJvmreport(String jsonpath) {
	File f=new File(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\JvmReports");
	Configuration con=new Configuration(f,"Adactin Hotel");
	con.addClassifications("Platform name", "Windows 7");
	con.addClassifications("Browser name", "Google Chrome");
	con.addClassifications("Bowser version", "91.0");
	con.addClassifications("Sprint time","24");
	
	List<String>list=new ArrayList<String>();
	list.add(jsonpath);
	ReportBuilder rb = new ReportBuilder(list,con);
	rb.generateReports();
	
}

	}

	


