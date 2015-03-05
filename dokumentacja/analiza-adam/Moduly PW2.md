# Przegląd modułów rozpisanych w ramach PW2 


## M1: Podział na obwody głosowania 
podział gminy na obwody głosowania  


## M2: Geografia okręgów wyborczych 
podział na okręgi wyborcze

Moduły 1 i 2 maja zapewnić:
* zarządzanie projektami podziału
* zatwierdzanie decyzji (coś w rodzaju Workflow)
* działać na podstawie
  * systemu PESEL
  * system ewidencji ludności
  * słowników podziału kraju 
* archiwizować dane
* Zapewnić funkcje import / eksport na bazie XML  

(podziału gminy na okręgi i obwody głosowania dokonuje Rada Gminy na wniosek w/b/p,  
na tej samej zasadzie dokonywane są zmiany w podziale gminy. PKW po otrzymaniu stosownej uchwały Rady  
nie może jej zmienić/zatwierdzić itp.  
IMO te moduły przechowują i archiwizują (na szczeblu PKW) powyższe podziały i historię zmian oraz  
udostępniają dane do tworzenia plików .klk z geografią wyborczą.)

## M3: Meldunek kwartalny i przedwyborczy
Bardzo kiepski opis.
Meldunek kwartalny?
Meldunek przedwyborczy?

(W każdej gminie znajduje sie pracownik odpowiedzialny za prowadzenie Stałego Rejestru Wyborców.  
Na jego podstawie co kwartał zobowiązany jest do wygenerowania raportu, gdzie informuje PKW  
o ilości w każdym okręgu i obwodzie głosowania: wszystkich mieszkańców, oraz ilości uprawnionych do głosowania.  
W piątek (przed niedzielą wyborczą) dodatkowo składa się identyczny raport (jak kwartalny) i zwię się  
on raportem przedwyborczym.  
Ten raport przedwyborczy służy do stworzenia odpowiedniego pliku .klk)  

## M4: Słowniki podziału terytorialnego
W każdych wyborach mamy do czynienia z innym podziałem kraju na okręgi wyborcze. Celem tego modułu jest odzwierciedlenie tego wirtualnego podziału państwa w celu realizacji konkretnych wyborów. 

Okręgi wyborcze:  
[SEJM](http://pl.wikipedia.org/wiki/Polskie_okr%C4%99gi_wyborcze#mediaviewer/File:Sejm_RP_okr%C4%99gi.svg)  
[SENAT](http://pl.wikipedia.org/wiki/Polskie_okr%C4%99gi_wyborcze#mediaviewer/File:Senat_RP_okr%C4%99gi.svg)  
[EUROPARLAMENT](http://pl.wikipedia.org/wiki/Polskie_okr%C4%99gi_wyborcze#mediaviewer/File:European_Parliament_constituencies_Poland.svg)  
SEJMIK WOJEWÓDZKI - każde województwo podzielone na różną ilość okręgów (od 4 do 7).  
(UWAGA Miasto stołeczne Warszawa to 3 okręgi wyborcze + 4 okregi poza miejskie)  
POWIATY - każda gmina (wchodząca w skład powiatu) stanowi jeden okręg wyborczy.  
(UWAGA M.st. Warszawa jest gminą na prawach powiatu złożonym z 18 dzielnic.  
Jednak Okręgów wyborczych jest 9.)  
GMINA - każda gmina podzielona na różną ilość okręgów.  
(UWAGA dzielnice (18) Warszawy są gminą na prawach powiatu.)  

"Gminny okręg wyborczy" jest podzielony na obwody wyborcze:  
obwód wyborczy definiujemy od 500 do 3000 mieszkańców. 

- Czy chodzi tutaj o nową wersję systemu TERYT? 
    - Nie


## M5: Słownik instytucji wybieranych
Baza wszelkich instytucji (pozycji na wszystkich szczeblach władzy: Prezydent, Sejm, Senat, Sejmik,  
Rada, w/b/p itp.) które są do obsadzenia.
Funkcjonalność na poziomie PKW,

## M6: Baza obsady instytucji
Kto kiedy sprawował jaką pozycję.
dostęp dla komisarza wyborczego PKW do swojego okręgu 

## M7: Terminarz akcji wyborczych
Typowy kalendarz, dużo szablonów itp.
Podpunkt e jest dość dziwny, dotyczy walidacji a jednocześnie jest ściśle połączony z modułem 5. Na poziomie PKW. 

## M8: Centralny rejestr osób

## M9: Informacje dodatkowe dla rejestru
Jak dla mnie to 8 i 9 to jeden wielki znak zapytania.

## M10: Baza organów wyborczych
Definicja organu wyborczego?

Odp:
Organ wyborczy – instytucja odpowiedzialna za zorganizowanie, przygotowanie i przeprowadzenie  
powszechnego głosowania w ramach wyborów (lub odpowiednio referendów), w tym ustalenie ich wyników.  

W Polsce organami wyborczymi są:  

stałe organy wyborcze, powołane na określoną kadencję:  
Państwowa Komisja Wyborcza  
komisarze wyborczy  

doraźne komisje wyborcze, powoływane do przeprowadzenia konkretnych wyborów lub referendów i rozwiązywane po wykonaniu ich ustawowych zadań:
okręgowe komisje wyborcze (w wyborach parlamentarnych, prezydenckich, europejskich)  
terytorialne komisje wyborcze (w wyborach samorządowych): wojewódzka, powiatowa i gminna (miejska) komisja wyborcza  
terytorialne komisje ds. referendum (w referendum lokalnym): wojewódzka, powiatowa i gminna (miejska) komisja do spraw referendum  
rejonowe komisje wyborcze (w wyborach europejskich)  
obwodowe komisje wyborcze (we wszystkich wyborach oraz w referendum ogólnokrajowym) — lokale wyborcze wyposażone w urny do głosowania  
obwodowa komisja ds. referendum (w referendum lokalnym)  

## M11: Autentykacja i autoryzacja

## M12: Infrastruktura PKI

## M13: Rejestracja komitetów wyborczych

## M14: Rejestracja kandydatów

## M15: Generowanie i eksport  plików klk dla kalkulatora

## M16: Numeracja list i kandydatów
Jak działa taka numeracja?
Na potrzeby wyborów Polska zostaje podzielona wirtualnie na poziomy (państwo, region, województwo, gmina, miasto) jak i podlegające im okręgi wyborcze. Komitet wyborczy ABC może zostać zarejestrowany na każdym z poziomów. Kandydaci, komitety wyborcze jak i partie na wszystkich poziomach są zobowiązane do wykonania rejestracji do dnia X. Następnego dnia dochodzi do losowania numerów. Każdy komitet wyborczy zarejestrowany na poziomie państwa, otrzymuje jednolity numer, ważny we wszystkich okręgach wyborczych. Natomiast kolejne poziomy w hierarchii: 
- respektują numerację nadrzędnego szczebla 
- losują kolejne (po numerach nadrzędnego szczebla), jednolite numery dla własnego poziomu

## M17: Kalkulator wyborczy
:)

## M18: Frekwencja wyborcza
Frekwencja jest przekazywana do centrali dwukrotnie, o godzinie 12 jak i  17, w ciągu dnia wyborczego. Przekaz wykonany jest poprzez kalkulator wyborczy jako liczba podpisów w spisie wyborczów = liczba wydanych kart do głosowania. 


## M19: Kontrola spływu protokołów
Dostęp do protokołów przez przeglądarkę, filtrowanie, sortowanie, analiza ostrzeżeń i błędów.

## M20: Przyjmowanie protokołów
Upload danych z kalkulatorów, autoryzacja, walidacja protokołów itp.

## M21: Obsługa komisji wyborczych wszelkich szczebli
Weryfikacja i zatwierdzenie protokołów.


## M22: Wyniki wyborów

- Jak wygląda liczenie w centrali? Zakładam, że również na tym szczeblu komputer tylko wspiera pracę człowieka.
  - Liczenie na wyższych poziomach, w zależności od wyborów, może być bardzo skomplikowane (miejsca po przecinku, uwzględnienie jak i rozdysponowanie głosów nieważnych itp.). 

## M23: Generowanie dokumentów
## M24: Rejestr partii politycznych
## M25: Centralna archiwizacja.



