//import org.example.model.Contact;

import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        Contact[] contacts = {
                new Contact("David", "Sanger", "Argos LLC", "Sales Manager"),
                new Contact("Carlos", "Jimenez", "Zappos", "Director"),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager")
        };

        PhoneNumber phone1 = new PhoneNumber("240-133-0011", "Home");
        PhoneNumber phone2 = new PhoneNumber("240-133-0123", "Mobile");
        PhoneNumber phone3 = new PhoneNumber("412-116-9988", "Work");

        EmailAddress email1 = new EmailAddress("dave.sang@gmail.com", "Home");
        EmailAddress email2 = new EmailAddress("dsanger@argos.com", "Work");
        EmailAddress email3 = new EmailAddress("ali@bmi.com", "Work");

            contacts[0].addPhoneNumber(phone1);
            contacts[0].addPhoneNumber(phone2);
            contacts[2].addPhoneNumber(phone3);

            contacts[0].addEmailAddress(email1);
            contacts[1].addEmailAddress(email2);
            contacts[2].addEmailAddress(email3);

            //sort contacts on last name

            for (int i = 0; i < contacts.length; i++) {
                for (int j = i + 1; j < contacts.length; j++) {
                    if (contacts[i].getLastName().compareTo(contacts[j].getLastName()) > 0) {
                        Contact temp = contacts[i];
                        contacts[i] = contacts[j];
                        contacts[j] = temp;
                    }
                }
            }

            Gson gson = new Gson();
            for (Contact contact : contacts) {
                String json = gson.toJson(contact);
                System.out.println(json);
            }
    }
}