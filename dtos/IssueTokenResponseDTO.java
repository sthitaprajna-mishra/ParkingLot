package dtos;

import enums.ResponseStatus;
import models.Token;

public class IssueTokenResponseDTO {
    private Token token;
    private ResponseStatus responseStatus;
    private String failureMessage;
}
