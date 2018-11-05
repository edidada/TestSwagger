package cn.edidada.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/swagger")
@EnableSwagger2
public class SwaggerDemoController {

    @RequestMapping(value = "/demos.do")
    String getDemo() {
        return "This is a demo";
    }

    @RequestMapping(value = {
            "/abc",
            "/page",
            "page*",
            "view/*,**/msg"
    })
    String indexMultipleMapping() {
        return "Hello from index multiple mapping.";
    }

    @RequestMapping(value = "/postdemo.do",method = RequestMethod.HEAD)
    String getDemos() {
        return "This is a demo";
    }
    @RequestMapping(value = "/getdemo.do",method = RequestMethod.GET)
    String getDemoss() {
        return "This is a demo";
    }
}
