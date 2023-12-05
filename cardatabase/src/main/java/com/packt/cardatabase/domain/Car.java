package com.packt.cardatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String brand, model, color, registrationNumber;
	private int modelYear, price;
	
	public Car() {
		super();
	}
	
	public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price,
			Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.modelYear = modelYear;
		this.price = price;
		this.owner = owner;
	}

	public Long getId() {
        return id;
	}
	public String getBrand() {
        return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}	
	public String getModel() {
        return model;
	}
	public void setModel(String model) {
        this.model = model;
	}
	
	public String getColor() {
		return color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public int getModelYear() {
		return modelYear;
	}

	public int getPrice() {
		return price;
	}



	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="owner")
	private Owner owner;
	// Getter and setter
	public Owner getOwner() {
	    return owner;
	}
	public void setOwner(Owner owner) {
	    this.owner = owner;
	}
	
}
