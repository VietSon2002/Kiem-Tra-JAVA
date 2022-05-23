import java.util.Date;


public abstract class Person
{
    private String name;
    private Date birth;
    private byte gender;

    public Person()
    {
    }
    
    public Person(String name, Date birth, byte gender)
    {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getBirth()
    {
        return birth;
    }

    public void setBirth(Date birth)
    {
        this.birth = birth;
    }

    public byte getGender()
    {
        return gender;
    }

    public void setGender(byte gender)
    {
        this.gender = gender;
    }
    
    
}
