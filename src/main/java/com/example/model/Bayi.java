package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bayi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	public String nama;
	public Integer jenis_kelamin;
	public Integer tempat_dilahirkan;
	public String tempat_kelahiran;
	public String tanggal_lahir;
	public Integer jenis_kelahiran;
	public Integer kelahiran_ke;
	public Integer anak_ke;
	public Integer penolong_kelahiran;
	public Integer berat_bayi;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Integer getJenis_kelamin() {
		return jenis_kelamin;
	}
	public void setJenis_kelamin(Integer jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	public Integer getTempat_dilahirkan() {
		return tempat_dilahirkan;
	}
	public void setTempat_dilahirkan(Integer tempat_dilahirkan) {
		this.tempat_dilahirkan = tempat_dilahirkan;
	}
	public String getTempat_kelahiran() {
		return tempat_kelahiran;
	}
	public void setTempat_kelahiran(String tempat_kelahiran) {
		this.tempat_kelahiran = tempat_kelahiran;
	}
	public String getTanggal_lahir() {
		return tanggal_lahir;
	}
	public void setTanggal_lahir(String tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}
	public Integer getJenis_kelahiran() {
		return jenis_kelahiran;
	}
	public void setJenis_kelahiran(Integer jenis_kelahiran) {
		this.jenis_kelahiran = jenis_kelahiran;
	}
	public Integer getKelahiran_ke() {
		return kelahiran_ke;
	}
	public void setKelahiran_ke(Integer kelahiran_ke) {
		this.kelahiran_ke = kelahiran_ke;
	}
	public Integer getAnak_ke() {
		return anak_ke;
	}
	public void setAnak_ke(Integer anak_ke) {
		this.anak_ke = anak_ke;
	}
	public Integer getPenolong_kelahiran() {
		return penolong_kelahiran;
	}
	public void setPenolong_kelahiran(Integer penolong_kelahiran) {
		this.penolong_kelahiran = penolong_kelahiran;
	}
	public Integer getBerat_bayi() {
		return berat_bayi;
	}
	public void setBerat_bayi(Integer berat_bayi) {
		this.berat_bayi = berat_bayi;
	}
}
