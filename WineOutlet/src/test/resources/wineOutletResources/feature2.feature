Feature: WineOutlet login 

Scenario Outline: Validate login
Given launch WineOutlet site
When click on login button
And enter emailid with "<x>" value
And click on yes i have password
And enter password with "<y>" value
And click continue button
Then validate fields with "<z>" value
And close site 
Examples:
|           x                |        y           |        z         |
|                            |                    |      blank       |
|  kurellavishal@ymail.com   |                    |   blankpwd       |
|  kurellavishal@ymail.com   |    9700065099      |  invalidpwd      |
|  kurellavishal@gmail.com   |    9700065091      |  invaliduser     |
|  kurellavishal@ymail.com   |    9700065091      |      valid       |