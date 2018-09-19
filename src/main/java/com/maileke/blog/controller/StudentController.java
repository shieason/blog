package com.maileke.blog.controller;

import com.maileke.blog.entity.Student;
import com.maileke.blog.service.StudentService;
import com.maileke.blog.vo.Mess;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * shieason 2018.09.19
 */
@RestController
@RequestMapping("/students")
@Api(tags = "学生控制器")
public class StudentController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/rest")
	public Object restTest() {
		return restTemplate.getForObject("http://localhost:8080/students", Object.class);
	}

	@ApiOperation(value = "获取学生列表")
	@GetMapping("")
	public Object getStudents() {
        List<Student> students = studentService.list(null);
		return Mess.succ(students);
	}

	@ApiOperation("更新学生")
	@PostMapping("")
	public Object postStudent(@RequestBody Student student) {
		studentService.save(student);
		return Mess.succ(null);
	}

	@GetMapping("/{id}")
	public Object getStudent(@PathVariable("id") Long id) {
        Student student = studentService.getById(id);
		return Mess.succ(student);
	}

	@PutMapping("/{id}")
	public Object putStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		Student stu = studentService.getById(id);
		stu.setAge(student.getAge());
		stu.setName(student.getName());
		studentService.updateById(stu);

		return Mess.succ(null);
	}

	@DeleteMapping("/{id}")
	public Object deleteStudent(@PathVariable Long id) {
	    studentService.removeById(id);
	    return Mess.succ(null);
    }
}

