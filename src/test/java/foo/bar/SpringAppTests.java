package foo.bar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {

    @PersistenceContext
    EntityManager em;



    @Test
    public void shouldRetrieveDataFromDB(){
        assertEquals("Johnson",em.find(EmpEntity.class,1).getEname());
    }
}
