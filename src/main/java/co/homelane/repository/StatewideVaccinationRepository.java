package co.homelane.repository;

import co.homelane.db.jooq.tables.records.CovidVaccineStatewiseRecord;
import co.homelane.utils.ApplicationUtils;
import java.time.LocalDateTime;
import java.util.List;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static co.homelane.db.jooq.Tables.COVID_VACCINE_STATEWISE;

@Repository
public class StatewideVaccinationRepository {

    private final DSLContext dslContext;

    public StatewideVaccinationRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<CovidVaccineStatewiseRecord> getDateWiseData(String date) {

        return dslContext.select()
                .from(COVID_VACCINE_STATEWISE)
                .where(COVID_VACCINE_STATEWISE.UPDATED_ON.eq(ApplicationUtils.getdate(date))).
                        fetchInto(CovidVaccineStatewiseRecord.class);
    }

    public List<CovidVaccineStatewiseRecord> getDateAndStateWiseData(String date, String stateName) {

        return dslContext.select()
                .from(COVID_VACCINE_STATEWISE)
                .where(COVID_VACCINE_STATEWISE.UPDATED_ON.eq(ApplicationUtils.getdate(date))
                        .and(COVID_VACCINE_STATEWISE.STATE.eq(stateName)))
                .fetchInto(CovidVaccineStatewiseRecord.class);
    }

    public List<CovidVaccineStatewiseRecord> getStateWiseData(String stateName) {
        return dslContext.select()
                .from(COVID_VACCINE_STATEWISE)
                .where(COVID_VACCINE_STATEWISE.STATE.eq(stateName))
                .orderBy(COVID_VACCINE_STATEWISE.UPDATED_ON.desc())
                .fetchInto(CovidVaccineStatewiseRecord.class);
    }
}
