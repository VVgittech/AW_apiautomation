package StepDefinition;

import Context.ThreadContextForScenarios;
import Enums.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class APISteps {


    public APISteps(){

    }


    @Given("^user has AirWallex API Access with token$")
    public void airwallex(){
        System.out.println("User going to create beneficiary with valid token");
    }

    @When("^user posts new request to create Beneficiary using exampleTable \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
        public void createNewBeneficiary(String personal_email,String city,String country_code,String postcode,String state,String street_address,String account_currency,String account_name,String account_number,String account_routing_type1,String account_routing_value1,String bank_country_code,String bank_name,String local_clearing_system,String company_name,String entity_type,String nickname,String payment_methods){
        JSONObject beneficiary=new JSONObject();
        String expectedMessage="";
        JSONObject finalJSONObject =new JSONObject();
        JSONObject additional_info=new JSONObject();
        additional_info.put("personal_email",personal_email);

       JSONObject address=new JSONObject();
       address.put("city",city);
        address.put("country_code",country_code);
        address.put("postcode",postcode);
        address.put("state",state);
        address.put("street_address",street_address);

        JSONObject bank_details=new JSONObject();
        bank_details.put("account_currency",account_currency);
        bank_details.put("account_name",account_name);
        if(account_number.isEmpty()){
            expectedMessage="account_number' is required";
        }
        else if(account_number.length()<=7 && account_number.length()>=11){
            expectedMessage="Length of account_number should be between 7 and 11 when bank_country_code is 'US'";
        }
        bank_details.put("account_number",account_number);
        bank_details.put("account_routing_type1",account_routing_type1);
        bank_details.put("account_routing_value1",account_routing_value1);
        bank_details.put("bank_country_code",bank_country_code);
        bank_details.put("bank_name",bank_name);
        bank_details.put("local_clearing_system",local_clearing_system);

        beneficiary.put("additional_info",additional_info);
        beneficiary.put("address",address);
        beneficiary.put("bank_details",bank_details);
        beneficiary.put("company_name",company_name);
        beneficiary.put("entity_type",entity_type);
        finalJSONObject.put("nickname",nickname);
        JSONArray payment_methodsArray=new JSONArray();
        payment_methodsArray.add(payment_methods);
        finalJSONObject.put("payment_methods",payment_methodsArray);

        finalJSONObject.put("beneficiary",beneficiary);


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","Bearer "+Constants.AIRWALLEX_TOKEN.value+"")
           //     .header("headers", "[object Object]")
                .and()
                .body(finalJSONObject.toJSONString())
                .when()
                .post(Constants.AIRWALLEX_API_BASE_URL.value+Constants.AIRWALLEX_CREATE_NEW_BENEFICIARY_ENDPOINT.value)
                .then()
                .extract().response();
        System.out.println(response.body().prettyPrint());
        System.out.println(response.statusCode());

        if(response.statusCode()!=201){
            Assert.assertEquals(400, response.statusCode());
            Assert.assertEquals(expectedMessage,response.jsonPath().getString("message"));
        }
        ThreadContextForScenarios.setScenarioContext("Response",response);

    }

    @Then("^user should create a new beneficiary$")
    public void isNewBeneficiaryCreatedSuccessfully(){
        Response response= (Response) ThreadContextForScenarios.getScenarioContext("Response");

    }
}
