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
public class CovidVaccineStatewise implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime updatedOn;
    private String        state;
    private String        totalDosesAdministered;
    private String        totalSessionsConducted;
    private String        totalSites;
    private String        firstDoseAdministered;
    private String        secondDoseAdministered;
    private String        maleIndividualsVaccinated;
    private String        femaleIndividualsVaccinated;
    private String        transgenderIndividualsVaccinated;
    private String        totalCovaxinAdministered;
    private String        totalCovishieldAdministered;
    private String        totalSputnikVAdministered;
    private String        aefi;
    private String        age_18_45Years;
    private String        age_45_60Years;
    private String        age_60AboveYears;
    private String        totalIndividualsVaccinated;

    public CovidVaccineStatewise() {}

    public CovidVaccineStatewise(CovidVaccineStatewise value) {
        this.updatedOn = value.updatedOn;
        this.state = value.state;
        this.totalDosesAdministered = value.totalDosesAdministered;
        this.totalSessionsConducted = value.totalSessionsConducted;
        this.totalSites = value.totalSites;
        this.firstDoseAdministered = value.firstDoseAdministered;
        this.secondDoseAdministered = value.secondDoseAdministered;
        this.maleIndividualsVaccinated = value.maleIndividualsVaccinated;
        this.femaleIndividualsVaccinated = value.femaleIndividualsVaccinated;
        this.transgenderIndividualsVaccinated = value.transgenderIndividualsVaccinated;
        this.totalCovaxinAdministered = value.totalCovaxinAdministered;
        this.totalCovishieldAdministered = value.totalCovishieldAdministered;
        this.totalSputnikVAdministered = value.totalSputnikVAdministered;
        this.aefi = value.aefi;
        this.age_18_45Years = value.age_18_45Years;
        this.age_45_60Years = value.age_45_60Years;
        this.age_60AboveYears = value.age_60AboveYears;
        this.totalIndividualsVaccinated = value.totalIndividualsVaccinated;
    }

    public CovidVaccineStatewise(
        LocalDateTime updatedOn,
        String        state,
        String        totalDosesAdministered,
        String        totalSessionsConducted,
        String        totalSites,
        String        firstDoseAdministered,
        String        secondDoseAdministered,
        String        maleIndividualsVaccinated,
        String        femaleIndividualsVaccinated,
        String        transgenderIndividualsVaccinated,
        String        totalCovaxinAdministered,
        String        totalCovishieldAdministered,
        String        totalSputnikVAdministered,
        String        aefi,
        String        age_18_45Years,
        String        age_45_60Years,
        String        age_60AboveYears,
        String        totalIndividualsVaccinated
    ) {
        this.updatedOn = updatedOn;
        this.state = state;
        this.totalDosesAdministered = totalDosesAdministered;
        this.totalSessionsConducted = totalSessionsConducted;
        this.totalSites = totalSites;
        this.firstDoseAdministered = firstDoseAdministered;
        this.secondDoseAdministered = secondDoseAdministered;
        this.maleIndividualsVaccinated = maleIndividualsVaccinated;
        this.femaleIndividualsVaccinated = femaleIndividualsVaccinated;
        this.transgenderIndividualsVaccinated = transgenderIndividualsVaccinated;
        this.totalCovaxinAdministered = totalCovaxinAdministered;
        this.totalCovishieldAdministered = totalCovishieldAdministered;
        this.totalSputnikVAdministered = totalSputnikVAdministered;
        this.aefi = aefi;
        this.age_18_45Years = age_18_45Years;
        this.age_45_60Years = age_45_60Years;
        this.age_60AboveYears = age_60AboveYears;
        this.totalIndividualsVaccinated = totalIndividualsVaccinated;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.updated_on</code>.
     */
    public CovidVaccineStatewise setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.state</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.state</code>.
     */
    public CovidVaccineStatewise setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.total_doses_administered</code>.
     */
    public String getTotalDosesAdministered() {
        return this.totalDosesAdministered;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.total_doses_administered</code>.
     */
    public CovidVaccineStatewise setTotalDosesAdministered(String totalDosesAdministered) {
        this.totalDosesAdministered = totalDosesAdministered;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.total_sessions_conducted</code>.
     */
    public String getTotalSessionsConducted() {
        return this.totalSessionsConducted;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.total_sessions_conducted</code>.
     */
    public CovidVaccineStatewise setTotalSessionsConducted(String totalSessionsConducted) {
        this.totalSessionsConducted = totalSessionsConducted;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.total_sites</code>.
     */
    public String getTotalSites() {
        return this.totalSites;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.total_sites</code>.
     */
    public CovidVaccineStatewise setTotalSites(String totalSites) {
        this.totalSites = totalSites;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.first_dose_administered</code>.
     */
    public String getFirstDoseAdministered() {
        return this.firstDoseAdministered;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.first_dose_administered</code>.
     */
    public CovidVaccineStatewise setFirstDoseAdministered(String firstDoseAdministered) {
        this.firstDoseAdministered = firstDoseAdministered;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.second_dose_administered</code>.
     */
    public String getSecondDoseAdministered() {
        return this.secondDoseAdministered;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.second_dose_administered</code>.
     */
    public CovidVaccineStatewise setSecondDoseAdministered(String secondDoseAdministered) {
        this.secondDoseAdministered = secondDoseAdministered;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.male_individuals_vaccinated</code>.
     */
    public String getMaleIndividualsVaccinated() {
        return this.maleIndividualsVaccinated;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.male_individuals_vaccinated</code>.
     */
    public CovidVaccineStatewise setMaleIndividualsVaccinated(String maleIndividualsVaccinated) {
        this.maleIndividualsVaccinated = maleIndividualsVaccinated;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.female_individuals_vaccinated</code>.
     */
    public String getFemaleIndividualsVaccinated() {
        return this.femaleIndividualsVaccinated;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.female_individuals_vaccinated</code>.
     */
    public CovidVaccineStatewise setFemaleIndividualsVaccinated(String femaleIndividualsVaccinated) {
        this.femaleIndividualsVaccinated = femaleIndividualsVaccinated;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.transgender_individuals_vaccinated</code>.
     */
    public String getTransgenderIndividualsVaccinated() {
        return this.transgenderIndividualsVaccinated;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.transgender_individuals_vaccinated</code>.
     */
    public CovidVaccineStatewise setTransgenderIndividualsVaccinated(String transgenderIndividualsVaccinated) {
        this.transgenderIndividualsVaccinated = transgenderIndividualsVaccinated;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.total_covaxin_administered</code>.
     */
    public String getTotalCovaxinAdministered() {
        return this.totalCovaxinAdministered;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.total_covaxin_administered</code>.
     */
    public CovidVaccineStatewise setTotalCovaxinAdministered(String totalCovaxinAdministered) {
        this.totalCovaxinAdministered = totalCovaxinAdministered;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.total_covishield_administered</code>.
     */
    public String getTotalCovishieldAdministered() {
        return this.totalCovishieldAdministered;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.total_covishield_administered</code>.
     */
    public CovidVaccineStatewise setTotalCovishieldAdministered(String totalCovishieldAdministered) {
        this.totalCovishieldAdministered = totalCovishieldAdministered;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.total_sputnik_v_administered</code>.
     */
    public String getTotalSputnikVAdministered() {
        return this.totalSputnikVAdministered;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.total_sputnik_v_administered</code>.
     */
    public CovidVaccineStatewise setTotalSputnikVAdministered(String totalSputnikVAdministered) {
        this.totalSputnikVAdministered = totalSputnikVAdministered;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.aefi</code>.
     */
    public String getAefi() {
        return this.aefi;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.aefi</code>.
     */
    public CovidVaccineStatewise setAefi(String aefi) {
        this.aefi = aefi;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.age_18_45_years</code>.
     */
    public String getAge_18_45Years() {
        return this.age_18_45Years;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.age_18_45_years</code>.
     */
    public CovidVaccineStatewise setAge_18_45Years(String age_18_45Years) {
        this.age_18_45Years = age_18_45Years;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.age_45_60_years</code>.
     */
    public String getAge_45_60Years() {
        return this.age_45_60Years;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.age_45_60_years</code>.
     */
    public CovidVaccineStatewise setAge_45_60Years(String age_45_60Years) {
        this.age_45_60Years = age_45_60Years;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.age_60_above_years</code>.
     */
    public String getAge_60AboveYears() {
        return this.age_60AboveYears;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.age_60_above_years</code>.
     */
    public CovidVaccineStatewise setAge_60AboveYears(String age_60AboveYears) {
        this.age_60AboveYears = age_60AboveYears;
        return this;
    }

    /**
     * Getter for <code>covid_vaccine_statewise.total_individuals_vaccinated</code>.
     */
    public String getTotalIndividualsVaccinated() {
        return this.totalIndividualsVaccinated;
    }

    /**
     * Setter for <code>covid_vaccine_statewise.total_individuals_vaccinated</code>.
     */
    public CovidVaccineStatewise setTotalIndividualsVaccinated(String totalIndividualsVaccinated) {
        this.totalIndividualsVaccinated = totalIndividualsVaccinated;
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
        final CovidVaccineStatewise other = (CovidVaccineStatewise) obj;
        if (updatedOn == null) {
            if (other.updatedOn != null)
                return false;
        }
        else if (!updatedOn.equals(other.updatedOn))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (totalDosesAdministered == null) {
            if (other.totalDosesAdministered != null)
                return false;
        }
        else if (!totalDosesAdministered.equals(other.totalDosesAdministered))
            return false;
        if (totalSessionsConducted == null) {
            if (other.totalSessionsConducted != null)
                return false;
        }
        else if (!totalSessionsConducted.equals(other.totalSessionsConducted))
            return false;
        if (totalSites == null) {
            if (other.totalSites != null)
                return false;
        }
        else if (!totalSites.equals(other.totalSites))
            return false;
        if (firstDoseAdministered == null) {
            if (other.firstDoseAdministered != null)
                return false;
        }
        else if (!firstDoseAdministered.equals(other.firstDoseAdministered))
            return false;
        if (secondDoseAdministered == null) {
            if (other.secondDoseAdministered != null)
                return false;
        }
        else if (!secondDoseAdministered.equals(other.secondDoseAdministered))
            return false;
        if (maleIndividualsVaccinated == null) {
            if (other.maleIndividualsVaccinated != null)
                return false;
        }
        else if (!maleIndividualsVaccinated.equals(other.maleIndividualsVaccinated))
            return false;
        if (femaleIndividualsVaccinated == null) {
            if (other.femaleIndividualsVaccinated != null)
                return false;
        }
        else if (!femaleIndividualsVaccinated.equals(other.femaleIndividualsVaccinated))
            return false;
        if (transgenderIndividualsVaccinated == null) {
            if (other.transgenderIndividualsVaccinated != null)
                return false;
        }
        else if (!transgenderIndividualsVaccinated.equals(other.transgenderIndividualsVaccinated))
            return false;
        if (totalCovaxinAdministered == null) {
            if (other.totalCovaxinAdministered != null)
                return false;
        }
        else if (!totalCovaxinAdministered.equals(other.totalCovaxinAdministered))
            return false;
        if (totalCovishieldAdministered == null) {
            if (other.totalCovishieldAdministered != null)
                return false;
        }
        else if (!totalCovishieldAdministered.equals(other.totalCovishieldAdministered))
            return false;
        if (totalSputnikVAdministered == null) {
            if (other.totalSputnikVAdministered != null)
                return false;
        }
        else if (!totalSputnikVAdministered.equals(other.totalSputnikVAdministered))
            return false;
        if (aefi == null) {
            if (other.aefi != null)
                return false;
        }
        else if (!aefi.equals(other.aefi))
            return false;
        if (age_18_45Years == null) {
            if (other.age_18_45Years != null)
                return false;
        }
        else if (!age_18_45Years.equals(other.age_18_45Years))
            return false;
        if (age_45_60Years == null) {
            if (other.age_45_60Years != null)
                return false;
        }
        else if (!age_45_60Years.equals(other.age_45_60Years))
            return false;
        if (age_60AboveYears == null) {
            if (other.age_60AboveYears != null)
                return false;
        }
        else if (!age_60AboveYears.equals(other.age_60AboveYears))
            return false;
        if (totalIndividualsVaccinated == null) {
            if (other.totalIndividualsVaccinated != null)
                return false;
        }
        else if (!totalIndividualsVaccinated.equals(other.totalIndividualsVaccinated))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.updatedOn == null) ? 0 : this.updatedOn.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.totalDosesAdministered == null) ? 0 : this.totalDosesAdministered.hashCode());
        result = prime * result + ((this.totalSessionsConducted == null) ? 0 : this.totalSessionsConducted.hashCode());
        result = prime * result + ((this.totalSites == null) ? 0 : this.totalSites.hashCode());
        result = prime * result + ((this.firstDoseAdministered == null) ? 0 : this.firstDoseAdministered.hashCode());
        result = prime * result + ((this.secondDoseAdministered == null) ? 0 : this.secondDoseAdministered.hashCode());
        result = prime * result + ((this.maleIndividualsVaccinated == null) ? 0 : this.maleIndividualsVaccinated.hashCode());
        result = prime * result + ((this.femaleIndividualsVaccinated == null) ? 0 : this.femaleIndividualsVaccinated.hashCode());
        result = prime * result + ((this.transgenderIndividualsVaccinated == null) ? 0 : this.transgenderIndividualsVaccinated.hashCode());
        result = prime * result + ((this.totalCovaxinAdministered == null) ? 0 : this.totalCovaxinAdministered.hashCode());
        result = prime * result + ((this.totalCovishieldAdministered == null) ? 0 : this.totalCovishieldAdministered.hashCode());
        result = prime * result + ((this.totalSputnikVAdministered == null) ? 0 : this.totalSputnikVAdministered.hashCode());
        result = prime * result + ((this.aefi == null) ? 0 : this.aefi.hashCode());
        result = prime * result + ((this.age_18_45Years == null) ? 0 : this.age_18_45Years.hashCode());
        result = prime * result + ((this.age_45_60Years == null) ? 0 : this.age_45_60Years.hashCode());
        result = prime * result + ((this.age_60AboveYears == null) ? 0 : this.age_60AboveYears.hashCode());
        result = prime * result + ((this.totalIndividualsVaccinated == null) ? 0 : this.totalIndividualsVaccinated.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CovidVaccineStatewise (");

        sb.append(updatedOn);
        sb.append(", ").append(state);
        sb.append(", ").append(totalDosesAdministered);
        sb.append(", ").append(totalSessionsConducted);
        sb.append(", ").append(totalSites);
        sb.append(", ").append(firstDoseAdministered);
        sb.append(", ").append(secondDoseAdministered);
        sb.append(", ").append(maleIndividualsVaccinated);
        sb.append(", ").append(femaleIndividualsVaccinated);
        sb.append(", ").append(transgenderIndividualsVaccinated);
        sb.append(", ").append(totalCovaxinAdministered);
        sb.append(", ").append(totalCovishieldAdministered);
        sb.append(", ").append(totalSputnikVAdministered);
        sb.append(", ").append(aefi);
        sb.append(", ").append(age_18_45Years);
        sb.append(", ").append(age_45_60Years);
        sb.append(", ").append(age_60AboveYears);
        sb.append(", ").append(totalIndividualsVaccinated);

        sb.append(")");
        return sb.toString();
    }
}
