package POJO.Airwallex;

public class Beneficiary {
    private Address address;

    private String entity_type;

    private Additional_info additional_info;

    private Bank_details bank_details;

    private String company_name;

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public String getEntity_type ()
    {
        return entity_type;
    }

    public void setEntity_type (String entity_type)
    {
        this.entity_type = entity_type;
    }

    public Additional_info getAdditional_info ()
    {
        return additional_info;
    }

    public void setAdditional_info (Additional_info additional_info)
    {
        this.additional_info = additional_info;
    }

    public Bank_details getBank_details ()
    {
        return bank_details;
    }

    public void setBank_details (Bank_details bank_details)
    {
        this.bank_details = bank_details;
    }

    public String getCompany_name ()
    {
        return company_name;
    }

    public void setCompany_name (String company_name)
    {
        this.company_name = company_name;
    }

    @Override
    public String toString()
    {
        return "Beneficiary [address = "+address+", entity_type = "+entity_type+", additional_info = "+additional_info+", bank_details = "+bank_details+", company_name = "+company_name+"]";
    }
}
