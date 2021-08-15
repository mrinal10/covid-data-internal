package co.homelane.config;

import co.homelane.config.db.DbConfig;
import co.homelane.config.properties.BookingNotificationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.TimeZone;

/**
 * General configuration of the application.
 */
@ComponentScan(basePackages = {"co.tide.homelane"})
@Import({
        DbConfig.class,
        SwaggerConfig.class
})
@EnableConfigurationProperties(BookingNotificationProperties.class)
public class AppConfig {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC/Greenwich"));
    }

}