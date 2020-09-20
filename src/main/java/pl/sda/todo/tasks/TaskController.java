package pl.sda.todo.tasks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController() {
        this.taskService = new TaskService();
    }

    @RequestMapping(value="/tasks", method = RequestMethod.GET)
    public String tasks(Model model) {

        model.addAttribute("tasks", taskService.getAllTasks());

        return "tasks";
    }
}
