package com.alibaba.platform.service;

import com.alibaba.platform.dto.CityDTO;

import java.util.List;

/**
 * @author :  chen weijie
 * @Date: 2019-02-24 1:45 AM
 */
public interface CityService {


    /**
     * 根据主键查找city
     *
     * @param id
     * @return
     */
    List<CityDTO> findById(Integer id);

}
