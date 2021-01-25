package org.adactin;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg extends Base {
	@BeforeClass
	private void beforeclass() {
		launchBrowser();
		launchurl("https://adactinhotelapp.com/");
		Login k=new Login();
		k.setUserNameAndPassword("abdullathif14", "2364VD");
		k.btncLogin();	
	}
	@Test
	private void Test1() {
		SelectClass s=new SelectClass();
		
		  sbvi(s.getLocation(),3);
	      sbvi(s.getHotels(), 2);
	      sbvi(s.getRoom_type(), 4);
	      sbvi(s.getRoom_nos(), 6);
	      fill(s.getDatepick_in(), "18/04/2021");
	      fill(s.getDatepick_out(), "28/04/2021");
	      sbvi(s.getAdult_room(), 3);
	      sbvi(s.getChild_room(), 1);
	      btnclick(s.getSubmit());
}
	@Test
	private void test2() {
		Login l=new Login();
		l.sele();	
	}
	@Test
	private void test3() {
		SelectClass c=new SelectClass();
		sbvi(c.getCtype(),3);
		sbvi(c.getExpmonth(),4);
		sbvi(c.getExpyear(),11);
		Login n=new Login();
		n.pay();
	}
	@Test
	private void test4() throws InterruptedException {
		Thread.sleep(6000);
		WebElement j = driver.findElement(By.xpath("//input[@name='order_no']"));
	    System.out.println("your booking id is "+j.getAttribute("value")); 
	}
	
}
