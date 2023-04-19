package com.53.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutTabRepository extends JpaRepository<AboutTab, Long> {
    AboutTab findByIntroduction(String introduction);
    AboutTab findByANMWWebsite(String anmwWebsite);
    AboutTab findByEmailUs(String emailUs);
    AboutTab findByLogin(Boolean login);
}