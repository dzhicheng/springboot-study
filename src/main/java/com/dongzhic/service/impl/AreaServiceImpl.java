package com.dongzhic.service.impl;

import com.dongzhic.service.AreaService;
import com.dongzhic.bean.ConsultConfigArea;
import com.dongzhic.dao.CommonMapper;
import com.dongzhic.dynamic.datasource.TargetDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private CommonMapper mapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ConsultConfigArea> qryAreaFromBase(Map param) {
        // TODO Auto-generated method stub
        return mapper.qryArea(param);
    }

    @TargetDataSource(name = "ds2")
    public List<ConsultConfigArea> qryArea(Map param) {
        List<ConsultConfigArea> consultConfigAreas = mapper.qryArea(param);
        return consultConfigAreas;
    }

    @Transactional
    @TargetDataSource(name = "ds1")
    public int saveArea(ConsultConfigArea area) {
        int count = mapper.saveArea(area);
        return count;
    }

    @Transactional
    public int saveAreaToBase(ConsultConfigArea area) {
        // TODO Auto-generated method stub
        return mapper.saveArea(area);
    }
}
