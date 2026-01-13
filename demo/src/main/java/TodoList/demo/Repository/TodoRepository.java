package TodoList.demo.Repository;

import TodoList.demo.Models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ToDo,Long> {
}
