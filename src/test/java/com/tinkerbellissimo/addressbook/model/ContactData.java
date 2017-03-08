package com.tinkerbellissimo.addressbook.model;

/**
 * Created by tinkerbellissimo on 2/27/17.
 */
public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String address;
  private final String homePhone;
  private final String group;
  private int id;

  public ContactData(String firstName, String lastName, String address, String homePhone, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.homePhone = homePhone;
    this.group = group;
  }

  public ContactData(int id, String firstName, String lastName, String address, String homePhone, String group) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.homePhone = homePhone;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getGroup() {
    return group;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "firstName='" + firstName + '\'' +
            ", id=" + id +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    return firstName != null ? firstName.equals(that.firstName) : that.firstName == null;

  }

  @Override
  public int hashCode() {
    return firstName != null ? firstName.hashCode() : 0;
  }
}
