import com.gyg.chapter04.aspect.Audience;
import com.gyg.chapter04.javaConfig.AudienceConfiguration;
import com.gyg.chapter04.service.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <pre>
 * 功    能: 通过java配置测试切面
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 3:36 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
//声明改类时spring的测试类，声明之后，就可以注入spring上下文容器中的对象
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AudienceConfiguration.class})
public class AudienceTestByJavaConfig {

    @Autowired
    private Performance performance;

    @Autowired
    private Audience audience;

    @Test
    public void aspectTestByJavaConfig(){

        performance.perform("mike");
        audience.say();
    }

}
