package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by tinkerbellissimo on 2/27/17.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getGroupHelper().selectContact();
    app.getGroupHelper().initContactModification();
    app.getGroupHelper().fillContactForm(new ContactData("testFirstName2", "testLastName2",
            "testAddress2", "testHomePhone2"));
    app.getGroupHelper().submitContactModification();
  }
}
