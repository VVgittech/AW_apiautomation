package Enums;

public enum Constants {
  AIRWALLEX_TOKEN("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIyNzc0M2I5Zi1jZGYzLTQxNTctOGY1OS0xMWY1YTA2NTNjMmIiLCJzdWIiOiIyODk2ZWJmZC03YjM5LTRjYjktYTE2My00ZGM5NTkyOGI3MzUiLCJpYXQiOjE2NDcyOTY2ODcsImV4cCI6MTY0NzMwODY4NywiYWNjb3VudF9pZCI6IjIyNTQ4MzkyLTM4Y2MtNDFiNy04YjFiLWM1YWNjZDAzNzJhOCIsImRhdGFfY2VudGVyX3JlZ2lvbiI6IkhLIiwidHlwZSI6ImNsaWVudCIsImRjIjoiSEsiLCJpc3NkYyI6IlVTIn0.0Udqg7ktBm1DNbZ0fu0khef_OTFzswiFatwbQSecPmg"),
  AIRWALLEX_API_BASE_URL("https://api-demo.airwallex.com"),
  AIRWALLEX_CREATE_NEW_BENEFICIARY_ENDPOINT("/api/v1/beneficiaries/create")
  ;

  public String value;

  Constants(String value){
    this.value=value;
  }
}
