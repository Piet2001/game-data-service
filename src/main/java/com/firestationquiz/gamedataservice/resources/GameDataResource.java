package com.firestationquiz.gamedataservice.resources;

import com.firestationquiz.gamedataservice.controllers.QuestionController;
import com.firestationquiz.gamedataservice.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gamedata")
public class GameDataResource {

    @GetMapping("/new")
    public Question getQuestion(){
        QuestionController questionController = new QuestionController();
        return questionController.getNewQuestion();
    }
}
