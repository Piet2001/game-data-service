package com.firestationquiz.gamedataservice.controllers;

import com.firestationquiz.gamedataservice.models.Question;
import com.firestationquiz.gamedataservice.models.Station;
import com.firestationquiz.gamedataservice.repositories.StationRepository;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class QuestionController {

    private StationRepository stationRepo;

    public Question getNewQuestion() {
//        List<Station> stationList = stationRepo.getStations();

        Question question1 = new Question(
                "Helmond",
                "https://media.discordapp.net/attachments/534476070192414730/824276101953880074/Brandweer_Helmond2.jpg",
                "Asten",
                "Eindhoven-Centrum",
                "Helmond",
                "Mierlo");

        Question question2 = new Question(
                "Deurne",
                "https://media.discordapp.net/attachments/832601082500612137/832601422176583710/Post_Deurne_5-7-20192.jpg?width=960&height=540",
                "Geldrop",
                "Eindhoven-Woensel",
                "Nuenen",
                "Deurne");

        Random random = new Random();
        boolean first = random.nextBoolean();

        if(first){
            return question1;
        }
        else{
            return question2;
        }
    }
}