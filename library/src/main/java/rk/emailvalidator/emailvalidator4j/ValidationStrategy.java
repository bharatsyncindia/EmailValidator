package rk.emailvalidator.emailvalidator4j;

import rk.emailvalidator.emailvalidator4j.parser.Email;

public interface ValidationStrategy {
    Boolean isValid(String email, Email parser);
}
