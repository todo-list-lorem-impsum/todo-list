package pl.sda.todo.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    public List<Task> getAllTasks() {

        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task("Zadanie 1"));
        tasks.add(new Task("Zadanie 2"));
        tasks.add(new Task("Zadanie 3"));

        return tasks;
    }
}
