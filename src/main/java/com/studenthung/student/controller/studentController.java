package com.studenthung.student.controller;

import com.studenthung.student.model.Student;
import com.studenthung.student.repository.IStudentRepository;
import com.studenthung.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {
    //
    @Autowired
    private IStudentService iStudentService;

    @GetMapping("/")
    public String test() {
        return "hello";
    }

    // API ADD STUDENT
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return iStudentService.addStudent(student);
    }

    // API UPDATE STUDENT
    @PutMapping("/update")
    public Student updateStudent(@RequestParam("id") long id, @RequestBody Student student) {
        return iStudentService.updateStudent(id, student);
    }


    //API DELETE STUDENT
    @DeleteMapping("/delete/{id}")
    public boolean deleteStudent(@PathVariable("id") long id) {
        return iStudentService.deleteStudent(id);
    }

    // API LẤY DANH SÁCH
    @GetMapping("/list")
    public List<Student> getAllStudent() {
        return iStudentService.getAllStudent();
    }
}
