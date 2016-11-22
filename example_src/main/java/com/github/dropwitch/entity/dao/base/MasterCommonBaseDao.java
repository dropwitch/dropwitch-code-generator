package com.github.dropwitch.entity.dao.base;

import com.github.dropwitch.entity.MasterCommon;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.joda.time.DateTime;

import java.util.List;

public abstract class MasterCommonBaseDao extends AbstractDAO<MasterCommon> {
    public MasterCommonBaseDao(SessionFactory factory) {
        super(factory);
    }

    @SuppressWarnings("unchecked")
    public List<MasterCommon> findAll() {
        return criteria().list();
    }

    public MasterCommon findById(Integer id) {
        return (MasterCommon) criteria()
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }
}
