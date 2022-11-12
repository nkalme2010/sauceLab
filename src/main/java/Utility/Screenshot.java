package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class Screenshot extends TestBase{
	
	public static void screenshotMethod(String name) throws Exception
	{
		
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\hp\\eclipse-workspace\\SwagLab\\ScreenshotFolder\\"+name+".jpeg");
		FileHandler.copy(scr1, dest1);
	}

}
