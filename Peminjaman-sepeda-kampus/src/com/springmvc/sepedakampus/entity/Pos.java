package com.springmvc.sepedakampus.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "pos")
public class Pos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pos")
	private int id;

	@Column(name = "lokasi")
	private String lokasi;

	@Column(name = "is_active")
	private int isActive;

	@Column(name = "jumlah_sepeda")
	private int jumlahSepeda;

	@OneToMany(mappedBy = "petugas")
	private List<Petugas> petugas;

	@OneToMany(mappedBy = "sepeda")
	private List<Sepeda> sepedas;

	@OneToMany(mappedBy = "peminjaman")
	private List<Peminjaman> peminjamans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getJumlahSepeda() {
		return jumlahSepeda;
	}

	public void setJumlahSepeda(int jumlahSepeda) {
		this.jumlahSepeda = jumlahSepeda;
	}

	public List<Petugas> getPetugas() {
		return petugas;
	}

	public void setPetugas(List<Petugas> petugas) {
		this.petugas = petugas;
	}

	public List<Sepeda> getSepedas() {
		return sepedas;
	}

	public void setSepedas(List<Sepeda> sepedas) {
		this.sepedas = sepedas;
	}

	public List<Peminjaman> getPeminjamans() {
		return peminjamans;
	}

	public void setPeminjamans(List<Peminjaman> peminjamans) {
		this.peminjamans = peminjamans;
	}

}
