package com.abalaev.railtrans.dao.impl;

import com.abalaev.railtrans.dao.api.StationDao;
import com.abalaev.railtrans.model.Station;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository("stationDao")
@Transactional
public class StationDaoImpl extends GenericDaoImpl<Station, Integer> implements StationDao {


    @Override
    public List<Station> getAll() {
        List<Station> result = null;
        try {
//            em.getTransaction().begin();
            TypedQuery<Station> query;
            query = em.createNamedQuery("Station.getAll",Station.class);
            result = query.getResultList();
//            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        return result;
    }
}
