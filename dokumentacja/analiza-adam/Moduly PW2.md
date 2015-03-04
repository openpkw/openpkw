# Przegląd modułów rozpisanych w ramach PW2 


## M1: Podział na obwody głosowania 
podział gminy na obwody głosowania

## M2: Geografia okręgów wyborczych 
podział na okręgi wyborcze

Moduły 1 i 2 maja zapewnić:
zarządzanie projektami podziału
    zatwierdzanie decyzji (coś w rodzaju Workflow)
    działać na podstawie
        systemu PESEL
        system ewidencji ludności
        słowników podziału kraju 
    archiwizować dane
    Zapewnić funkcje import / eksport na bazie XML

## M3: Meldunek kwartalny i przedwyborczy
Bardzo kiepski opis.
Meldunek kwartalny?
Meldunek przedwyborczy?



## M4: Słowniki podziału terytorialnego
W każdych wyborach mamy do czynienia z innym podziałem kraju na okręgi wyborcze. Celem tego modułu jest odzwierciedlenie tego wirtualnego podziału państwa w celu realizacji konkretnych wyborów. 

Okręg wyborczy definiujemy od 500 do 3000 wyborców. 

- Czy chodzi tutaj o nową wersję systemu TERYT? 
    - Nie


## M5: Słownik instytucji wybieranych
Baza wszelkich instytucji (pozycji na wszystkich szczeblach władzy: Prezydent, Sejm, Senat, Rada itp.) które są do obsadzenia.
Funkcjonalność na poziomie PKW, Warszawa jest wyjątkowa 

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

## M11: Autentykacja i autoryzacja

## M12: Infrastruktura PKI

## M13: Rejestracja komitetów wyborczych

## M14: Rejestracja kandydatów

## M15: Generowanie i eksport  plików klk dla kalkulatora

## M16: Numeracja list i kandydatów
Jak działa taka numeracja?
Na potrzeby wyborów Polska zostaje podzielona wirtualnie na poziomy (państwo, region, województwo, gmina, miasto) jak i podlegające im okręgi wyborcze. Komitet wyborczy ABC może zostać zarejestrowany na każdym z poziomów. Kandydaci, komitety wyborcze jak i partie na wszystkich poziomach są zobowiązane do wykonania rejestracji do dnia X. Następnego dnia dochodzi do losowania numerów. Każdy komitet wyborczy zarejestrowany na poziomie państwa, otrzymuje jednolity numer, ważny we wszystkich okręgach wyborczych. Natomiast kolejne poziomy w hierarchii: 
- respektują numerację nadrzędnego szczebla 
- losują jednolite numery dla własnego poziomu

## M17: Kalkulator wyborczy
:)

## M18: Frekwencja wyborcza
Frekwencja jest przekazywana do centrali dwukrotnie, o godzinie 12 jak i  16, wciągu dnia wyborczego. Przekaz wykonany jest poprzez kalkulator wyborczy jako liczba w postaci procentowej. 


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



