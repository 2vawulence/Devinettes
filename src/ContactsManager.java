public class ContactsManager {
    //creation de la liste de contact et de la fonction de recherche
    Contacts[] liste = new Contacts[2];
    int contactCount = 0;
    void addContact(Contacts contact){
        liste[contactCount] = contact;
        contactCount++;
    }
    Contacts getContact(String searchName ){
        for(int i=0;i<contactCount;i++){
            if(liste[i].name.equals(searchName)){

                return liste[i];
            }
        }
        return null;
    }

}
