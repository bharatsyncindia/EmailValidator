package rk.emailvalidator.emailvalidator4j;

import java.util.Collections;
import java.util.List;

import rk.emailvalidator.emailvalidator4j.lexer.EmailLexer;
import rk.emailvalidator.emailvalidator4j.parser.Email;
import rk.emailvalidator.emailvalidator4j.parser.exception.InvalidEmail;

public final class EmailValidator {
    private final Email parser = new Email(new EmailLexer());
    private List<ValidationStrategy> validators = Collections.emptyList();

    public EmailValidator (List<ValidationStrategy> validators) {
        this.validators = validators;
    }

    public EmailValidator () {}

    public boolean isValid(String email) {
        boolean parserResult = true;
        try {
            this.parser.parse(email);
        } catch (InvalidEmail invalidEmail) {
            parserResult = false;
        }

        return parserResult && this.applyValidators(email);
    }

    private boolean applyValidators(String email) {
        boolean validatorsResult = true;
        for (ValidationStrategy validator : this.validators) {
            validatorsResult = validatorsResult && validator.isValid(email, this.parser);
        }

        return validatorsResult;
    }

    public boolean hasWarnings() {
        return !this.parser.getWarnings().isEmpty();
    }

    public List getWarnings() {
        return this.parser.getWarnings();
    }
}
