/*
 * This file is generated by jOOQ.
 */
package co.homelane.db.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Covid_19India implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        sno;
    private LocalDateTime date;
    private String        time;
    private String        stateUnionterritory;
    private String        confirmedindiannational;
    private String        confirmedforeignnational;
    private String        cured;
    private String        deaths;
    private String        confirmed;

    public Covid_19India() {}

    public Covid_19India(Covid_19India value) {
        this.sno = value.sno;
        this.date = value.date;
        this.time = value.time;
        this.stateUnionterritory = value.stateUnionterritory;
        this.confirmedindiannational = value.confirmedindiannational;
        this.confirmedforeignnational = value.confirmedforeignnational;
        this.cured = value.cured;
        this.deaths = value.deaths;
        this.confirmed = value.confirmed;
    }

    public Covid_19India(
        String        sno,
        LocalDateTime date,
        String        time,
        String        stateUnionterritory,
        String        confirmedindiannational,
        String        confirmedforeignnational,
        String        cured,
        String        deaths,
        String        confirmed
    ) {
        this.sno = sno;
        this.date = date;
        this.time = time;
        this.stateUnionterritory = stateUnionterritory;
        this.confirmedindiannational = confirmedindiannational;
        this.confirmedforeignnational = confirmedforeignnational;
        this.cured = cured;
        this.deaths = deaths;
        this.confirmed = confirmed;
    }

    /**
     * Getter for <code>covid_19_india.sno</code>.
     */
    public String getSno() {
        return this.sno;
    }

    /**
     * Setter for <code>covid_19_india.sno</code>.
     */
    public Covid_19India setSno(String sno) {
        this.sno = sno;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.date</code>.
     */
    public LocalDateTime getDate() {
        return this.date;
    }

    /**
     * Setter for <code>covid_19_india.date</code>.
     */
    public Covid_19India setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.time</code>.
     */
    public String getTime() {
        return this.time;
    }

    /**
     * Setter for <code>covid_19_india.time</code>.
     */
    public Covid_19India setTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.state_unionterritory</code>.
     */
    public String getStateUnionterritory() {
        return this.stateUnionterritory;
    }

    /**
     * Setter for <code>covid_19_india.state_unionterritory</code>.
     */
    public Covid_19India setStateUnionterritory(String stateUnionterritory) {
        this.stateUnionterritory = stateUnionterritory;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.confirmedindiannational</code>.
     */
    public String getConfirmedindiannational() {
        return this.confirmedindiannational;
    }

    /**
     * Setter for <code>covid_19_india.confirmedindiannational</code>.
     */
    public Covid_19India setConfirmedindiannational(String confirmedindiannational) {
        this.confirmedindiannational = confirmedindiannational;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.confirmedforeignnational</code>.
     */
    public String getConfirmedforeignnational() {
        return this.confirmedforeignnational;
    }

    /**
     * Setter for <code>covid_19_india.confirmedforeignnational</code>.
     */
    public Covid_19India setConfirmedforeignnational(String confirmedforeignnational) {
        this.confirmedforeignnational = confirmedforeignnational;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.cured</code>.
     */
    public String getCured() {
        return this.cured;
    }

    /**
     * Setter for <code>covid_19_india.cured</code>.
     */
    public Covid_19India setCured(String cured) {
        this.cured = cured;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.deaths</code>.
     */
    public String getDeaths() {
        return this.deaths;
    }

    /**
     * Setter for <code>covid_19_india.deaths</code>.
     */
    public Covid_19India setDeaths(String deaths) {
        this.deaths = deaths;
        return this;
    }

    /**
     * Getter for <code>covid_19_india.confirmed</code>.
     */
    public String getConfirmed() {
        return this.confirmed;
    }

    /**
     * Setter for <code>covid_19_india.confirmed</code>.
     */
    public Covid_19India setConfirmed(String confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Covid_19India other = (Covid_19India) obj;
        if (sno == null) {
            if (other.sno != null)
                return false;
        }
        else if (!sno.equals(other.sno))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        }
        else if (!date.equals(other.date))
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        }
        else if (!time.equals(other.time))
            return false;
        if (stateUnionterritory == null) {
            if (other.stateUnionterritory != null)
                return false;
        }
        else if (!stateUnionterritory.equals(other.stateUnionterritory))
            return false;
        if (confirmedindiannational == null) {
            if (other.confirmedindiannational != null)
                return false;
        }
        else if (!confirmedindiannational.equals(other.confirmedindiannational))
            return false;
        if (confirmedforeignnational == null) {
            if (other.confirmedforeignnational != null)
                return false;
        }
        else if (!confirmedforeignnational.equals(other.confirmedforeignnational))
            return false;
        if (cured == null) {
            if (other.cured != null)
                return false;
        }
        else if (!cured.equals(other.cured))
            return false;
        if (deaths == null) {
            if (other.deaths != null)
                return false;
        }
        else if (!deaths.equals(other.deaths))
            return false;
        if (confirmed == null) {
            if (other.confirmed != null)
                return false;
        }
        else if (!confirmed.equals(other.confirmed))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sno == null) ? 0 : this.sno.hashCode());
        result = prime * result + ((this.date == null) ? 0 : this.date.hashCode());
        result = prime * result + ((this.time == null) ? 0 : this.time.hashCode());
        result = prime * result + ((this.stateUnionterritory == null) ? 0 : this.stateUnionterritory.hashCode());
        result = prime * result + ((this.confirmedindiannational == null) ? 0 : this.confirmedindiannational.hashCode());
        result = prime * result + ((this.confirmedforeignnational == null) ? 0 : this.confirmedforeignnational.hashCode());
        result = prime * result + ((this.cured == null) ? 0 : this.cured.hashCode());
        result = prime * result + ((this.deaths == null) ? 0 : this.deaths.hashCode());
        result = prime * result + ((this.confirmed == null) ? 0 : this.confirmed.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Covid_19India (");

        sb.append(sno);
        sb.append(", ").append(date);
        sb.append(", ").append(time);
        sb.append(", ").append(stateUnionterritory);
        sb.append(", ").append(confirmedindiannational);
        sb.append(", ").append(confirmedforeignnational);
        sb.append(", ").append(cured);
        sb.append(", ").append(deaths);
        sb.append(", ").append(confirmed);

        sb.append(")");
        return sb.toString();
    }
}
