package co.homelane.repository;

import co.homelane.db.jooq.tables.records.StatewisetestingdetailsRecord;
import co.homelane.utils.ApplicationUtils;
import java.util.List;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static co.homelane.db.jooq.Tables.STATEWISETESTINGDETAILS;

@Repository
public class TestingDetailsRepository {
    private final DSLContext dslContext;

    public TestingDetailsRepository(DSLContext dslContext) { this.dslContext = dslContext; }

    public List<StatewisetestingdetailsRecord> getDateWiseData(String date) {

        return dslContext.select()
                .from(STATEWISETESTINGDETAILS)
                .where(STATEWISETESTINGDETAILS.DATE.eq(ApplicationUtils.getdate(date)))
                .fetchInto(StatewisetestingdetailsRecord.class);
    }

    public List<StatewisetestingdetailsRecord> getDateAndStateWiseData(String date, String stateName) {

        return dslContext.select()
                .from(STATEWISETESTINGDETAILS)
                .where(STATEWISETESTINGDETAILS.DATE.eq(ApplicationUtils.getdate(date))
                        .and(STATEWISETESTINGDETAILS.STATE.eq(stateName)))
                .fetchInto(StatewisetestingdetailsRecord.class);
    }

    public List<StatewisetestingdetailsRecord> getStateWiseData(String stateName) {

        return dslContext.select()
                .from(STATEWISETESTINGDETAILS)
                .where(STATEWISETESTINGDETAILS.STATE.eq(stateName))
                .orderBy(STATEWISETESTINGDETAILS.DATE.desc())
                .fetchInto(StatewisetestingdetailsRecord.class);
    }
}
