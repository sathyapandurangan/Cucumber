Feature: Add a New Customer
Scenario: User Login With User Name And Password

Given User Entered into The signin Page
When User Enter The Valid Mailid 
And User Enter The Valid Password
And User Click The login Button
Then User Ssuccessfully Enter into Home Page

Scenario: Add A new Customer Details
When User Click The Customers
And User Click The Customers from Coustomers options
And User Click Add New Button
And User Enter The Valid Mailid For New Customer
And User Enter The Password
And User Enter The First Name
And User Enter The Last Name
And User Enter The Date Of Birth
And User Enter The Gender
And User Enter The Company Name
And User Pass Last istaxexempty
Then Customer Click Save Button

Scenario: Search A Customer
When Customer Enter Emailid
And Click Search Button