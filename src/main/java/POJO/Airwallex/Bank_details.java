package POJO.Airwallex;

public class Bank_details {
    private String account_number;

    private String account_currency;

    private String bank_country_code;

    private String account_routing_value1;

    private String account_name;

    private String bank_name;

    private String account_routing_type1;

    private String local_clearing_system;

    public String getLocal_clearing_system() {
        return local_clearing_system;
    }

    public void setLocal_clearing_system(String local_clearing_system) {
        this.local_clearing_system = local_clearing_system;
    }

    public String getAccount_number ()
    {
        return account_number;
    }

    public void setAccount_number (String account_number)
    {
        this.account_number = account_number;
    }

    public String getAccount_currency ()
    {
        return account_currency;
    }

    public void setAccount_currency (String account_currency)
    {
        this.account_currency = account_currency;
    }

    public String getBank_country_code ()
    {
        return bank_country_code;
    }

    public void setBank_country_code (String bank_country_code)
    {
        this.bank_country_code = bank_country_code;
    }

    public String getAccount_routing_value1() {
        return account_routing_value1;
    }

    public void setAccount_routing_value1(String account_routing_value1) {
        this.account_routing_value1 = account_routing_value1;
    }

    public String getAccount_name ()
    {
        return account_name;
    }

    public void setAccount_name (String account_name)
    {
        this.account_name = account_name;
    }

    public String getBank_name ()
    {
        return bank_name;
    }

    public void setBank_name (String bank_name)
    {
        this.bank_name = bank_name;
    }

    public String getAccount_routing_type1 ()
    {
        return account_routing_type1;
    }

    public void setAccount_routing_type1 (String account_routing_type1)
    {
        this.account_routing_type1 = account_routing_type1;
    }

    @Override
    public String toString() {
        return "Bank_details{" +
                "account_number='" + account_number + '\'' +
                ", account_currency='" + account_currency + '\'' +
                ", bank_country_code='" + bank_country_code + '\'' +
                ", account_routing_value1='" + account_routing_value1 + '\'' +
                ", account_name='" + account_name + '\'' +
                ", bank_name='" + bank_name + '\'' +
                ", account_routing_type1='" + account_routing_type1 + '\'' +
                ", local_clearing_system='" + local_clearing_system + '\'' +
                '}';
    }
}
