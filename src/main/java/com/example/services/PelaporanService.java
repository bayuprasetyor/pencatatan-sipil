package com.example.services;

import java.util.List;

import com.example.model.Pelaporan;

public interface PelaporanService {

	List<Pelaporan> listPelaporan();
	Pelaporan saveOrUpdate(Pelaporan pelaporan);
}
