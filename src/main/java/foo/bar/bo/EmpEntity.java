package foo.bar.bo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * User: fran
 * Date: 25/01/2014
 */
@javax.persistence.Table
@Entity
@NamedQuery(name="findAll",query="SELECT c FROM EmpEntity c")
public class EmpEntity {
    private int empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private BigDecimal sal;
    private BigDecimal comm;
    private Integer dept;

    @Id
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    @Basic
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    @Basic
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Basic
    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Basic
    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    @Basic
    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

   
}
