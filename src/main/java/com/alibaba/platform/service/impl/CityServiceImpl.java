package com.alibaba.platform.service.impl;

import com.alibaba.platform.dao.CityDAO;
import com.alibaba.platform.dto.CityDTO;
import com.alibaba.platform.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :  chen weijie
 * @Date: 2019-02-24 1:45 AM
 */
@Service
public class CityServiceImpl implements CityService {


    @Autowired
    private CityDAO cityDAO;

    @Override
    public List<CityDTO> findById(Integer id) {
        return cityDAO.findById(id);
    }
}
