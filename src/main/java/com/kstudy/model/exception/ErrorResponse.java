package com.kstudy.model.exception;

import lombok.*;
import org.springframework.validation.ObjectError;

import javax.lang.model.type.ErrorType;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
@Builder(builderMethodName = "of")
public class ErrorResponse {
    // 타임스탬프
    private LocalDateTime timestamp;
    // 에러정보
    private Map<String, Object> errorInfo;
    // 에러 상세정보
    private List<ObjectError> errorDetails;
    // 예외 발생에 대한 이동 링크..
    private String redirectLink;
}
