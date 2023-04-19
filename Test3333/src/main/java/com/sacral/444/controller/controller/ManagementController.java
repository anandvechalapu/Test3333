package com.sacral.444.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.444.controller.dto.AuditLogDto;
import com.sacral.444.controller.model.ExecutiveMemo;
import com.sacral.444.controller.service.ManagementService;
import com.sacral.444.controller.service.ExecutiveMemoService;

@RestController
@RequestMapping("/api/v1")
public class ManagementController {

    @Autowired
    private ManagementService managementService;

    @Autowired
    private ExecutiveMemoService executiveMemoService;

    @PostMapping("/auditlogs")
    public AuditLogDto saveAuditLog(@RequestBody AuditLogDto auditLogDto) {
        return managementService.saveAuditLog(auditLogDto);
    }

    @PostMapping("/executivememos")
    public ExecutiveMemo saveExecutiveMemo(@RequestBody ExecutiveMemo executiveMemo) {
        return executiveMemoService.save(executiveMemo);
    }

    @GetMapping("/executivememos/{dateCreated}")
    public Optional<ExecutiveMemo> findByDateCreated(@PathVariable String dateCreated) {
        return executiveMemoService.findByDateCreated(dateCreated);
    }

    @GetMapping("/executivememos/{memo}")
    public Optional<ExecutiveMemo> findByMemo(@PathVariable String memo) {
        return executiveMemoService.findByMemo(memo);
    }
    
    @GetMapping("/executivememos/{databaseId}")
    public Optional<ExecutiveMemo> findByDatabaseId(@PathVariable Long databaseId) {
        return executiveMemoService.findByDatabaseId(databaseId);
    }
    
    @GetMapping("/executivememos/{databaseId}")
    public void deleteByDatabaseId(@PathVariable Long databaseId) {
        executiveMemoService.deleteByDatabaseId(databaseId);
    }
}