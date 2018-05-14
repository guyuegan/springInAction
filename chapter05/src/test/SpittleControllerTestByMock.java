import com.gyg.chapter05.controller.SpittleController;
import com.gyg.chapter05.dao.ISpittleRepository;
import com.gyg.chapter05.dao.SpittleRepository;
import com.gyg.chapter05.entity.Spittle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static
        org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 10:33 2017/10/6 0006
 * Q    Q: 1784286916
 * </pre>
 */
public class SpittleControllerTestByMock {

    private ISpittleRepository spittleRepository;

    @Before
    public void init(){
        spittleRepository = new SpittleRepository();
    }

    @Test
    public void spittleList() throws Exception{

        List<Spittle> expectedSpittles =
                spittleRepository.findSpittles(Long.MAX_VALUE, 5);
        ISpittleRepository mockRepository =
               mock(ISpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE, 5)).
                thenReturn(expectedSpittles);

        SpittleController controller =
                new SpittleController(mockRepository);

        MockMvc mockMvc = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();

        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList",
                        hasItems(expectedSpittles.toArray())));
    }

    @Test
    public void showRegisterForm() throws Exception{

        SpittleController spittleController = new SpittleController();
        MockMvc mockMvc = standaloneSetup(spittleController).build();

        mockMvc.perform(get("spittles/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void simpleDateFormat(){
        System.out.println(
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .format(new Date())
        );
    }

}
