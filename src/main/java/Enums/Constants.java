package Enums;

public enum Constants {
  AIRWALLEX_TOKEN("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI3Njk5ODgwNC0xMzMzLTQ0M2MtOTgxNi0xMTM3ODQyZGU4MGMiLCJzdWIiOiIyODk2ZWJmZC03YjM5LTRjYjktYTE2My00ZGM5NTkyOGI3MzUiLCJpYXQiOjE2NDcyOTEzMjMsImV4cCI6MTY0NzMwMzMyMywiYWNjb3VudF9pZCI6IjIyNTQ4MzkyLTM4Y2MtNDFiNy04YjFiLWM1YWNjZDAzNzJhOCIsImRhdGFfY2VudGVyX3JlZ2lvbiI6IkhLIiwidHlwZSI6ImNsaWVudCIsImRjIjoiSEsiLCJpc3NkYyI6IlVTIn0.RX7xRta665yrfrNWNftlJr46HC3BP2f1xU_2gsZ1fko"),
  AIRWALLEX_API_BASE_URL("https://api-demo.airwallex.com"),
  AIRWALLEX_CREATE_NEW_BENEFICIARY_ENDPOINT("/api/v1/beneficiaries/create")
  ;

  public String value;

  Constants(String value){
    this.value=value;
  }
}
