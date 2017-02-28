package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by tinkerbellissimo on 2/26/17.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
