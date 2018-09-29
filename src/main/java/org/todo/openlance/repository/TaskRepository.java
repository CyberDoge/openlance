package org.todo.openlance.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.todo.openlance.model.Tag;
import org.todo.openlance.model.Task;

import java.util.Set;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

    @Query(value = "SELECT tag_id FROM Tag_to_Task WHERE task_id like ?1", nativeQuery = true)
    Set<Tag> findListByTagId(int id);

}
