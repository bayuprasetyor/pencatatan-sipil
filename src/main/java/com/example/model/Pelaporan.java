package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="pelaporan")
public class Pelaporan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	public String kepala_keluarga;
	public Integer kartu_keluarga;
	public Integer id_bayi;
	public Integer id_ibu;
	public Integer id_ayah;
	public Integer id_pelapor;
	public Integer id_saksi1;
	public String ktp;
	public String kk;
	public String surat_nikah;
	public String surat_kelahiran;
	public Integer id_petugas;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKepala_keluarga() {
		return kepala_keluarga;
	}
	public void setKepala_keluarga(String kepala_keluarga) {
		this.kepala_keluarga = kepala_keluarga;
	}
	public Integer getKartu_keluarga() {
		return kartu_keluarga;
	}
	public void setKartu_keluarga(Integer kartu_keluarga) {
		this.kartu_keluarga = kartu_keluarga;
	}
	public Integer getId_bayi() {
		return id_bayi;
	}
	public void setId_bayi(Integer id_bayi) {
		this.id_bayi = id_bayi;
	}
	public Integer getId_ibu() {
		return id_ibu;
	}
	public void setId_ibu(Integer id_ibu) {
		this.id_ibu = id_ibu;
	}
	public Integer getId_ayah() {
		return id_ayah;
	}
	public void setId_ayah(Integer id_ayah) {
		this.id_ayah = id_ayah;
	}
	public Integer getId_pelapor() {
		return id_pelapor;
	}
	public void setId_pelapor(Integer id_pelapor) {
		this.id_pelapor = id_pelapor;
	}
	public Integer getId_saksi1() {
		return id_saksi1;
	}
	public void setId_saksi1(Integer id_saksi1) {
		this.id_saksi1 = id_saksi1;
	}
	public String getKtp() {
		return ktp;
	}
	public void setKtp(String ktp) {
		this.ktp = ktp;
	}
	public String getKk() {
		return kk;
	}
	public void setKk(String kk) {
		this.kk = kk;
	}
	public String getSurat_nikah() {
		return surat_nikah;
	}
	public void setSurat_nikah(String surat_nikah) {
		this.surat_nikah = surat_nikah;
	}
	public String getSurat_kelahiran() {
		return surat_kelahiran;
	}
	public void setSurat_kelahiran(String surat_kelahiran) {
		this.surat_kelahiran = surat_kelahiran;
	}
	public Integer getId_petugas() {
		return id_petugas;
	}
	public void setId_petugas(Integer id_petugas) {
		this.id_petugas = id_petugas;
	}
}
