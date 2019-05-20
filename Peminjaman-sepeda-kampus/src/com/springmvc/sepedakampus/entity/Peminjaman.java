package com.springmvc.sepedakampus.entity;

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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "peminjam")
	private Mahasiswa peminjam;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "petugas")
	private Petugas petugas;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_sepeda")
	private Sepeda idSepeda;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pos_peminjaman")
	private Pos posPeminjaman;

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

	public Mahasiswa getPeminjam() {
		return peminjam;
	}

	public void setPeminjam(Mahasiswa peminjam) {
		this.peminjam = peminjam;
	}

	public Petugas getPetugas() {
		return petugas;
	}

	public void setPetugas(Petugas petugas) {
		this.petugas = petugas;
	}

	public Sepeda getIdSepeda() {
		return idSepeda;
	}

	public void setIdSepeda(Sepeda idSepeda) {
		this.idSepeda = idSepeda;
	}

	public Pos getPosPeminjaman() {
		return posPeminjaman;
	}

	public void setPosPeminjaman(Pos posPeminjaman) {
		this.posPeminjaman = posPeminjaman;
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
