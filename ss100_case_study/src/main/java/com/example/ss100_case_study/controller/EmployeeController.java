package com.example.ss100_case_study.controller;


import com.example.ss100_case_study.dto.CustomerDTO;
import com.example.ss100_case_study.dto.EmployeeDTO;
import com.example.ss100_case_study.model.customer.Customer;
import com.example.ss100_case_study.model.customer.CustomerType;
import com.example.ss100_case_study.model.employee.Division;
import com.example.ss100_case_study.model.employee.EducationDegree;
import com.example.ss100_case_study.model.employee.Employee;
import com.example.ss100_case_study.model.employee.Position;
import com.example.ss100_case_study.service.IEmployeeService;
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

@RequestMapping("employees")
@Controller
public class EmployeeController {

    @Autowired
    IEmployeeService iEmployeeService;

    @GetMapping("")
    public String list(Model model, @PageableDefault(value = 5) Pageable pageable) {
        Page<Employee> employeePage;
        employeePage = iEmployeeService.findAll(pageable);
        model.addAttribute("employeePage", employeePage);
        return "employee/list";

    }
    @GetMapping("/create")
    public String showForm(Model model) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        model.addAttribute("employeeDTO", employeeDTO);
        return "employee/create";
    }

    @PostMapping("/create")
    public String CreateCustomer(@Valid @ModelAttribute EmployeeDTO employeeDTO,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "employee/create";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDTO, employee);
            iEmployeeService.save(employee);
            redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
            return "redirect:/employees";
        }
    }
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        Employee employee = this.iEmployeeService.findById(id);
        if (employee == null) {
            return "error.404";
        }
        EmployeeDTO employeeDTO = new EmployeeDTO();

        BeanUtils.copyProperties(employee, employeeDTO);

        List<Division> divisionList  = this.iEmployeeService.findAllDivision();
        List<EducationDegree> educationDegreeList = this.iEmployeeService.findAllEducation();
        List<Position>positionList=this.iEmployeeService.findAllPosition();
        model.addAttribute("employeeDTO", employeeDTO);
        model.addAttribute("divisionList", divisionList);
        model.addAttribute("educationDegreeList", educationDegreeList);
        model.addAttribute("positionList", positionList);

        return "/employee/edit";
    }

    @PostMapping("/edit/{id}")
    public String editEmployee(@PathVariable Integer id, @Validated @ModelAttribute EmployeeDTO employeeDTO, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model) {

        if (bindingResult.hasFieldErrors()) {
            List<Division> divisionList  = this.iEmployeeService.findAllDivision();
            List<EducationDegree> educationDegreeList = this.iEmployeeService.findAllEducation();
            List<Position>positionList=this.iEmployeeService.findAllPosition();
            model.addAttribute("divisionList", divisionList);
            model.addAttribute("educationDegreeList", educationDegreeList);
            model.addAttribute("positionList", positionList);
            return "/employee/edit";
        }
        Employee employee =  new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        employee.setIdEmployee(id);
        this.iEmployeeService.save(employee);
        redirectAttributes.addFlashAttribute("SOS", "edit thành công!");
        return "redirect:/employees";
    }


    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable Integer id, Model model) {
        Employee employee = this.iEmployeeService.findById(id);
        if (employee == null) {
            return "error.404";
        }
        EmployeeDTO employeeDTO = new EmployeeDTO();

        BeanUtils.copyProperties(employee, employeeDTO);

        List<Division> divisionList  = this.iEmployeeService.findAllDivision();
        List<EducationDegree> educationDegreeList = this.iEmployeeService.findAllEducation();
        List<Position>positionList=this.iEmployeeService.findAllPosition();
        model.addAttribute("employeeDTO", employeeDTO);
        model.addAttribute("divisionList", divisionList);
        model.addAttribute("educationDegreeList", educationDegreeList);
        model.addAttribute("positionList", positionList);

        return "/employee/delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id, @Validated @ModelAttribute EmployeeDTO employeeDTO, BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes, Model model) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        employee.setIdEmployee(id);
        this.iEmployeeService.deleteById(id);
        redirectAttributes.addFlashAttribute("SOS", "delete thành công!");
        return "redirect:/employees";

    }

}
