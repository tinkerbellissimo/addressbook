package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.goToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
  }
}
