package com.53.service;

import com.53.repository.GlobalSettings;
import com.53.repository.GlobalSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlobalSettingsService {
    
    @Autowired
    private GlobalSettingsRepository globalSettingsRepository;

    public GlobalSettings findByDatabaseId(Long databaseId) {
        return globalSettingsRepository.findByDatabaseId(databaseId);
    }

    public void saveGlobalSettings(GlobalSettings globalSettings) {
        globalSettingsRepository.saveGlobalSettings(globalSettings);
    }

    public void deleteGlobalSettings(GlobalSettings globalSettings) {
        globalSettingsRepository.deleteGlobalSettings(globalSettings);
    }

    public void validateGlobalSettings(GlobalSettings globalSettings) {
        globalSettingsRepository.validateGlobalSettings(globalSettings);
    }
}