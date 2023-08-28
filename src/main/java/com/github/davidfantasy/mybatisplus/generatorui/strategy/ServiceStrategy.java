package com.github.davidfantasy.mybatisplus.generatorui.strategy;

import lombok.Data;

@Data
public class ServiceStrategy {

    /**
     * 自定义继承的Service类全称，带包名
     */
    //private String superServiceClass = ConstVal.SUPER_SERVICE_CLASS;
    private String superServiceClass = "com.admin4j.framework.mp.service.IBizService";


}
