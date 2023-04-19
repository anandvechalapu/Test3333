package com.sacral.444.controller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.444.controller.model.ExecutiveMemo;
import com.sacral.444.controller.repository.ExecutiveMemoRepository;

@Service
public class ExecutiveMemoService {

    @Autowired
    private ExecutiveMemoRepository executiveMemoRepository;

    public ExecutiveMemo save(ExecutiveMemo executiveMemo) {
        return executiveMemoRepository.save(executiveMemo);
    }

    public Optional<ExecutiveMemo> findByDateCreated(String dateCreated) {
        return executiveMemoRepository.findByDateCreated(dateCreated);
    }

    public Optional<ExecutiveMemo> findByMemo(String memo) {
        return executiveMemoRepository.findByMemo(memo);
    }
    
    public Optional<ExecutiveMemo> findByDatabaseId(Long databaseId) {
        return executiveMemoRepository.findById(databaseId);
    }
    
    public void deleteByDatabaseId(Long databaseId) {
        executiveMemoRepository.deleteByDatabaseId(databaseId);
    }
}