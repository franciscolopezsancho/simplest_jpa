package foo.bar;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * User: fran
 * Date: 25/01/2014
 */
@javax.persistence.Table(name = "emp", schema = "", catalog = "test")
@Entity
public class EmpEntity {
    private int empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private BigDecimal sal;
    private BigDecimal comm;
    private Integer dept;

    @javax.persistence.Column(name = "empno", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    @javax.persistence.Column(name = "ename", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @javax.persistence.Column(name = "job", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    @Basic
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @javax.persistence.Column(name = "mgr", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    @javax.persistence.Column(name = "hiredate", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @javax.persistence.Column(name = "sal", nullable = true, insertable = true, updatable = true, length = 7, precision = 2)
    @Basic
    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @javax.persistence.Column(name = "comm", nullable = true, insertable = true, updatable = true, length = 7, precision = 2)
    @Basic
    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    @javax.persistence.Column(name = "dept", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpEntity empEntity = (EmpEntity) o;

        if (empno != empEntity.empno) return false;
        if (comm != null ? !comm.equals(empEntity.comm) : empEntity.comm != null) return false;
        if (dept != null ? !dept.equals(empEntity.dept) : empEntity.dept != null) return false;
        if (ename != null ? !ename.equals(empEntity.ename) : empEntity.ename != null) return false;
        if (hiredate != null ? !hiredate.equals(empEntity.hiredate) : empEntity.hiredate != null) return false;
        if (job != null ? !job.equals(empEntity.job) : empEntity.job != null) return false;
        if (mgr != null ? !mgr.equals(empEntity.mgr) : empEntity.mgr != null) return false;
        if (sal != null ? !sal.equals(empEntity.sal) : empEntity.sal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empno;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (mgr != null ? mgr.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        return result;
    }
}
