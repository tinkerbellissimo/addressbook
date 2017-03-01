package com.tinkerbellissimo.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by tinkerbellissimo on 2/28/17.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getGroupHelper().selectContact();
    app.getGroupHelper().deleteSelectedContact();
    app.getGroupHelper().acceptAlert();
  }
}
