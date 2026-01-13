package TodoList.demo.Service;

import TodoList.demo.Exception.TodoNotFoundException;
import TodoList.demo.Models.*;
import TodoList.demo.Repository.TodoRepository;


import TodoList.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class TodoService {

    @Autowired
    TodoRepository repo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public TodoResponse getTodoById(Long id) {
        ToDo todo = repo.findById(id).orElseThrow(() ->
                new TodoNotFoundException("Todo not found with id " + id)
        );

        return TodoMapper.toResponse(todo);
    }

    //Getting All Todos here
    public List<TodoResponse> getAllTodos() {

//        List<ToDo> todos=repo.findAll();
//
//        return todos.stream()
//                .map(todo -> new TodoResponse(
//                        todo.getId(),
//                        todo.getTitle(),
//                        todo.getDescription(),
//                        todo.isCompleted()
//                ))
//                .toList();

        return repo.findAll()
                .stream()
                .map(TodoMapper::toResponse)
                .toList();
    }


    public Page<TodoResponse> getAllTodosPages(int page, int size, String sortBy, String direction) {

        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);

        Page<ToDo> todoPage = repo.findAll(pageable);

        return todoPage.map(todo -> new TodoResponse(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription(),
                todo.isCompleted()
        ));
    }


    public ToDo createTodo(TodoRequest request) {
        ToDo todo = TodoMapper.toEntity(request);
        return repo.save(todo);
    }


    public TodoResponse updateTodo(Long id, TodoRequest request) {

        ToDo todo = repo.findById(id).orElseThrow(() ->
                new TodoNotFoundException("Todo not found with id " + id));

        // updating fields here
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());
        todo.setCompleted(request.isCompleted());

        ToDo saved = repo.save(todo);

        return TodoMapper.toResponse(saved);
    }
}





