
// NIM			: 11S15023
// Kelas		: 14TI1

package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Pelaporan;
import com.example.services.PelaporanService;

@Controller
public class PelaporanController {
	public PelaporanService pelaporanService;
	@Autowired
	public void setPelaporanService(PelaporanService pelaporanService) {
		this.pelaporanService = pelaporanService;
	}
	@RequestMapping("/pelaporan")
	public String PelaporanList(Model model) {
		model.addAttribute("pelaporan", pelaporanService.listPelaporan());
		return "pelaporan";
	}
    @GetMapping("/pelaporan/create")
    public String tampilkanForm(Model model) {
        model.addAttribute("pelaporan", new Pelaporan());
        return "formPelaporan";
    }
	@RequestMapping(value = "/pelaporan/create",method=RequestMethod.POST)
	public String simpatDataPelaporan(Model model,Pelaporan pelaporan) {
		model.addAttribute("pelaporan",pelaporanService.saveOrUpdate(pelaporan));
		return "redirect:/pelaporan";
	}

}
