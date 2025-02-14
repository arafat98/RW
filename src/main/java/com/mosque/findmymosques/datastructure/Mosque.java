package com.mosque.findmymosques.datastructure;
import jakarta.persistence.*;

import com.mosque.findmymosques.datastructure.Area;


@Entity

@Table(name = "mosques") //this is the table name in the databse

public class Mosque {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically increments the id
    private long id;

    @Column(nullable = false) // cannot be null for the name of the mosque
    private String name;

    @Column(nullable = false)
    private String address; // address column in the table and cannot be null

    @Column(nullable = false, length = 10)
    private String postcode; //postcode of the mosques stored in this column

    private double latitude;
    private double longitude;

    @ManyToOne
    @JoinColumn(name = "area_id") //foreign key in the table, one to many relationship
    private Area area;

    private String contactNumber;

    // Constructors
    public Mosque() {
    }

    public Mosque(String name, String address, String postcode, double latitude, double longitude, Area area, String contactNumber) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.area = area;
        this.contactNumber = contactNumber;

    }


    // Getter and Setters using it to access private
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }






}
