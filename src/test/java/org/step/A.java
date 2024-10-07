package org.step;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.baseclass.BaseClass;

public class A extends BaseClass {
	
	public void Abu() {
		
		getProjectPath();
	
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		A a=new A();
		a.Abu();
		Properties properties = new Properties();
		properties.load(new FileInputStream(
				"C:\\Users\\Thangapandiyan P\\eclipse-workspace\\Cucumber\\config\\Config.properties"));
		Object object = properties.get("url");
		String value = (String) object;
		System.out.println(value);

		String path = System.getProperty("user.dir");
		System.out.println(path);

	}

}
