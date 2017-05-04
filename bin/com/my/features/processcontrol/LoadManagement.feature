Feature: Load Management
In order to keep our computers busy finishing work
As system operator
I want to add or remove work

Scenario: increase load
Given there are processing units with 30% capacity
When "new job" is available for processing
Then select least busy processing unit
And add to its work queue  # need to share information between Then and And 

 Scenario: boot a user
 Given no processing unit has capacity
 And user "bob" already has a job running
 When another job is added by user "bob"
 Then block user "bob"  # need to share information between Then and And. Could reword this to use "bob" variable but lets see what happens
 And signoff user
