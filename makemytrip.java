public static void main(String[] args){
		
		WebDriver wd = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(wd,30);
		
		wd.get("http://us.makemytrip.com/");
		
		wd.manage().window().maximize();
		
		wd.findElement(By.xpath(".//*[@id='trip_type']/label[2]")).click();
		
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[2]/span[1]/input")).click();
		
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[2]/span[1]/input")).clear();
		
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[2]/span[1]/input")).sendKeys("BOS");
	
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]")).click();
		
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[3]/span/input")).click();
	
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[3]/span/input")).clear();
		
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[3]/span/input")).sendKeys("LAX");
		
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]")).click();
		
		
		//Date Picker
		//Departing Date
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[2]/a")).click();
		
		// click on the calendar
		
		wd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[7]/a")).click();
		
		// selecting return date
		
		wd.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).click();
		//calendar is open
		wd.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[7]/a")).click();
		
		// selected all the dates
		
		wd.findElement(By.xpath(".//*[@id='bottom_buttons']/button[1]")).click();
		
	}