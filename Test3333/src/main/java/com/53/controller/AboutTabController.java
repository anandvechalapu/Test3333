package com.53.controller;

import com.53.model.AboutTab;
import com.53.model.GlobalSettings;
import com.53.service.AboutTabService;
import com.53.service.GlobalSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AboutTabController {

    @Autowired
    private AboutTabService aboutTabService;

    @Autowired
    private GlobalSettingsService globalSettingsService;

    @GetMapping("/aboutTab/{introduction}")
    public AboutTab getAboutTabByIntroduction(@PathVariable String introduction) {
        return aboutTabService.findByIntroduction(introduction);
    }

    @GetMapping("/aboutTab/{anmwWebsite}")
    public AboutTab getAboutTabByAnmwWebsite(@PathVariable String anmwWebsite) {
        return aboutTabService.findByANMWWebsite(anmwWebsite);
    }

    @GetMapping("/aboutTab/{emailUs}")
    public AboutTab getAboutTabByEmailUs(@PathVariable String emailUs) {
        return aboutTabService.findByEmailUs(emailUs);
    }

    @GetMapping("/aboutTab/{login}")
    public AboutTab getAboutTabByLogin(@PathVariable Boolean login) {
        return aboutTabService.findByLogin(login);
    }


    @GetMapping("/globalSettings/{databaseId}")
    public GlobalSettings getGlobalSettingsByDatabaseId(@PathVariable Long databaseId) {
        return globalSettingsService.findByDatabaseId(databaseId);
    }

    @PostMapping("/globalSettings")
    public void saveGlobalSettings(@RequestBody GlobalSettings globalSettings) {
        globalSettingsService.saveGlobalSettings(globalSettings);
    }

    @DeleteMapping("/globalSettings")
    public void deleteGlobalSettings(@RequestBody GlobalSettings globalSettings) {
        globalSettingsService.deleteGlobalSettings(globalSettings);
    }

    @PutMapping("/globalSettings")
    public void validateGlobalSettings(@RequestBody GlobalSettings globalSettings) {
        globalSettingsService.validateGlobalSettings(globalSettings);
    }

}