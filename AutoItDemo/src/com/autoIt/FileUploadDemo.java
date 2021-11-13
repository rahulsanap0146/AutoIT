package com.autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://javabykiran.com/playground/");
		driver.findElement(By.xpath("//a[@href='file-upload']")).click();
		driver.findElement(By.id("file")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E://AutoIT//demo.exe");
		driver.findElement(By.xpath("//button[@name='send']")).click();
		Thread.sleep(5000);
		System.out.println("File is uploaded Succuessfully");
		//driver.close();
	}
}
