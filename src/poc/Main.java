package poc;

import classes.City;
import classes.City.CityBuilder;
import classes.Event;
import classes.Event.EventBuilder;
import classes.Location;
import classes.Location.LocationBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Event> events = new ArrayList<>();
        events = Arrays.asList(new EventBuilder().id(6).name("ShowUno")
                                .location(new LocationBuilder().id(1).name("Argentina")
                                .city(new CityBuilder().id(1).name("Mar del Plata").build()).build()).build(),
                              new EventBuilder().id(2).name("ShowDos")
                                .location(new LocationBuilder().id(2).name("Brasil")
                                .city(new CityBuilder().id(2).name("Rio").build()).build()).build(),
                              new EventBuilder().id(10).name("ShowTres")
                                .location(new LocationBuilder().id(3).name("Uruguay")
                                .city(new CityBuilder().id(3).name("Montevideo").build()).build()).build(),
                              new EventBuilder().id(1).name("ShowCuatro")
                                .location(new LocationBuilder().id(4).name("Mexico")
                                .city(new CityBuilder().id(4).name("DF").build()).build()).build(),
                              new EventBuilder().id(5).name("ShowCinco")
                                .location(new LocationBuilder().id(5).name("Argentina")
                                .city(new CityBuilder().id(5).name("Caba").build()).build()).build(),
                              new EventBuilder().id(3).name("ShowSeis")
                                .location(new LocationBuilder().id(6).name("Chile")
                                .city(new CityBuilder().id(6).name("Santiago").build()).build()).build(),
                              new EventBuilder().id(8).name("ShowSiete")
                                .location(new LocationBuilder().id(7).name("Peru")
                                .city(new CityBuilder().id(7).name("Lima").build()).build()).build(),
                              new EventBuilder().id(12).name("ShowOcho")
                                .location(new LocationBuilder().id(8).name("Mexico")
                                .city(new CityBuilder().id(8).name("Guadalajara").build()).build()).build(),
                              new EventBuilder().id(20).name("ShowNueve")
                                .location(new LocationBuilder().id(9).name("Uruguay")
                                .city(new CityBuilder().id(9).name("Punta del Este").build()).build()).build(),
                              new EventBuilder().id(4).name("ShowDiez")
                                .location(new LocationBuilder().id(10).name("Argentina")
                                .city(new CityBuilder().id(10).name("Villa Carlos Paz").build()).build()).build());

        System.out.println(events);

        Event evId = getEventById(events, 2);

        String cityName = getCityById(events,2);

        System.out.println("Evento 2: Ciudad: " + cityName);

        //Get first 5 events and sort them alphabetically

        List<Event> firstFiveEvents = getFirstFive(events); // Get first 5
        firstFiveEvents.sort(Comparator.comparing(Event::getName)); // Sort alphabetically by Name
        System.out.println("Primeros 5 eventos ordenados alfabeticamente");
        System.out.println(firstFiveEvents);
    }

    public static Event getEventById(List<Event> events, Integer id) {
        return events.stream()
                .filter(e -> id.equals(e.getId()))
                .findFirst()
                .get();
    }

    public static String getCityById(List<Event> events, Integer id) {
        return Optional.ofNullable(getEventById(events, id))
                .map(Event::getLocation)
                .map(Location::getCity)
                .map(City::getName)
                .orElse("Sin Ciudad");
    }

    public static List<Event> getFirstFive(List<Event> events) {
        return events.stream()
                .limit(5)
                .collect(Collectors.toList());
    }

}
