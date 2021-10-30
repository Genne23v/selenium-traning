# selenium-traning

### WebDriver: Get a test script and interpret it for each browser and platform. 
1. To write automated tests for multiple browsers and platforms
2. To maintain a stadardized API
3. Emulate actions of users

### Browser Drivers: ChromeDriver, geckodriver, EdgeDriver, SafariDriver (All follows W3C spec)

### Tested Website
https://formy-project.herokuapp.com

### Using CSS Selector
```java
//By Tag and Class(or id) (e.g. <input class="q" type="text"> or id="q") 
driver.findElement(By.cssSelector("input.q"));  //OR ("input#q")

//By Tag and Attribute (e.g. <input type="radio" value="radio button">) 
driver.findElement(By.cssSelector("input[type='radio']"));  //OR ("input[value='radio button']")

//By Multiple Classes 
driver.findElement(By.cssSelector(".btn.btn-lg.btn-success"));

//By Prefix (e.g. <div id="textField_randomId">)
driver.findElement(By.cssSelector("div[id^='textField']"));

//By Suffix (e.g. <div id="randomId_textField">)
driver.findElement(By.cssSelector("div[id$='textField']"));

//By Substring (e.g. <div id="123_textField_randomId">
driver.findElement(By.cssSelector("div[id*='textField']"));

//Selecting Child 
driver.findElement(By.cssSelector("div#parent a"));
driver.findElement(By.cssSelector("#list li:nth-child(n)"));
```

### Synchronization Issue
#### Implicit Waits
```java
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
```
#### Explicit Waits
```java
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element"));
```
#### Other Expected Conditions
```java
elementToBeClickable()
elementToBeSelected()
presenceOfElementLocated()
textToBePresentInElement()
```
### Integration
#### Selenium Grid
1. Download Selenium Grid on homepage. Then go to downloaded file location. 
```
java -jar selenium-server-<version>.jar hub
```
2. Go to IP address displayed after above command execution on a browser. <IP-address:PORT/grid/console>
3. Add node with below command
```
java -jar selenium-server-<version>.jar node -hub IP-address:PORT
```
4. Go back to console to check set-up status (default: 5 Chrome, 5 Firefox, 1 Safari)

