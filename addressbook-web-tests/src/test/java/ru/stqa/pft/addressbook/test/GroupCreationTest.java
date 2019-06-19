package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupsHelper().initGroupCreation();
    app.getGroupsHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupsHelper().submitGroup();
    app.getGroupsHelper().returnToGroupPage();
  }
}
