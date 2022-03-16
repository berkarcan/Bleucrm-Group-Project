$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MessageFunctionality.feature");
formatter.feature({
  "name": "BlEUCRM Sending Message Functionalities",
  "description": "  Agile Story: As a user, I should be able to send messages by clicking on Message tab under Active Stream",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "HR User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.LoginStepDefs.hr_User_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hr enters the login credentials correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.LoginStepDefs.hr_enters_the_login_credentials_correctly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "HR is logged in succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.LoginStepDefs.hr_is_logged_in_succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Message Tag",
  "keyword": "When "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.MessageFunctionality.user_navigates_to_Message_Tag()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to send a message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user enters a message",
  "keyword": "And "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.MessageFunctionality.user_enters_a_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the send button",
  "keyword": "And "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.MessageFunctionality.user_clicks_on_the_send_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027blog-submit-button-save\u0027]\"}\n  (Session info: chrome\u003d99.0.4844.51)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-8K5OS7S\u0027, ip: \u0027192.168.43.35\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.12\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.51, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\pmamm\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59459}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 19bfb0eabe333211e96fab7d039a4f4d\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027blog-submit-button-save\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.bleucrm.step_definitions.MessageFunctionality.user_clicks_on_the_send_button(MessageFunctionality.java:119)\r\n\tat ✽.User clicks on the send button(file:///C:/Users/pmamm/IdeaProjects/BLEUCRMTest/src/test/resources/features/MessageFunctionality.feature:31)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should see the message on Activity Stream page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bleucrm.step_definitions.MessageFunctionality.user_should_see_the_message_on_Activity_Stream_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});