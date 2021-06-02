package com.firestationquiz.gamedataservice.resources;

import com.firestationquiz.gamedataservice.controllers.QuestionController;
import com.firestationquiz.gamedataservice.models.Question;
import com.firestationquiz.gamedataservice.models.Station;
import com.firestationquiz.gamedataservice.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/gamedata")
public class GameDataResource {

    @Autowired
    private StationService service;

    @Autowired
    private QuestionController controller;

    @GetMapping(value="/all")
    public List<Station> getAllStations() {
        return service.listAll();
    }

    @GetMapping(value="/new")
    public Question getQuestion() {
        return controller.getNewQuestion();
    }

    @PutMapping(value="/newstation")
    public Station saveStation(@RequestBody Station station)
    {
        return service.saveStation(station);
    }
}
