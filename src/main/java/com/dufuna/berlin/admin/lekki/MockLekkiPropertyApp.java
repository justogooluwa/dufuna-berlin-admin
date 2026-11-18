package com.dufuna.berlin.admin.lekki;

import com.dufuna.berlin.admin.model.LekkiProperty;
import com.dufuna.berlin.admin.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiProperty property = new LekkiProperty();

        property.setPropertyID(1L);
        property.setAddress("Lekki Phase 1, Lagos");
        property.setType("Duplex");

        MockLekkiPropertyService propertyService =
                new MockLekkiPropertyService();

        propertyService.saveProperty(property);

        propertyService.getProperty(1L);
    }
}