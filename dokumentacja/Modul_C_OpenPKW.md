#Systemy kontroli poprawności przeprowadzenia wyborów

* Moduł 1 - wpisywanie danych z protokołów, walidacja poprawności wpisania, wysłanie danych na serwer.
    *  - wysłanie danych SMS

* Moduł 2 - zdjęcia protokołu, wysłanie na serwer, przypisanie zdjęć do konkretnego obwodu

* Moduł 3 - serwer, przyjęcie danych, agregacja danych, wizualizacja danych

* Moduł 4 - archiwizacja danych z przeszłych akcji wyborczych

*   

#walidacja mobilek (V.2015)
cyfry w nawiasach odnoszą sie do punktów oryginalnego protokołu.  

**Błędy twarde**

P1 Liczba osób, którym wydano karty do głosowania (pkt. 4), nie może być większa od liczby wyborców uprawnionych do głosowania (pkt. 1).  
P2 Liczba kart wyjętych z urny (pkt. 9) musi być równa sumie liczby kart nieważnych (pkt. 10) i liczby kart ważnych (pkt. 11).  
P3 Liczba kart ważnych (pkt. 11) musi być równa sumie liczby głosów nieważnych (pkt. 12) i liczby głosów ważnych oddanych na wszystkich kandydatów (pkt. 13).  
P8 Suma głosów oddanych na wszystkich kandydatów (pkt. 14 pole RAZEM) nie może być różna od sumy głosów oddanych na poszczególnych kandydatów (w pkt. 14).  
P9 Suma głosów oddanych na wszystkich kandydatów (w pkt. 14) musi być równa liczbie głosów ważnych (w pkt. 13).  

**Błędy miękkie** (ostrzeżenia wymagające wyjasnień i wydruku Raportu ostrzeżeń)  

S3 Liczba wyborców, którym wydano karty do głosowania (pkt. 4) nie powinna przekraczać 90% liczby wyborców uprawnionych do głosowania (pkt. 1).  
S4 Liczba wyborców uprawnionych do głosowania (pkt. 1) powinna być dodatnia.  
S5 Liczba wyborców, którym wydano karty do głosowania (pkt. 4) powinna być dodatnia.  
S6 Liczba kart wyjętych z urny (pkt. 9) powinna być dodatnia.  
S7 Liczba kart ważnych (pkt. 11) powinna być dodatnia.  
S8 Liczba wyborców uprawnionych do głosowania (pkt. 1) nie powinna być mniejsza niż liczba kart ważnych (pkt. 11).  
S16 Liczba kart ważnych (pkt. 11) nie powinna być większa od liczby wyborców uprawnionych do głosowania (pkt. 1).  

**Dodatkowo uzgodniliśmy, że:**  

1) wszystkie dane liczbowe o wynikach głosowania są liczbami całkowitymi nieujemnymi;  
2) Wszystkie liczby nie mogą byc większe niż 3000 (za wyjątkiem ZAGRANICY)  
3) przy nazwiskach kandydatów skreślonych nie może być wpisana żadna liczba;  
