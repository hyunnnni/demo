package com.example.demo.exam;

import com.example.demo.exam.model.ExamDetailVo;
import com.example.demo.exam.model.ExamInsDto;
import com.example.demo.exam.model.ExamUpd;
import com.example.demo.exam.model.ExamVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {
    List<ExamVo> selExamList();

    List<ExamVo> selExamById(int personId, int personii);

    int insExam(ExamInsDto dto);
    int delExam(int personId);

    int updExam(ExamUpd eu);
}
