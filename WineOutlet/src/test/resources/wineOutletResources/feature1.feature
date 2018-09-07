Feature: WineOutlet login 
Scenario: validate title
Given launch WineOutlet site
Then title is "Buy Wine Online - Fine Wine at Wine Outlet" value
And close site 

Scenario Outline: Validate login
Given launch WineOutlet site
When click on login button
And enter emailid with "<x>" value
And click on yes i have password
And enter password with "<y>" value
Then validate fields with "<z>" value
And click login button
And close site 
|           x                |        y           |        z         |
|                            |                    |      blank       |
|  kurellavishal@ymail.com   |                    |   blankpwd       |
|  kurellavishal@ymail.com   |    9700065099      |  invalidpwd      |
|  kurellavishal@gmail.com   |    9700065091      |  invaliduser     |
|  kurellavishal@ymail.com   |    9700065091      |      valid       |