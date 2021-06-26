package com.kstudy.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum ErrorInfo {
    DATA_NOT_FOUND("E400", "해당 데이터 조회에 실패 하였습니다."),
    INVALID_PARAMETER("E401", "잘못된 요청 정보 입니다."),
    NO_IDENTIFIED_ERROR("E999", "서비스 처리 중 오류가 발생 하였습니다.");

    private String errorCode;
    private String errorMessage;

    public Map<String, Object> getInfo() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("errorCode", this.errorCode);
        resultMap.put("errorMessage", this.errorMessage);

        return resultMap;
    }
}
