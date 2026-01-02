package org.example.analyticsservice.queries;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class GetAllAccountAnalyticsByAccountId {
    private final String accountId;

    public GetAllAccountAnalyticsByAccountId(String accountId) {
        this.accountId = accountId;
    }
}
