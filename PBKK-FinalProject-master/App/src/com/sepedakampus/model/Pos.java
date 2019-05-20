package com.sepedakampus.model;

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



}
