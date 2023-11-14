package com.example.demo.exam;

import com.example.demo.ResVo;
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

    public ResVo postPerson(ExamInsDto dto){
        int result = mapper.insExam(dto);
        return new ResVo(result);
    }

    public ResVo getDel (int personId){
        int result = mapper.delExam(personId);
        return new ResVo(result);
    }

    public ResVo getUpd (ExamUpd eu){
        int result = mapper.updExam(eu);
        return new ResVo(result);
    }
}
