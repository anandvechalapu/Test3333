package com.53.service;

import com.53.entity.AboutTab;
import com.53.repository.AboutTabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutTabService {

    @Autowired
    AboutTabRepository aboutTabRepository;

    public AboutTab findByIntroduction(String introduction) {
        return aboutTabRepository.findByIntroduction(introduction);
    }

    public AboutTab findByANMWWebsite(String anmwWebsite) {
        return aboutTabRepository.findByANMWWebsite(anmwWebsite);
    }

    public AboutTab findByEmailUs(String emailUs) {
        return aboutTabRepository.findByEmailUs(emailUs);
    }

    public AboutTab findByLogin(Boolean login) {
        return aboutTabRepository.findByLogin(login);
    }

}