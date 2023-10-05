public class EmailContact implements ContactInfo {
    private String email;

    public EmailContact (String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void sendMessage() {
        System.out.println("Email send to " + email);
    }
}
