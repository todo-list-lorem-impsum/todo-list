package pl.sda.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @RequestMapping(value="/todo", method = RequestMethod.GET)
    public String index() {
        return "todo";
    }
}
