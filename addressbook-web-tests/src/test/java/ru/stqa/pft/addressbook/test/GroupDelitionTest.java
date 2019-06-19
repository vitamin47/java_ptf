package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase{

  @Test
  public void testGroupDelition() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupsHelper().selectGroup();
    app.getGroupsHelper().deliteSelectedGroups();
    app.getGroupsHelper().returnToGroupPage();
  }

}
