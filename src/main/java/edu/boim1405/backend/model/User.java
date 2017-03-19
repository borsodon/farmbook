package edu.boim1405.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "user_identification", unique = true, nullable = false)
    private String userIdentification;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "email_address", unique = true)
    private String emailAddress;

    @Column(name = "telephone")
    private String telephone;

    public User(final String userIdentification, final String firstName,
            final String lastName, final String password,
            final String emailAddress, final String telephone) {
        this.userIdentification = userIdentification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }

    public User(final Long id, final String userIdentification,
            final String firstName, final String lastName, final String password,
             final String emailAddress, final String telephone) {
        super(id);
        this.userIdentification = userIdentification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }

    
	public String getUserIdentification() {
		return userIdentification;
	}

	public void setUserIdentification(String userIdentification) {
		this.userIdentification = userIdentification;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
