package co.homelane.service;

import co.homelane.converter.Converter;
import co.homelane.model.DateWiseData;
import co.homelane.model.StateDateWiseData;
import co.homelane.model.StateWiseData;
import co.homelane.repository.IndiaDataRepository;
import co.homelane.repository.StatewideVaccinationRepository;
import co.homelane.repository.TestingDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    private final IndiaDataRepository indiaDataRepository;
    private final StatewideVaccinationRepository statewiseVaccinationRepository;
    private final TestingDetailsRepository testingDetailsRepository;
    private final Converter converter;

    public DataServiceImpl(IndiaDataRepository indiaDataRepository,
            StatewideVaccinationRepository statewiseVaccineRepository,
            TestingDetailsRepository testingDetailsRepository, Converter converter) {
        this.indiaDataRepository = indiaDataRepository;
        this.statewiseVaccinationRepository = statewiseVaccineRepository;
        this.testingDetailsRepository = testingDetailsRepository;
        this.converter = converter;
    }


    @Override
    public DateWiseData searchDateSpecificData(String date) {

        return DateWiseData.builder()
                .date(date)
                .infectionDetails(converter.getInfectionDetails(indiaDataRepository.getDateWiseData(date)))
                .stateWiseTestingDetails(converter.getTestingDetails(testingDetailsRepository.getDateWiseData(date)))
                .vaccinationDetails(converter.getVaccinationDetails(
                        statewiseVaccinationRepository.getDateWiseData(date)))
                .build();
    }

    @Override
    public StateDateWiseData searchDateAndStateSpecificData(String stateName, String date) {
        return StateDateWiseData.builder()
                .date(date)
                .stateName(stateName)
                .infectionDetails(converter.getInfectionDetails(indiaDataRepository
                        .getDateAndStateWiseData(date, stateName)))
                .stateWiseTestingDetails(converter.getTestingDetails(testingDetailsRepository
                        .getDateAndStateWiseData(date, stateName)))
                .vaccinationDetails(converter.getVaccinationDetails(statewiseVaccinationRepository
                        .getDateAndStateWiseData(date, stateName)))
                .build();
    }

    @Override
    public StateWiseData searchStateSpecificData(String State) {
        return StateWiseData.builder()
                .stateName(State)
                .infectionDetails(converter.getInfectionDetails(indiaDataRepository.getStateWiseData(State)))
                .stateWiseTestingDetails(converter.getTestingDetails(testingDetailsRepository.getStateWiseData(State)))
                .vaccinationDetails(converter.getVaccinationDetails(statewiseVaccinationRepository
                        .getStateWiseData(State)))
                .build();
    }
}
