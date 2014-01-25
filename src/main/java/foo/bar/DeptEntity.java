package foo.bar;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: fran
 * Date: 25/01/2014
 */
@javax.persistence.Table(name = "dept", schema = "", catalog = "test")
@Entity
public class DeptEntity {
    private int deptno;
    private String dname;
    private String loc;

    @javax.persistence.Column(name = "deptno", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @javax.persistence.Column(name = "dname", nullable = true, insertable = true, updatable = true, length = 14, precision = 0)
    @Basic
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @javax.persistence.Column(name = "loc", nullable = true, insertable = true, updatable = true, length = 13, precision = 0)
    @Basic
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptEntity that = (DeptEntity) o;

        if (deptno != that.deptno) return false;
        if (dname != null ? !dname.equals(that.dname) : that.dname != null) return false;
        if (loc != null ? !loc.equals(that.loc) : that.loc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptno;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (loc != null ? loc.hashCode() : 0);
        return result;
    }
}
