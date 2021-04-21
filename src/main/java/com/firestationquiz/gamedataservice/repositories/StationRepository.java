package com.firestationquiz.gamedataservice.repositories;

import com.firestationquiz.gamedataservice.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {
}
