package co.homelane.config.db;

import javax.sql.DataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

/**
 * General configuration for the database.
 */
@EnableConfigurationProperties({LiquibaseProperties.class})
public class DbConfig {
    private boolean migrationsHaveRun = false;

    @Bean
    public SpringLiquibase liquibase(
            DataSource dataSource,
            LiquibaseProperties liquibaseProperties,
            Environment springEnvironment) {

        boolean skipMigrations = springEnvironment.acceptsProfiles(Profiles.of("fast"));
        boolean runMigrations = !skipMigrations && !migrationsHaveRun && liquibaseProperties.isEnabled();
        SpringLiquibase liquibase = new SpringLiquibase();

        if (runMigrations) {
            liquibase.setShouldRun(true);
            liquibase.setDataSource(dataSource);
            liquibase.setChangeLog("classpath:liquibase/master.xml");
            liquibase.setContexts(liquibaseProperties.getContexts());
            liquibase.setDefaultSchema(liquibaseProperties.getDefaultSchema());
            liquibase.setDropFirst(liquibaseProperties.isDropFirst());

        } else {
            liquibase.setShouldRun(false);
        }

        migrationsHaveRun = true;

        return liquibase;
    }
}