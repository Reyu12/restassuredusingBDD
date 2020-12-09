Feature: Testing the rest assured response for rates API

 @tag1
 Scenario: Check the positive response for given rates API

 Given user go to url
 When get response code
 Then validate the response which should be correct
 
 @tag2
 Scenario: An automated test suite should run which will assert the response
 
 Given Rates API for Latest Foreign Exchange rates
 When The API is available
 Then get response code
 And validate the response with assert
 
 @tag3
 Scenario: for incorrect url assert the response supplied by the call
 
 Given Rates API should be available
 When get incorrect response
 Then validate the response for a error code
 
 @tag4
 Scenario: check the positive response for Rates API for Specific date Foreign Exchange rates
 
 Given i get the responce for a date in step
 When i get the status of response in step
 Then validate the statuscode of response

  @tag5
 Scenario: Assert the response for a perticular date of exchange rates API
 
 Given i get the response for a specific date
 When assert the response i got
 Then display the correct statuscode
  
  @tag6
  Scenario: validate the respose when i send req with future date in rates API
  
  Given send the request with future date 
  When get the response for given request
  Then check that response matches with current date
  