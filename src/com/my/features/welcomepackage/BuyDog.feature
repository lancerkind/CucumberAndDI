Feature: first-time owner welcome package
In order to establish 
As a store owner
I want to offer them immediate discounts on items with high markup

Scenario Outline: buys a selected accessory
Given first-time owner buys a dog they love
When purchasing a "<selected accessory>"  
Then "<selected accessory>" is discounted at 10% 

Examples: (enumerating all selected accessories)
|selected accessory		| 
|dog dish				|
|collar					|
|store brand dog food	|	
|store brand puppy food	|	 

Scenario Outline: buys a few selected and a few not
Given first-time owner buys a dog they love
When purchasing "<accessories>" 
Then "<selected accessories>" are discounted at 10% 

Examples: 
|<accessories>						| <selected accessories> 	|
|dog dish, bling collar, puppy chow	| dog dish					|	