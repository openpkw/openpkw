function validate() {

	try {
		var liczba_osob_meldunek = getInt("liczba_wyborcow", "Liczba wyborców w obwodzie");
		var pole_1_1 = getInt("liczba_1_1", "Liczba wyborców uprawnionych do głosowania");
		var pole_1_2 = getInt("liczba_1_2", "Komisja otrzymała kart do głosowania");
		var pole_1_3 = getInt("liczba_1_3", "Nie wykorzystano kart do głosowania");
		var pole_1_4 = getInt("liczba_1_4", "Liczba wyborców, którym wydano karty do głosowania");
		var pole_1_5 = getInt("liczba_1_5", "Liczba wyborców głosujących przez pełnomocnika");
		var pole_1_6 = getInt("liczba_1_6", "Liczba wyborców głosujących na podstawie zaświadczenia o prawie do głosowania");
		var pole_1_7 = getInt("liczba_1_7", "Liczba wyborców, którym wysłano pakiety wyborcze");
		var pole_1_8 = getInt("liczba_1_8", "Liczba otrzymanych kopert zwrotnych");
		var pole_1_8_a = getInt("liczba_1_8_a", "Liczba kopert zwrotnych, w których nie było oświadczenia o osobistym i tajnym oddaniu głosu");
		var pole_1_8_b = getInt("liczba_1_8_b", "Liczba kopert zwrotnych, w których oświadczenie nie było podpisane przez wyborcę");
		var pole_1_8_c = getInt("liczba_1_8_c", "Liczba kopert zwrotnych, w których nie było koperty na kartę do głosowania");
		var pole_1_8_d = getInt("liczba_1_8_d", "Liczba kopert zwrotnych, w których znajdowała się niezaklejona koperta na kartę do głosowania");
		var pole_1_8_e = getInt("liczba_1_8_e", "Liczba kopert na kartę do głosowania wrzuconych do urny");

		var dopuszczalny_blad = liczba_osob_meldunek / 10;
		var roznica = Math.abs(liczba_osob_meldunek - pole_1_1);

		check(roznica < dopuszczalny_blad, "Liczba wyborców uprawnionych do głosowania jest różna od liczby osób z ostatniego meldunku wyborczego ("+liczba_osob_meldunek+") o wiecej niż 10%.");

		var min_liczba_kart = 0.8 * pole_1_1;
		check(pole_1_2 >= min_liczba_kart, "Liczba otrzymanych kart do głosowania jest mniejsza, niż 80% liczby wyborów uprawnionych do głosowania.");

		var suma = parseInt(pole_1_3) + parseInt(pole_1_4);

		check(suma == pole_1_2, "Suma liczb z pkt. 3 i 4 powinna być równa liczbie z pkt. 2. Jeśli tak nie jest, przypuszczalną przyczynę należy opisać w pkt. 15.");

		check(pole_1_8 <= pole_1_7, "Liczba z pkt. 8 nie może być większa od liczby z pkt. 7.");

		var suma_pole_8a_8e = parseInt(pole_1_8_a) + parseInt(pole_1_8_b) + parseInt(pole_1_8_c) + parseInt(pole_1_8_d) + parseInt(pole_1_8_e);

		check(suma_pole_8a_8e <= parseInt(pole_1_8), "Suma liczba z pkt. 8a–8e nie może być większa od liczby z pkt. 8");

	} catch (err) {
		alert(err);
		return;
	}

	alert("Jest OK!");
}

function check(result, errorMessage) {
	if (!result) {
		throw errorMessage;
	}
}

function getInt(elementId, elementName) {
	var element = document.getElementById(elementId);
	if (!isInt(element.value)) {
		throw ("Wartość w polu ["+elementName+"] musi być liczbą całkowitą.");
	}
	return element.value;
}

function isInt(n) {
  return !isNaN(parseInt(n)) && isFinite(n) && parseInt(n) == n.toString();
}

function isNumber(n) {
  return !isNaN(parseFloat(n)) && isFinite(n);
}