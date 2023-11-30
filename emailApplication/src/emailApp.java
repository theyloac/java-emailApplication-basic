public class emailApp {
    
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        em1.setMailboxCapacity(200);
        System.out.println(em1.showInfo());
    }
}
