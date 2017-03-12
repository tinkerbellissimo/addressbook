package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.ContactData;
import com.tinkerbellissimo.addressbook.model.Contacts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

/**
 * Created by tinkerbellissimo on 2/27/17.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData().withFirstName("testFirstName").withLastName("testLastName")
              .withAddress("testAddress").withEmail("test@mail.com").withHomePhone("111")
              .withMobilePhone("222 333").withWorkPhone("(1)2-34").withGroup("test1") , true);
    }
  }

  @Test
  public void testContactModification() {
    Contacts before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData().withId(modifiedContact.getId())
            .withFirstName("testFirstName").withLastName("testLastName").withAddress("testAddress")
            .withEmail("test@mail.com").withHomePhone("111").withMobilePhone("222 333")
            .withWorkPhone("(1)2-34").withHomePhone("testHomePhone").withGroup("test1");
    app.contact().modify(contact);
    assertEquals(app.contact().count(), before.size());
    Contacts after = app.contact().all();
    assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));

  }
}
