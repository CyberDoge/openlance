package org.todo.openlance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.todo.openlance.controller.Messages.TaskMessage;
import org.todo.openlance.repository.TaskRepository;

@RestController
public class TaskController {
    private  TaskRepository repository;

    public TaskController(TaskRepository repository){
        this.repository = repository;
    }

    public class Greeting {

        private String content;
        public Greeting() {
        }

        public Greeting(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

    }


    @PostMapping("/task")
    public Greeting greeting(TaskMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getTitle()) + "!");
    }
    @DeleteMapping("/task/{id}")
    void deleteEmployee(@PathVariable int id) {
        repository.deleteById(id);
    }
}
