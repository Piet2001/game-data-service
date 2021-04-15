package com.firestationquiz.gamedataservice.repositories;

import com.firestationquiz.gamedataservice.models.Station;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StationRepository {

    private List<Station> stations = Arrays.asList(
            new Station("Helmond", "link_Helmond"),
            new Station("Deurne", "Link_Deurne"),
            new Station("Mierlo", "Link_Mierlo"),
            new Station("Asten", "Link_Asten"),
            new Station("Eindhoven-Centrum", "Link_EindhovenCentrum"),
            new Station("Eindhoven-Woensel", "Link_Woensel")
    );

    public List<Station> getStations() {
        return stations;
    }

}
