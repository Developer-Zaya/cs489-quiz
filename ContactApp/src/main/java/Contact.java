import java.util.ArrayList;
import java.util.List;



public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    // Constructor
    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
    }

    public String getLastName() {
        return lastName;
    }
    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void removePhoneNumber(String number) {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            if (phoneNumbers.get(i).getNumber().equals(number)) {
                phoneNumbers.remove(i);
                return;
            }
        }
    }

    public void addEmailAddress(EmailAddress emailAddress) {
        emailAddresses.add(emailAddress);
    }

    public void removeEmailAddress(String address) {
        for (int i = 0; i < emailAddresses.size(); i++) {
            if (emailAddresses.get(i).getAddress().equals(address)) {
                emailAddresses.remove(i);
                return;
            }
        }
    }
}
