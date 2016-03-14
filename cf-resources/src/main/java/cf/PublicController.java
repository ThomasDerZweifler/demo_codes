package cf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhishekupadhyay on 2016/02/24.
 */
@RestController
@RequestMapping(value = "/public")
public class PublicController {
    @RequestMapping(value = "/pub")
    public Map<String,String> prod() {
        Map<String,String> map = new HashMap<>();
        map.put("prodid","prodid");
        map.put("prodname","prodname");
        return map;
    }
}
