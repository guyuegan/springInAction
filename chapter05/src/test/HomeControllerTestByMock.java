import com.gyg.chapter05.controller.HomeController;
import com.gyg.chapter05.javaConfig.RootConfig;
import com.gyg.chapter05.javaConfig.SpittrWebAppInitializer;
import com.gyg.chapter05.javaConfig.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static
        org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 10:33 2017/10/6 0006
 * Q    Q: 1784286916
 * </pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, WebConfig.class,
        SpittrWebAppInitializer.class})
@WebAppConfiguration
public class HomeControllerTestByMock {

    @Test
    public void homePageTest() throws Exception{

        //当控制器的requestMapping名字和返回的视图名字都是"home"时，会有以下问题
        //would dispatch back to the current handler URL [/home] again. Check your ViewResolver setup!
        // (Hint: This may be the result of an unspecified view, due to default view name generation.)
        HomeController controller = new HomeController();
        MockMvc mockMvc =
                standaloneSetup(controller).build();
        mockMvc.perform(get("/homeController/myHome"))
                .andExpect(view().name("home"));
    }
}
