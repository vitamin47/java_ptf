package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    FirefoxDriver wd;

    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    private GroupsHelper groupsHelper;
    private SessionHelper sessionHelper;

    public void init() {
       wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupsHelper = new GroupsHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void logout() {
      wd.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        logout();
        wd.quit();
    }

    public boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }



    public GroupsHelper getGroupsHelper() {
        return groupsHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
