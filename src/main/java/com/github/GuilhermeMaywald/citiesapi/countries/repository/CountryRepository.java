package com.github.GuilhermeMaywald.citiesapi.countries.repository;

import com.github.GuilhermeMaywald.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
