This project is for creating beneficiariy using AirWallex API and perform certain Validations.

1) Data is present in AirWallex.feature file in the form of Example table( location is src/test/java/FeatureFiles/AirWallex.feature) like below,we can add more lines
of data or add new scenario with new set of data

 |personal_email|city|country_code|postcode|state|street_address|account_currency|account_name|account_number|account_routing_type1|account_routing_value1|bank_country_code|bank_name|local_clearing_system|company_name|entity_type|nickname|payment_methods|
      |john.walker@gmail.com|Seattle|US|98104|Washington|412 5th Avenue|USD|John Walker|50001121|aba|021000021|US|JP Morgan Chase Bank|ACH|ABC University|COMPANY|ABC University|LOCAL|
      
      For example- this is one scenario with one set of data-
      
      Scenario Outline: Creating new beneficiary and doing validations

    Given user has AirWallex API Access with token
    When user posts new request to create Beneficiary using exampleTable "<personal_email>" "<city>" "<country_code>" "<postcode>" "<state>" "<street_address>" "<account_currency>" "<account_name>" "<account_number>" "<account_routing_type1>" "<account_routing_value1>" "<bank_country_code>" "<bank_name>" "<local_clearing_system>" "<company_name>" "<entity_type>" "<nickname>" "<payment_methods>"
    Then user should create a new beneficiary
    Examples:
      |personal_email|city|country_code|postcode|state|street_address|account_currency|account_name|account_number|account_routing_type1|account_routing_value1|bank_country_code|bank_name|local_clearing_system|company_name|entity_type|nickname|payment_methods|
      |john.walker@gmail.com|Seattle|US|98104|Washington|412 5th Avenue|USD|John Walker|50001121|aba|021000021|US|JP Morgan Chase Bank|ACH|ABC University|COMPANY|ABC University|LOCAL|
      
      Like this we can add more scenarios with new set of data or add new row of data in same scenario.
      
 2) Code/Validation for these steps is present is APISteps.java file(Location- src/main/java/StepDefinition/APISteps.java
    In this class check method "createNewBeneficiary" ,here all validation is done.
    
 3) How to Run-
    Search for MainRunner.java(Its under src/test/java/Runner/MainRunner.java)
      
      
