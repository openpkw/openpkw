package org.openpkw.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. 
 * Edit by Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-07.
 */

@Entity
@Table(name = "opm_obwodowa_komisja")
public class PeripheralCommittee {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="pkwId")
	private String pkwId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="type")
	private String type;
	
	@Column(name="allowedToVote")
	private long allowedToVote;
	
	@Column(name="opm_okregowa_komisja_id")
	private long opmOkregowaKomisjaId;
	
	@Column(name="KodTeryt")
	private long territoryCode;
	
	@Column(name="KodObwodu")
	private long areaCode;

	public long getId() {
		return id;
	}

	public void setIdCommittee(long id) {
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

	public long getAllowedToVote() {
		return allowedToVote;
	}

	public void setAllowedToVote(long allowedToVote) {
		this.allowedToVote = allowedToVote;
	}

	public long getOpmOkregowaKomisjaId() {
		return opmOkregowaKomisjaId;
	}

	public void setOpmOkregowaKomisjaId(long opmOkregowaKomisjaId) {
		this.opmOkregowaKomisjaId = opmOkregowaKomisjaId;
	}

	public long getTerritoryCode() {
		return territoryCode;
	}

	public void setTerritoryCode(long territoryCode) {
		this.territoryCode = territoryCode;
	}

	public long getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(long areaCode) {
		this.areaCode = areaCode;
	}
}
