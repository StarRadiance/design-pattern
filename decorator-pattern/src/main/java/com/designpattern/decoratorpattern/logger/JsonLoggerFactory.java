package com.designpattern.decoratorpattern.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class clazz) {
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
