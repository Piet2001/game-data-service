package com.firestationquiz.gamedataservice.repositories;

import com.firestationquiz.gamedataservice.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
}
