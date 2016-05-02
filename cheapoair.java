public static void main(String args[]) throws Exception
	{
		//1: open Firefox Browser
		WebDriver wd = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(wd,60);
		//2. Open URL
		
		wd.get("http://www.cheapoair.com/");
		
		//
		wd.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div/section/header/div/a")).click();
		
		//3. Select One way flights
		wd.findElement(By.id("owFlight")).click();
		
		//4. Click on from city 
		
		wd.findElement(By.id("ember694")).click();
		
		//5. Clear the Content

		wd.findElement(By.id("ember694")).clear();
		
		//6. Enter the city Name  
		
		wd.findElement(By.id("ember694")).sendKeys("BOS");
		
		
		wd.findElement(By.id("tabTd")).click();
		Thread.sleep(1000);
		
		// 7. Click on the to city
		
		wd.findElement(By.id("ember705")).click();
		
		// 8. Clear the content
		
		wd.findElement(By.id("ember705")).clear();
		
		// 9. Enter the Destination City
		
		wd.findElement(By.id("ember705")).sendKeys("LAX");
		
		wd.findElement(By.id("tabTd")).click();
		//10. Enter the Date
		
		wd.findElement(By.id("departCalendar_0")).click(); 
		
		wd.findElement(By.xpath("//fieldset[@id='calendarCompId']/section/div/div/ol/div[34]/li")).click();
		
		Thread.sleep(1000);
		
		// Enter Search Button
		
		wd.findElement(By.xpath("//input[@value='Search Now']")).click();
		Thread.sleep(20000);
	
		// Verify Text
		
		boolean exists = wd.findElements( By.id("_SearchCountForFilters") ).size() != 0;
		
		System.out.println("*********" +exists);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_SearchCountForFilters")));
		
		String Price = wd.findElement(By.cssSelector("strong.fare__amount.is--total > span.currency")).getText();
		
		System.out.println("Lowest Price is " +Price);
}