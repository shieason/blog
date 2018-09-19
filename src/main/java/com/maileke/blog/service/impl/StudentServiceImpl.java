package com.maileke.blog.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.maileke.blog.entity.Student;
import com.maileke.blog.mapper.StudentMapper;
import com.maileke.blog.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
