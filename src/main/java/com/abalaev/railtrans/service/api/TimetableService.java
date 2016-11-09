package com.abalaev.railtrans.service.api;


import com.abalaev.railtrans.model.Station;
import com.abalaev.railtrans.model.Timetable;

public interface TimetableService {
    Timetable readByStations (Station stationBegin, Station stationEnd) throws Exception;
}
