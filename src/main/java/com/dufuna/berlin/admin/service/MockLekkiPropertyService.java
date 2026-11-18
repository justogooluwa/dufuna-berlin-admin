package com.dufuna.berlin.admin.service;

import com.dufuna.berlin.admin.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {

    private LekkiProperty property;

    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        this.property = property;
    }

    @Override
    public LekkiProperty getProperty(Long propertyID) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return property;
    }
}