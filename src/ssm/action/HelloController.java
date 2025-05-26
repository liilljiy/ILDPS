package ssm.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DYS
 * @version 1.0
 * @Description
 * @DateTime 2025/5/26 上午11:27
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping("/hello")
    private String helloworld(){
        // todo  数据库crud处理

        return "Hello World!";
    }
}