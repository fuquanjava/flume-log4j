package flume.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * flume-log4j 2015/5/21 16:06
 *
 * @author fuquan
 */
public class Test{
    static Logger logger= LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            i++;
            logger.info("info ..... {}", i);
            Thread.sleep(300);
        }


    }
}
