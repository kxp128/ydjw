package com.ehootu.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @Title:GetNumberUtils
 * @Author: KongXiaoPing
 * @Date: 2018-01-12 17:15
 * @Description: 设置编号工具
 */
public class GetNumberUtils {
    private final static Logger log = LoggerFactory.getLogger(GetNumberUtils.class);
    /**
     * 获得编号 前6位  08（广元）02（利州）01
     * 中间6位 yyMMdd
     * 后3位 001  002 ....,规则 每天从1开始递增
     *
     * @return
     */
    public static String getNumber() {
        //日期格式
        String strDate = DateUtils.formatDate(new Date(), "yyMMdd");
        //三位数递增，每天从1开始递增 如 001 002...
        String countNumber = Counter.getCount();
        String number = "080201" + strDate + countNumber;
        log.info("number--" + number);
        return number;
    }
}