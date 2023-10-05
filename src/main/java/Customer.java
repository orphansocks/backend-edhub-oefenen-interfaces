public class Customer {

    private String name;
    private int customerNumber;
    private String lastName;
    private CreditCard creditCard;
    private ContactInfo contactinfo;

	// CONSTRUCTOR

    public Customer(String name, String lastName, CreditCard creditCard, ContactInfo contactinfo) {
        this(name, lastName, (int) (Math.random() * 100), creditCard, contactinfo);
    }
    public Customer(String name, String lastName, int customerNumber, CreditCard creditCard, ContactInfo contactinfo) {
        this.name = name;
        this.customerNumber = customerNumber;
        this.lastName = lastName;
        this.creditCard = creditCard;
        this.contactinfo = contactinfo;
    }

    //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public ContactInfo getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(ContactInfo contactinfo) {
        this.contactinfo = contactinfo;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }
}
