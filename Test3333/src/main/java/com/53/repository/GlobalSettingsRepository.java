package com.53.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalSettingsRepository extends JpaRepository<GlobalSettings, Long> {
  
    GlobalSettings findByDatabaseId(Long databaseId);

    void saveGlobalSettings(GlobalSettings globalSettings);

    void deleteGlobalSettings(GlobalSettings globalSettings);

    void validateGlobalSettings(GlobalSettings globalSettings);
}