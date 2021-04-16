package com.firestationquiz.gamedataservice.resources;

import com.firestationquiz.gamedataservice.controllers.QuestionController;
import com.firestationquiz.gamedataservice.models.Question;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/gamedata")
public class GameDataResource {

    @RequestMapping("/new")
    public Question getQuestion(){
        QuestionController questionController = new QuestionController();
        return questionController.getNewQuestion();
    }
}
