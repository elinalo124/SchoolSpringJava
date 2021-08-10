import com.elina.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]){

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CourseService service = appContext.getBean("courseService", CourseService.class);
        System.out.println(service.findAll().get(0).getName());

    }
}