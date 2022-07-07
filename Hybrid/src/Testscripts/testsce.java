package Testscripts;


import Generic.Basetest;
import pomscripts.Login;

public class testsce extends Basetest {
	public void loginl()
	
	{

	 Login lp=new Login(driver);
     lp.setem("7353227790");
     lp.setps("God is bad");
     lp.clickl();  
}
}
