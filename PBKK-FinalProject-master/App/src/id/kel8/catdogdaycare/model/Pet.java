package id.kel8.catdogdaycare.model;

import javax.persistence.*;

@Entity
@Table(name="pets")
public class Pet {
	
	@Id
	@Column(name="pet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	
	@Column(name="pet_name")
	private String petName;
	
	@Column(name="pet_jenis")
	private String petJenis;
	
	@Column(name="pet_gender")
	private String petGender;
	
	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetJenis() {
		return petJenis;
	}

	public void setPetJenis(String petJenis) {
		this.petJenis = petJenis;
	}

	public String getPetGender() {
		return petGender;
	}

	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	public Pet() {
	}

	public Pet(String petName, String petJenis, String petGender) {
		this.petName = petName;
		this.petJenis = petJenis;
		this.petGender = petGender;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", petJenis=" + petJenis + ", petGender=" + petGender
				+ "]";
	}
}
