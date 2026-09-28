package com.springrevision.bankaccountservice.exception;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    @GraphQlExceptionHandler(BankAccountNotFoundAxception.class)
    public GraphQLError handleBankAccountNotFound(
            BankAccountNotFoundAxception ex) {

        return GraphqlErrorBuilder.newError()
                .message(ex.getMessage())
                .build();
    }
}
