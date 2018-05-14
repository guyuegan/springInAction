import com.gyg.chapter04.aspect.Audience;
import com.gyg.chapter04.javaConfig.AudienceConfiguration;
import com.gyg.chapter04.service.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <pre>
 * 功    能: 通过xml配置测试切面
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:36 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class AudienceTestByXmlConfig {

    @Autowired
    private Performance performance;

    @Test
    public void aspectTestByXmlConfig(){

        performance.perform("mike");
    }
}
