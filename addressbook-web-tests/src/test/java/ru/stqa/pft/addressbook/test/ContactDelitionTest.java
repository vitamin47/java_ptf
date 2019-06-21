package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class ContactDelitionTest extends TestBase{

    @Test
    public void testContactDelition() throws Exception{
        app.getContactHelper().selectChecbox();
        app.getContactHelper().clickDelete();
        app.getNavigationHelper().alertClose();
    }

}
