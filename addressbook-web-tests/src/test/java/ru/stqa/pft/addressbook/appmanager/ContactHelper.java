package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitContact() {
        wd.findElement(By.xpath("//input[@name='submit']")).click();
    }

    public void addContact(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("middlename"),contactData.getMiddlename());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("title"),contactData.getTitle());
        type(By.name("company"),contactData.getCompany());
        type(By.name("address"),contactData.getAddress());
        list(By.name("bday"), contactData.getBday());
        list(By.name("bmonth"), contactData.getBmonth());
        type(By.name("byear"),contactData.getByear());
        list(By.name("aday"), contactData.getAday());
        list(By.name("amonth"), contactData.getAmonth());
        type(By.name("ayear"),contactData.getAyear());
    }


    public void selectChecbox() {
        click(By.name("selected[]"));
    }

    public void clickDelete() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void contactModification() {
        click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a/img"));
    }

    public void updateContact() {
        click(By.name("update"));
    }
}
