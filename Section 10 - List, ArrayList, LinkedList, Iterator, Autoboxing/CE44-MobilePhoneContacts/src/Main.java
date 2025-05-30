public class Main
{
    public static void main(String[] args)
    {
        MobilePhone mobilelist = new MobilePhone("912428087");

        Contact contact = new Contact("John", "12324");
        Contact contact1 = new Contact("John", "12324");

       mobilelist.addNewContact(contact);
       mobilelist.addNewContact(contact1);
       mobilelist.printContacts();

    }
}