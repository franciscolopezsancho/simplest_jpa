/**
 * Name: SQLiteDialect4.java
 * 10 May 2016 @ 14:30:05
 * Created By: francisco.lopez-sancho
 *
 * Copyright &copy; 2016 Compliant Phones Ltd.
 *
 * All rights reserved.  Reproduction, distribution or retransmission without
 * express written permission of Compliant Phones Ltd.is prohibited. This source 
 * code and any program compiled from it remain the sole property of 
 * Compliant Phones Ltd.
 * 
 * @author francisco.lopez-sancho
 * @since 10 May 2016 
 */
package foo.bar.dialect;

import java.sql.Types;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.dialect.function.VarArgsSQLFunction;
import org.hibernate.type.StringType;

public class SQLiteDialect4 extends Dialect {
    public SQLiteDialect4() {
        registerColumnType(Types.BIT, "integer");
        registerColumnType(Types.TINYINT, "tinyint");
        registerColumnType(Types.SMALLINT, "smallint");
        registerColumnType(Types.INTEGER, "integer");
        registerColumnType(Types.BIGINT, "bigint");
        registerColumnType(Types.FLOAT, "float");
        registerColumnType(Types.REAL, "real");
        registerColumnType(Types.DOUBLE, "double");
        registerColumnType(Types.NUMERIC, "numeric");
        registerColumnType(Types.DECIMAL, "decimal");
        registerColumnType(Types.CHAR, "char");
        registerColumnType(Types.VARCHAR, "varchar");
        registerColumnType(Types.LONGVARCHAR, "longvarchar");
        registerColumnType(Types.DATE, "date");
        registerColumnType(Types.TIME, "time");
        registerColumnType(Types.TIMESTAMP, "timestamp");
        registerColumnType(Types.BINARY, "blob");
        registerColumnType(Types.VARBINARY, "blob");
        registerColumnType(Types.LONGVARBINARY, "blob");
        // registerColumnType(Types.NULL, "null");
        registerColumnType(Types.BLOB, "blob");
        registerColumnType(Types.CLOB, "clob");
        registerColumnType(Types.BOOLEAN, "integer");

        registerFunction( "concat", new VarArgsSQLFunction(StringType.INSTANCE, "", "||", "") );
        registerFunction( "mod", new SQLFunctionTemplate( StringType.INSTANCE, "?1 % ?2" ) );
        registerFunction( "substr", new StandardSQLFunction("substr", StringType.INSTANCE) );
        registerFunction( "substring", new StandardSQLFunction( "substr", StringType.INSTANCE) );
    }

    public boolean supportsIdentityColumns() {
        return true;
    }

  /*
  public boolean supportsInsertSelectIdentity() {
    return true; // As specify in NHibernate dialect
  }
  */

    public boolean hasDataTypeInIdentityColumn() {
        return false; // As specify in NHibernate dialect
    }

  /*
  public String appendIdentitySelectToInsert(String insertString) {
    return new StringBuffer(insertString.length()+30). // As specify in NHibernate dialect
      append(insertString).
      append("; ").append(getIdentitySelectString()).
      toString();
  }
  */

    public String getIdentityColumnString() {
        // return "integer primary key autoincrement";
        return "integer";
    }

    public String getIdentitySelectString() {
        return "select last_insert_rowid()";
    }

    public boolean supportsLimit() {
        return true;
    }

    protected String getLimitString(String query, boolean hasOffset) {
        return new StringBuffer(query.length()+20).
                append(query).
                append(hasOffset ? " limit ? offset ?" : " limit ?").
                toString();
    }

    public boolean supportsTemporaryTables() {
        return true;
    }

    public String getCreateTemporaryTableString() {
        return "create temporary table if not exists";
    }

    public boolean dropTemporaryTableAfterUse() {
        return false;
    }

    public boolean supportsCurrentTimestampSelection() {
        return true;
    }

    public boolean isCurrentTimestampSelectStringCallable() {
        return false;
    }

    public String getCurrentTimestampSelectString() {
        return "select current_timestamp";
    }

    public boolean supportsUnionAll() {
        return true;
    }

    public boolean hasAlterTable() {
        return false; // As specify in NHibernate dialect
    }

    public boolean dropConstraints() {
        return false;
    }

    public String getAddColumnString() {
        return "add column";
    }

    public String getForUpdateString() {
        return "";
    }

    public boolean supportsOuterJoinForUpdate() {
        return false;
    }

    public String getDropForeignKeyString() {
        throw new UnsupportedOperationException("No drop foreign key syntax supported by SQLiteDialect4");
    }

    public String getAddForeignKeyConstraintString(String constraintName,
                                                   String[] foreignKey, String referencedTable, String[] primaryKey,
                                                   boolean referencesPrimaryKey) {
        throw new UnsupportedOperationException("No add foreign key syntax supported by SQLiteDialect4");
    }

    public String getAddPrimaryKeyConstraintString(String constraintName) {
        throw new UnsupportedOperationException("No add primary key syntax supported by SQLiteDialect4");
    }

    public boolean supportsIfExistsBeforeTableName() {
        return true;
    }

    public boolean supportsCascadeDelete() {
        return false;
    }
}
