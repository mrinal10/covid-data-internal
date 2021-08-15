/*
 * This file is generated by jOOQ.
 */
package co.homelane.db.jooq.tables.records;


import co.homelane.db.jooq.tables.Covid_19India;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Covid_19IndiaRecord extends TableRecordImpl<Covid_19IndiaRecord> implements Record9<String, LocalDateTime, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>covid_19_india.sno</code>.
     */
    public Covid_19IndiaRecord setSno(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.sno</code>.
     */
    public String getSno() {
        return (String) get(0);
    }

    /**
     * Setter for <code>covid_19_india.date</code>.
     */
    public Covid_19IndiaRecord setDate(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.date</code>.
     */
    public LocalDateTime getDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>covid_19_india.time</code>.
     */
    public Covid_19IndiaRecord setTime(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.time</code>.
     */
    public String getTime() {
        return (String) get(2);
    }

    /**
     * Setter for <code>covid_19_india.state_unionterritory</code>.
     */
    public Covid_19IndiaRecord setStateUnionterritory(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.state_unionterritory</code>.
     */
    public String getStateUnionterritory() {
        return (String) get(3);
    }

    /**
     * Setter for <code>covid_19_india.confirmedindiannational</code>.
     */
    public Covid_19IndiaRecord setConfirmedindiannational(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.confirmedindiannational</code>.
     */
    public String getConfirmedindiannational() {
        return (String) get(4);
    }

    /**
     * Setter for <code>covid_19_india.confirmedforeignnational</code>.
     */
    public Covid_19IndiaRecord setConfirmedforeignnational(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.confirmedforeignnational</code>.
     */
    public String getConfirmedforeignnational() {
        return (String) get(5);
    }

    /**
     * Setter for <code>covid_19_india.cured</code>.
     */
    public Covid_19IndiaRecord setCured(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.cured</code>.
     */
    public String getCured() {
        return (String) get(6);
    }

    /**
     * Setter for <code>covid_19_india.deaths</code>.
     */
    public Covid_19IndiaRecord setDeaths(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.deaths</code>.
     */
    public String getDeaths() {
        return (String) get(7);
    }

    /**
     * Setter for <code>covid_19_india.confirmed</code>.
     */
    public Covid_19IndiaRecord setConfirmed(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>covid_19_india.confirmed</code>.
     */
    public String getConfirmed() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, LocalDateTime, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, LocalDateTime, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Covid_19India.COVID_19_INDIA.SNO;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Covid_19India.COVID_19_INDIA.DATE;
    }

    @Override
    public Field<String> field3() {
        return Covid_19India.COVID_19_INDIA.TIME;
    }

    @Override
    public Field<String> field4() {
        return Covid_19India.COVID_19_INDIA.STATE_UNIONTERRITORY;
    }

    @Override
    public Field<String> field5() {
        return Covid_19India.COVID_19_INDIA.CONFIRMEDINDIANNATIONAL;
    }

    @Override
    public Field<String> field6() {
        return Covid_19India.COVID_19_INDIA.CONFIRMEDFOREIGNNATIONAL;
    }

    @Override
    public Field<String> field7() {
        return Covid_19India.COVID_19_INDIA.CURED;
    }

    @Override
    public Field<String> field8() {
        return Covid_19India.COVID_19_INDIA.DEATHS;
    }

    @Override
    public Field<String> field9() {
        return Covid_19India.COVID_19_INDIA.CONFIRMED;
    }

    @Override
    public String component1() {
        return getSno();
    }

    @Override
    public LocalDateTime component2() {
        return getDate();
    }

    @Override
    public String component3() {
        return getTime();
    }

    @Override
    public String component4() {
        return getStateUnionterritory();
    }

    @Override
    public String component5() {
        return getConfirmedindiannational();
    }

    @Override
    public String component6() {
        return getConfirmedforeignnational();
    }

    @Override
    public String component7() {
        return getCured();
    }

    @Override
    public String component8() {
        return getDeaths();
    }

    @Override
    public String component9() {
        return getConfirmed();
    }

    @Override
    public String value1() {
        return getSno();
    }

    @Override
    public LocalDateTime value2() {
        return getDate();
    }

    @Override
    public String value3() {
        return getTime();
    }

    @Override
    public String value4() {
        return getStateUnionterritory();
    }

    @Override
    public String value5() {
        return getConfirmedindiannational();
    }

    @Override
    public String value6() {
        return getConfirmedforeignnational();
    }

    @Override
    public String value7() {
        return getCured();
    }

    @Override
    public String value8() {
        return getDeaths();
    }

    @Override
    public String value9() {
        return getConfirmed();
    }

    @Override
    public Covid_19IndiaRecord value1(String value) {
        setSno(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value2(LocalDateTime value) {
        setDate(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value3(String value) {
        setTime(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value4(String value) {
        setStateUnionterritory(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value5(String value) {
        setConfirmedindiannational(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value6(String value) {
        setConfirmedforeignnational(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value7(String value) {
        setCured(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value8(String value) {
        setDeaths(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord value9(String value) {
        setConfirmed(value);
        return this;
    }

    @Override
    public Covid_19IndiaRecord values(String value1, LocalDateTime value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Covid_19IndiaRecord
     */
    public Covid_19IndiaRecord() {
        super(Covid_19India.COVID_19_INDIA);
    }

    /**
     * Create a detached, initialised Covid_19IndiaRecord
     */
    public Covid_19IndiaRecord(String sno, LocalDateTime date, String time, String stateUnionterritory, String confirmedindiannational, String confirmedforeignnational, String cured, String deaths, String confirmed) {
        super(Covid_19India.COVID_19_INDIA);

        setSno(sno);
        setDate(date);
        setTime(time);
        setStateUnionterritory(stateUnionterritory);
        setConfirmedindiannational(confirmedindiannational);
        setConfirmedforeignnational(confirmedforeignnational);
        setCured(cured);
        setDeaths(deaths);
        setConfirmed(confirmed);
    }
}
