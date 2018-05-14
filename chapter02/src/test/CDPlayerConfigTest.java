
import com.gyg.chapter02.soundSystem.CDPlayerConfig;
import com.gyg.chapter02.soundSystem.ICompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 5:13 2017/9/26 0026
 * Q    Q: 1784286916
 * </pre>
 */
//说明这个类是一个spring的测试类，声明之后该测试类就可以直接注入spring上下文容器中的对象
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerConfigTest {

    @Autowired
    private ICompactDisc compactDisc;

    @Test
    public void display(){
        compactDisc.dispaly();
    }

}