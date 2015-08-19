package org.openpkw.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. 
 * Edit by Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-06.
 */

@Entity
@Table(name = "opm_zdjecie")
public class Photo {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="opm_obwodowa_komisja_pkwId")
	private String opmObwodowaKomisjaPkwId;
	
	@Column(name="timeStamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;
		
	@Column(name="userFileName")
	private String userFileName;
	
	@Column(name="token")
	private String token;
	
	@Column(name="file_type")
	private String fileType;
	
	@Column(name="opm_user_id")
	@ManyToOne
	@JoinColumn(name="id")
	private User user;
	
	@Column(name="protokol")
	@ManyToOne
	@JoinColumn(name="id")
	private Protocol protokol;
	
	@Column(name="komisjaID")
	@ManyToOne
	@JoinColumn(name="id")
	private PeripheralCommittee committee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOpmObwodowaKomisjaPkwId() {
		return opmObwodowaKomisjaPkwId;
	}

	public void setOpmObwodowaKomisjaPkwId(String opmObwodowaKomisjaPkwId) {
		this.opmObwodowaKomisjaPkwId = opmObwodowaKomisjaPkwId;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Protocol getProtokol() {
		return protokol;
	}

	public void setProtokol(Protocol protokol) {
		this.protokol = protokol;
	}

	public PeripheralCommittee getCommittee() {
		return committee;
	}

	public void setCommittee(PeripheralCommittee committee) {
		this.committee = committee;
	}

}
