public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Frodo", "Balings", new MasterCard(0), new EmailContact(("frodo@novi.nl")));
        customer.getCreditCard().pay(100);
        customer.printName();
        customer.getContactinfo().sendMessage();
        System.out.println(customer.getCreditCard().getDebt());



        Customer customer2 = new Customer("Samwise", "Gamgee", new VisaCard(0), new EmailContact(("samwise@novi.nl")));
        customer2.getCreditCard().pay(100);

        customer2.printName();
        System.out.println(customer2.getCreditCard().getDebt());

    }
}
