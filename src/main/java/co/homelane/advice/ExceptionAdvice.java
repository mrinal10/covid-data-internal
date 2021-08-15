package co.homelane.advice;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * A sample exception handler, that adds an additional exception mapping to the Tide defaults. You'll probably want to
 * remove the TeapotException.
 */
@ControllerAdvice
@Order(HIGHEST_PRECEDENCE)
public class ExceptionAdvice {

    /*@Autowired
    public ExceptionAdvice(FieldErrorsProcessor fieldErrorsProcessor,
            TideServicePropertiesV3 serviceProperties,
            MessageProvider messageProvider) {
        super(fieldErrorsProcessor, serviceProperties, messageProvider);
    }


    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> handleConstraintViolationException(ConstraintViolationException ex) {
        String message = ex.getConstraintViolations().stream()
                .map(ConstraintViolation::getMessage).collect(Collectors.joining(";"));

        return new ResponseEntity<>(Responses.error(ResponseStatus.BAD_REQUEST.getText(),
                ResponseStatus.BAD_REQUEST.getCode(), message),
                HttpStatus.BAD_REQUEST);
    }*/

}
