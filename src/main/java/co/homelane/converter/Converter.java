package co.homelane.converter;

import co.homelane.db.jooq.tables.records.CovidVaccineStatewiseRecord;
import co.homelane.db.jooq.tables.records.Covid_19IndiaRecord;
import co.homelane.db.jooq.tables.records.StatewisetestingdetailsRecord;
import co.homelane.model.pojo.InfectionData;
import co.homelane.model.pojo.TestingData;
import co.homelane.model.pojo.VaccinationData;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    public List<TestingData> getTestingDetails (List<StatewisetestingdetailsRecord> statewisetestingdetails) {
        return statewisetestingdetails.stream().map(this::getTestingData).collect(Collectors.toList());
    }

    public List<VaccinationData> getVaccinationDetails (List<CovidVaccineStatewiseRecord> statewiseVaccinationDetails) {
        return statewiseVaccinationDetails.stream().map(this::getVaccinationData).collect(Collectors.toList());
    }

    public List<InfectionData> getInfectionDetails (List<Covid_19IndiaRecord> statewiseInfectionDetails) {
        return statewiseInfectionDetails.stream().map(this::getInfectionData).collect(Collectors.toList());
    }

    private InfectionData getInfectionData(Covid_19IndiaRecord statewiseInfectiondetails) {
        return InfectionData.builder()
                .date(getSanitizedData(statewiseInfectiondetails.getDate()))
                .confirmed(getSanitizedData(statewiseInfectiondetails.getConfirmed()))
                .time(getSanitizedData(statewiseInfectiondetails.getTime()))
                .confirmedforeignnational(getSanitizedData(statewiseInfectiondetails.getConfirmedforeignnational()))
                .confirmedindiannational(getSanitizedData(statewiseInfectiondetails.getConfirmedindiannational()))
                .cured(getSanitizedData(statewiseInfectiondetails.getCured()))
                .deaths(getSanitizedData(statewiseInfectiondetails.getDeaths()))
                .time(getSanitizedData(statewiseInfectiondetails.getTime()))
                .state_unionterritory(getSanitizedData(statewiseInfectiondetails.getStateUnionterritory()))
                .build();
    }

    private TestingData getTestingData(StatewisetestingdetailsRecord statewisetestingdetails) {

        String appDate = getSanitizedData(statewisetestingdetails.getDate());
        String sampleCount = getSanitizedData(statewisetestingdetails.getTotalsamples());
        String negativeCount = getSanitizedData(statewisetestingdetails.getNegative());
        String positiveCount = getSanitizedData(statewisetestingdetails.getPositive());

        return TestingData.builder()
                .date(appDate)
                .stateName(statewisetestingdetails.getState())
                .testSampleCount(sampleCount)
                .negativeCount(negativeCount)
                .positiveCount(positiveCount)
                .build();
    }

    private VaccinationData getVaccinationData(CovidVaccineStatewiseRecord covidVaccineStatewiseRecord) {
        return VaccinationData.builder()
                .aefi(getSanitizedData(covidVaccineStatewiseRecord.getAefi()))
                .date(getSanitizedData(covidVaccineStatewiseRecord.getUpdatedOn()))
                .age_18_45_years(getSanitizedData(covidVaccineStatewiseRecord.getAge_18_45Years()))
                .age_45_60_years(getSanitizedData(covidVaccineStatewiseRecord.getAge_45_60Years()))
                .age_60_above_years(getSanitizedData(covidVaccineStatewiseRecord.getAge_60AboveYears()))
                .female_individuals_vaccinated(getSanitizedData(covidVaccineStatewiseRecord.getFemaleIndividualsVaccinated()))
                .male_individuals_vaccinated(getSanitizedData(covidVaccineStatewiseRecord.getMaleIndividualsVaccinated()))
                .transgender_individuals_vaccinated(getSanitizedData(covidVaccineStatewiseRecord.getTransgenderIndividualsVaccinated()))
                .total_doses_administered(getSanitizedData(covidVaccineStatewiseRecord.getTotalDosesAdministered()))
                .first_dose_administered(getSanitizedData(covidVaccineStatewiseRecord.getFirstDoseAdministered()))
                .second_dose_administered(getSanitizedData(covidVaccineStatewiseRecord.getSecondDoseAdministered()))
                .total_sites(getSanitizedData(covidVaccineStatewiseRecord.getTotalSites()))
                .total_sessions_conducted(getSanitizedData(covidVaccineStatewiseRecord.getTotalSessionsConducted()))
                .stateName(getSanitizedData(covidVaccineStatewiseRecord.getState()))
                .total_individuals_vaccinated(getSanitizedData(covidVaccineStatewiseRecord.getTotalIndividualsVaccinated()))
                .total_covaxin_administered(getSanitizedData(covidVaccineStatewiseRecord.getTotalCovaxinAdministered()))
                .total_covishield_administered(getSanitizedData(covidVaccineStatewiseRecord.getTotalCovishieldAdministered()))
                .total_sputnik_v_administered(getSanitizedData(covidVaccineStatewiseRecord.getTotalSputnikVAdministered()))
                .build();
    }

    private String getSanitizedData(LocalDateTime data) {
        String convertedData = data==null ? "" : data.toString();
        return convertedData;
    }

    private String getSanitizedData(Double data) {
        String convertedData = data==null ? "" : data.toString();
        return convertedData;
    }

    private String getSanitizedData(Integer data) {
        String convertedData = data==null ? "" : data.toString();
        return convertedData;
    }

    private String getSanitizedData(String data) {
        String convertedData = data==null ? "" : data.toString();
        return convertedData;
    }
}
