package org.openpkw.model.entity;

import java.sql.Timestamp;

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
@Table(name = "opm_wynik")
public class Result {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="PytanieId")
	private int pytanieId;
	private int opm_obwodowa_komisja_id;
	@Column(name="WynikOdpowiedzi")
	private String wynikOdpowiedzi;
	@Column(name="StepelCzasowy")
	private Timestamp stepelCzasowy;
	@Column(name="OpmUserId")
	private int opmUserId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPytanieId() {
		return pytanieId;
	}

	public void setPytanieId(int pytanieId) {
		this.pytanieId = pytanieId;
	}

	public int getOpm_obwodowa_komisja_id() {
		return opm_obwodowa_komisja_id;
	}

	public void setOpm_obwodowa_komisja_id(int opm_obwodowa_komisja_id) {
		this.opm_obwodowa_komisja_id = opm_obwodowa_komisja_id;
	}

	public String getWynikOdpowiedzi() {
		return wynikOdpowiedzi;
	}

	public void setWynikOdpowiedzi(String wynikOdpowiedzi) {
		this.wynikOdpowiedzi = wynikOdpowiedzi;
	}

	public Timestamp getStepelCzasowy() {
		return stepelCzasowy;
	}

	public void setStepelCzasowy(Timestamp stepelCzasowy) {
		this.stepelCzasowy = stepelCzasowy;
	}

	public int getOpmUserId() {
		return opmUserId;
	}

	public void setOpmUserId(int opmUserId) {
		this.opmUserId = opmUserId;
	}

}
