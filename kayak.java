public static void main(String[] args) throws Exception{
		
		WebDriver wd = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(wd,60);
		
		
		wd.get("https://www.kayak.com");
		
		
		wd.manage().window().maximize();
	
		wd.findElement(By.linkText("FLIGHTS")).click();

		wd.findElement(By.id("origin")).click();
		
		wd.findElement(By.id("origin")).clear();
		
		wd.findElement(By.id("origin")).sendKeys("BOS");
		
		//wd.findElement(By.xpath("//div[@id='bd-main']")).click();
		
		//wd.findElement(By.id("destination")).click();
		
		wd.findElement(By.id("destination")).clear();
	
		wd.findElement(By.id("destination")).sendKeys("LAX");
		
		wd.findElement(By.xpath(".//*[@id='travel_dates-start-wrapper']/span[1]")).click();
		
		wd.findElement(By.xpath(".//*[@id='datepicker']/div[4]/span[2]/span[2]/span[3]/span[1]/span")).click();
	
		//wd.findElement(By.xpath(".//*[@id='travel_dates-end-wrapper']/span[1]")).click();
		
		wd.findElement(By.xpath(".//*[@id='datepicker']/div[3]/span[2]/span[2]/span[4]/span[1]/span")).click();
		
		wd.findElement(By.id("fdimgbutton")).click();	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inner']")));
	
		String price = wd.findElement(By.xpath("//a[@class='results_price bookitprice']")).getText();
		
		System.out.println("Kayak" + price);
		
		wd.close();
	
	
	
	}