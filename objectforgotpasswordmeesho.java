package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.forgotpasswordmeeshopom;

public class objectforgotpasswordmeesho extends Base_Test {
	
	@Test()
	
	public void test(String[] testdata)
	{
	forgotpasswordmeeshopom fpm=new forgotpasswordmeeshopom(driver);
	   fpm.Click_becomeasupplier();
	   fpm.Click_loginbutton();
	   fpm.EnterValueInemail(CHROME_KEY);
	   fpm.EnterValueInpassword(CHROME_KEY);
	   fpm.EnterValueInemail1(CHROME_KEY);
	   fpm.pwd1(CHROME_KEY);
	   fpm. submit();
	   
	} 
}
