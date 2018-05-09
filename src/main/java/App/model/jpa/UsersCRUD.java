package App.model.jpa;

import App.model.Domain.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersCRUD extends PagingAndSortingRepository<Users, Long> {
    Users findById(@Param("id") Long id);
    Users findByEmail(@Param("email") String email);
    Users findByUsername(@Param("name") String name);
}
