package tester.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	@GeneratedValue
	private int sId;
	@Column(nullable = false)
	private String sName;
	private String sAddress;
	private double sPercentage;
	private String sGender;
	@Lob
	private byte[] file;

	public Student(String sName, String sAddress, double sPercentage, String sGender, byte[] file) {
		super();
		this.sName = sName;
		this.sAddress = sAddress;
		this.sPercentage = sPercentage;
		this.sGender = sGender;
		this.file = file;
	}

	public Student() {

	}

}
