import com.gyg.chapter05.controller.HomeController;
import org.junit.Assert;
import org.junit.Test;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 10:33 2017/10/6 0006
 * Q    Q: 1784286916
 * </pre>
 */
public class HomeControllerTest {

    @Test
    public void homePageTest(){

        HomeController controller = new HomeController();
        Assert.assertEquals("home", controller.home());
    }
}
