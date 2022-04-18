package com.example.on_tap2.controller;

import com.example.on_tap2.dto.StudentDto;
import com.example.on_tap2.model.ClassStudent;
import com.example.on_tap2.model.Student;
import com.example.on_tap2.service.IClassService;
import com.example.on_tap2.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("student")
@Controller
public class StudentController {

    @Autowired
    IStudentService iStudentService;

    @Autowired
    IClassService iClassService;

    @GetMapping("")
    public String list(Model model, @PageableDefault(value = 2) Pageable pageable) {
        Page<Student> students;
        students = iStudentService.findAll(pageable);
        model.addAttribute("students", students);
        return "list";
    }

    @GetMapping("/createStudent")
    public String showForm(Model model) {
        List<ClassStudent> classStudentList = iClassService.findAllClass();
        StudentDto studentDto = new StudentDto();
        model.addAttribute("classStudentList",classStudentList);
        model.addAttribute("studentDto", studentDto);
        return "create";
    }

    @PostMapping("/create")
    public String createStuden(@Valid @ModelAttribute StudentDto studentDto,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes
                             ) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        else
        {
        Student student = new Student();
        BeanUtils.copyProperties(studentDto, student);
        iStudentService.save(student);
        redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
        return "redirect:/student";
    }
}

}
