package com.springmvc.sepedakampus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pos")
public class Pos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nama_pos")
	private String namaPos;
	
	@Column(name="ktrsdian_pos")
	private int ktrsdianPos;
	
	public Pos() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNamaPos() {
		return namaPos;
	}
	
	public void setNamaPos(String namaPos) {
		this.namaPos = namaPos;
	}
	
	public int getKtrsdianPos() {
		return ktrsdianPos;
	}
	
	public void setKtrsdianPos(int ktrsdianPos) {
		this.ktrsdianPos = ktrsdianPos;
	}
	
	@Override
	public String toString() {
		return "Pos [id=" + id + ", namaPos=" + namaPos + ", ktrsdianPos=" + ktrsdianPos + "]";
	}
}
