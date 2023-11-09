package com.example.demo.exam;

import com.example.demo.exam.model.ExamDetailVo;
import com.example.demo.exam.model.ExamInsDto;
import com.example.demo.exam.model.ExamUpd;
import com.example.demo.exam.model.ExamVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamService {
    private final ExamMapper mapper;

   /* @Autowired
    public ExamService (ExamMapper mapper){
        this.mapper = mapper;
    }*/

    public List<ExamVo> getExam(){
        return mapper.selExamList();
    }

    public List<ExamVo> getPersonId(int personId, int personii){
        return mapper.selExamById(personId,personii);
    }

    public int postPerson(ExamInsDto dto){
        return mapper.insExam(dto);
    }

    public int getDel (int personId){
        return mapper.delExam(personId);
    }

    public int getUpd (ExamUpd eu){
        return mapper.updExam(eu);
    }
}
