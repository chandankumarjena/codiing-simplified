package com.codingsimplified.designpattern;
interface WebDriver{
	public void testEtherNet();
	public void testCompatibility();
}
class ChromeWebDriver implements WebDriver{

	@Override
	public void testEtherNet() {
		// TODO Auto-generated method stub
		System.out.println("ethernet test success");
		
	}

	@Override
	public void testCompatibility() {
		// TODO Auto-generated method stub
		System.out.println("compatibility test success");
	}
	
}
class IEWebDriver {
	public void checkEthernet() {
		System.out.println("ethernet working");
	}
	public void checkCompatibility() {
		System.out.println("compatibility checked success");
	}
}
class WebDriverAdaptor implements WebDriver{
	IEWebDriver ieWebDriver;
	
	public WebDriverAdaptor(IEWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.ieWebDriver = driver;
	}

	@Override
	public void testEtherNet() {
		// TODO Auto-generated method stub
		ieWebDriver.checkEthernet();
	}

	@Override
	public void testCompatibility() {
		// TODO Auto-generated method stub
		ieWebDriver.checkCompatibility();
	}
	
}
public class AdaptorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeWebDriver chromeWebDriver = new ChromeWebDriver();
		chromeWebDriver.testEtherNet();
		chromeWebDriver.testCompatibility();
		
		WebDriverAdaptor webDriverAdaptor = new WebDriverAdaptor(new IEWebDriver());
		webDriverAdaptor.testCompatibility();
		webDriverAdaptor.testEtherNet();
	}

}
