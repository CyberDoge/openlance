package org.todo.openlance.repository;

import org.springframework.data.repository.CrudRepository;
import org.todo.openlance.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
