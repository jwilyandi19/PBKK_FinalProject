package com.sepedakampus.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {

	@Id
	@Column(name = "nrp_mahasiswa")
	private String nrpMahasiswa;

	@Column(name = "nama")
	private String nama;

	@Column(name = "password")
	private String password;

	@Column(name = "nomorhp")
	private String nomorHp;

	@Column(name = "alamat")
	private String alamat;

	@Column(name = "departemen")
	private String departemen;


	public String getNrpMahasiswa() {
		return nrpMahasiswa;
	}

	public void setNrpMahasiswa(String nrpMahasiswa) {
		this.nrpMahasiswa = nrpMahasiswa;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNomorHp() {
		return nomorHp;
	}

	public void setNomorHp(String nomorHp) {
		this.nomorHp = nomorHp;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getDepartemen() {
		return departemen;
	}

	public void setDepartemen(String departemen) {
		this.departemen = departemen;
	}


}
