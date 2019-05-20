package com.sepedakampus.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "notifikasi")
public class Notifikasi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_notifikasi")
	private int idNotifikasi;

	@Column(name = "isi")
	private String isi;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "petugas")
	private Petugas petugas;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user")
	private Mahasiswa mahasiswa;

	@Column(name = "waktu_kirim")
	private Timestamp waktuKirim;

	@Column(name = "status")
	private int status;

	public int getIdNotifikasi() {
		return idNotifikasi;
	}

	public void setIdNotifikasi(int idNotifikasi) {
		this.idNotifikasi = idNotifikasi;
	}

	public String getIsi() {
		return isi;
	}

	public void setIsi(String isi) {
		this.isi = isi;
	}

	public Petugas getPetugas() {
		return petugas;
	}

	public void setPetugas(Petugas petugas) {
		this.petugas = petugas;
	}

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}

	public Timestamp getWaktuKirim() {
		return waktuKirim;
	}

	public void setWaktuKirim(Timestamp waktuKirim) {
		this.waktuKirim = waktuKirim;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
