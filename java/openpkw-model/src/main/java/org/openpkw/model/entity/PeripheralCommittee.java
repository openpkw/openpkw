package org.openpkw.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. Edit by
 * Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-06.
 */

@Entity
@Table(name = "opm_obwodowa_komisja")
public class PeripheralCommittee {

	@Id
	private int id;
	private String pkwId;
	private String name;
	private String address;
	private String type;
	private int allowedToVote;
	private int opm_okregowa_komisja_id;
	@Column(name="KodTeryt")
	private int kodTeryt;
	@Column(name="KodObwodu")
	private int kodObwodu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getAllowedToVote() {
		return allowedToVote;
	}

	public void setAllowedToVote(int allowedToVote) {
		this.allowedToVote = allowedToVote;
	}

	public int getOpm_okregowa_komisja_id() {
		return opm_okregowa_komisja_id;
	}

	public void setOpm_okregowa_komisja_id(int opm_okregowa_komisja_id) {
		this.opm_okregowa_komisja_id = opm_okregowa_komisja_id;
	}

	public int getKodTeryt() {
		return kodTeryt;
	}

	public void setKodTeryt(int kodTeryt) {
		this.kodTeryt = kodTeryt;
	}

	public int getKodObwodu() {
		return kodObwodu;
	}

	public void setKodObwodu(int kodObwodu) {
		this.kodObwodu = kodObwodu;
	}

}
