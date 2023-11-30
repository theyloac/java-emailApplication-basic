import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;


    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        // Call a method asking for the department - return the department
        this.department = setDepartment();


        // Call a method that returns a random password
        this.password = randomPassword(10);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        String email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + ".company.com";

        
    }

    // Method to ask for and set the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales"; }
        else if (depChoice == 2) { return "dev"; }
        else if (depChoice == 3) { return "acct"; }
        else { return ""; }
    }

    // Generate a random password
    private String randomPassword(int lenght){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Getters
    public int getMailboxCapacity() { return this.mailboxCapacity; }
    public String getAlternateEmail() { return this.alternateEmail; }
    public String getPassword() { return this.password; }

    // Show info
    public String showInfo() {
        return "DISPLAY NAME: " + this.firstName + " " + this.lastName + 
        "\nCOMPANY EMAIL: " + this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + ".company.com" +
        "\nMAILBOX CAPACITY: " + this.mailboxCapacity + "mb";
    }



}
