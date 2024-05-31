Feature: Amazon Login
Scenario: Login With valid username and password

Given Launch the amezon URL
When Click the signin button it will navigate to signin page
And Enter the valid Mail id "sathyapandurangan92@gmail.com"
And Enter the valid password "sathya1992"
And click the signin button it will navigate to home page

Scenario: Search Product And AddtoCart
When Click the Search Box to pass Input
And Click the Search Button
And Select the Perticular Product
And Click the AddtoCart Button
Then Click the cart Button
Then User Successfully add Product into Cart


