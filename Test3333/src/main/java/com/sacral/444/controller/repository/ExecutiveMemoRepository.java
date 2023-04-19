package com.sacral.444.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sacral.444.controller.model.ExecutiveMemo;

public interface ExecutiveMemoRepository extends JpaRepository<ExecutiveMemo, Long> {

    ExecutiveMemo findByDateCreated(String dateCreated);
    
    ExecutiveMemo findByMemo(String memo);
    
    ExecutiveMemo findByDatabaseId(Long databaseId);
    
    void deleteByDatabaseId(Long databaseId);
    
}