package App.model.jpa;

import App.model.Domain.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersCRUD extends PagingAndSortingRepository<Users, Long> {
    Users findAllById(@Param("id") Long id);
}
