package TodoList.demo.Models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TodoRequest {



        @NotBlank(message = "Title cannot be empty")
        private String title;

        @NotBlank(message = "Description cannot be empty")
        private String description;

        private boolean completed;
    }


