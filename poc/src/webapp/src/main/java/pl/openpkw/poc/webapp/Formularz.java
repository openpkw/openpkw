package pl.openpkw.poc.webapp;

public class Formularz {

	@FormElement(page = 1, x = 200, y = 750)
	@RequestParameter("kodGminy")
	private String kodTerytorialnyGminy;

	@FormElement(page = 1, x = 480, y = 750)
	@RequestParameter("nrObwodu")
	private String numerObwoduGlosowania;

	@FormElement(page = 1, x = 220, y = 720)
	@RequestParameter("adresOKW")
	private String siedzibaObwodowejKomisjiWyborczej;

	@FormElement(page = 1, x = 110, y = 695)
	@RequestParameter("gmina")
	private String gminaDzielnica;

	@FormElement(page = 1, x = 250, y = 695)
	@RequestParameter
	private String powiat;

	@FormElement(page = 1, x = 440, y = 695)
	@RequestParameter
	private String wojewodztwo;

	@FormElement(page = 1, x = 290, y = 645)
	@RequestParameter
	private String dataGlosowania;

	@FormElement(page = 1, x = 220, y = 625)
	@RequestParameter
	private String dzienMiesiacGlosowania;

	@FormElement(page = 1, x = 305, y = 625)
	@RequestParameter
	private String rokGlosowania;

	@FormElement(page = 1, x = 365, y = 625)
	@RequestParameter
	private String godzinaGlosowaniaOd;

	@FormElement(page = 1, x = 460, y = 625)
	@RequestParameter
	private String godzinaGlosowaniaDo;

	@FormElement(page = 1, x = 420, y = 585)
	@RequestParameter
	private String pole_1_1;

	@FormElement(page = 1, x = 420, y = 535)
	@RequestParameter
	private String pole_1_2;

	@FormElement(page = 1, x = 420, y = 505)
	@RequestParameter
	private String pole_1_3;

	@FormElement(page = 1, x = 420, y = 475)
	@RequestParameter
	private String pole_1_4;

	@FormElement(page = 1, x = 420, y = 425)
	@RequestParameter
	private String pole_1_5;

	@FormElement(page = 1, x = 420, y = 368)
	@RequestParameter
	private String pole_1_6;

	@FormElement(page = 1, x = 420, y = 310)
	@RequestParameter
	private String pole_1_7;

	@FormElement(page = 1, x = 420, y = 280)
	@RequestParameter
	private String pole_1_8;

	@FormElement(page = 1, x = 420, y = 251)
	@RequestParameter
	private String pole_1_8a;

	@FormElement(page = 1, x = 420, y = 222)
	@RequestParameter
	private String pole_1_8b;

	@FormElement(page = 1, x = 420, y = 193)
	@RequestParameter
	private String pole_1_8c;

	@FormElement(page = 1, x = 420, y = 164)
	@RequestParameter
	private String pole_1_8d;

	@FormElement(page = 1, x = 420, y = 135)
	@RequestParameter
	private String pole_1_8e;

	public String getKodTerytorialnyGminy() {
		return kodTerytorialnyGminy;
	}

	public void setKodTerytorialnyGminy(String kodTerytorialnyGminy) {
		this.kodTerytorialnyGminy = kodTerytorialnyGminy;
	}

	public String getNumerObwoduGlosowania() {
		return numerObwoduGlosowania;
	}

	public void setNumerObwoduGlosowania(String numerObwoduGlosowania) {
		this.numerObwoduGlosowania = numerObwoduGlosowania;
	}

	public String getSiedzibaObwodowejKomisjiWyborczej() {
		return siedzibaObwodowejKomisjiWyborczej;
	}

	public void setSiedzibaObwodowejKomisjiWyborczej(String siedzibaObwodowejKomisjiWyborczej) {
		this.siedzibaObwodowejKomisjiWyborczej = siedzibaObwodowejKomisjiWyborczej;
	}

	public String getGminaDzielnica() {
		return gminaDzielnica;
	}

	public void setGminaDzielnica(String gminaDzielnica) {
		this.gminaDzielnica = gminaDzielnica;
	}

	public String getPowiat() {
		return powiat;
	}

	public void setPowiat(String powiat) {
		this.powiat = powiat;
	}

	public String getWojewodztwo() {
		return wojewodztwo;
	}

	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}

	public String getDataGlosowania() {
		return dataGlosowania;
	}

	public void setDataGlosowania(String dataGlosowania) {
		this.dataGlosowania = dataGlosowania;
	}

	public String getDzienMiesiacGlosowania() {
		return dzienMiesiacGlosowania;
	}

	public void setDzienMiesiacGlosowania(String dzienMiesiacGlosowania) {
		this.dzienMiesiacGlosowania = dzienMiesiacGlosowania;
	}

	public String getRokGlosowania() {
		return rokGlosowania;
	}

	public void setRokGlosowania(String rokGlosowania) {
		this.rokGlosowania = rokGlosowania;
	}

	public String getGodzinaGlosowaniaOd() {
		return godzinaGlosowaniaOd;
	}

	public void setGodzinaGlosowaniaOd(String godzinaGlosowaniaOd) {
		this.godzinaGlosowaniaOd = godzinaGlosowaniaOd;
	}

	public String getGodzinaGlosowaniaDo() {
		return godzinaGlosowaniaDo;
	}

	public void setGodzinaGlosowaniaDo(String godzinaGlosowaniaDo) {
		this.godzinaGlosowaniaDo = godzinaGlosowaniaDo;
	}

	public String getPole_1_1() {
		return pole_1_1;
	}

	public void setPole_1_1(String pole_1_1) {
		this.pole_1_1 = pole_1_1;
	}

	public String getPole_1_2() {
		return pole_1_2;
	}

	public void setPole_1_2(String pole_1_2) {
		this.pole_1_2 = pole_1_2;
	}

	public String getPole_1_3() {
		return pole_1_3;
	}

	public void setPole_1_3(String pole_1_3) {
		this.pole_1_3 = pole_1_3;
	}

	public String getPole_1_4() {
		return pole_1_4;
	}

	public void setPole_1_4(String pole_1_4) {
		this.pole_1_4 = pole_1_4;
	}

	public String getPole_1_5() {
		return pole_1_5;
	}

	public void setPole_1_5(String pole_1_5) {
		this.pole_1_5 = pole_1_5;
	}

	public String getPole_1_6() {
		return pole_1_6;
	}

	public void setPole_1_6(String pole_1_6) {
		this.pole_1_6 = pole_1_6;
	}

	public String getPole_1_7() {
		return pole_1_7;
	}

	public void setPole_1_7(String pole_1_7) {
		this.pole_1_7 = pole_1_7;
	}

	public String getPole_1_8() {
		return pole_1_8;
	}

	public void setPole_1_8(String pole_1_8) {
		this.pole_1_8 = pole_1_8;
	}

	public String getPole_1_8a() {
		return pole_1_8a;
	}

	public void setPole_1_8a(String pole_1_8a) {
		this.pole_1_8a = pole_1_8a;
	}

	public String getPole_1_8b() {
		return pole_1_8b;
	}

	public void setPole_1_8b(String pole_1_8b) {
		this.pole_1_8b = pole_1_8b;
	}

	public String getPole_1_8c() {
		return pole_1_8c;
	}

	public void setPole_1_8c(String pole_1_8c) {
		this.pole_1_8c = pole_1_8c;
	}

	public String getPole_1_8d() {
		return pole_1_8d;
	}

	public void setPole_1_8d(String pole_1_8d) {
		this.pole_1_8d = pole_1_8d;
	}

	public String getPole_1_8e() {
		return pole_1_8e;
	}

	public void setPole_1_8e(String pole_1_8e) {
		this.pole_1_8e = pole_1_8e;
	}
}