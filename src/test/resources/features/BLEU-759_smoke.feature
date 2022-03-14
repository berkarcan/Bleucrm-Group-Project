Feature: Default

	Background:
		#@BLEU-754
		When the user logins with a valid username and password
		Then the user should be able to reach the dashboard page: "https://qa.bleucrm.com/stream/?login=yes"
		

	## User should be able to select the type of information under preview text 
	# # User should be able to select a date and set a time under preview text
	# # User should be able to add and remove a picture under details
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # User should be able to select Text, HTML, and Visual Editor
	# # User should be able to send news
	@BLEU-753 @BLEU-759 @BLEU-757
	Scenario: user should be able to add news under Company
		Given the user is on the company page
		When the user enters the add news page
		Then User should be able to select the type of information under preview text	

	#*User Story:* As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
	#
	#*Acceptance Criteria:*
	#
	#1. User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#2. User can dislike the idea.
	#3. User can like the idea.
	#4. User can sort the ideas by date added.
	#5. User can sort the ideas by rating.
	#6. User should be able to create new category by clicking "New category" under Ideas page of Services module.
	#7. User can print the lists by clicking "Print" button under Lists page of Services menu.
	@BLEU-751 @BLEU-759
	Scenario: User can suggest new idea by clicking "New idea" under Ideas page of Services module
		Given user can see "Services" under Activity stream
		When user enters "Ideas" page
		Then user can suggest new idea	

	
	@BLEU-760 @BLEU-759
	Scenario: User sends a poll  with multiple choices using the general functionalities
		When user clicks on poll tab
		And user clicks "Add more" and clicks Employees and Departments
		Then user can click to add 2 departments and 4 employees randomly
		When user clicks on link icon
		Then user can save text "" or link "www.pollyjoly.com"
		When user clicks on add mention icon and clicks on Employees and Departments
		Then user can select 4 employee emails randomly to mention
		When user clicks on "Add question" text to add question 3 times
		Then text boxes for n+1 questions and their answer boxes are displayed
		When user allows multiple choices, insert questions and answers
		Then user can send the poll