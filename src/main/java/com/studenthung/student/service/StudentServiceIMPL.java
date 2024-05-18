package com.studenthung.student.service;

import com.studenthung.student.model.Student;
import com.studenthung.student.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements IStudentService {

    @Autowired // XEM NÓ LÀ J

    private IStudentRepository iStudentRepository;

    @Override
    public Student addStudent(Student student) {
        if (student != null) {
            return iStudentRepository.save(student);
        }
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        if (student != null) {
            Student student1 = iStudentRepository.getById(id);
            if (student1 != null) {
                student1.setName(student.getName());
                student1.setLop(student.getLop());
                student1.setTuoi(student.getTuoi());

                return iStudentRepository.save(student1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteStudent(Long id) {
        if (id >= 1) {
            Student student = iStudentRepository.getById(id);
            if (student != null) {
                iStudentRepository.delete(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> getAllStudent() {
        return iStudentRepository.findAll();
    }

    @Override
    public Student getOneStudent(Long id) {
        return iStudentRepository.getById(id);

    }
}
