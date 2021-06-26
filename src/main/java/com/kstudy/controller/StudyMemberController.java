package com.kstudy.controller;

import com.kstudy.advice.ControllerExceptionAdvice;
import com.kstudy.exception.InvalidParameterException;
import com.kstudy.exception.MemberNotFoundException;
import com.kstudy.model.exception.ErrorInfo;
import com.kstudy.model.exception.ErrorResponse;
import com.kstudy.model.mybatis.StudyMember;
import com.kstudy.model.response.ResponseVO;
import com.kstudy.service.StudyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/study")
public class StudyMemberController {

    @Autowired
    private StudyMemberService studyMemberService;

    // Request handler method..
    @GetMapping(value = "/members/{member_seq}")
    public StudyMember members(@PathVariable(value = "member_seq") int memberSeq) {

        Optional<StudyMember> member = studyMemberService.getMemberBySeq(memberSeq);

        return member.orElseThrow(MemberNotFoundException::new);
    }

    @PostMapping(value = "/members")
    public ResponseVO memberJoin(@Validated StudyMember member, BindingResult result) {

        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            throw new InvalidParameterException(allErrors);
        }

        return ResponseVO.of()
                         .status(HttpStatus.OK)
                         .message("정상적으로 등록되었습니다.")
                         .build();
    }
}
