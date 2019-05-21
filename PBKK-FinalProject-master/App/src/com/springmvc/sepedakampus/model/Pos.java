package com.springmvc.sepedakampus.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="pos")
public class Pos {
	
	@Id
	@Column(name="id_pos")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpos;
	
	@Column(name="lokasi")
	private String lokasi;
	
	@Column(name="is_active")
	private int is_active;
	
	@Column(name="jumlah_sepeda")
	private int jumlah;

	
	public int getIdpos() {
		return idpos;
	}


	public void setIdpos(int idpos) {
		this.idpos = idpos;
	}


	public String getLokasi() {
		return lokasi;
	}


	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}


	public int getIs_active() {
		return is_active;
	}


	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}


	public int getJumlah() {
		return jumlah;
	}


	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public Pos() {
	}
	
}