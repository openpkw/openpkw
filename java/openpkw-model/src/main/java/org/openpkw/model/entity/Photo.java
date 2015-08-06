package org.openpkw.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. 
 * Edit by Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-06.
 */

@Entity
@Table(name = "opm_zdjecie")
public class Photo {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="opm_obwodowa_komisja_pkwId")
	private String opmObwodowaKomisjaPkwId;
	private Timestamp timeStamp;
	@Column(name="opm_user_id")
	private int opmUserId;
	private String userFileName;
	private String token;
	@Column(name="file_type")
	private String fileType;
	//@OneToOne(mappedBy = "opm_protokol")
	private int protokol;
	//@OneToOne(mappedBy = "opm_obwodowa_komisja")
	private int komisjaID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOpmObwodowaKomisjaPkwId() {
		return opmObwodowaKomisjaPkwId;
	}

	public void setOpmObwodowaKomisjaPkwId(String opmObwodowaKomisjaPkwId) {
		this.opmObwodowaKomisjaPkwId = opmObwodowaKomisjaPkwId;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getOpmUserId() {
		return opmUserId;
	}

	public void setOpmUserId(int opmUserId) {
		this.opmUserId = opmUserId;
	}

	public String getUserFileName() {
		return userFileName;
	}

	public void setUserFileName(String userFileName) {
		this.userFileName = userFileName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public int getProtokol() {
		return protokol;
	}

	public void setProtokol(int protokol) {
		this.protokol = protokol;
	}

	public int getKomisjaID() {
		return komisjaID;
	}

	public void setKomisjaID(int komisjaID) {
		this.komisjaID = komisjaID;
	}

}
