package controllers;

import dtos.IssueTokenRequestDTO;
import dtos.IssueTokenResponseDTO;

public class TokenController {
    public IssueTokenResponseDTO issueToken(IssueTokenRequestDTO issueTokenRequestDTO) {
        return new IssueTokenResponseDTO();
    }
}
