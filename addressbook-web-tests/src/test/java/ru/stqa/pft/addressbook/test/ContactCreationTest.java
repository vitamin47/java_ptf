package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.getNavigationHelper().gotoCreateContact();
    app.getContactHelper().addContact(new ContactData("Contact1", "MiddleNameContact1", "LastNameContact1", "Title", "Company", "Address", "1", "January", "1980", "2", "February", "2019"));
    app.getContactHelper().submitContact();
  }
}

