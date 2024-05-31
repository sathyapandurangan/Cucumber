Feature: Facebook login
Scenario Outline: User Login With The User Name and Password 

Given User landed The Facebook Page
When User Enter The User Name In User Name Feild "<username>"
And User Enter The Password Feild "<password>"
And User Click The Login Button
Then User Navigate To The Home Page


Examples:
|username|password|
|sathya|pandurangan|
|sathya|dinakaran|
|sathya|p|