package com.firestationquiz.gamedataservice.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest
class StationTest {

    @Test
    void NameEqualsNameFromConstructor() {
        Station station = new Station(1,"Helmond","https://media.discordapp.net/attachments/534476070192414730/824276101953880074/Brandweer_Helmond2.jpg");
        assertThat(station.getName()).isEqualTo("Helmond");
        assertThat(station.getImageUrl()).isEqualTo("https://media.discordapp.net/attachments/534476070192414730/824276101953880074/Brandweer_Helmond2.jpg");
    }

    @Test
    void NameNotEqualToOldAfterSet() {
        Station station = new Station(1, "Test Station", "This is a link ;)");
        station.setName("Another Name");
        assertThat(station.getName()).isNotEqualTo("Test Station");
        assertThat(station.getImageUrl()).isEqualTo("This is a link ;)");
        assertThat(station.getName()).isEqualTo("Another Name");
    }
}
