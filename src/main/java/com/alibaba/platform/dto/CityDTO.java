package com.alibaba.platform.dto;

/**
 * @author :  chen weijie
 * @Date: 2019-02-24 1:34 AM
 */

public class CityDTO {

    private Integer id;
    private String name;
    private Integer state;
    private String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
