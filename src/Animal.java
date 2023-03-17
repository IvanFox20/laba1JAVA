public class Animal
{
    private Integer age;
    private String name;
    private String color;
    private String gender;

    Animal()
    {
        this(0,"n/a","n/a","n/a");
    }
    Animal(Integer ageValue,String nameValue,String colorValue,String genderValue)
    {
        this.age = ageValue;
        this.name = nameValue;
        this.color = colorValue;
        this.gender = genderValue;
    }
    public void setAge(Integer value)
    {
        this.age = value;
    }
    public Integer getAge()
    {
        return age;
    }

    public void setName(String value)
    {
        this.name = value;
    }

    public String getName()
    {
        return name;
    }

    public void setColor(String value)
    {
        this.color = value;
    }

    public String getColor()
    {
        return color;
    }
    public void setGender(String value)
    {
        this.gender = value;
    }

    public String getGender()
    {
        return gender;
    }

    public  String toString()
    {
        return "age: " + age + "| name: " + name + "| color: " + color + "| gender: " + gender;
    }
}
