package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.loginmeeshopom;

public class objectloginmeesho1 extends Base_Test {
	@Test()
	
	public void test(String[] testdata)
	{
		loginmeeshopom lm=new loginmeeshopom(driver);
		lm.Click_becomeasupplier();
		lm.Click_loginbutton();
	    lm.EnterValueInemail(CHROME_KEY);
	    lm.pwd(CHROME_KEY);
	    lm.submit();
		
	}


}
