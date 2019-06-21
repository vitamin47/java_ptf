package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

    @Test
    public void testContactModification() throws Exception{
        app.getContactHelper().selectChecbox();
        app.getContactHelper().contactModification();
        app.getContactHelper().addContact(new ContactData("Name1", "MiddleName2", "","","","","2","February","","2","March",""));
        app.getContactHelper().updateContact();
    }
}
