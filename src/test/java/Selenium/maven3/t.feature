Feature: testing login functionality


Scenario: asdakdasldjasldasjdlk

	Given User is on Home Page || gohomepage
	When User Navigate to Login Page
	And User enters UserName and Password || WebElementEnter "Username" "Ayesha"
	And User enters UserName and Password || WebElementEnter "Password" "12345"
	And wait 2 second || Wait "2"
	Then Message displayed Login Successfully