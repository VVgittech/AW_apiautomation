package POJO.Airwallex;

public class Additional_info {
    private String personal_email;

    public String getPersonal_email ()
    {
        return personal_email;
    }

    public void setPersonal_email (String personal_email)
    {
        this.personal_email = personal_email;
    }

    @Override
    public String toString()
    {
        return "Additional_info [personal_email = "+personal_email+"]";
    }
}
