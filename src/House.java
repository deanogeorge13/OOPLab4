public class House {
    private String address;
    private String type;
    private double price;
    private Person owner;

    public House()
    {
        setAddress("No Address Specified");
        setType("No Type Specified");
        setPrice(0.0);
        setOwner(new Person("No Owner Specified"));
    }

    public House(String addr, String type, double price, String name, int age, char gender)
    {
        this.address=addr;
        this.type=type;
        this.price=price;
        this.owner = new Person(name, age, gender);
    }

    public String getAddress()
    {
        return address;
    }

    public String getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(double price)
    {
        if(price>=0.0)
            this.price = price;

        else
            System.out.println("yikes");
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }

    public String toString()
    {
        return "Address: " + getAddress() + "\nType: " + getType() + "\nPrice: " + getPrice() + "\nOwner: " + getOwner();
    }
}
