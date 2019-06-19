package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class GroupDelitionTest extends TestBase{

  @Test
  public void testGroupDelition() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deliteSelectedGroups();
    app.returnToGroupPage();
  }

}
