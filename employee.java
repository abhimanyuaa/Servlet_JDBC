package com.demo.beans;

public class employee {
String name,city,address;
int contact;
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(String name, String city, String address, int contact) {
	super();
	this.name = name;
	this.city = city;
	this.address = address;
	this.contact = contact;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "employee [name=" + name + ", city=" + city + ", address=" + address + ", contact=" + contact + "]";
}

}
