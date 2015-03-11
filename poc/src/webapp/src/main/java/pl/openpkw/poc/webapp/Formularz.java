package pl.openpkw.poc.webapp;

import java.text.DecimalFormat;

public class Formularz {
	
	private DecimalFormat df = new DecimalFormat("0");
	
	private String formatString(String numberStr) {
		if (numberStr == null) {
			return "";
		}
		if (numberStr.length() == 0) {
			return "";
		}
		
		long number = 0;
		try {
			number = Long.parseLong(numberStr);
		} catch (Exception ex) {
			return "B³¹d: "+numberStr;
		}
		
		String formattedNumber = df.format(number);
		
		while (formattedNumber.length() < 5) {
			formattedNumber = "*" + formattedNumber;
		}
		
		String wideNumber = "";
		for (int i = 0; i < formattedNumber.length(); i++) {
			wideNumber += formattedNumber.charAt(i)+"    ";
		}
		
		return wideNumber;
	}

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
	
	@RequestParameter
	private String pole_2_9;
	
	@RequestParameter
	private String pole_2_9a;
	
	@RequestParameter
	private String pole_2_10;
	
	@RequestParameter
	private String pole_2_11;
	
	@RequestParameter
	private String pole_2_12;
	
	@RequestParameter
	private String pole_2_13;
	
	@RequestParameter
	private String kandydat_1_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_2_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_3_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_4_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_5_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_6_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_7_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_8_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_9_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_10_imiona_i_nazwisko;
	
	@RequestParameter
	private String kandydat_1_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_2_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_3_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_4_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_5_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_6_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_7_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_8_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_9_liczba_glosow_waznych;
	
	@RequestParameter
	private String kandydat_10_liczba_glosow_waznych;
	
	@RequestParameter
	private String suma_glosow_waznych;
	
	@RequestParameter
	private String uwagi_3_15;
	
	@RequestParameter
	private String uwagi_3_16;
	
	@RequestParameter
	private String uwagi_3_17;
	
	@RequestParameter
	private String uwagi_3_18;
	
	@RequestParameter
	private String uwagi_3_19;
	
	@RequestParameter
	private String uwagi_3_20;
	
	@RequestParameter
	private String uwagi_3_21;
	
	@RequestParameter
	private String czlonek_01;

	@RequestParameter
	private String czlonek_02;

	@RequestParameter
	private String czlonek_03;

	@RequestParameter
	private String czlonek_04;

	@RequestParameter
	private String czlonek_05;

	@RequestParameter
	private String czlonek_06;

	@RequestParameter
	private String czlonek_07;

	@RequestParameter
	private String czlonek_08;

	@RequestParameter
	private String czlonek_09;

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
		return formatString(pole_1_1);
	}

	public void setPole_1_1(String pole_1_1) {
		this.pole_1_1 = pole_1_1;
	}

	public String getPole_1_2() {
		return formatString(pole_1_2);
	}

	public void setPole_1_2(String pole_1_2) {
		this.pole_1_2 = pole_1_2;
	}

	public String getPole_1_3() {
		return formatString(pole_1_3);
	}

	public void setPole_1_3(String pole_1_3) {
		this.pole_1_3 = pole_1_3;
	}

	public String getPole_1_4() {
		return formatString(pole_1_4);
	}

	public void setPole_1_4(String pole_1_4) {
		this.pole_1_4 = pole_1_4;
	}

	public String getPole_1_5() {
		return formatString(pole_1_5);
	}

	public void setPole_1_5(String pole_1_5) {
		this.pole_1_5 = pole_1_5;
	}

	public String getPole_1_6() {
		return formatString(pole_1_6);
	}

	public void setPole_1_6(String pole_1_6) {
		this.pole_1_6 = pole_1_6;
	}

	public String getPole_1_7() {
		return formatString(pole_1_7);
	}

	public void setPole_1_7(String pole_1_7) {
		this.pole_1_7 = pole_1_7;
	}

	public String getPole_1_8() {
		return formatString(pole_1_8);
	}

	public void setPole_1_8(String pole_1_8) {
		this.pole_1_8 = pole_1_8;
	}

	public String getPole_1_8a() {
		return formatString(pole_1_8a);
	}

	public void setPole_1_8a(String pole_1_8a) {
		this.pole_1_8a = pole_1_8a;
	}

	public String getPole_1_8b() {
		return formatString(pole_1_8b);
	}

	public void setPole_1_8b(String pole_1_8b) {
		this.pole_1_8b = pole_1_8b;
	}

	public String getPole_1_8c() {
		return formatString(pole_1_8c);
	}

	public void setPole_1_8c(String pole_1_8c) {
		this.pole_1_8c = pole_1_8c;
	}

	public String getPole_1_8d() {
		return formatString(pole_1_8d);
	}

	public void setPole_1_8d(String pole_1_8d) {
		this.pole_1_8d = pole_1_8d;
	}

	public String getPole_1_8e() {
		return formatString(pole_1_8e);
	}

	public void setPole_1_8e(String pole_1_8e) {
		this.pole_1_8e = pole_1_8e;
	}

	public String getPole_2_9() {
		return formatString(pole_2_9);
	}

	public void setPole_2_9(String pole_2_9) {
		this.pole_2_9 = pole_2_9;
	}

	public String getPole_2_9a() {
		return formatString(pole_2_9a);
	}

	public void setPole_2_9a(String pole_2_9a) {
		this.pole_2_9a = pole_2_9a;
	}

	public String getPole_2_10() {
		return formatString(pole_2_10);
	}

	public void setPole_2_10(String pole_2_10) {
		this.pole_2_10 = pole_2_10;
	}

	public String getPole_2_11() {
		return formatString(pole_2_11);
	}

	public void setPole_2_11(String pole_2_11) {
		this.pole_2_11 = pole_2_11;
	}

	public String getPole_2_12() {
		return formatString(pole_2_12);
	}

	public void setPole_2_12(String pole_2_12) {
		this.pole_2_12 = pole_2_12;
	}

	public String getPole_2_13() {
		return formatString(pole_2_13);
	}

	public void setPole_2_13(String pole_2_13) {
		this.pole_2_13 = pole_2_13;
	}

	public String getKandydat_1_imiona_i_nazwisko() {
		return kandydat_1_imiona_i_nazwisko;
	}

	public void setKandydat_1_imiona_i_nazwisko(String kandydat_1_imiona_i_nazwisko) {
		this.kandydat_1_imiona_i_nazwisko = kandydat_1_imiona_i_nazwisko;
	}

	public String getKandydat_2_imiona_i_nazwisko() {
		return kandydat_2_imiona_i_nazwisko;
	}

	public void setKandydat_2_imiona_i_nazwisko(String kandydat_2_imiona_i_nazwisko) {
		this.kandydat_2_imiona_i_nazwisko = kandydat_2_imiona_i_nazwisko;
	}

	public String getKandydat_3_imiona_i_nazwisko() {
		return kandydat_3_imiona_i_nazwisko;
	}

	public void setKandydat_3_imiona_i_nazwisko(String kandydat_3_imiona_i_nazwisko) {
		this.kandydat_3_imiona_i_nazwisko = kandydat_3_imiona_i_nazwisko;
	}

	public String getKandydat_4_imiona_i_nazwisko() {
		return kandydat_4_imiona_i_nazwisko;
	}

	public void setKandydat_4_imiona_i_nazwisko(String kandydat_4_imiona_i_nazwisko) {
		this.kandydat_4_imiona_i_nazwisko = kandydat_4_imiona_i_nazwisko;
	}

	public String getKandydat_5_imiona_i_nazwisko() {
		return kandydat_5_imiona_i_nazwisko;
	}

	public void setKandydat_5_imiona_i_nazwisko(String kandydat_5_imiona_i_nazwisko) {
		this.kandydat_5_imiona_i_nazwisko = kandydat_5_imiona_i_nazwisko;
	}

	public String getKandydat_6_imiona_i_nazwisko() {
		return kandydat_6_imiona_i_nazwisko;
	}

	public void setKandydat_6_imiona_i_nazwisko(String kandydat_6_imiona_i_nazwisko) {
		this.kandydat_6_imiona_i_nazwisko = kandydat_6_imiona_i_nazwisko;
	}

	public String getKandydat_7_imiona_i_nazwisko() {
		return kandydat_7_imiona_i_nazwisko;
	}

	public void setKandydat_7_imiona_i_nazwisko(String kandydat_7_imiona_i_nazwisko) {
		this.kandydat_7_imiona_i_nazwisko = kandydat_7_imiona_i_nazwisko;
	}

	public String getKandydat_8_imiona_i_nazwisko() {
		return kandydat_8_imiona_i_nazwisko;
	}

	public void setKandydat_8_imiona_i_nazwisko(String kandydat_8_imiona_i_nazwisko) {
		this.kandydat_8_imiona_i_nazwisko = kandydat_8_imiona_i_nazwisko;
	}

	public String getKandydat_9_imiona_i_nazwisko() {
		return kandydat_9_imiona_i_nazwisko;
	}

	public void setKandydat_9_imiona_i_nazwisko(String kandydat_9_imiona_i_nazwisko) {
		this.kandydat_9_imiona_i_nazwisko = kandydat_9_imiona_i_nazwisko;
	}

	public String getKandydat_10_imiona_i_nazwisko() {
		return kandydat_10_imiona_i_nazwisko;
	}

	public void setKandydat_10_imiona_i_nazwisko(String kandydat_10_imiona_i_nazwisko) {
		this.kandydat_10_imiona_i_nazwisko = kandydat_10_imiona_i_nazwisko;
	}

	public String getKandydat_1_liczba_glosow_waznych() {
		return formatString(kandydat_1_liczba_glosow_waznych);
	}

	public void setKandydat_1_liczba_glosow_waznych(String kandydat_1_liczba_glosow_waznych) {
		this.kandydat_1_liczba_glosow_waznych = kandydat_1_liczba_glosow_waznych;
	}

	public String getKandydat_2_liczba_glosow_waznych() {
		return formatString(kandydat_2_liczba_glosow_waznych);
	}

	public void setKandydat_2_liczba_glosow_waznych(String kandydat_2_liczba_glosow_waznych) {
		this.kandydat_2_liczba_glosow_waznych = kandydat_2_liczba_glosow_waznych;
	}

	public String getKandydat_3_liczba_glosow_waznych() {
		return formatString(kandydat_3_liczba_glosow_waznych);
	}

	public void setKandydat_3_liczba_glosow_waznych(String kandydat_3_liczba_glosow_waznych) {
		this.kandydat_3_liczba_glosow_waznych = kandydat_3_liczba_glosow_waznych;
	}

	public String getKandydat_4_liczba_glosow_waznych() {
		return formatString(kandydat_4_liczba_glosow_waznych);
	}

	public void setKandydat_4_liczba_glosow_waznych(String kandydat_4_liczba_glosow_waznych) {
		this.kandydat_4_liczba_glosow_waznych = kandydat_4_liczba_glosow_waznych;
	}

	public String getKandydat_5_liczba_glosow_waznych() {
		return formatString(kandydat_5_liczba_glosow_waznych);
	}

	public void setKandydat_5_liczba_glosow_waznych(String kandydat_5_liczba_glosow_waznych) {
		this.kandydat_5_liczba_glosow_waznych = kandydat_5_liczba_glosow_waznych;
	}

	public String getKandydat_6_liczba_glosow_waznych() {
		return formatString(kandydat_6_liczba_glosow_waznych);
	}

	public void setKandydat_6_liczba_glosow_waznych(String kandydat_6_liczba_glosow_waznych) {
		this.kandydat_6_liczba_glosow_waznych = kandydat_6_liczba_glosow_waznych;
	}

	public String getKandydat_7_liczba_glosow_waznych() {
		return formatString(kandydat_7_liczba_glosow_waznych);
	}

	public void setKandydat_7_liczba_glosow_waznych(String kandydat_7_liczba_glosow_waznych) {
		this.kandydat_7_liczba_glosow_waznych = kandydat_7_liczba_glosow_waznych;
	}

	public String getKandydat_8_liczba_glosow_waznych() {
		return formatString(kandydat_8_liczba_glosow_waznych);
	}

	public void setKandydat_8_liczba_glosow_waznych(String kandydat_8_liczba_glosow_waznych) {
		this.kandydat_8_liczba_glosow_waznych = kandydat_8_liczba_glosow_waznych;
	}

	public String getKandydat_9_liczba_glosow_waznych() {
		return formatString(kandydat_9_liczba_glosow_waznych);
	}

	public void setKandydat_9_liczba_glosow_waznych(String kandydat_9_liczba_glosow_waznych) {
		this.kandydat_9_liczba_glosow_waznych = kandydat_9_liczba_glosow_waznych;
	}

	public String getKandydat_10_liczba_glosow_waznych() {
		return formatString(kandydat_10_liczba_glosow_waznych);
	}

	public void setKandydat_10_liczba_glosow_waznych(String kandydat_10_liczba_glosow_waznych) {
		this.kandydat_10_liczba_glosow_waznych = kandydat_10_liczba_glosow_waznych;
	}

	public String getSuma_glosow_waznych() {
		return formatString(suma_glosow_waznych);
	}

	public void setSuma_glosow_waznych(String suma_glosow_waznych) {
		this.suma_glosow_waznych = suma_glosow_waznych;
	}

	public String getUwagi_3_15() {
		return uwagi_3_15;
	}

	public void setUwagi_3_15(String uwagi_3_15) {
		this.uwagi_3_15 = uwagi_3_15;
	}

	public String getUwagi_3_16() {
		return uwagi_3_16;
	}

	public void setUwagi_3_16(String uwagi_3_16) {
		this.uwagi_3_16 = uwagi_3_16;
	}

	public String getUwagi_3_17() {
		return uwagi_3_17;
	}

	public void setUwagi_3_17(String uwagi_3_17) {
		this.uwagi_3_17 = uwagi_3_17;
	}

	public String getUwagi_3_18() {
		return uwagi_3_18;
	}

	public void setUwagi_3_18(String uwagi_3_18) {
		this.uwagi_3_18 = uwagi_3_18;
	}

	public String getUwagi_3_19() {
		return uwagi_3_19;
	}

	public void setUwagi_3_19(String uwagi_3_19) {
		this.uwagi_3_19 = uwagi_3_19;
	}

	public String getUwagi_3_20() {
		return uwagi_3_20;
	}

	public void setUwagi_3_20(String uwagi_3_20) {
		this.uwagi_3_20 = uwagi_3_20;
	}

	public String getUwagi_3_21() {
		return uwagi_3_21;
	}

	public void setUwagi_3_21(String uwagi_3_21) {
		this.uwagi_3_21 = uwagi_3_21;
	}

	public String getCzlonek_01() {
		return czlonek_01;
	}

	public void setCzlonek_01(String czlonek_01) {
		this.czlonek_01 = czlonek_01;
	}

	public String getCzlonek_02() {
		return czlonek_02;
	}

	public void setCzlonek_02(String czlonek_02) {
		this.czlonek_02 = czlonek_02;
	}

	public String getCzlonek_03() {
		return czlonek_03;
	}

	public void setCzlonek_03(String czlonek_03) {
		this.czlonek_03 = czlonek_03;
	}

	public String getCzlonek_04() {
		return czlonek_04;
	}

	public void setCzlonek_04(String czlonek_04) {
		this.czlonek_04 = czlonek_04;
	}

	public String getCzlonek_05() {
		return czlonek_05;
	}

	public void setCzlonek_05(String czlonek_05) {
		this.czlonek_05 = czlonek_05;
	}

	public String getCzlonek_06() {
		return czlonek_06;
	}

	public void setCzlonek_06(String czlonek_06) {
		this.czlonek_06 = czlonek_06;
	}

	public String getCzlonek_07() {
		return czlonek_07;
	}

	public void setCzlonek_07(String czlonek_07) {
		this.czlonek_07 = czlonek_07;
	}

	public String getCzlonek_08() {
		return czlonek_08;
	}

	public void setCzlonek_08(String czlonek_08) {
		this.czlonek_08 = czlonek_08;
	}

	public String getCzlonek_09() {
		return czlonek_09;
	}

	public void setCzlonek_09(String czlonek_09) {
		this.czlonek_09 = czlonek_09;
	}
}