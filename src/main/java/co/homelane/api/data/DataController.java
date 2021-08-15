package co.homelane.api.data;

import co.homelane.model.DateWiseData;
import co.homelane.model.StateDateWiseData;
import co.homelane.model.StateWiseData;
import co.homelane.service.DataService;
import io.swagger.annotations.*;
import javax.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/internal-data")
@Api("Related data on Covid")
@Validated
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @ApiOperation(value = "Get all date specific data")
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "Success"
            ),
            @ApiResponse(
                    code = 401,
                    message = "Unauthorized"
            ),
            @ApiResponse(
                    code = 500,
                    message = "Unable to process request."
            )
    })
    @GetMapping("/on-date/{date}")
    public DateWiseData getDateSpecificdata(@ApiParam(value = "date",
            example = "2016-12-16 YYYY-MM-DD format", required = true)
    @NotBlank(message = "date cannot be blank.")
    @PathVariable("date") String date) {
        return dataService.searchDateSpecificData(date);
    }

    @ApiOperation(value = "Get all state specific data")
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "Success"
            ),
            @ApiResponse(
                    code = 401,
                    message = "Unauthorized"
            ),
            @ApiResponse(
                    code = 500,
                    message = "Unable to process request."
            )
    })
    @GetMapping("/of-state/{state}")
    public StateWiseData getStateSpecificdata(@ApiParam(value = "state name",
            example = "West Bengal", required = true)
    @NotBlank(message = "state name cannot be blank.")
    @PathVariable("state") String state) {
        return dataService.searchStateSpecificData(state);
    }

    @ApiOperation(value = "Get state and date specific data")
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "Success"
            ),
            @ApiResponse(
                    code = 401,
                    message = "Unauthorized"
            ),
            @ApiResponse(
                    code = 500,
                    message = "Unable to process request."
            )
    })
    @GetMapping("/of-state/{state}/on/{date}")
    public StateDateWiseData getStateSpecificdata(@ApiParam(value = "state name",
            example = "West Bengal", required = true)
    @NotBlank(message = "state name cannot be blank.")
    @PathVariable("state") String state, @PathVariable("date") String date) {
        return dataService.searchDateAndStateSpecificData(state, date);
    }

}
