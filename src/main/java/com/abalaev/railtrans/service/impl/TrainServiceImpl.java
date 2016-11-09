package com.abalaev.railtrans.service.impl;

import com.abalaev.railtrans.dao.api.TrainDao;
import com.abalaev.railtrans.model.Train;
import com.abalaev.railtrans.service.api.TrainService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("trainService")
@Transactional
public class TrainServiceImpl implements TrainService {

    private static final Logger LOG = Logger.getLogger(TrainServiceImpl.class);
    @Autowired
    TrainDao trainDao;

    @Override
    public Train createTrain(Train train) {
        Train result = null;
        result = trainDao.create(train);
        LOG.info("train created {}",result);
        return result;
    }

    @Override
    public List<Train> getAllTrains() {
        LOG.info("get list of all trains");
        return trainDao.getAllTrains();
    }

    @Override
    public Train read(int id) {
        Train result = null;
        result = trainDao.read(id);
        LOG.info("read train by id {}", result);
        return result;
    }
}
