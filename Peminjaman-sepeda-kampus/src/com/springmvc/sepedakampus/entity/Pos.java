package com.springmvc.sepedakampus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "pos")
public class Pos {

	@Id

	@Column(name = "id_pos")
	private int id;

	@Column(name = "lokasi")
	private String lokasi;

	@Column(name = "is_active")
	private int  isActive;

	@Column(name = "jumlah_sepeda")
	private int jumlahSepeda;

	public Pos() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String lokasi() {
		return lokasi;
	}

	public void getLokasi(String lokasi) {
		this.lokasi = lokasi;
	}

	public int setIsActive() {
		return isActive;
	}

	public void getIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int setJumlahSepeda() {
		return jumlahSepeda;
	}
	
	public void getJumlahSepeda(int jumlahSepeda) {
		this.jumlahSepeda =  jumlahSepeda;
	}

}
