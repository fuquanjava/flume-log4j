package flume.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * flume-log4j 2015/5/21 16:48
 *
 * @author fuquan
 */
public class Test2 {
    static Logger logger = LoggerFactory.getLogger(Test2.class);

    public static void main(String[] args) {
        logger.info("startt  logging ...");
        logger.info("end logging .....");
        // 执行到这里的时候，flume 还是保持连接.
        System.out.println("ove =====================");



    }


}
