package com.tianjian.wuliao.test;

import java.util.Date;

/**
 *物料的各项信息
 */
public class productInfo {
    private String name;//物料名称
    private String num;//编号
    private String place;//物料来源

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public productInfo(String name, String num, String place) {
        this.name = name;
        this.num = num;
        this.place = place;
    }

    public productInfo() {
    }
}
