package App.model.jpa;

import App.model.Domain.Domain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import java.util.Optional;



@Slf4j
@Repository("RestRepository")
@Transactional
public class RestRepository {


    private ListableBeanFactory beanFactory;

    RestRepository(@Autowired
                           ListableBeanFactory beanFactory){
        this.beanFactory = beanFactory;
    }


    private Repositories repositories;

    @PostConstruct
    public void setRepositories() {
        repositories = new Repositories(beanFactory);
    }

    public JpaRepository getRepo(Class clazz){
        return Optional.ofNullable((JpaRepository) repositories.getRepositoryFor(clazz))
                .orElseThrow(() -> new RuntimeException(""));
    }



    @SuppressWarnings("unchecked")
    public CrudRepository getRepository(Class clazz){
        CrudRepository res = (CrudRepository) repositories.getRepositoryFor(clazz);
        return res;
    }
    
    @SuppressWarnings("unchecked")
    public void save(Domain entity){
        getRepository(entity.getClass()).save(entity);
    }
    
    public void delete(Domain entity){
        getRepository(entity.getClass()).delete(entity);
    }

    public Object findAll(Class clazz){
        return getRepository(clazz).findAll();
    }
}
