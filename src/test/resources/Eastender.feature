@test				
Feature: Verify the Eastenders next Epsoide Time				
				
@tvbuttonsearch
Scenario Outline: check the time of EastEnder next Epsoide via TV button and iplayer search
Given I am in HomePage				
When I select the TV option under More option in header	
And iplayer page is opened			
And I enter "<search1>" in search box							
And I click on first link
And I select Programme website				
Then check the time for the next episode
Examples:
|search1|
|EastEnders|
			
				
@iplayerchannels				
Scenario: check the time of EastEnder next Epsoide via iPlayer icon								
Given I am in HomePage				
When I select the iPlayer
And I click on channels on iplayer page
And I click on one				
And I click on Eastenders link under soaps				
And I select Programme website				
Then check the time for the next episode				
				
@search				
Scenario Outline: Verify the next Epsoide of EastEnders displayed								
Given I am in HomePage				
When I enter "<search>" into search textbox	
And search page for "<search>" is displayed				
And I click on first search link 
And I select Programme website											
Then check the time for the next episode	
Examples:
|search|
|EastEnders|

			