package com.gyg.chapter05.entity;

public class Spitter {

  private Long id;
  
/*  @NotNull
  @Size(min=5, max=16)*/
  private String username;

  /*@NotNull
  @Size(min=5, max=25)*/
  private String password;
  
 /* @NotNull
  @Size(min=2, max=30)*/
  private String firstName;

 /* @NotNull
  @Size(min=2, max=30)*/
  private String lastName;
  
 /* @NotNull
  @Email*/
  private String email;

  public Spitter() {}
  
  public Spitter(String username, String password, String firstName, String lastName, String email) {
    this(null, username, password, firstName, lastName, email);
  }

  public Spitter(Long id, String username, String password, String firstName, String lastName, String email) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Spitter spitter = (Spitter) o;

    if (id != null ? !id.equals(spitter.id) : spitter.id != null) return false;
    if (!username.equals(spitter.username)) return false;
    if (!password.equals(spitter.password)) return false;
    if (!firstName.equals(spitter.firstName)) return false;
    if (!lastName.equals(spitter.lastName)) return false;
    return email.equals(spitter.email);
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + username.hashCode();
    result = 31 * result + password.hashCode();
    result = 31 * result + firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + email.hashCode();
    return result;
  }
}
