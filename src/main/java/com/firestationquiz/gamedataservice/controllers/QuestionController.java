package com.firestationquiz.gamedataservice.controllers;

import com.firestationquiz.gamedataservice.models.Question;
import com.firestationquiz.gamedataservice.models.Station;
import com.firestationquiz.gamedataservice.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
public class QuestionController {

    @Autowired
    private StationService service;

    private Random random = new Random();

    public Question getNewQuestion() {

        List<Station> selected = new ArrayList<>();
        while (selected.size() < 4){
            var newSelected = getRandomStation();
            if (!selected.contains(newSelected)) {
                selected.add(newSelected);
            }
        }

        Station ans = selected.get(random.nextInt(selected.size()));

        return new Question(
                ans.getName(),
                ans.getImageUrl(),
                selected.get(0).getName(),
                selected.get(1).getName(),
                selected.get(2).getName(),
                selected.get(3).getName()
        );

    }

    public Station getRandomStation(){
        List<Station> stationList = service.listAll();

        return stationList.get(random.nextInt(stationList.size()));
    }
}
