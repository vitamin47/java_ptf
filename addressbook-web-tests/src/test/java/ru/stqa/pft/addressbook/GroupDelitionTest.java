package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase{

  @Test
  public void testGroupDelition() throws Exception {
    gotoGroupPage();
    selectGroup();
    deliteSelectedGroups();
    returnToGroupPage();
  }

}
