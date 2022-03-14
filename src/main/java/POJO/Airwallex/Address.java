package POJO.Airwallex;

public class Address {
    private String country_code;

    private String street_address;

    private String city;

    private String postcode;

    private String state;

    public String getCountry_code ()
    {
        return country_code;
    }

    public void setCountry_code (String country_code)
    {
        this.country_code = country_code;
    }

    public String getStreet_address ()
    {
        return street_address;
    }

    public void setStreet_address (String street_address)
    {
        this.street_address = street_address;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getPostcode ()
    {
        return postcode;
    }

    public void setPostcode (String postcode)
    {
        this.postcode = postcode;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    @Override
    public String toString()
    {
        return "Address [country_code = "+country_code+", street_address = "+street_address+", city = "+city+", postcode = "+postcode+", state = "+state+"]";
    }
}
