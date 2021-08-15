package co.homelane.service;

import co.homelane.converter.Converter;
import co.homelane.repository.IndiaDataRepository;
import co.homelane.repository.StatewideVaccinationRepository;
import co.homelane.repository.TestingDetailsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith({MockitoExtension.class})
public class DataserviceUTest {

    @Mock
    private IndiaDataRepository indiaDataRepository;

    @Mock
    private StatewideVaccinationRepository statewideVaccinationRepository;

    @Mock
    private TestingDetailsRepository testingDetailsRepository;

    @Mock
    private Converter converter;

    private DataService dataService;

    @BeforeEach
    void setup() {
        dataService = new DataServiceImpl(indiaDataRepository, statewideVaccinationRepository,
                testingDetailsRepository, converter);
    }

    @Test
    void searchDateSpecificDataTest() {
        String date = "2020-04-02";
        assertDoesNotThrow(() -> dataService.searchDateSpecificData(date));
    }

    @Test
    void searchStateSpecificDataTest() {
        String date = "Andhra Pradesh";
        assertDoesNotThrow(() -> dataService.searchStateSpecificData(date));
    }

    @Test
    void searchDateStateSpecificDataTest() {
        String date = "2020-04-02";
        String state = "Andhra Pradesh";
        assertDoesNotThrow(() -> dataService.searchDateAndStateSpecificData(state, date));
    }

}
