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
@Table(name = "peminjaman")
public class Peminjaman {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_peminjaman")
	private int idPeminjaman;


	@Column(name = "tanggal_meminjam")
	private Timestamp tanggalMeminjam;

	@Column(name = "tanggal_mengembalikan")
	private Timestamp tanggalMengembalikan;

	@Column(name = "keterangan")
	private String keterangan;

	@Column(name = "status")
	private int status;

	public int getIdPeminjaman() {
		return idPeminjaman;
	}

	public void setIdPeminjaman(int idPeminjaman) {
		this.idPeminjaman = idPeminjaman;
	}

	public Timestamp getTanggalMeminjam() {
		return tanggalMeminjam;
	}

	public void setTanggalMeminjam(Timestamp tanggalMeminjam) {
		this.tanggalMeminjam = tanggalMeminjam;
	}

	public Timestamp getTanggalMengembalikan() {
		return tanggalMengembalikan;
	}

	public void setTanggalMengembalikan(Timestamp tanggalMengembalikan) {
		this.tanggalMengembalikan = tanggalMengembalikan;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
