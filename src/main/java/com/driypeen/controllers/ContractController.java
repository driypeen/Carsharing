package com.driypeen.controllers;

import com.driypeen.entities.Contract;
import com.driypeen.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/contracts")
public class ContractController {
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping
    public String showAllContracts (Model model) {
        List<Contract> contracts = (List<Contract>) contractService.findAll();

        model.addAttribute("contracts", contracts);
        return "contracts";
    }

    @GetMapping("/{id}")
    public String findContractById (@PathVariable("id") int id,
            Model model) {
        //Auth

        Optional<Contract> contractOptional = contractService.findByContractId(id);

        if (contractOptional.isPresent()) {
            Contract contract = contractOptional.get();
            model.addAttribute("contract", contract);
        } else {
            //error
        }
        return "contract";
    }

    @PostMapping(path = "/new")
    public String newContract (Model model) {
        //Auth

        return "contracts";
    }
}
