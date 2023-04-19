package com.sacral.444.controller.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.444.controller.dto.AuditLogDto;
import com.sacral.444.service.ManagementService;

@RestController
@RequestMapping("/save")
public class AuditLogController {

    @Autowired
    private ManagementService managementService;

    @PostMapping
    public AuditLogDto saveAuditLog(@Valid @RequestBody AuditLogDto auditLogDto) {
        return managementService.saveAuditLog(auditLogDto);
    }

}