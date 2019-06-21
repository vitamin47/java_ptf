package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
      click(By.linkText("groups"));
    }

    public void gotoCreateContact() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void alertClose (){
        wd.switchTo().alert().accept();
    }
}
