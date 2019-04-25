package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ibu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	public Integer nik;
	public String nama_lengkap;
	public String tanggal_lahir;
	public String pekerjaan;
	public String alamat;
	public Integer kewarganegaraan;
	public Integer keturunan;
	public String kebangsaan;
	public String tanggal_perkawinan;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNik() {
		return nik;
	}
	public void setNik(Integer nik) {
		this.nik = nik;
	}
	public String getNama_lengkap() {
		return nama_lengkap;
	}
	public void setNama_lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}
	public String getTanggal_lahir() {
		return tanggal_lahir;
	}
	public void setTanggal_lahir(String tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}
	public String getPekerjaan() {
		return pekerjaan;
	}
	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public Integer getKewarganegaraan() {
		return kewarganegaraan;
	}
	public void setKewarganegaraan(Integer kewarganegaraan) {
		this.kewarganegaraan = kewarganegaraan;
	}
	public Integer getKeturunan() {
		return keturunan;
	}
	public void setKeturunan(Integer keturunan) {
		this.keturunan = keturunan;
	}
	public String getKebangsaan() {
		return kebangsaan;
	}
	public void setKebangsaan(String kebangsaan) {
		this.kebangsaan = kebangsaan;
	}
	public String getTanggal_perkawinan() {
		return tanggal_perkawinan;
	}
	public void setTanggal_perkawinan(String tanggal_perkawinan) {
		this.tanggal_perkawinan = tanggal_perkawinan;
	}
}
