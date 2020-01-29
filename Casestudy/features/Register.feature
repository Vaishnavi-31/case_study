Feature: Register
Scenario: Register on TestMeApp
When user open TestMeApp
And click on SignUp
And enter name as "Vaishnavi124"
And enter fname as "Vaishnavi"
And enter lname as "Khandebharad"
And enter password as "Vaish434"
And enter confirm password as "Vaish434"
And enter gender as "Female" 
And enter email as "vaishkbharad@gmail.com"
And enter mobile number as "7894561235"
And enter DOB as "31/12/1996"
And enter Address as "Shahu colony,Buldana"
And enter security question as "What is your favour color?"
And enter answer as "black"
Then registered

@Login
Scenario: Login using datatable
Given User open TestMeApp
And click on Signin
And user enter credentials
| lalitha | Password123 |
