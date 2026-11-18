package com.dufuna.berlin.admin.service;

import com.dufuna.berlin.admin.model.LekkiProperty;

public interface LekkiPropertyService {
    void saveProperty(LekkiProperty property);
    LekkiProperty getProperty(Long properyID);
}
