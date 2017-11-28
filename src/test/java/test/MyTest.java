package test;

/**
 * @author importtao
 * @version V1.0
 * @Title: $file_name$
 * @Package $package_name$
 * @Description: TODO
 * @date $date$ $time$
 */

import com.alibaba.fastjson.JSON;
import me.importtao.myssm.dao.TestMapper;
import me.importtao.myssm.model.Test;
import me.importtao.myssm.service.AopS;
import me.importtao.myssm.service.TestService;
import me.importtao.myssm.util.RedisUtil;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-mybatis.xml","classpath:spring-redis.xml","classpath:spring-web.xml", "classpath:spring-service.xml" })
public class MyTest {
    Logger logger = Logger.getLogger(MyTest.class);
    @Autowired
    TestService testService;

    @org.junit.Test
    public void test(){

        Test t=(Test)testService.selectByPrimaryKey(1);
        logger.info(JSON.toJSON(t));
        AopS s = new AopS();
        s.selectTest();
        logger.info("测试完成");

    }
}
