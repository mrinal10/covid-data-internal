/*
 * This file is generated by jOOQ.
 */
package co.homelane.db.jooq.tables;


import co.homelane.db.jooq.DefaultSchema;
import co.homelane.db.jooq.tables.records.Covid_19IndiaRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Covid_19India extends TableImpl<Covid_19IndiaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>covid_19_india</code>
     */
    public static final Covid_19India COVID_19_INDIA = new Covid_19India();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Covid_19IndiaRecord> getRecordType() {
        return Covid_19IndiaRecord.class;
    }

    /**
     * The column <code>covid_19_india.sno</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> SNO = createField(DSL.name("sno"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_19_india.date</code>.
     */
    public final TableField<Covid_19IndiaRecord, LocalDateTime> DATE = createField(DSL.name("date"), SQLDataType.LOCALDATETIME(3).nullable(false), this, "");

    /**
     * The column <code>covid_19_india.time</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> TIME = createField(DSL.name("time"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_19_india.state_unionterritory</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> STATE_UNIONTERRITORY = createField(DSL.name("state_unionterritory"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_19_india.confirmedindiannational</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> CONFIRMEDINDIANNATIONAL = createField(DSL.name("confirmedindiannational"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_19_india.confirmedforeignnational</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> CONFIRMEDFOREIGNNATIONAL = createField(DSL.name("confirmedforeignnational"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_19_india.cured</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> CURED = createField(DSL.name("cured"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_19_india.deaths</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> DEATHS = createField(DSL.name("deaths"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_19_india.confirmed</code>.
     */
    public final TableField<Covid_19IndiaRecord, String> CONFIRMED = createField(DSL.name("confirmed"), SQLDataType.VARCHAR(100), this, "");

    private Covid_19India(Name alias, Table<Covid_19IndiaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Covid_19India(Name alias, Table<Covid_19IndiaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>covid_19_india</code> table reference
     */
    public Covid_19India(String alias) {
        this(DSL.name(alias), COVID_19_INDIA);
    }

    /**
     * Create an aliased <code>covid_19_india</code> table reference
     */
    public Covid_19India(Name alias) {
        this(alias, COVID_19_INDIA);
    }

    /**
     * Create a <code>covid_19_india</code> table reference
     */
    public Covid_19India() {
        this(DSL.name("covid_19_india"), null);
    }

    public <O extends Record> Covid_19India(Table<O> child, ForeignKey<O, Covid_19IndiaRecord> key) {
        super(child, key, COVID_19_INDIA);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Covid_19India as(String alias) {
        return new Covid_19India(DSL.name(alias), this);
    }

    @Override
    public Covid_19India as(Name alias) {
        return new Covid_19India(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Covid_19India rename(String name) {
        return new Covid_19India(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Covid_19India rename(Name name) {
        return new Covid_19India(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, LocalDateTime, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}