public static void main(String[] args) throws Exception{
	
	WebDriver wd = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(wd,60);
	
		wd.get("http://www.orbitz.com");
		
		wd.manage().window().maximize();
		//wd.navigate().refresh();
		
		Thread.sleep(100);
		
		
		wd.findElement(By.id("tab-flight-tab")).click();
		
		wd.findElement(By.id("flight-origin")).click();
		
		wd.findElement(By.id("flight-origin")).sendKeys("BOS");
		
		wd.findElement(By.id("wizard-theme-wrapper")).click();
		
		wd.findElement(By.id("flight-destination")).click();
		
		wd.findElement(By.id("flight-destination")).sendKeys("LAX");
		
		wd.findElement(By.id("wizard-theme-wrapper")).click();
		
		wd.findElement(By.id("flight-departing")).clear();
		
		wd.findElement(By.id("flight-departing")).click();
		
		wd.findElement(By.id("flight-departing")).sendKeys("05/15/2016");
		
		wd.findElement(By.id("flight-returning")).clear();
		
		wd.findElement(By.id("flight-returning")).click();
		
		wd.findElement(By.id("flight-returning")).sendKeys("05/22/2016");
		
		wd.findElement(By.id("search-button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("listings-header")));
		//Thread.sleep(20000);
		
		String price = wd.findElement(By.xpath("//span[@class='dollars price-emphasis']")).getText();
		
		System.out.println("Price is "+price);
		
		wd.close();
	}