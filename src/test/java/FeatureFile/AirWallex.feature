Feature: AirWallex Post Request to Create Beneficiary

  Scenario Outline: Creating new beneficiary and doing validations

    Given user has AirWallex API Access with token
    When user posts new request to create Beneficiary using exampleTable "<personal_email>" "<city>" "<country_code>" "<postcode>" "<state>" "<street_address>" "<account_currency>" "<account_name>" "<account_number>" "<account_routing_type1>" "<account_routing_value1>" "<bank_country_code>" "<bank_name>" "<local_clearing_system>" "<company_name>" "<entity_type>" "<nickname>" "<payment_methods>"
    Then user should create a new beneficiary
    Examples:
      |personal_email|city|country_code|postcode|state|street_address|account_currency|account_name|account_number|account_routing_type1|account_routing_value1|bank_country_code|bank_name|local_clearing_system|company_name|entity_type|nickname|payment_methods|
      |john.walker@gmail.com|Seattle|US|98104|Washington|412 5th Avenue|USD|John Walker|50001121|aba|021000021|US|JP Morgan Chase Bank|ACH|ABC University|COMPANY|ABC University|LOCAL|