package com.kstudy.model.mybatis;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class StudyMember {
    @NotNull(message = "부적합한 식별값입니다.")
    private Long memberSeq;
    @NotNull(message = "이름을 입력해주세요.")
    private String memberName;
    @Range(min = 10, max = 30, message = "가입이 불가능한 연령입니다.")
    private int age;

    private LocalDateTime joinDate;
    private String memberJob;
    private String createdAt;
    private String updatedAt;
}
