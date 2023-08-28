package com.github.davidfantasy.mybatisplus.generatorui.strategy;

import lombok.Data;

@Data
public class ServiceImplStrategy {
    /**
     * 自定义继承的ServiceImpl类全称，带包名
     */
    //private String superServiceImplClass = ConstVal.SUPER_SERVICE_IMPL_CLASS;
    private String superServiceImplClass = "com.admin4j.framework.mp.service.impl.BizServiceImpl";
}
