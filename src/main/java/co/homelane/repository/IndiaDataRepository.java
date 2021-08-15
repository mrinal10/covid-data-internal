package co.homelane.repository;

import static co.homelane.db.jooq.Tables.COVID_19_INDIA;
import co.homelane.db.jooq.tables.records.Covid_19IndiaRecord;
import co.homelane.utils.ApplicationUtils;
import java.time.LocalDateTime;
import java.util.List;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class IndiaDataRepository {
    private final DSLContext dslContext;

    public IndiaDataRepository(DSLContext dslContext) { this.dslContext = dslContext; }

    public List<Covid_19IndiaRecord> getDateWiseData(String date) {

        List<Covid_19IndiaRecord> result =  dslContext.select()
                .from(COVID_19_INDIA)
                .where(COVID_19_INDIA.DATE.eq(ApplicationUtils.getdate(date)))
                .fetchInto(Covid_19IndiaRecord.class);

        return result;
    }

    public List<Covid_19IndiaRecord> getDateAndStateWiseData(String date, String stateName) {
        int year = 0;
        int dayOfMonth = 0;
        int month = 0;

        return dslContext.select()
                .from(COVID_19_INDIA)
                .where(COVID_19_INDIA.DATE.eq(ApplicationUtils.getdate(date))
                        .and(COVID_19_INDIA.STATE_UNIONTERRITORY.eq(stateName)))
                .fetchInto(Covid_19IndiaRecord.class);
    }

    public List<Covid_19IndiaRecord> getStateWiseData(String stateName) {

        return dslContext.select()
                .from(COVID_19_INDIA)
                .where(COVID_19_INDIA.STATE_UNIONTERRITORY.eq(stateName))
                .orderBy(COVID_19_INDIA.DATE.desc())
                .fetchInto(Covid_19IndiaRecord.class);
    }

}
