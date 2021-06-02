package com.firestationquiz.gamedataservice.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.firestationquiz.gamedataservice.models.Station;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class GameDataResourceTest {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private MockMvc mvc;

    @Test
    void saveStation() throws Exception {

        Station station = new Station(1,"Helmond","https://media.discordapp.net/attachments/534476070192414730/824276101953880074/Brandweer_Helmond2.jpg");
        String StationAsString = mapper.writeValueAsString(station);

        mvc.perform(put("/gamedata/newstation")
                .contentType(MediaType.APPLICATION_JSON)
                .content(StationAsString)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Helmond"))
                .andExpect(jsonPath("$.imageUrl").value("https://media.discordapp.net/attachments/534476070192414730/824276101953880074/Brandweer_Helmond2.jpg"));
    }

    @Test
    void GetAllStations() throws Exception {
        mvc.perform(get("/gamedata/all")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.[0].id").value(1))
                .andExpect(jsonPath("$.[0].name").value("Helmond"))
                .andExpect(jsonPath("$.[0].imageUrl").value("https://media.discordapp.net/attachments/534476070192414730/824276101953880074/Brandweer_Helmond2.jpg"))
                .andExpect(jsonPath("$.[1].id").value(2))
                .andExpect(jsonPath("$.[1].name").value("Deurne"))
                .andExpect(jsonPath("$.[1].imageUrl").value("https://cdn.discordapp.com/attachments/832601082500612137/832601422176583710/Post_Deurne_5-7-20192.jpg"))
                .andExpect(jsonPath("$.[2].id").value(3))
                .andExpect(jsonPath("$.[2].name").value("Asten"))
                .andExpect(jsonPath("$.[2].imageUrl").value("https://cdn.discordapp.com/attachments/832601082500612137/834368841915957258/Post_Asten_12-4-191.jpg"));
    }

    @Test
    void GetNewQuestion() throws Exception {
        mvc.perform(get("/gamedata/new")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.option1").hasJsonPath())
                .andExpect(jsonPath("$.option2").hasJsonPath())
                .andExpect(jsonPath("$.option3").hasJsonPath())
                .andExpect(jsonPath("$.option4").hasJsonPath())
                .andExpect(jsonPath("$.answer").hasJsonPath())
                .andExpect(jsonPath("$.imageUrl").hasJsonPath());
    }
}