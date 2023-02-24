# Handling SSL certificates in Selenium WebDriver

This repository holds begineer code to help you understand how to handle SSL certificates in Selenium WebDriver. It contains different test files to help understand the difference in execution when we accept and reject insecure SSL certificates. For ease of execution on different browseers, LambdaTest cloud Selenium grid is being used.

## What is SSL?
SSL stands for Secure Sockets Layer. It is a standard security protocol that helps to establish a secure connection between the client (browser) and the server. SSL certificates help to ensure that all the data transmission between a client and server is encrypted using a strong encryption standard.

This helps to validate the identity of the client to the server and thus to keep hackers at bay from spying on any information exchange. SSL encryption thus facilitates the exchange of sensitive information like card details, usernames, passwords, etc between the client and server.

## What is an Untrusted SSL Certificate? 
Whenever you try to access a website, the authenticity and trust of the website are determined by the SSL certificate. Suppose that certificate is not able to validate itself. In that case, a secure encrypted connection is not established and the browser throws an Untrusted Connection exception which leads to an error on the browser. This is what you can understand as an Untrusted SSL Certificate.

## About Project
It is created using Selenium with Java, TestNG and Maven for Web-based automation to handle SSL certificates.

This is the list of tools, being used in this framework:
1. Apache Maven
2. Java 8
3. Selenium Cloud Grid - [LambdaTest](https://www.lambdatest.com) Platform
4. TestNG Framework

## Steps for Local Execution
1. Import this project in Eclipse/IntelliJ as “Existing Maven Project”
2. Go to Test_Accept_InsecureSslCerts.java or Test_Reject_InsecureSslCerts.java and Run test case for your desired case.
3. You can see the logs coming up on Console as your execution progresses.
4. Since we are using RemoteWebDriver and executing on Cloud Grid platform, LambdaTest, you can login to same and view detailed logs on dashboard.
