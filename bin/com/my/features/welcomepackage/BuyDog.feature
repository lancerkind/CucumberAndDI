Feature: first-time owner welcome package
In order to establish 
As a store owner
I want to offer them immediate discounts on items with high markup

Scenario Outline: buys a selected accessory
Given first-time owner buys a dog they love
When purchasing selected accessory "<selected accessory>"  
Then selected accessory is discounted at 10% 

Examples: (enumerating all selected accessories)
|selected accessory		| 
|dog dish				|
|collar					|
|store brand dog food	|	
|store brand puppy food	|	 

Scenario Outline: buys a few selected and a few not
Given first-time owner buys a dog they love
When purchasing accessories "<accessories>" 
Then selected accossories "<selected accessories>" are discounted at 10% 

Examples: 
|<accessories>						| <selected accessories> 	|
|dog dish, bling collar, puppy chow	| dog dish					|	

Scenario: VIP buys a selected accessory
Given first-time owner buys a dog they love
And has a VIP card
When purchasing a selected accessory
Then selected accessory are discounted an additional 5%
# No reason to keep repeating the list of selected examples or the feature file
# becomes filled with redundant documentation. We just need to spot check one.