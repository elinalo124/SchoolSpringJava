import com.elina.repository.CourseRepository;
import com.elina.repository.CourseRespositoryImpl;
import com.elina.service.CourseService;
import com.elina.service.CourseServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.elina"})
public class AppConfig {

    /*
    @Bean(name = "courseRepository")
    public CourseRepository getCourseRepository(){
        return new CourseRespositoryImpl();
    }
    @Bean(name = "courseService")
    public CourseService getCourseService(){
        CourseServiceImpl courseService = new CourseServiceImpl();
        //courseService.setRepository(getCourseRepository());
        return courseService;
    }

     */

}
