#OR code - REFERENDUM jednodniowe

**Założenia:**  
- podstawą obliczeń jest protokół zgodny z:  
* UCHWAŁA PAŃSTWOWEJ KOMISJI WYBORCZEJ z dnia 6 lipca 2015 r. w sprawie wzorów protokołów głosowania {...} ([M.P. 2015 skierowane do publikacji]  (http://referendum2015.pkw.gov.pl/akty_prawne/0/12_UCHWALA_PANSTWOWEJ_KOMISJI_WYBORCZEJ_z_dnia_6_lipca_2015_r_w_sprawie_wzorow_protokolow_glosowania_i_protokolow_o_wyniku_referendum_stosowanych_w_referendum_ogolnokrajowym_przez_obwodowe_komisje_do_spraw_referendum_komisarzy_wyborczych_oraz_Panstwowa_Komisje_Wyborcza))  
Protokół Obwodowej Komisji ds. Referendum [wzór protokołu] (http://referendum2015.pkw.gov.pl/pliki/1436263547_Za%C5%82%C4%85cznik%20nr%201.docx)  
- maksymalna przewidziana (możliwa) do wprowadzenia liczba znaków w każdej pozycji protokołu
- jeden znak rozdzielający grupy cyfr (np. ";")
- liczba (nie cyfra!) "0" zajmuje jeden znak (możemy rozważyć wprowadzenia zasady znaku pustego "" zamiast liczby "0", który automatycznie będzie wypełniany po zeskanowaniu liczbą "0")  

**Nagłówek:**  
TERYT – 6 znaków +1 rozdzielający  
Nr obwodu – 4 znaki +1 rozdzielający  

**Rozliczenie kart:**  
1.	Uprawnieni do głosowania - 5 znaków +1 rozdzielający  
2.	Otrzymane karty do głosowania  - 5 znaków +1 rozdzielający  
3.	Niewykorzystane karty  - 5 znaków +1 rozdzielający  
4.	Wydano kart do głosowania  - 5 znaków +1 rozdzielający  
5.	Głosujący przez pełnomocnika  - 5 znaków +1 rozdzielający  
6.	Głosujący na podstawie zaświadczenia - 5 znaków +1 rozdzielający  

**Rozliczenie głosowania korespondencyjnego:**  
7.	Wydano pakietów - 5 znaków +1 rozdzielający  
8.	Otrzymano koperty zwrotne - 5 znaków +1 rozdzielający  
8a. Brak oświadczenia - 5 znaków +1 rozdzielający  
8b. Brak podpisu na oświadczeniu - 5 znaków +1 rozdzielający  
8c. Brak koperty na kartę do głosowania - 5 znaków +1 rozdzielający  
8d. Niezaklejona koperta na kartę do głosowania - 5 znaków +1 rozdzielający  
8e. Koperty na kartę do głosowania wrzucone do urny - 5 znaków +1 rozdzielający  

**Ustalenia wyników**  
9.	Karty wyjęte z urny - 5 znaków +1 rozdzielający  
9a. liczba kart z kopert na kartę do głosowania - 5 znaków +1 rozdzielający  
10.	Karty nieważne - 5 znaków +1 rozdzielający  
11.	Karty ważne - 5 znaków +1 rozdzielający  
12.	Głosy nieważne - 5 znaków +1 rozdzielający  
13.	Głosy ważne - 5 znaków +1 rozdzielający  

**Pytanie Nr 1**  
14a. Liczba głosów pozytywnych TAK - 5 znaków +1 rozdzielający  
14b. Liczba głosów negatywnych NIE - 5 znaków +1 rozdzielający  

**Pytanie Nr 2**  
14a. Liczba głosów pozytywnych TAK - 5 znaków +1 rozdzielający  
14b. Liczba głosów negatywnych NIE - 5 znaków +1 rozdzielający  

**Pytanie Nr 3**  
14a. Liczba głosów pozytywnych TAK - 5 znaków +1 rozdzielający  
14b. Liczba głosów negatywnych NIE - 5 znaków +1 rozdzielający  

**Uwagi i adnotacje**  
15. wartość „0” – brak uwag; wartość „1” – na protokole występują wyjaśnienia - 1 znak +1 rozdzielający  
16. wartość „0” – brak uwag; wartość „1” – na protokole występują wyjaśnienia - 1 znak +1 rozdzielający  
17. wartość „0” – brak uwag; wartość „1” – na protokole występują wyjaśnienia - 1 znak +1 rozdzielający  
18. wartość „0” – brak zarządzeń; wartość „1” – na protokole odnotowano zarządzenia - 1 znak +1 rozdzielający  
19. wartość „0” – brak zarzutów; wartość „1” – „brak mężów zaufania”; wartość „2” - na protokole odnotowano zarzuty mężów zaufania - 1 znak +1 rozdzielający  
20. wartość „0” – brak zarzutów; wartość „1” –  na protokole odnotowano zarzuty członków komisji - 1 znak +1 rozdzielający  
21. wartość „0” – brak uwag; wartość „1” - na protokole odnotowano uwagi - 1 znak +1 rozdzielający  

**Podpisy członków komisji**
– 9 razy: jest podpis wartość „1” lub brak podpisu wartość „0” - 9 znaków +9 rozdzielających  

**Łącznie cały string równa się: 194 znaki**
