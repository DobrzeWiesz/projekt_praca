package restApi;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping(path="/status")
@RestController
public class ping_pongController {
    @RequestMapping(value="/ping", method=GET)
    @ResponseBody
    public String foo() {
        return "pong";
    }
}
