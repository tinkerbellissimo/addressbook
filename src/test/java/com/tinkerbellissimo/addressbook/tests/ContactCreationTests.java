package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    
  @Test
  public void testContactCreation() {
    app.getGroupHelper().initContactCreation();
    app.getGroupHelper().fillContactForm(new ContactData("testFirstName", "testLastName",
            "testAddress", "testHomePhone"));
    app.getGroupHelper().submitContactCreation();
  }
}
