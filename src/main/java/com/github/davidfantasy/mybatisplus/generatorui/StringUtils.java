package com.github.davidfantasy.mybatisplus.generatorui;

import cn.hutool.core.util.StrUtil;

/**
 * @author andanyang
 * @since 2023/6/9 11:02
 */
public class StringUtils {

    public static String serviceName(String serviceName) {
        if (StrUtil.startWith(serviceName, "I")) {
            serviceName = StrUtil.subAfter(serviceName, "I", false);
        }
        return cn.hutool.core.util.StrUtil.lowerFirst(serviceName);
    }

    public static void main(String[] args) {
        String s = StringUtils.serviceName("ISysDictTypeService");
        System.out.println("s = " + s);
        s = StringUtils.serviceName("IaTest");
        System.out.println("s = " + s);
        s = StringUtils.serviceName("ATest");
        System.out.println("s = " + s);
        s = StringUtils.serviceName("IATeIst");
        System.out.println("s = " + s);
    }
}
