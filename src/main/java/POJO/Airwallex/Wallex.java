package POJO.Airwallex;

import Annotation.CSVProviderAnnotation;
import Utilities.CSVUtility;

import java.util.List;

public class Wallex {
    private String beneficiary_id;

    private List<String> payment_methods;

    private Beneficiary beneficiary;

    private String nickname;

    private String uniqueValue;

    public String getUniqueValue() {
        return uniqueValue;
    }

    public void setUniqueValue(String uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    public String getBeneficiary_id() {
        return beneficiary_id;
    }

    public void setBeneficiary_id(String beneficiary_id) {
        this.beneficiary_id = beneficiary_id;
    }

    public List<String> getPayment_methods() {
        return payment_methods;
    }

    public void setPayment_methods(List<String> payment_methods) {
        this.payment_methods = payment_methods;
    }

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getNickname() {
        return nickname;
    }
    @CSVProviderAnnotation(value="readCSVWithUniqueIdentfierFromFeatureFile")
    public static Wallex getCSVData(String value){
        CSVUtility csvUtility=new CSVUtility();
        List<Wallex>listOfWallex=csvUtility.csvReadAll(Wallex.class);
        Wallex wallex=new Wallex();
        for(Wallex wallex1:listOfWallex){
            if(wallex1.getUniqueValue().equalsIgnoreCase(value)){
                Beneficiary beneficiary=new Beneficiary();
                Address address=new Address();
                Additional_info additional_info=new Additional_info();
                Bank_details bank_details=new Bank_details();

                additional_info.setPersonal_email(wallex1.getBeneficiary().getAdditional_info().getPersonal_email());

                address.setCity(wallex1.getBeneficiary().getAddress().getCity());
                address.setCountry_code(wallex1.getBeneficiary().getAddress().getCountry_code());
                address.setPostcode(wallex1.getBeneficiary().getAddress().getPostcode());
                address.setState(wallex1.getBeneficiary().getAddress().getState());
                address.setStreet_address(wallex1.getBeneficiary().getAddress().getStreet_address());

                bank_details.setAccount_currency(wallex1.getBeneficiary().getBank_details().getAccount_currency());
                bank_details.setAccount_name(wallex1.getBeneficiary().getBank_details().getAccount_name());
                bank_details.setAccount_number(wallex1.getBeneficiary().getBank_details().getAccount_number());
                bank_details.setAccount_routing_type1(wallex1.getBeneficiary().getBank_details().getAccount_routing_type1());
                bank_details.setAccount_routing_value1(wallex1.getBeneficiary().getBank_details().getAccount_routing_value1());
                bank_details.setBank_country_code(wallex1.getBeneficiary().getBank_details().getBank_country_code());
                bank_details.setBank_name(wallex1.getBeneficiary().getBank_details().getBank_name());
                bank_details.setLocal_clearing_system(wallex1.getBeneficiary().getBank_details().getLocal_clearing_system());

                beneficiary.setCompany_name(wallex1.getBeneficiary().getCompany_name());
                beneficiary.setEntity_type(wallex1.getBeneficiary().getEntity_type());
                beneficiary.setAddress(address);
                beneficiary.setAdditional_info(additional_info);
                beneficiary.setBank_details(bank_details);

                wallex.setBeneficiary(beneficiary);
                wallex.setNickname(wallex1.getNickname());
                wallex.setPayment_methods(wallex1.getPayment_methods());

            }
        }
        return wallex;
    }

    public static void main(String[] args) {
        System.out.println(Wallex.getCSVData("test1"));
    }
    @Override
    public String toString() {
        return "Wallex{" +
                "beneficiary_id='" + beneficiary_id + '\'' +
                ", payment_methods=" + payment_methods +
                ", beneficiary=" + beneficiary +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
