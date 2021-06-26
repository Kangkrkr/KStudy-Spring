package com.kstudy.service;

import com.kstudy.model.mybatis.StudyMember;
import com.kstudy.repository.mybatis.StudyMemberMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudyMemberService {

    private final StudyMemberMapper studyMemberMapper;

    public List<String> getMemberListWithNameAndSeq() {
        return Arrays.asList("");
    }

    public Optional<StudyMember> getMemberBySeq(int memberSeq) {
        return Optional.ofNullable(studyMemberMapper.selectMemberBySeq(memberSeq));
    }
}
