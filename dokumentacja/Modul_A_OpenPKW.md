Opracowano na podstawie analizy dokumentów przetargowych ([**SIWZ**] (https://github.com/openpkw/openpkw/blob/master/dokumentacja/Przetargi_PKW_2013_1014.md)) ogłoszonych przez PKW/KBW w roku 2013/2014

**Bardzo proszę o krytyczne spojrzenie. Czy taki podział na moduły jest odpowiedni pod względem programistycznym. Czy nie trzeba wydzielic jakiś innych modułów. Czy bazy danych będą współpracować (wymiana danych) w ramach modułów i pomiędzy nimi itp itd.**


Dostęp do wszystkich podmodułów poprzez dedykowaną stronę HTML, uprawnienia do obsługi modułów nadawane oddzielnie do każdego modułu (**Moduł A.2.**).

#Moduł A. Platforma Wyborcza

**Moduł A.1.** Systemu pobierania danych o komitetach wyborczych, listach kandydatów i kandydatach oraz obwodach, okręgach i składach komisji (z serwisów udostępnionych przez Zamawiającego ?),

**Moduł A.2.** Oprogramowanie do zarządzania uprawnieniami do obsługi informatycznej wyborów (w oparciu o bazę LDAP udostępnioną przez Zamawiającego ?), oprogramowanie obsługi infrastruktury klucza publicznego w zakresie wystawiania i udostępniania certyfikatów (infrastruktura PKI udostępniona przez Zamawiającego?),

**Moduł A.3.** Moduł frekwencji - wprowadzenia, przyjmowania danych o liczbie wyborców, którzy wzięli udział w głosowaniu w trakcie głosowania, nadzoru nad przekazywaniem, kontroli poprawności,

**Moduł A.4.** Moduł przyjmowania danych elektronicznych z protokołów wyników głosowania w obwodzie przesłanych przez moduł kalkulator wyborczego (Moduł B.1.; B.2.; B.3.), kontrola spływu protokołów wyników głosowania w obwodzie,

**Moduł A.5.** Moduł obsługi organu wyborczego (terytorialnej komisji wyborczej, komisarza wyborczego i Państwowej Komisji Wyborczej) na obszarze właściwości organu.   

**Moduł A.6.** Moduł ustalania wyników głosowania i wyników wyborów. Protokoły zbiorcze komisji wyższego rzędu.  

**Moduł A.7.** Moduł Wizualizacji na bieżąco wyników głosowania.  

**Moduł A.8.** Archiwizacja - wykonanie eksportu danych, zapewniający przeniesienie danych dotyczących komitetów wyborczych, list kandydatów i kandydatów, obwodów głosowania, okręgach wyborczych i wyników głosowania, wyników podziału mandatów do archiwum (zaimplementowanego jako relacyjna baza danych),

**Moduł A.9.** Moduł zarządczy (??) dla administratorów całości systemu.

# Wymagane bazy danych (uzyskanie dostępu lub stworzenie od podstaw)  

 1. Rejestr partii politycznych w Polsce  

 2. Stały rejestr wyborców (prowadzony przez gminy - wymiana danych między gminami poprzez moduł centralny)  

 3. Okręgi wyborcze (Polska) (wszystkie akcje wyborcze ? )  
  - Akcje wyborcze (słownik)

 4. Obwody wyborcze (gminy)  
  - Rodzaje obwodów (słownik)
    - stałe
      - w kraju
        - dla niepełnosprawnych / do głosowania korespondencyjnego  
      - za granicą (NIE w wyborach samorządowych) (wchodzą w skład: okręgu wyborczego właściwego dla dzielnicy Śródmieście m.st. Warszawy)  
    - odrębne
      - zakład opieki zdrowotnej,  
      - domu pomocy społecznej,  
      - zakład karnym, areszt śledczy oraz oddział zewnętrznym zakładu karnego i aresztu,  
      - dom studenta lub zespół domów studenta (NIE w wyborach samorządowych)   
      - polskie statki morskie (NIE w wyborach samorządowych) (wchodzą w skład: okręgu wyborczego właściwego dla siedziby armatora) 

 5. Okręgi wyborcze (gminy - tylko wybory samorządowe)  

 6. Komitety wyborcze (składy osobowe, pełnione funkcje, decyzje o zgłoszeniu, zarejestrowaniu, losowaniu nr)  
  - rodzaje komitetów wyborczych (słownik)
    - komitet wyborczy partii politycznej (patrz 1.) (oprócz wyborów prezydenckich)
    - komitet wyborczy koalicji partii politycznych (patrz 1.) (oprócz wyborów prezydenckich)
    - komitet wyborczy stowarzyszenia lub organizacji społecznej (wyłącznie w wyborach samorządowych)
    - komitet wyborczy wyborców (we wszystkich typach wyborów)
  - funkcje w komitecie wyborczym (słownik)
    - pełnomocnik wyborczy 
    - pełnomocnik finansowy 
  - dane pozostałe
    - nazwa komitetu wyborczego (art.94 KW reguluje nazewnictwo komitetów)
    - skrót nazwy komitetu wyborczego (art. 92-95 KW reguluje zasady skrótów i znaków graficznych)
    - znak graficzny komitetu wyborczego (j.w)
    - adres siedziby komitetu (organu stowarzyszenia lub organizacji)
    - numer ewidencyjny partii politycznej (w przypadku komitetu wyborczego partii politycznej lub numery )
    - numery ewidencyjne partii politycznych (w przypadku komitetu wyborczego koalicji partii politycznych)
    - numer ewidencyjny stowarzyszenia lub organizacji społecznej (pod którym są wpisane do rejestru)
    - imię, nazwisko, adres zamieszkania, PESEL - pełnomocnika wyborczego (nie kandydat w wyborach prezydenckich)(Można być pełnomocnikiem wyborczym tylko jednego komitetu wyborczego)
    - imię, nazwisko, adres zamieszkania, PESEL - pełnomocnika finansowego (nie kandydat w wyborach prezydenckich)(Można być pełnomocnikiem finansowym tylko jednego komitetu wyborczego.)  
    - adres strony internetowej na której komitet wyborczy umieszcza informacje określone w kodeksie.

 7. Komisje wyborcze (składy osobowe, pełnione funkcje)  
  - funkcje (słownik)
    - członek
    - Przewodniczący
    - Zastępca Przewodniczącego
  - nazwa komitetu wyborczego delegującego do komisji (słownik patrz 6.)

 8. Listy kandydatów i kandydaci (wszystkie akcje wyborcze ? )  
  -  Stanowiska wybieralne (słownik)  
  -  Akcje wyborcze (słownik patrz 3.)

 9. Frekwencja
  - godz. frekwencji (słownik)  
  - ....  

 10. Wyniki głosowania (dane z kalkulatora)  

 11. Wzory dokumentów wyborczych  
  - Postanowienie o przyjęciu zawiadomienia o utworzeniu komitetu wyborczego  
  - Wezwanie pełnomocnika wyborczego do usunięcia wad w zawiadomieniu o utworzeniu komitetu wyborczego  
  - Postanowienie o odmowie przyjęcia zawiadomienia o utworzeniu komitetu wyborczego  
  - .  

12. 
