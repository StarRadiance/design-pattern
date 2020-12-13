package com.designpattern.decoratorpattern.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    private static final Logger logger = JsonLoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.error("系统错误");


        try {
            InputStream in = new FileInputStream("");
            BufferedInputStream bis = new BufferedInputStream(in);
            bis.read();
            bis.close();

            BufferedReader br = new BufferedReader(new FileReader(""));
            br.readLine();

            BufferedReader bs = new BufferedReader(new StringReader(""));
            bs.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
