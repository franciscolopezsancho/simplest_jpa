package foo.bar;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import foo.bar.bo.EmpEntity;
import foo.bar.config.PersistenceJPAConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
@Transactional
@ContextConfiguration(classes = {PersistenceJPAConfig.class})
public class SpringAppTests {

    @PersistenceContext
    EntityManager em;

    @Test
    public void shouldRetrieveDataFromDB(){
    	EmpEntity emp1 = new EmpEntity();
    	emp1.setEmpno(1);
    	String name = "John";
    	emp1.setEname(name);
    	em.persist(emp1);
        assertEquals(name,em.find(EmpEntity.class,1).getEname());
        assertEquals(1,em.createNamedQuery("findAll").getResultList().size());
    }
    
    
}
