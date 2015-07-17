#OR code - wybory do Sejmu 2015 r.

**Założenia:**  
- W związku z brakiem aktualnej uchwały PKW z zaktualizowanym protokołem Obwodowej Komisji do obliczeń użyto protokół zgodny z:  
uchwałą Państwowej Komisji z dnia 11 lipca 2011 r. w sprawie wzorów protokołów głosowania i protokołów z wyborów stosowanych w wyborach do Sejmu Rzeczypospolitej Polskiej i do Senatu Rzeczypospolitej Polskiej ([M.P. Nr 69, poz. 682] (http://isap.sejm.gov.pl/DetailsServlet?id=WMP20110690682), zmiana: [Nr 84, poz. 878] (http://isap.sejm.gov.pl/DetailsServlet?id=WMP20110840878)),  
**uzupełniony o moduł rozliczenia głosowania korespondencyjnego.**
- maksymalna przewidziana (możliwa) do wprowadzenia liczba znaków w każdej pozycji protokołu
- jeden znak rozdzielający grupy cyfr (np. ";")
- liczba (nie cyfra!) "0" zajmuje jeden znak (możemy rozważyć wprowadzenia zasady znaku pustego "" zamiast liczby "0", który automatycznie będzie wypełniany po zeskanowaniu liczbą "0")  
- 20 Komitetów wyborczych zgłaszajcych listy kandydatów w każdym okręgu (w 2011 r. było 11)  
- 40 kandydatów na jednej licie (Warszawa: 20 mandatów x 2 kandydatów na 1 miejsce z każdej listy - w 2011 było maksymalnie 292 kandydatów w okręgu 16 mandatowym)

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

**Lista kandydatów - pkt. 10 protokołu z 2011 r.**  
20 razy:  
Liczba głosów na listę: Nr listy - 2 znaki + 1 znak rozdzielajcy - 5 znaków +1 rozdzielający  
Kandydat: 40 razy wartość: Nr listy - 2 znaki + 1 znak rozdzielajcy - Nr kandydata - 2 znaki + 1 znak rozdzielający - Liczba głosów na kandydata - 5 znaków + 1 znak rozdzielający  
RAZEM - Nr listy - 2 znaki + 1 znak rozdzielajcy - 5 znaków + 1 znak rozdzielający  

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

**Łącznie cały string równa się: 10.118 znaków**
