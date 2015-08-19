package org.openpkw.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. Edit by
 * Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-07.
 */

@Entity
@Table(name = "opm_obwodowa_komisja")
public class PeripheralCommittee {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "pkwId")
	private String pkwId;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "type")
	private String type;

	@Column(name = "allowedToVote")
	private Long allowedToVote;

	@Column(name = "opm_okregowa_komisja_id")
	private Long opmOkregowaKomisjaId;

	@Column(name = "KodTeryt")
	private Long territoryCode;

	@Column(name = "KodObwodu")
	private Long areaCode;
	
	@OneToMany
	private List<User> usersList;
	
	@OneToMany
	private List<Photo> photosList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPkwId() {
		return pkwId;
	}

	public void setPkwId(String pkwId) {
		this.pkwId = pkwId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getAllowedToVote() {
		return allowedToVote;
	}

	public void setAllowedToVote(Long allowedToVote) {
		this.allowedToVote = allowedToVote;
	}

	public Long getOpmOkregowaKomisjaId() {
		return opmOkregowaKomisjaId;
	}

	public void setOpmOkregowaKomisjaId(Long opmOkregowaKomisjaId) {
		this.opmOkregowaKomisjaId = opmOkregowaKomisjaId;
	}

	public Long getTerritoryCode() {
		return territoryCode;
	}

	public void setTerritoryCode(Long territoryCode) {
		this.territoryCode = territoryCode;
	}

	public Long getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}
	

}
