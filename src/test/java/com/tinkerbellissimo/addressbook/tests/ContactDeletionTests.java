package com.tinkerbellissimo.addressbook.tests;

import com.tinkerbellissimo.addressbook.model.ContactData;
import com.tinkerbellissimo.addressbook.model.Contacts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tinkerbellissimo on 2/28/17.
 */
public class ContactDeletionTests extends TestBase {

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
  public void testContactDeletion() {
    Contacts before = app.contact().all();
    ContactData deletedContact = before.iterator().next();
    app.contact().delete(deletedContact);
    assertEquals(app.contact().count(), before.size() - 1);
    Contacts after = app.contact().all();
    assertThat(after, equalTo(before.without(deletedContact)));
  }
}
