package com.dufuna.berlin.admin.model;

import java.time.LocalDate;
import java.util.Objects;

public class LekkiProperty {
    private Long propertyID;
    private String address;
    private String type;
    private int numberofBedrooms;
    private int numberofSittingRooms;
    private int numberofKitchens;
    private int numberofBathtrooms;
    private int numberofToilets;
    private String owner;
    private String description;
    private LocalDate validFrom;
    private LocalDate validTo;

    public LekkiProperty() {

    }

    public Long getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(Long propertyID) {
        this.propertyID = propertyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberofBedrooms() {
        return numberofBedrooms;
    }

    public void setNumberofBedrooms(int numberofBedrooms) {
        this.numberofBedrooms = numberofBedrooms;
    }

    public int getNumberofSittingRooms() {
        return numberofSittingRooms;
    }

    public void setNumberofSittingRooms(int numberofSittingRooms) {
        this.numberofSittingRooms = numberofSittingRooms;
    }

    public int getNumberofKitchens() {
        return numberofKitchens;
    }

    public void setNumberofKitchens(int numberofKitchens) {
        this.numberofKitchens = numberofKitchens;
    }

    public int getNumberofBathtrooms() {
        return numberofBathtrooms;
    }

    public void setNumberofBathtrooms(int numberofBathtrooms) {
        this.numberofBathtrooms = numberofBathtrooms;
    }

    public int getNumberofToilets() {
        return numberofToilets;
    }

    public void setNumberofToilets(int numberofToilets) {
        this.numberofToilets = numberofToilets;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public String toString() {
        return "LekkiProperty{" +
                "propertyID=" + propertyID +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", numberofBedrooms=" + numberofBedrooms +
                ", numberofSittingRooms=" + numberofSittingRooms +
                ", numberofKitchens=" + numberofKitchens +
                ", numberofBathtrooms=" + numberofBathtrooms +
                ", numberofToilets=" + numberofToilets +
                ", owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LekkiProperty that = (LekkiProperty) o;
        return Objects.equals(propertyID, that.propertyID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(propertyID);
    }
}
