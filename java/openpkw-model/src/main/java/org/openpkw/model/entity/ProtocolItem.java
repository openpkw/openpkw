package org.openpkw.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. 
 * Edit by Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-06.
 */

@Entity
@Table(name = "opm_pozycje_protokolu")
public class ProtocolItem {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="TrescPozycjiProtokolu")
	private String trescPozycjiProtokolu;
	@Column(name="ProtokolID")
	private int protokolID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrescPozycjiProtokolu() {
		return trescPozycjiProtokolu;
	}
	public void setTrescPozycjiProtokolu(String trescPozycjiProtokolu) {
		this.trescPozycjiProtokolu = trescPozycjiProtokolu;
	}
	public int getProtokolID() {
		return protokolID;
	}
	public void setProtokolID(int protokolID) {
		this.protokolID = protokolID;
	}

	
}
