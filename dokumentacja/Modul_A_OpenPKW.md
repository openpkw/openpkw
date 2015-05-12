Opracowano na podstawie analizy dokumentów przetargowych ([**SIWZ**] (https://github.com/openpkw/openpkw/blob/master/dokumentacja/Przetargi_PKW_2013_1014.md)) ogłoszonych przez PKW/KBW w roku 2013/2014

**Bardzo proszę o krytyczne spojrzenie. Czy taki podział na moduły jest odpowiedni pod względem programistycznym. Czy nie trzeba wydzielic jakiś innych modułów. Czy bazy danych będą współpracować (wymiana danych) w ramach modułów i pomiędzy nimi itp itd.**


Dostęp do wszystkich podmodułów poprzez dedykowaną stronę HTML, uprawnienia do obsługi modułów nadawane oddzielnie do każdego modułu (**Moduł A.2.**).

#System Wyborczy OpenPKW  
[**Diagram**] (https://www.draw.io/?url=https%3A%2F%2Fraw.githubusercontent.com%2Fopenpkw%2Fopenpkw%2Fmaster%2Fdokumentacja%2Fprocesy%2FSW_OpenPKW.xml)  

**Moduł A.** Geografia wyborcza. Podział kraju na okręgi w zależności od rodzaju akcji wyborczej. Podział okręgów na obwody wyborcze. Podział gmin na okręgi wyborcze w wyborach do rad gmin. Obwody wyborcze zagranicą i na polskich statkach morskich. [**Diagram**] (https://www.draw.io/?url=https%3A%2F%2Fraw.githubusercontent.com%2Fopenpkw%2Fopenpkw%2Fmaster%2Fdokumentacja%2Fprocesy%2FSW_OpenPKW_A.xml)  

**Moduł B.** Organy wyborcze.  
Państwowa Komisja Wyborcza - skład, organ powołujący, kadencje. Okregowe Komisje Wyborcze (jak PKW), Komisarze Wyborczy, Krajowe Biuro Wyborcze, osoby funkcyjne na poszczególnych szczeblach, operatorzy komisji wyborczych. Składy Obwodowych i Terytorialnych komisji wyborczych, komitety zgłaszające kandydatów do komisji, wyniki losowania itp.

**Moduł C.** Kandydaci.  
Rejestracja Komitetów wyborczych, obszar dziaalnia, zgłaszanie list kandydatów, nadawanie numerów listom kandydatów ([**Diagram**] (https://www.draw.io/?url=https%3A%2F%2Fraw.githubusercontent.com%2Fopenpkw%2Fopenpkw%2Fmaster%2Fdokumentacja%2Fprocesy%2FSW_OpenPKW_C5.xml)), historia obsadzania mandatów.

**Moduł D.** Dane wyborcze.
Meldunek wyborczy - kwartalny ([**Diagram**] (https://www.draw.io/?url=https%3A%2F%2Fraw.githubusercontent.com%2Fopenpkw%2Fopenpkw%2Fmaster%2Fdokumentacja%2Fprocesy%2FSW_OpenPKW_D1.xml)), przedwyborczy. Generowanie plików KLK i JSON zasilających kalkulatory wyborcze (html i localhost).

**Moduł E.** Moduł obsługi organu wyborczego (terytorialnej komisji wyborczej, komisarza wyborczego i Państwowej Komisji Wyborczej) na obszarze właściwości organu, nadzoru nad przekazywaniem, kontrola poprawności.  

**Moduł F.** Moduł frekwencji - wprowadzenia, przyjmowania danych o liczbie wyborców, którzy wzięli udział w głosowaniu w trakcie głosowania. [**Diagram**] (https://www.draw.io/?url=https%3A%2F%2Fraw.githubusercontent.com%2Fopenpkw%2Fopenpkw%2Fmaster%2Fdokumentacja%2Fprocesy%2FSW_OpenPKW_F1.xml),  

**Moduł G.** Moduł ustalania wyników głosowania i wyników wyborów [**Diagram**] (https://www.draw.io/?url=https%3A%2F%2Fraw.githubusercontent.com%2Fopenpkw%2Fopenpkw%2Fmaster%2Fdokumentacja%2Fprocesy%2FSW_OpenPKW_G.xml). Protokoły zbiorcze komisji wyższego rzędu. 

**Moduł H.** Wzorce dokumentów wyborczych na podstawie ustaw, uchwal PKW, zarzadzeń ministrów wykorzystywane przez pozostale moduly Systemu Wyborczego OpenPKW.  
np. dla wyborow prezydenckich:  
[Zawiadomienie] (http://prezydent2015.pkw.gov.pl/pliki/1426675041_Zawiadomienie_o_utworzeniu_komitetu_wyborczego_kandydata_na_Prezydenta_RP.doc) o utworzeniu komitetu wyborczego kandydata na Prezydenta RP  
[Oświadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1426675121_Oswiadczenie_o_utworzeniu_komitetu_wyborczego_kandydata_na_Prezydenta_RP.doc) o utworzeniu komitetu wyborczego kandydata na Prezydenta RP  
[Oświadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1426675180_Oswiadczenie_pelnomocnika_wyborczego.doc) pełnomocnika wyborczego  
[Oświadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1426675214_Oswiadczenie_pelnomocnika_finansowego.doc) pełnomocnika finansowego  
[Oświadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1427101056_O%C5%9Bwiadczenie_zgoda_na_kandydowanie.doc) zgoda na kandydowanie  
[Oświadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1427101115_O%C5%9Bwiadczenie_zgoda_na_utworzenie_komitetu.doc) zgoda na utworzenie komitetu  
[Oświadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1427101185_O%C5%9Bwiadczenie_o_posiadaniu_prawa_wybieralno%C5%9Bci.doc) o posiadaniu prawa wybieralności  
[Oświadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1427101223_O%C5%9Bwiadczenie_lustracyjne.doc) lustracyjne  
[Informacja] (http://prezydent2015.pkw.gov.pl/pliki/1427101277_Informacja_o_zlozeniu_o%C5%9Bwiadczenia_lustracyjnego.doc) o złożeniu oświadczenia lustracyjnego  
[Zgłoszenie] (http://prezydent2015.pkw.gov.pl/pliki/1427196695_zg%C5%82oszenie_cz%C5%82onk%C3%B3w_OKW.doc) członków OKW  
[Zaswiadczenie] (http://prezydent2015.pkw.gov.pl/pliki/1426683312_zaswiadczenie_mezowie_zaufania.docx) mężowie zaufania  
Obwieszczenie PKW o wynikach głosowania. [10.05.2015] (http://prezydent2015.pkw.gov.pl/pliki/1_Obwieszczenie.pdf)  
 * Załącznik 1 do Obwieszczenia PKW [10.05.2015] (http://prezydent2015.pkw.gov.pl/pliki/2_Obwieszczenie_zal1.pdf)  
 * Załącznik 2 do Obwieszczenia PKW [10.05.2015] (http://prezydent2015.pkw.gov.pl/pliki/2_Obwieszczenie_zal2.pdf) 

**Moduł I.** Oprogramowanie do zarządzania uprawnieniami do obsługi informatycznej wyborów (w oparciu o bazę LDAP udostępnioną przez Zamawiającego ?), oprogramowanie obsługi infrastruktury klucza publicznego w zakresie wystawiania i udostępniania certyfikatów (infrastruktura PKI udostępniona przez Zamawiającego?), Moduł zarządczy (??) dla administratorów całości systemu.  

**Moduł J.** Rejestr partii politycznych w Polsce.  

**Moduł K.** Kalkulator dla localhost.  

**Moduł L.** Moduł Wizualizacji na bieżąco wyników głosowania.  

**Moduł M.** Serwer binarny. Obrazy dokumentów, protokolów, skany, zdjecia, wzory podpisów (?).  

**Moduł N.**  
**Moduł O.**  
**Moduł P.**  
**Moduł R.** Archiwizacja - wykonanie eksportu danych, zapewniający przeniesienie danych dotyczących komitetów wyborczych, list kandydatów i kandydatów, obwodów głosowania, okręgach wyborczych i wyników głosowania, wyników podziału mandatów do archiwum (zaimplementowanego jako relacyjna baza danych),  

**Moduł S.** Moduł przyjmowania danych elektronicznych z protokołów wyników głosowania w obwodzie przesłanych przez moduł kalkulator wyborczego (Moduł B.1.; B.2.; B.3.), kontrola spływu protokołów wyników głosowania w obwodzie,  

**Moduł T.**  
**Moduł U.**  
**Moduł W.**  

**Moduł X.** Program mobilny  

**Moduł Y.** Program mobilny  

**Moduł Z.** Program mobilny 


# Wymagane bazy danych (uzyskanie dostępu lub stworzenie od podstaw)  

 1. Rejestr partii politycznych w Polsce  

 2. Stały rejestr wyborców (prowadzony przez gminy - wymiana danych między gminami poprzez moduł raportu wybroczego)  

 3. Okręgi wyborcze (Polska)   
  - Akcje wyborcze (słownik)
    - Wybory prezydenckie
    - Wybory do Sejmu RP
    - Wybory do Senatu RP / Wybory uzupeniajace do Senatu RP  
    - Wybory do PUE
    - Wybory do Sejmiku województwa
    - Wybory do Rady Powiatu
    - Wybory do Rady miasta na prawach powiatu
    - Wybory do Rady dzielnicy m.st. Warszawa
    - Wybory Rady Gminy / wybory uzupeniajace do Rady Gminy  
    - Wybory do Rady Miasta / wybory uzupeniajace do Rady Miasta  
    - Wybory wójt/burmistrz/prezydent / wybory w trakcie kanecji
    - Referendum Ogólnokrajowe
    - Referendum lokalne

 4. Obwody wyborcze (gminy)
  - Rodzaje gmin (typ obszaru głosowania) (słownik)
    - gmina miejska
    - gmina wiejska
    - gmina miejsko-wiejska
    - miasto w gminie miejsko-wiejskiej
    - obszar wiejski w gminie miejsko-wiejskiej
    - dzielnica w gminie Warszawa
    - delegatury i dzielnice innych gmin miejskich
    - zagranica
    - statek
  - Rodzaje obwodów (typ obwodu gosowania) (słownik)
    - stałe (powszechne),
      - w kraju,
        - dla niepełnosprawnych / do głosowania korespondencyjnego,  
      - za granicą (NIE w wyborach samorządowych) (wchodzą w skład: okręgu wyborczego właściwego dla dzielnicy Śródmieście m.st. Warszawy),
      - tajny - bazy wojskowe za granicą kraju (NIE w wyborach samorządowych) (wchodzą w skałd: okręgu wyborczego właściwego dla ...... ????),
    - odrębne
      - zakład opieki zdrowotnej (szpital),  
      - domu pomocy społecznej,  
      - zakład karny,
      - areszt śledczy,
      - oddział zewnętrzny zakładu karnego,
      - oddział zewnętrznym aresztu śledczego,  
      - dom studencki (NIE w wyborach samorządowych)
      - zespół domów studenckich (NIE w wyborach samorządowych)   
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

 7. Komisje wyborcze (rodzaj, składy osobowe, pełnione funkcje)  
  - rodzaj komisji wyborczej (słownik)
    - PKW
    - Komisarz Wyborczy
    - Okręgowa Komisja Wyborcza
    - Rejonowa Komisja Wyborcza
    - Terenowa Komisja Wyborcza
      - Gminna
      - Miejska
      - Powiatowa
      - Dzielnicowa
      - Wojewódzka
    - Obwodowa Komisja Wyborcza
  - funkcje (słownik)
    - członek
    - Przewodniczący
    - Zastępca Przewodniczącego
  - nazwa organu/organizacji/komitetu wyborczego delegującego do komisji (słownik patrz 6.)
  - Nazwisko, Imiona, adres zamieszkania, PESEL, nr. telefonu, data zgłoszenia
  - Kto zgłosił
    - pełnomocnik wyborczy
    - osoba upoważniona przez pełnomocnika wyborczego

 8. Listy kandydatów i kandydaci (wszystkie akcje wyborcze ? )  
  -  Stanowiska wybieralne (słownik)
    - Prezydent RP
    - Poseł na Sejm RP
    - Senator RP
    - Poseł do PUE
    - wójt
    - burmistrz
    - prezydent miasta
    - radny Sejmiku wojewódzkiego
    - radny Rady powiatowej
    - radny Rady miasta na prawach powiatu
    - radny Rady Dzielnicy m.st. Warszawy
    - radny Rady gminy
    - radny Rady miasta
  -  Akcje wyborcze (słownik patrz 3.)

 9. Frekwencja (tylko dla stałych obwodów wyborczych)
  - godziny sprawozdawcze - frekwencja (słownik)
    - wg stanu z godz. 12:00
     - Liczba osób uprawnionych do głosowania (łącznie z osobami dopisanymi w dniu wyborów)
     - Liczba wyborców, którym wydano karty do głosowania
    - wg stanu z godz. 17:00
     - Liczba osób uprawnionych do głosowania (łącznie z osobami dopisanymi w dniu wyborów)
     - Liczba wyborców, którym wydano karty do głosowania
  - ....  

 10. Wyniki głosowania (dane z kalkulatora)  

 11. Wzory dokumentów wyborczych  
  - Postanowienie o przyjęciu zawiadomienia o utworzeniu komitetu wyborczego  
  - Wezwanie pełnomocnika wyborczego do usunięcia wad w zawiadomieniu o utworzeniu komitetu wyborczego  
  - Postanowienie o odmowie przyjęcia zawiadomienia o utworzeniu komitetu wyborczego  
  - Zgłoszenie kandydatów na członków obwodowych komisji wyborczych w wyborach (samorządowych).
  - Zgłoszenie kandydata na członka (nazwa właściwej terytorialnej komisji) komisji wyborczej w (miejscowość) w wyborach (samorządowych)
  - ..  
