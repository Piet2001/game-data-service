package com.firestationquiz.gamedataservice.resources;

import com.firestationquiz.gamedataservice.controllers.QuestionController;
import com.firestationquiz.gamedataservice.models.Question;
import com.firestationquiz.gamedataservice.models.Station;
import com.firestationquiz.gamedataservice.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/gamedata")
public class GameDataResource {

    @Autowired
    private StationService service;

    @Autowired
    private QuestionController controller;

    @GetMapping()
    public List<Station> list() {
        return service.listAll();
    }

    @RequestMapping("/new")
    public Question getQuestion() {

        return controller.getNewQuestion();
    }
}
