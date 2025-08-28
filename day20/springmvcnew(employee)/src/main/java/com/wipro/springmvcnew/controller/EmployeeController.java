package com.wipro.springmvcnew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.wipro.springmvcnew.entity.Department;
import com.wipro.springmvcnew.entity.Employee;
import com.wipro.springmvcnew.entity.EmploymentType;
import com.wipro.springmvcnew.repo.DepartmentRepo;
import com.wipro.springmvcnew.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @Autowired
    private DepartmentRepo departmentRepo;

   
    @GetMapping
    public String list(@RequestParam(value = "q", required = false) String q, Model model) {
        List<Employee> employees = service.searchByName(q);
        model.addAttribute("employees", employees);
        model.addAttribute("query", q == null ? "" : q);
        return "employees/list";
    }

  
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("types", EmploymentType.values());
        model.addAttribute("departments", departmentRepo.findAll());
        return "employees/form";
    }

 
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        Employee employee = service.getById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Employee ID"));
        model.addAttribute("employee", employee);
        model.addAttribute("types", EmploymentType.values());
        model.addAttribute("departments", departmentRepo.findAll());
        return "employees/form";
    }

   
    @PostMapping
    public String create(@Valid @ModelAttribute("employee") Employee employee,
                         BindingResult result,
                         Model model) {

        if (result.hasErrors()) {
            model.addAttribute("types", EmploymentType.values());
            model.addAttribute("departments", departmentRepo.findAll());
            return "employees/form";
        }

        mapDepartment(employee);

        service.create(employee);
        return "redirect:/employees";
    }

  
    @PostMapping("/{id}")
    public String update(@PathVariable Long id,
                         @Valid @ModelAttribute("employee") Employee employee,
                         BindingResult result,
                         Model model) {

        if (result.hasErrors()) {
            model.addAttribute("types", EmploymentType.values());
            model.addAttribute("departments", departmentRepo.findAll());
            return "employees/form";
        }

        mapDepartment(employee);

        service.update(id, employee);
        return "redirect:/employees";
    }

  
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/employees";
    }

   
    private void mapDepartment(Employee employee) {
        if (employee.getDepartment() != null && employee.getDepartment().getId() != null) {
            Department dept = departmentRepo.findById(employee.getDepartment().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Invalid Department ID"));
            employee.setDepartment(dept);
        } else {
            employee.setDepartment(null);
        }
    }
}
