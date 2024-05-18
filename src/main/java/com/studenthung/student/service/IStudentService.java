package com.studenthung.student.service;

import com.studenthung.student.model.Student;

import java.util.List;

public interface IStudentService {
    // hàm thêm sinh viên
    public Student addStudent(Student student);

    // hàm sửa sinh viên
    public Student updateStudent(Long id, Student student);


    // hàm xóa sinh viên
    public boolean deleteStudent(Long id);


    // hàm lấy sinh viên
    public List<Student> getAllStudent();


    // hàm lấy ra 1 sinh viên

    public Student getOneStudent(Long id);
}
