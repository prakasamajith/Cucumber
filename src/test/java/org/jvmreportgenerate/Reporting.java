package org.jvmreportgenerate;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonFileReport) {

		//1.Mention the path of JVM Report where to store?
		File file = new File("C:\\Users\\Thangapandiyan P\\eclipse-workspace\\Cucumber\\target");
		//2.Create the Object for Configuration Class
		Configuration configuration = new Configuration(file, "Facebook Automation");
		//3.Pass the Key, Value as Details--Browser,OS Versions,Sprint
		configuration.addClassifications("OS", "Windows 11");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "23.4");
		configuration.addClassifications("Sprint", "37");
		//4.Create the Object for ReportBuilder Class to read results from JSON File
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFileReport);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		//5.Generate the JVM Report
		builder.generateReports();

	}
}