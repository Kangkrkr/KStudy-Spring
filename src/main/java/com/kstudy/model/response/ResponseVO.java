package com.kstudy.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@Setter
@Builder(builderMethodName = "of")
public class ResponseVO {
    private HttpStatus status;
    private String message;
}
