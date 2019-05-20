package com.springmvc.sepedakampus.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "petugas")
public class Petugas {
	@Id
	@Column(name = "id_petugas")
	private String idPetugas;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pos")
	private Pos idPos;

	@Column(name = "nama")
	private String nama;

	@Column(name = "password")
	private String password;

	@Column(name = "nomorhp")
	private String nomorHp;

	@Column(name = "alamat")
	private String alamat;

	@OneToMany(mappedBy = "notifikasi")
	private List<Notifikasi> notifikasis;

	@OneToMany(mappedBy = "peminjaman")
	private List<Peminjaman> peminjamans;

	public String getIdPetugas() {
		return idPetugas;
	}

	public void setIdPetugas(String idPetugas) {
		this.idPetugas = idPetugas;
	}

	public Pos getIdPos() {
		return idPos;
	}

	public void setIdPos(Pos idPos) {
		this.idPos = idPos;
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

	public List<Notifikasi> getNotifikasis() {
		return notifikasis;
	}

	public void setNotifikasis(List<Notifikasi> notifikasis) {
		this.notifikasis = notifikasis;
	}

	public List<Peminjaman> getPeminjamans() {
		return peminjamans;
	}

	public void setPeminjamans(List<Peminjaman> peminjamans) {
		this.peminjamans = peminjamans;
	}

}
