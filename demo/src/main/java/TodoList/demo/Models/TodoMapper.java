package TodoList.demo.Models;

public class TodoMapper {

    public static TodoResponse toResponse(ToDo todo) {
        return new TodoResponse(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription(),
                todo.isCompleted()
        );
    }

    public static ToDo toEntity(TodoRequest request) {
        ToDo todo = new ToDo();
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());
        todo.setCompleted(request.isCompleted());
        return todo;
    }
}

