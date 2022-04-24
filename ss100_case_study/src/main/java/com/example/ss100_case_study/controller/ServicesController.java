package com.example.ss100_case_study.controller;


import com.example.ss100_case_study.dto.ServicesDTO;
import com.example.ss100_case_study.model.services.Services;
import com.example.ss100_case_study.service.IServicesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RequestMapping("/services")
@Controller
public class ServicesController {
    @Autowired
    IServicesService iServicesService ;

    @GetMapping("")
    public String list(Model model, @PageableDefault(value = 5) Pageable pageable) {

        Page<Services> servicesPage;
        servicesPage = iServicesService.findAll(pageable);
        model.addAttribute("servicesPage", servicesPage);
        return "service/list";

    }
    @GetMapping("/create/villa")
    public String showFormVilla(Model model) {
        ServicesDTO servicesDTO = new ServicesDTO();
        model.addAttribute("servicesDTO", servicesDTO);
        return "service/villa";
    }
    @GetMapping("/create/room")
    public String showFormRoom(Model model) {
        ServicesDTO servicesDTO = new ServicesDTO();
        model.addAttribute("servicesDTO", servicesDTO);
        return "service/room";
    }
    @GetMapping("/create/house")
    public String showFormHouse(Model model) {
        ServicesDTO servicesDTO = new ServicesDTO();
        model.addAttribute("servicesDTO", servicesDTO);
        return "service/house";
    }

    @PostMapping("/create/house")
    public String createCustomerHouse(@Valid @ModelAttribute ServicesDTO servicesDTO,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "service/house";
        } else {
            Services services = new Services();
            BeanUtils.copyProperties(servicesDTO, services);
            iServicesService.save(services);
            redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
            return "redirect:/services";
        }
    }
    @PostMapping("/create/villa")
    public String createCustomerVL(@Valid @ModelAttribute ServicesDTO servicesDTO,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "service/villa";
        } else {
            Services services = new Services();
            BeanUtils.copyProperties(servicesDTO, services);
            iServicesService.save(services);
            redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
            return "redirect:/services";
        }
    }
    @PostMapping("/create/room")
    public String createCustomerRoom(@Valid @ModelAttribute ServicesDTO servicesDTO,
                                   BindingResult bindingResult,
                                   RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "service/room";
        } else {
            Services services = new Services();
            BeanUtils.copyProperties(servicesDTO, services);
            iServicesService.save(services);
            redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
            return "redirect:/services";
        }
    }

}
