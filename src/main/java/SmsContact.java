public class SmsContact implements ContactInfo {
    private String phoneNumber;

    public SmsContact (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage() {
        System.out.println("Sms send to " + phoneNumber);
    }
}