package com.wipro.basic;

public class Customer {

   
    String customerName;
    String phoneNumber;
    String emailId;
    String address;

    public Customer(String customerName, String phoneNumber, String emailId, String address) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    
    public static void main(String[] args) {
      
        Customer cust = new Customer("Srikanth", "1234567890", "srikanth@example.com", "Hyderabad");
        System.out.println("Customer Name: " + cust.getCustomerName());
        System.out.println("Phone Number: " + cust.getPhoneNumber());
        System.out.println("Email ID: " + cust.getEmailId());
        System.out.println("Address: " + cust.getAddress());
    }
}
