package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEx {
	public static void main(String[] args) throws AWTException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.tagName("img"));
		System.out.println(logo.getCssValue("color"));

		Actions acts = new Actions(driver);
		acts.contextClick(logo).pause(2000).perform();
		Robot r = new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.close();
	}
}
