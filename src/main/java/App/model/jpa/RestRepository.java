package App.model.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;


@Slf4j
@Repository("RestRepository")
@Getter
@Setter
public class RestRepository {


    @Autowired
    private ListableBeanFactory beanFactory;
    
    private Repositories repositories;

    @PostConstruct
    public void setRepositories() {
        repositories = new Repositories(beanFactory);
    }
    @SuppressWarnings("rawtypes")
    public CrudRepository getRepository(Class clazz){
        CrudRepository res = (CrudRepository) repositories.getRepositoryFor(clazz);
        return res;
    }
    
    @SuppressWarnings("unchecked")
    public void save(Domain entity){
        getRepository(entity.getClass()).save(entity)
    }
}
