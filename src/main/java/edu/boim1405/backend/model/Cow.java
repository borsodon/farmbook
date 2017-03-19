package edu.boim1405.backend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "cow")
public class Cow extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length=32)
	private String name;
	
	@Column(length=16,nullable=false)
	private String earNumber;
	
	
	@Column(nullable=false)
	@Type(type="date")
	private Date birthDate;
	
	@ManyToOne
    @JoinColumn(name = "owner", nullable = false)
    private User owner;

	public Cow() {
        super(null);
    }
	
	public Cow(final Long id, final String name, 
			final String earNumber, final Date birthDate, final User owner) {
			super(id);
			this.name = name;
			this.earNumber = earNumber;
			this.birthDate = birthDate;
			this.owner = owner;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEarNumber() {
		return earNumber;
	}

	public void setEarNumber(String earNumber) {
		this.earNumber = earNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
