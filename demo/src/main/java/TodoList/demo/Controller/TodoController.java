package TodoList.demo.Controller;

import TodoList.demo.Models.RegisterRequest;
import TodoList.demo.Models.ToDo;
import TodoList.demo.Models.TodoRequest;
import TodoList.demo.Models.TodoResponse;
import TodoList.demo.Service.TodoService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/{id}")
    public ResponseEntity<TodoResponse> getTodoById(@PathVariable long id){

        return ResponseEntity.ok(todoService.getTodoById(id));
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> getAllTodos() {

        return ResponseEntity.ok(todoService.getAllTodos());
    }

    @GetMapping("/page")
    public ResponseEntity<Page<TodoResponse>> getAllTodosPage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        return ResponseEntity.ok(
                todoService.getAllTodosPages(page, size, sortBy, direction)
        );
    }




    @PostMapping("/create")
    public ResponseEntity<ToDo> createTodo(@Valid @RequestBody TodoRequest request){


        return new ResponseEntity<>(todoService.createTodo(request), HttpStatus.CREATED);

    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateTodo(@PathVariable long id,
            @Valid @RequestBody TodoRequest request){

        return new ResponseEntity<>(todoService.updateTodo(id,request),HttpStatus.CREATED);
    }
}
