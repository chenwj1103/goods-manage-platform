package com.alibaba.platform.controller;

import com.alibaba.platform.dto.CityDTO;
import com.alibaba.platform.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author :  chen weijie
 * @Date: 2019-02-24 1:52 AM
 */
@Controller
@RequestMapping("/city")
public class CityController {



    @Autowired
    private CityService cityService;

    @RequestMapping("/queryCityById")
    public String queryCityById(Integer id, ModelMap model) {

        List<CityDTO> cityList = cityService.findById(id);
        model.addAttribute("cityList", cityList);
        return "city";
    }



}
