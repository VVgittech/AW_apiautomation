$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AirWallex.feature");
formatter.feature({
  "line": 1,
  "name": "AirWallex Post Request to Create Beneficiary",
  "description": "",
  "id": "airwallex-post-request-to-create-beneficiary",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Creating new beneficiary and doing positive validations",
  "description": "",
  "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-positive-validations",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user has AirWallex API Access with token",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user posts new request to create Beneficiary using exampleTable \"\u003cpersonal_email\u003e\" \"\u003ccity\u003e\" \"\u003ccountry_code\u003e\" \"\u003cpostcode\u003e\" \"\u003cstate\u003e\" \"\u003cstreet_address\u003e\" \"\u003caccount_currency\u003e\" \"\u003caccount_name\u003e\" \"\u003caccount_number\u003e\" \"\u003caccount_routing_type1\u003e\" \"\u003caccount_routing_value1\u003e\" \"\u003cbank_country_code\u003e\" \"\u003cbank_name\u003e\" \"\u003clocal_clearing_system\u003e\" \"\u003ccompany_name\u003e\" \"\u003centity_type\u003e\" \"\u003cnickname\u003e\" \"\u003cpayment_methods\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should create a new beneficiary",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-positive-validations;",
  "rows": [
    {
      "cells": [
        "personal_email",
        "city",
        "country_code",
        "postcode",
        "state",
        "street_address",
        "account_currency",
        "account_name",
        "account_number",
        "account_routing_type1",
        "account_routing_value1",
        "bank_country_code",
        "bank_name",
        "local_clearing_system",
        "company_name",
        "entity_type",
        "nickname",
        "payment_methods"
      ],
      "line": 9,
      "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-positive-validations;;1"
    },
    {
      "cells": [
        "john.walker@gmail.com",
        "Seattle",
        "US",
        "98104",
        "Washington",
        "412 5th Avenue",
        "USD",
        "John Walker",
        "50001121",
        "aba",
        "021000021",
        "US",
        "JP Morgan Chase Bank",
        "ACH",
        "ABC University",
        "COMPANY",
        "ABC University",
        "LOCAL"
      ],
      "line": 10,
      "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-positive-validations;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Creating new beneficiary and doing positive validations",
  "description": "",
  "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-positive-validations;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user has AirWallex API Access with token",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user posts new request to create Beneficiary using exampleTable \"john.walker@gmail.com\" \"Seattle\" \"US\" \"98104\" \"Washington\" \"412 5th Avenue\" \"USD\" \"John Walker\" \"50001121\" \"aba\" \"021000021\" \"US\" \"JP Morgan Chase Bank\" \"ACH\" \"ABC University\" \"COMPANY\" \"ABC University\" \"LOCAL\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15,
    16,
    17
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should create a new beneficiary",
  "keyword": "Then "
});
formatter.match({
  "location": "APISteps.airwallex()"
});
formatter.result({
  "duration": 73422125,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john.walker@gmail.com",
      "offset": 65
    },
    {
      "val": "Seattle",
      "offset": 89
    },
    {
      "val": "US",
      "offset": 99
    },
    {
      "val": "98104",
      "offset": 104
    },
    {
      "val": "Washington",
      "offset": 112
    },
    {
      "val": "412 5th Avenue",
      "offset": 125
    },
    {
      "val": "USD",
      "offset": 142
    },
    {
      "val": "John Walker",
      "offset": 148
    },
    {
      "val": "50001121",
      "offset": 162
    },
    {
      "val": "aba",
      "offset": 173
    },
    {
      "val": "021000021",
      "offset": 179
    },
    {
      "val": "US",
      "offset": 191
    },
    {
      "val": "JP Morgan Chase Bank",
      "offset": 196
    },
    {
      "val": "ACH",
      "offset": 219
    },
    {
      "val": "ABC University",
      "offset": 225
    },
    {
      "val": "COMPANY",
      "offset": 242
    },
    {
      "val": "ABC University",
      "offset": 252
    },
    {
      "val": "LOCAL",
      "offset": 269
    }
  ],
  "location": "APISteps.createNewBeneficiary(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2833431833,
  "status": "passed"
});
formatter.match({
  "location": "APISteps.isNewBeneficiaryCreatedSuccessfully()"
});
formatter.result({
  "duration": 81000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Creating new beneficiary and doing negative validations",
  "description": "",
  "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-negative-validations",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user has AirWallex API Access with token",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user posts new request to create Beneficiary using exampleTable \"\u003cpersonal_email\u003e\" \"\u003ccity\u003e\" \"\u003ccountry_code\u003e\" \"\u003cpostcode\u003e\" \"\u003cstate\u003e\" \"\u003cstreet_address\u003e\" \"\u003caccount_currency\u003e\" \"\u003caccount_name\u003e\" \"\u003caccount_number\u003e\" \"\u003caccount_routing_type1\u003e\" \"\u003caccount_routing_value1\u003e\" \"\u003cbank_country_code\u003e\" \"\u003cbank_name\u003e\" \"\u003clocal_clearing_system\u003e\" \"\u003ccompany_name\u003e\" \"\u003centity_type\u003e\" \"\u003cnickname\u003e\" \"\u003cpayment_methods\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user should create a new beneficiary",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-negative-validations;",
  "rows": [
    {
      "cells": [
        "personal_email",
        "city",
        "country_code",
        "postcode",
        "state",
        "street_address",
        "account_currency",
        "account_name",
        "account_number",
        "account_routing_type1",
        "account_routing_value1",
        "bank_country_code",
        "bank_name",
        "local_clearing_system",
        "company_name",
        "entity_type",
        "nickname",
        "payment_methods"
      ],
      "line": 18,
      "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-negative-validations;;1"
    },
    {
      "cells": [
        "john.walker@gmail.com",
        "Seattle",
        "US",
        "98104",
        "Washington",
        "412 5th Avenue",
        "USD",
        "John Walker",
        "",
        "aba",
        "021000021",
        "US",
        "JP Morgan Chase Bank",
        "ACH",
        "ABC University",
        "COMPANY",
        "ABC University",
        "LOCAL"
      ],
      "line": 19,
      "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-negative-validations;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Creating new beneficiary and doing negative validations",
  "description": "",
  "id": "airwallex-post-request-to-create-beneficiary;creating-new-beneficiary-and-doing-negative-validations;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user has AirWallex API Access with token",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user posts new request to create Beneficiary using exampleTable \"john.walker@gmail.com\" \"Seattle\" \"US\" \"98104\" \"Washington\" \"412 5th Avenue\" \"USD\" \"John Walker\" \"\" \"aba\" \"021000021\" \"US\" \"JP Morgan Chase Bank\" \"ACH\" \"ABC University\" \"COMPANY\" \"ABC University\" \"LOCAL\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15,
    16,
    17
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user should create a new beneficiary",
  "keyword": "Then "
});
formatter.match({
  "location": "APISteps.airwallex()"
});
formatter.result({
  "duration": 84458,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john.walker@gmail.com",
      "offset": 65
    },
    {
      "val": "Seattle",
      "offset": 89
    },
    {
      "val": "US",
      "offset": 99
    },
    {
      "val": "98104",
      "offset": 104
    },
    {
      "val": "Washington",
      "offset": 112
    },
    {
      "val": "412 5th Avenue",
      "offset": 125
    },
    {
      "val": "USD",
      "offset": 142
    },
    {
      "val": "John Walker",
      "offset": 148
    },
    {
      "val": "",
      "offset": 162
    },
    {
      "val": "aba",
      "offset": 165
    },
    {
      "val": "021000021",
      "offset": 171
    },
    {
      "val": "US",
      "offset": 183
    },
    {
      "val": "JP Morgan Chase Bank",
      "offset": 188
    },
    {
      "val": "ACH",
      "offset": 211
    },
    {
      "val": "ABC University",
      "offset": 217
    },
    {
      "val": "COMPANY",
      "offset": 234
    },
    {
      "val": "ABC University",
      "offset": 244
    },
    {
      "val": "LOCAL",
      "offset": 261
    }
  ],
  "location": "APISteps.createNewBeneficiary(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1543675208,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[account_number\u0027] is required\u003e but was:\u003c[This field] is required\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat StepDefinition.APISteps.createNewBeneficiary(APISteps.java:87)\n\tat ✽.When user posts new request to create Beneficiary using exampleTable \"john.walker@gmail.com\" \"Seattle\" \"US\" \"98104\" \"Washington\" \"412 5th Avenue\" \"USD\" \"John Walker\" \"\" \"aba\" \"021000021\" \"US\" \"JP Morgan Chase Bank\" \"ACH\" \"ABC University\" \"COMPANY\" \"ABC University\" \"LOCAL\"(AirWallex.feature:15)\n",
  "status": "failed"
});
formatter.match({
  "location": "APISteps.isNewBeneficiaryCreatedSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
});