package com.sacral.444.controller.service;

import com.sacral.444.controller.dto.AuditLogDto;
import com.sacral.444.controller.repository.AuditLogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagementService {

    @Autowired
    private AuditLogRepository auditLogRepository;

    public AuditLogDto saveAuditLog(AuditLogDto auditLogDto) {
        return auditLogRepository.save(auditLogDto);
    }

}