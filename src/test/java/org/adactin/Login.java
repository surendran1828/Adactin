package org.adactin;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	private static WebElement txtusername;
	
	
	@FindBy(xpath="//input[@type='password']")
	private static WebElement txtpassword;
	
	@FindBy(name="login")
	private static WebElement login;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private static WebElement radio;
	
	@FindBy(name="continue")
	private static WebElement cont;
	
	@FindBy(name="first_name")
	private static WebElement first_name;
	
	@FindBy(name="last_name")
	private static WebElement last_name;
	
	@FindBy(name="address")
	private static WebElement address;
	
	@FindBy(name="cc_num")
	private static WebElement cc_num;
	
	@FindBy(name="cc_cvv")
	private static WebElement cc_cvv;
	
	@FindBy(name="book_now")
	private static WebElement book;
	
	public void setUserNameAndPassword(String arg0,String arg1) {
		txtusername.sendKeys(arg0);
		txtpassword.sendKeys(arg1);
	}
	public void btncLogin() {
		 login.click();
	}
	public void sele() {
		radio.click();
		cont.click();
	}
	public void pay() {
		first_name.sendKeys("surendran");
		last_name.sendKeys("surea");
		address.sendKeys("chennai");
		cc_num.sendKeys("3246452146544896");
		cc_cvv.sendKeys("896");
		book.click();
		
	}
	
	
	
		
	
	
	

}
