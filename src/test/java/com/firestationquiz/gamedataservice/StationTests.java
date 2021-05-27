package com.firestationquiz.gamedataservice;

import com.firestationquiz.gamedataservice.models.Station;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest()
public class StationTests {

	@Test
	void NameEqualsNameFromConstructor() {
		Station station = new Station(1,"Helmond","https://media.discordapp.net/attachments/534476070192414730/824276101953880074/Brandweer_Helmond2.jpg");
		assertThat(station.getName()).isEqualTo("Helmond");
	}

}
