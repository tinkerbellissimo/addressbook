package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    
  @Test
  public void testContactCreation() {
    app.goToHomePage();
    app.getContactHelper().createContact(new ContactData("testFirstName", "testLastName",
            "testAddress", "testHomePhone", "test1") , true);
  }
}
