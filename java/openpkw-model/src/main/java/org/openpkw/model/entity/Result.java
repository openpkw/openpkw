package org.openpkw.model.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Łukasz Franczuk (luk.franczuk@gmail.com) on 2015-08-05. 
 * Edit by Jacek Feliksiak (jacekfeliksiak@gmail.com) on 2015-08-07.
 */

@Entity
@Table(name = "opm_wynik")
public class Result {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
			
	@Column(name="WynikOdpowiedzi")
	private String answerId;
	
	@Column(name="StepelCzasowy")
	private Date timeMark;
	
	@Column(name="OpmUserId")
	@OneToOne
	@JoinColumn(name="id")
	private User user;
	
	@Column(name="PytanieId")
	@OneToOne
	@JoinColumn(name="id")
	private ProtocolItem protocolItem;
	
	@Column(name="opm_obwodowa_komisja_id")
	@OneToOne
	@JoinColumn(name="id")
	private PeripheralCommittee peripheralCommittee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public Date getTimeMark() {
		return timeMark;
	}

	public void setTimeMark(Date timeMark) {
		this.timeMark = timeMark;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ProtocolItem getProtocolItem() {
		return protocolItem;
	}

	public void setProtocolItem(ProtocolItem protocolItem) {
		this.protocolItem = protocolItem;
	}

	public PeripheralCommittee getPeripheralCommittee() {
		return peripheralCommittee;
	}

	public void setPeripheralCommittee(PeripheralCommittee peripheralCommittee) {
		this.peripheralCommittee = peripheralCommittee;
	}

}
