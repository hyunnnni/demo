package com.example.demo.exam;

import com.example.demo.ResVo;
import com.example.demo.exam.model.ExamDetailVo;
import com.example.demo.exam.model.ExamInsDto;
import com.example.demo.exam.model.ExamUpd;
import com.example.demo.exam.model.ExamVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExamController {
    private final ExamService service;

    @GetMapping("/exam")
    public List<ExamVo> getExam(){
        return service.getExam();
    }

    @GetMapping("/exam/{ddd}/{rrr}")
    public List<ExamVo> getPersonId(@PathVariable(value = "rrr") int personId,@PathVariable(value = "ddd") int personii){
        return service.getPersonId(personId,personii);
    }

    @PostMapping("/exam")
    public ResVo postPerson(@RequestBody ExamInsDto dto){
        return service.postPerson(dto);
    }

    @DeleteMapping("/exam/{personId}")
    public ResVo getDel(@PathVariable int personId){
        return service.getDel(personId);
    }

    @PutMapping("/exam")
    public ResVo getUpd(@RequestBody ExamUpd eu){
        return service.getUpd(eu);
    }
}

