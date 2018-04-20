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
@Transactional
public class RestRepository {


    @Autowired
    private ListableBeanFactory beanFactory;
    private Repositories repositories;

    @PostConstruct
    public void setRepositories() {
        repositories = new Repositories(beanFactory);
    }

//    public JpaRepository getRepository(Class clazz){
//        Optional optional = repositories.getRepositoryFor(clazz);
//        return Optional.ofNullable((JpaRepository) repositories.getRepositoryFor())
//                .orElseThrow(()-> new RuntimeException("")) ;
//    }
//    public void save
}
