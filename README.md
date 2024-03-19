# E-Junkie Demo Site Automated Testing

### Project Overview

This project aims to automate the testing of the E-Junkie demo site using Selenium WebDriver, TestNG, and Java. The tests cover various user stories to ensure the functionality and reliability of the demo site. 
The website under test is [E-Junkie](https://shopdemo.e-junkie.com/).



## User Stories Covered

**US 301 Adding Ebook to Basket with Promotional Code :**
This user story focuses on the process of adding ebooks to the basket on the E-Junkie demo site. It also includes the functionality to apply promotional codes during checkout, with a validation check to ensure that invalid codes are appropriately handled.

**US 302 Demo Site Purchase with Debit Card "Faulty Payment" :**
This user story revolves around testing the payment process using a debit card. It ensures that error messages are displayed if essential information, such as email address and other payment details, are left blank, thus verifying the security of the payment process.

**US 303 Control of Unsuccessful Payment with Debit/Credit Card :**
This user story aims to validate the payment process with both debit and credit cards. It specifically checks that the system does not display an error message indicating an invalid card number when filling out the required fields correctly.

**US 304 Payment and Confirmation by Debit/Credit Card :**
 Here, the focus is on completing the payment process using valid card information and ensuring that a success message is displayed upon the completion of the transaction.

**US 305 Payment Process, Approval, and Download :**
 This user story ensures that after a successful payment process, customers can download the purchased ebook immediately. It emphasizes the importance of a fast and seamless payment and download experience.

**US 306 Communication Message Sending Process :**
 This user story covers the functionality of sending messages to E-Junkie officials through the contact form on the website. It allows customers to communicate with the site administrators regarding any queries or feedback they may have.

**US 307  Access to E-Junkie Homepage from Shopdemo.e-Junkie.com:**
This user story ensures that users can easily access the E-Junkie homepage from the demo site, providing quick access to information about the e-commerce platform.

**US 308  Access to Information Video :**
Here, the focus is on accessing an informational video from the E-Junkie homepage, allowing users to learn more about the platform through multimedia content.

**US 309 Payment Process, Approval, and Download Details :**
This user story emphasizes the entire payment process, including approval and download details. It ensures that customers can successfully download the purchased ebook and verify ownership.

 ## Prerequisites:

1. Java Development Kit (JDK)
   
2. Selenium WebDriver configured in the project.
   
3. TestNG framework set up for running test suites.

4. IDE (E.g., IntelliJ IDEA, Eclipse)

5. WebDriver compatible browser (E.g., Chrome, Firefox)

## Technologies and Tools Used: 

- Selenium WebDriver

- TestNG

- Java

- WebDriverManager (for managing browser drivers)


## Getting Started

- To get started with the project, follow these steps:

- Clone the repository to your local machine.

- Set up the necessary dependencies in the project, including Selenium WebDriver and TestNG.

- Ensure you have Java Development Kit (JDK) installed.

- Open the project in your preferred IDE.

- Configure WebDriver for the desired browser (e.g., ChromeDriver, FirefoxDriver).

- Update the test scripts in the project to reflect the specific test scenarios and requirements.

## Contributing

Contributions to enhance and extend the test suite are welcome. Please fork the repository, make your changes, and submit a pull request.


