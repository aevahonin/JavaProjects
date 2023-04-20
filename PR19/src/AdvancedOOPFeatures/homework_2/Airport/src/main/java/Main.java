package AdvancedOOPFeatures.homework_2.Airport.src.main.java;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        System.out.println(findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        return airport.getTerminals().stream()
                .map(Terminal::getFlights)
                .flatMap(Collection::stream)
                .filter(flight -> {
                    LocalDateTime temp = toLocalDateTime(flight.getDate());
                    LocalDateTime now = LocalDateTime.now();
                    LocalDateTime soon = now.plusHours(2);
                    return flight.getType().equals(Flight.Type.DEPARTURE)
                            && temp.isAfter(now)
                            && temp.isBefore(soon);
                }).collect(Collectors.toList());
    }

    private static LocalDateTime toLocalDateTime(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

}