package com.firestationquiz.gamedataservice.services;

import com.firestationquiz.gamedataservice.models.Station;
import com.firestationquiz.gamedataservice.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository repo;

    public List<Station> listAll() {
        return repo.findAll();
    }

    public Station saveStation(Station station) {
       return repo.save(station);
    }

    public Station get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
