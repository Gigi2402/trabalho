package AC2.DEVOPS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
        SpringApplication.run(DevopsApplication.class, args);

    }

        @RequestMapping ("/")
        @ResponseBody
        String home()
        {
            return "Hello World";
    }
        
}