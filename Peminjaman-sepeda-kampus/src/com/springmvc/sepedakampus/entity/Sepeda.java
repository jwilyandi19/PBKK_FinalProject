package com.springmvc.sepedakampus.entity;

import java.sql.Date;
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
@Table(name = "sepeda")
public class Sepeda {

	@Id
	@Column(name = "id_sepeda")
	private int idSepeda;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pos")
	private Pos idPos;

	@Column(name = "model")
	private String model;

	@Column(name = "tanggal_beli")
	private Date tanggalBeli;

	@Column(name = "is_available")
	private int isAvailable;

	@OneToMany(mappedBy = "peminjaman")
	private List<Peminjaman> peminjamans;

	public int getIdSepeda() {
		return idSepeda;
	}

	public void setIdSepeda(int idSepeda) {
		this.idSepeda = idSepeda;
	}

	public Pos getIdPos() {
		return idPos;
	}

	public void setIdPos(Pos idPos) {
		this.idPos = idPos;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getTanggalBeli() {
		return tanggalBeli;
	}

	public void setTanggalBeli(Date tanggalBeli) {
		this.tanggalBeli = tanggalBeli;
	}

	public int getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}

	public List<Peminjaman> getPeminjamans() {
		return peminjamans;
	}

	public void setPeminjamans(List<Peminjaman> peminjamans) {
		this.peminjamans = peminjamans;
	}

}
