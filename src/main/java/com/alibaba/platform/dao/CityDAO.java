package com.alibaba.platform.dao;

import com.alibaba.platform.dto.CityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author :  chen weijie
 * @Date: 2019-02-24 1:43 AM
 */
@Mapper
@Component
public interface CityDAO {

    /**
     * 根据id查询对象信息
     *
     * @param id
     * @return
     */
    @Select({
            "SELECT id, name, state, country FROM city WHERE id != #{id}",
    })
    List<CityDTO> findById(@Param("id") Integer id);



}
