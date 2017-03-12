package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.ContactData;
import com.tinkerbellissimo.addressbook.model.Contacts;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;


public class ContactCreationTests extends TestBase {
    
  @Test
  public void testContactCreation() {
    app.goTo().homePage();
    Contacts before = app.contact().all();
    ContactData contact = new ContactData()
            .withFirstName("testFirstName").withLastName("testLastName")
            .withAddress("23-05 Quentin Rd, Apt D1, Brooklyn, NY 11220").withEmail("test@mail.com")
            .withHomePhone("111").withMobilePhone("222 333").withWorkPhone("(1)2-34").withGroup("test1");
    app.contact().create(contact, true);
    assertEquals(app.contact().count(), before.size() + 1);
    Contacts after = app.contact().all();
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }
}
