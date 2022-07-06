package com.practice.dao;

import com.practice.model.DayCurrency;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DayCurrencyMapper implements RowMapper<DayCurrency> {
    @Override
    public DayCurrency mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        DayCurrency dayCurrency = new DayCurrency();

        dayCurrency.setPK_Id(resultSet.getInt("PK_id"));
        dayCurrency.setNominal(resultSet.getInt("nominal"));
        dayCurrency.setValue(resultSet.getInt("value"));
        dayCurrency.setDate(resultSet.getDate("date"));

        return dayCurrency;
    }
}
