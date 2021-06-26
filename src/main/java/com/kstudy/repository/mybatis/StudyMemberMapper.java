package com.kstudy.repository.mybatis;

import com.kstudy.model.mybatis.StudyMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyMemberMapper {
    public List<StudyMember> selectAll();
    public StudyMember selectMemberBySeq(int memberSeq);
}
