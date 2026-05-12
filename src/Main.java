//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
//creation de contact a ajouter dans la liste des contacts
       Contacts ami1 = new Contacts();
       ami1.name = "foto";
       ami1.phoneNumber = "0143005551";
        myContactsManager.addContact(ami1);

        Contacts ami2 = new Contacts();
        ami2.name = "yann";
        ami2.phoneNumber = "0705180954";
        myContactsManager.addContact(ami2);


        Contacts ami3 = new Contacts();
        ami3.name = "thierry";
        ami3.phoneNumber = "0506687323";
        myContactsManager.addContact(ami3);


        Contacts result =
                myContactsManager.getContact("foto");

        System.out.println(result.phoneNumber);
    }
}