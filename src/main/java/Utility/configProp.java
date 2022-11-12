package Utility;

import java.io.FileInputStream;

import java.util.Properties;

import Base.TestBase;


public class configProp extends TestBase {
 
	public static String configPropData(String value) throws Exception {
		Properties prop =new Properties();
		FileInputStream file =new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SwagLab\\config.property");
		prop.load(file);
		return prop.getProperty(value);
	}
}
