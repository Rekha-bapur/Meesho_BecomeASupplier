package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.startsellingpom;

public class objectstartselling extends Base_Test {
	
	@Test()
	
	public void test(String[] testdata)
	{
		startsellingpom ss=new startsellingpom(driver);
		ss.Click_becomeasupplier();
		ss.Click_startselling();
		ss.EnterValueInmobileno(CHROME_KEY);
		ss.Click_otp();
		ss.EnterValueInemail(CHROME_KEY);
		ss.EnterValueInpwd(CHROME_KEY);
		ss.Click_createaccount();
	}
}
