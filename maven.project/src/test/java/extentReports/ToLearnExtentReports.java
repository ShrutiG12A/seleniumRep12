package extentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports
{
@Test
public void  createReport()
{
	
//attach time stamp for diffrent reports every time based on time \
	String time =LocalDateTime.now().toString().replace(":", "-");
	
//	step 1: create the object for ExtentSparkReporter
	ExtentSparkReporter spark =new ExtentSparkReporter("./HTML_reports/extentreport"+time+".html");
	
//	step 2: create object for ExtentReports 
	ExtentReports extReport=new ExtentReports();

//	step 3: attach ExtentSparkReporter to ExtentReports
	extReport.attachReporter(spark);
	
//	step 4: create extentTest Object
	ExtentTest test = extReport.createTest("createReport");
	
//	step 5: call log() and provide  status and  message
	test.log(Status.PASS,"successfully created extent report");
	test.log(Status.INFO, "open browser and navigate to url");
	test.log(Status.SKIP,"enter valid credentials ");
	test.log(Status.WARNING,"click on login button");
	test.log(Status.FAIL, "home page is displayed ");
//	step 6: call flush
	extReport.flush();
}
}
