package TodoList.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TodoResponse {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

}
