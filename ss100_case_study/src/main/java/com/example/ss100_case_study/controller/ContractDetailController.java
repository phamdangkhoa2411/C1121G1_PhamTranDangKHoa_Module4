package com.example.ss100_case_study.controller;

import com.example.ss100_case_study.dto.ContractDTO;
import com.example.ss100_case_study.dto.ContractDetailDTO;
import com.example.ss100_case_study.dto.CustomerDTO;
import com.example.ss100_case_study.model.contract.AttachServices;
import com.example.ss100_case_study.model.contract.Contract;
import com.example.ss100_case_study.model.contract.ContractDetail;
import com.example.ss100_case_study.service.IContractDetailService;
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
import java.util.List;

@RequestMapping("contractDetails")
@Controller
public class ContractDetailController {
    @Autowired
    IContractDetailService iContractDetailService ;

    @GetMapping("")
    public String list(Model model, @PageableDefault(value = 5) Pageable pageable) {

        Page<ContractDetail> contractDetailPage;
        contractDetailPage = iContractDetailService.findAll(pageable);
        model.addAttribute("contractDetailPage",contractDetailPage);
        return "contract_detail/list";

    }
    @GetMapping("/create")
    public String showForm(Model model) {
         ContractDetailDTO contractDetailDTO = new ContractDetailDTO();
        List<Contract>contractList= iContractDetailService.findAllContract();
        List<AttachServices>attachServicesList= iContractDetailService.findAllAttachServices();
        model.addAttribute("contractDetailDTO", contractDetailDTO);
        model.addAttribute("contractList", contractList);
        model.addAttribute("attachServicesList", attachServicesList);
        return "contract_detail/create";
    }
    @PostMapping("/create")
    public String CreateContract(@Valid @ModelAttribute ContractDetailDTO contractDetailDTO,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "contract/create";
        } else {
            ContractDetail contractDetail = new ContractDetail();
            BeanUtils.copyProperties(contractDetailDTO, contractDetail);
            iContractDetailService.save(contractDetail);
            redirectAttributes.addFlashAttribute("SOS", "thêm mới thành công");
            return "redirect:/contractDetails";
        }
    }


}
