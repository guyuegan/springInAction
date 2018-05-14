
import com.gyg.chapter01.entity.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:37 2017/9/28 0028
 * Q    Q: 1784286916
 * </pre>
 */
public class PeopleTest02 {

    /**
     * 执行到第一步创建IOC容器对象的时候就调用了HelloWorld类的构造方法和setter方法。
     *
     */
    @Test
    public void getPeopleBySetterBean(){
        //通过classpath，创建spring应用上下文容器
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config02.xml");

        //获取容器中的bean
        People people = ctx.getBean("peopleBySetter", People.class);

        System.out.println(people);
    }

    @Test
    public void getPeopleByConstructor(){
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config02.xml");

        People people = ctx.getBean("peopleByConstructor", People.class);

        System.out.println(people);
    }

    @Test
    public void getPeopleWithHat(){
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config02.xml");

        People people = ctx.getBean("peopleWithHat", People.class);

        System.out.println(people);
    }

    @Test
    public void getPeopleWithClothes(){
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config02.xml");

        People people = ctx.getBean("peopleWithClothes", People.class);

        System.out.println(people);
    }

}