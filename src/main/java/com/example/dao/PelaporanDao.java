package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Pelaporan;
import com.example.services.PelaporanService;

public class PelaporanDao implements PelaporanService{
	private EntityManagerFactory emf;
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public List<Pelaporan> listPelaporan() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from pelaporan",Pelaporan.class).getResultList();
	}
    @GetMapping("/pelaporan/create")
    public String tampilkanForm(Model model) {
        model.addAttribute("pelaporan", new Pelaporan());
        return "FormPelaporan";
    }
	public Pelaporan saveOrUpdate(Pelaporan pelaporan) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Pelaporan saved = em.merge(pelaporan);
		em.getTransaction().commit();
		return saved;
	}

}
