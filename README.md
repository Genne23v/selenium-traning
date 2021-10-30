# selenium-traning

### WebDriver: Get a test script and interpret it for each browser and platform. 
1. To write automated tests for multiple browsers and platforms
2. To maintain a stadardized API
3. Emulate actions of users

### Browser Drivers: ChromeDriver, geckodriver, EdgeDriver, SafariDriver (All follows W3C spec)

### Tested Website
https://formy-project.herokuapp.com
https://selenium-blog.herokuapp.com (Ruby test)

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

### Resources
• Ruby WebDriver API docs: http://seleniumhq.github.io/selenium/docs/api/rb/Selenium/WebDriver
• Selenium wiki: https://github.com/SeleniumHQ/selenium/wiki
RSpec docs: http://rspec.info
• RSpec docs: http://rspec.info

#### Set Up Environment Variable on Windows
From Command Prompt
To look up path:
echo %PATH%
To add gecko driver to path:
set PATH=%PATH%;C:\Users\your_username\Downloads\geckodriver
From Dialog Window 
On Windows systems, to change the system path, right-click My Computer/This PC
and choose Properties. 
In the dialogue that appears, select Advanced system settings > Environment Variables.
Under System variables, select to edit path and add new entry: 
“C:\Users\your_username\Downloads\geckodriver” to the Path variable and click OK.
