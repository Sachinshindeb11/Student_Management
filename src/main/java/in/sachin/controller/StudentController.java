package in.sachin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.sachin.entity.Student;
import in.sachin.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

 @Autowired
 private StudentService service;

 @GetMapping
 public List<Student> getAllStudents() {
     return service.getAllStudents();
 }

 @GetMapping("/{id}")
 public Student getStudentById(@PathVariable Long id) {
     return service.getStudentById(id);
 }

 @PostMapping
 public Student registerStudent(@RequestBody Student student) {
     return service.saveStudent(student);
 }

 @PutMapping("/{id}")
 public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
     return service.updateStudent(id, student);
 }

 @DeleteMapping("/{id}")
 public void deleteStudent(@PathVariable Long id) {
     service.deleteStudent(id);
 }
}

