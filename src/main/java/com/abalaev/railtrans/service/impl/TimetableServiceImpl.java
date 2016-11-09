package com.abalaev.railtrans.service.impl;

import com.abalaev.railtrans.dao.api.TimetableDao;
import com.abalaev.railtrans.model.Station;
import com.abalaev.railtrans.model.Timetable;
import com.abalaev.railtrans.service.api.TimetableService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("timetableService")
@Transactional
public class TimetableServiceImpl implements TimetableService {

    private static final Logger LOG = Logger.getLogger(TimetableServiceImpl.class);
    @Autowired
    TimetableDao timetableDao;

    @Override
    public Timetable readByStations(Station stationBegin, Station stationEnd) throws Exception {
        LOG.info("start reading timetable by stations");
        Timetable result = timetableDao.readByStations(stationBegin, stationEnd);
        if (result != null) {
            LOG.info("finish reading timetable by stations");
            return result;
        } else{
            LOG.warn("timetable doesn't exist");
            throw new Exception("Way between " + stationBegin.getStationName()+ " and " + stationEnd.getStationName() + " doesn't exists");
        }
    }
}
