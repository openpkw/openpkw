# Protokoły spotkań


## Agenda na najbliższe spotkanie
Zbieramy tematy na najbliższą telekonferencje. Będę wdzięczny za akceptację schematu **autor: treść** 


* Przemek: Nowa filozofia działania państwowych systemów wyborczych (PW 2.0) na podstawie Wytycznych PKW dla Obwodowych KW z 9 marca 2015 r.  
  * 21 marca 2015 r.: [Wstępna analiza](https://github.com/Tirramisu/openpkw/blob/master/zmiany%20filozofii.md)
  * Sebastian: Od strony prototypu HTML bardzo interesuje mnie sprawa loginów, haseł, certyfikatów i kodów jednorazowych.  
  * Przemek: wczoraj (24.03) ukazały się wytyczne PKW dla Okręgowych KW z 23 marca 20115 - trwa analiza.
  * Przemek: najnowsze zasady poprawności protokołów dla wyborów prezydenckich:  [walidacja](https://github.com/Tirramisu/openpkw/blob/master/walidacja_2015_prezydent.md)
* Adam: Status implementacji 
  * [POC kalkulatora](https://github.com/openpkw/PocKalkulatorWyborczyHtml)
  * [OPW wybory prezydenckie 2015] (https://github.com/adamkowalewski/OtwartaPlatformaWyborcza) 
* Adam: Aktualna infrastruktura OpenPKW (kontynuacja z ubiegłego tygodnia)
  * Sebastian: Czy tutaj omówimy jakie mamy maszyny wirtualne i co na nich już stoi? Np. Jenkins na GlassFishu, prototyp kalkulatora na JBossie, itd.
* Adam: Czas zdefiniować developer guidelines & workspace configuration 
  * Sebastian: Zalążek jest tutaj: https://github.com/openpkw/PocKalkulatorWyborczyHtml/blob/master/README.md

* Sebastian: Aktualna sytuacja z włączaniem programistów do prac nad OpenPKW.
* Sebastian: Czy możemy już się zastanowić nad wyborem docelowej technologii?
  * Programiści Javowi dążą w stronę aplikacji webowej w Java EE. Prototyp jest właśnie w tej technologii.
  * Programiści front-endowi proponują postawienie prototypu HTML na serwerze HTML (Apache, Node.js).

## Aktualna lista ToDo 
Aktuala lista ToDo zawiera wszystkie aktualnie otwarte pozycje. Nazewnictwo: **data-nr: [odpowiedzialny] opis**. 
* 2015.03.18-3: [Marcin, Sebastian, Adam] Definicja zadań (user story) dla kontrybutorów POC.
  * Sebastian: Utworzyłem zadania w OpenProject, ale nie jestem zadowolony z funkcjonalności.
* 2015.03.11-1: [Robert, Rafał] Gromadzenie informacji na temat reguł walidacji i plików  KLK. 
* 2015.03.11-7: [Adam] Odnowi kontakt z NIWA. Tematyka infrastruktury i CI. Postara się zaprosić kogoś z NIWA do udziału w jednej z nadchodzących telekonferencji. 
* 2015.03.04-1: [Tomasz Woźniak] Zdobyć w PKW informację gdzie i kiedy generowany jest barcode dla formularzy? Czy w kalkulatorze czy na serwerze. SC: Ja bym to uznał za zamknięte, bo wiemy, że dotychczas barcode był generowany w kliencie.
  * 2015.03.18 Zadanie przejmuje Robert. 
* 2015.03.04-2: [Tomasz Woźniak] Zdobyć w PKW wszystkie pliki KLK na najbliższe wybory prezydenckie. Zarówno pliki KLK zawierające dane komisji i listy kandydatów, jak i pliki KLK z regułami walidacji.
  * 2015.03.18 Rafał przejmuje koordynacje tego zadania. 
  * Adam dodał zformatowane pliki do repozytorium. 
* 2015.03.04-3: [Sebastian -> Programiści] Zaimplementować zapis formularza do formatu XML.
  * Nikt nie wziął zadania.
* 2015.03.04-4: [Sebastian -> Programiści] Zaimplementować generowanie sumy MD5 (zależy od 2015.03.04-3).
  * Nikt nie wziął zadania.
* 2015.03.04-5: [Marcin lub inni Programiści] Dokończyć wariant 3 generowania PDFa z wypełnionym formularzem.
  * Nikt nie wziął zadania.
* 2015.03.18-1: [Programiści] Zaimplementować podpisywanie protokołu w postaci pliku XML certyfikatem.
  * Nikt nie wziął zadania.
* 2015.03.18-2: [Programiści] Zaimplementować obsługę tzw. raportu błędów.
  * Nikt nie wziął zadania.
* 2015.03.18-3: [Programiści] Zaimplementować obsługę uwag i adnotacji (punkty 15-21 formularza).
  * Nikt nie wziął zadania.
* 2015.03.18-4: [Programiści] Zaimplementować walidację pól formularza do końca.
  * Nikt nie wziął zadania.


##2015.03.25 20:00 [WiP]
Format: Telekonferencja / Skype  
Czas: 120 min  
Obecni: Adam Kowalewski, Sebastian Celejewski, Tomasz Woźniak, Przemek Jodkowski, Rafał Reguła, Marcin Tokarski, Robert Postek  

**Dyskusja**
* Adam: Aktualna sytuacja na wiki - musimy tam posprzątać. 
  * Patrz ToDo Tomek i Przemek???
* Adam: Aktualna sytuacja w issues - same jurrasic tickets.
  * Patrz ToDo Tomek???
* Rafał Reguła: Brak koordynacji w projekcie oraz hierarchicznej struktury organizacyjnej projektu z podziałem na role członków OpenPKW. Potrzeba ustematyzowanie tasków i obowiazków w odniesieniu do ról.
  * Sebastian: Odbył się szereg dyskusji mailowo-skypowych na ten temat.

**ToDo zrobione**
* 2015.03.18-1: [Sebastian i Adam] Wykonanie protokołu. [DONE]
* 2015.03.18-2: [Tomek, Sebastian, Adam] Tematyka CI w Azure, cel to budujący i testujący Jenkins.
  * Adam & Sebastian: jesteśmy zgodni, jedna solidna VM w Azure wystarczy na początek. Zmieniamy pakiet z A0 na D3 [Pakiety Azure](http://azure.microsoft.com/pl-pl/pricing/details/virtual-machines/#Linux)
  * Jenkins został skonfigurowany i buduje POC_KW jak i OPW. Infrastrukture udostępnia Adam. 
* 2015.03.18-4: [Adam] Reverse fork do głównego repozytorium wraz z wszelkimi konfliktami. 
  * [DONE] docs/adam oznaczone jako @Deprecated 
* 2015.03.18-5: [Adam] Sprawdzi możliwość integracji technologi SMS z OPW. 
  * Sprawdzone i udokumentowane w OPW.
* 2015.03.11-4: [Adam, Przemek] Konsolidacja dokumentacji do głównego repozytorium. 
  * [DONE] Adam wykonał merge repozytorium Przemka. 
* 2015.03.18-6: [Rafał] Przejmuje długoterminową koordynację komunikacji z PKW / KBW. 
  * Kontakt nawiązany, Rafał koordynuje kommunikacje z PKW. 


## 2015.03.18 20:00
Format: Telekonferencja / Skype  
Czas: 120 min  
Obecni: Adam Kowalewski, Sebastian Celejewski, Tomasz Woźniak, Przemek Jodkowski, Rafał Reguła, Marcin Tokarski, Robert Postek, Tomasz Klasa, Bartłomiej Kokoszka

**Dyskusja**
* Aktualna sytuacja na GitHubie oraz dalsze kroki. Repozytorium kodu prototypów przeniesione (zadanie 2015.03.11-8), dokumentację trzeba przenieść (zadanie 2015.03.11-4 i chyba też 2015.03.18-4 o ile dobrze rozumiem).

* Status implementacji 
  * [POC kalkulatora](https://github.com/openpkw/PocKalkulatorWyborczyHtml)
    * Prototyp HTML/Java - co dalej? Czy uznajemy, że przećwiczyliśmy technologię i zamykamy prototyp, czy implementujemy wszystko ze szczegółami? Decyzja: trzeba jeszcze parę rzeczy implementować: 2015.03.04-3 (zapis do XML), 2015.03.04-4 (generowanie barcode), dokończyć 2015.03.04-5 (generowanie PDFa - wariant 3) i 2015.03.18-4 (dokończenie walidacji). Oprócz tego musimy zaimplementować kilka nowych rzeczy: 2015-03.18-1 (podpisywanie protokołu certyfikatem), 2015.03.18-2 (raport błędów) i 2015.03.18-3 (uwagi i adnotacje). Wszystkie aktualne zadania programistyczne są tutaj: https://trello.com/b/1PocOld8/poc-wp.
  * [OPW wybory prezydenckie 2015] (https://github.com/adamkowalewski/OtwartaPlatformaWyborcza) 
    * Będzie możliwość dodania zdjęcia protokołu? - Tak 
    * Czy integracja z SMS jest możliwa? - ToDo 2015.03.18-5
* Dyskusja na temat zagadnienia zgłoszonego przez Rafała Regułę: ,,Brak koordynacji w projekcie oraz hierarchicznej struktury organizacyjnej projektu z podziałem na role członków OpenPKW. Potrzeba ustematyzowanie tasków i obowiazków w odniesieniu do ról.'' Był to taki wstęp do dyskusji, która być może czeka nas w najbliższej przyszłości: jak pracować nad OpenPKW? jak koordynować prace? czy jakoś przydzielać role? itd. Spora rozbieżność poglądów, zapewne będziemy to dyskutować na następnych spotkaniach, aby ludzie specjalizujący się w różnych dziedzinach mogli się wzajemnie zrozumieć.
* OpenProject - sprawa nieprzedyskutowana z powodu braku czasu, ale wygląda na to, że będziemy musieli o tym porozmawiać. Spektrum poglądów szerokie - od ,,po co nam w ogóle OpenProject?'' po ,,wszystko odnotowujmy w OpenProject''.
* Krótka refleksja na temat oświadczenia czwórki członków tzw. Core Teamu o odejściu z OpenPKW. Teraz my ciągniemy sztafetę, ale każdy ma prawo zrezygnować w dowolnym momencie, zapewne ludzie będą zarówno do projektu dochodzić, jak i się z niego odłączać i to jest OK.
* Nowi zgłaszający się do projektu ludzie - w jaki sposób rozpocząć współpracę, w jaki sposób rozdzielać zadania itd. Pierwszym krokiem będzie stworzenie w OpenProjectie zadań 2015.03.04-3 (eksport do XML), 2015-03.18-1 (certyfikaty), 2015.03.18-2 (raport błędów), 2015.03.18-3 (uwagi i adnotacje) i 2015.03.18-4 (dokończenie walidacji).

**Zrealizowane elementy ToDo**
* 2015.03.11-6: [Adam] Odpowiedzialny za protokół. [DONE]
* 2015.03.11-2: [Tomasz Woźniak] Konfiguracja wirtualnej maszyny w Azure tak aby administratorzy CI mogli skonfigurować środowisko. 
  * Maszyna jest, pakiet A0, rozpoczynamy konfigurację środowiska CI. Patrz ToDo 2015.03.18-2
* 2015.03.11-3: [Tomasz Woźniak] Kontakt z Magdą w celu reaktywacji zespołu PR jak i aktualizacji strony http://openpkw.pl
  * No niestety [Oświadczenie członków core team](http://openpkw.pl/pipermail/lista/2015-March/001445.html)
* 2015.03.11-5: [Przemek] Analiza zależności pomiędzy modułami specyfikacji PW2. 
  * Koniec i bomba a kto czytał (i analizował) ten trąba. PKW na przełomie ostatnich 12 miesięcy trzykrotnie aktualizowała wymagania PW2 (25 modułów -> 10 modułów -> 11 modułów). 
* 2015.03.11-8: [Sebastian] Integracja POC kalkulatora w organizacji [OpenPKW@github](https://github.com/openpkw/openpkw) tzn. nowe repo + merge (zrobione, kod przeniesiony do https://github.com/openpkw/PocKalkulatorWyborczyHtml, programiści mają prawa do zapisu, pierwsze commity za płoty) 

## 2015.03.11 20:00
Format: Telekonferencja / Skype  
Czas: 90min  
Obecni: Adam Kowalewski, Sebastian Celejewski, Michał Grabkowski, Tomasz Woźniak, Przemek Jodkowski, Rafał Reguła, Błażej Ksycki, Marcin Tokarski

**Dyskusja**
* Aktualne prototypy PW2 dostarczone przez PKW/KBW. 
* Reguły walidacji i ich reprezentacja w plikach KLK
* Aktualna infrastruktura OpenPKW
  * Chmura Azure - Tomek pracuje nad serwerami (aktualnie 2 max 6)
  * Chmura Amazon - Sebastian ma darmowy pakiet, mało pamięci RAM, brak stałego IP 
  * NIWA - Adam 
  * Prywatne serwery - Adam prywatny, płatny serwer Ubuntu dostępny 24/7 jako opcjonalny fallback
* Continuous Integration 
  * Sebastian i Błażej posiadają praktyczne doświadczenie w tematyce CI. 
* Adam: Strona internetowa openpkw.pl, grupa jak i Fanpage na Facebook nadal milczą, proponuje nawiązać kontakt z administratorami i wyznaczyć 2-3 osoby odpowiedzialne za ową domenę.
  * ToDo 2015.03.11-3 dla Tomka + Adam i Sebastian jako administratorzy grupy na FB.
* Adam: Tematyka NIWA CI(Continuous Integration). Proponuje wysłać zapytanie do NIWA czy mogliby nam udostępnić serwer CI, najlepiej Jenkins, jak i doświadczonego administratora - czyli osobę która zna tematykę CI jak i Jenkinsa jak własną kieszeń.
  * ToDo 2015.03.11-7 dla Adama 
* Adam: IMHO na dzień dzisiejszy jesteśmy zbyt roz-forkowani. Powinniśmy ASAP usprawnić proces synchronizacji z głównym repozytorium.
  * Adam i Sebastian otrzymali prawa administracji w centralnym github. ToDo 2015.03.11-4 i 2015.03.11-8
* Sebastian: Kilka spraw deweloperskich (powitanie członków zespołu deweloperskiego, postępy w prototypie).
  * DONE 
* Sebastian: Dodanie wszystkich biorących udział w OpenPKW jako członków organizacji openpkw w GitHubie oraz jako kontrybutorów w projekcie openpkw/openpkw.
* Rafał R. Dołączy do Konferencji Pan Robert. 


**Zrealizowane elementy ToDo**
* Rafał: Porozmawiać z kierownikiem referatu informatyki z Ursynowa w celu nawiązania stosunków i spytania na jakie problemy techniczne możemy się natknąć.
  * DONE + ToDo 2015.03.11-1
* Adam + Przemek: Proces komisji obwodowej [dokumentacja/procesy/] (dokumentacja/procesy/) + wprowadzenie do [draw.io](http://www.draw.io)

## 2015.03.04 20:00
Format: Telekonferencja / Skype  
Czas: 2h  
Obecni: Sebastian Celejewski, Adam Kowalewski, Rafał Reguła, Adam Mańczuk, Marcin Fabrykowski, Tomasz Woźniak, Przemek Jodkowski, Bartłomiej Kokoszka

**Postępy prac**

Adam 1: Kontakt z Tomkiem - namiary na ludzi zainteresowanych technologią Java / Java EE
- WiP: Czekamy na odpowiedz od Tomka

Adam 2: Wykonam modele procesów w OpenOffice Impress
- Po wykonaniu prototypów w OO Impress jak i [draw.io](http://www.draw.io) stwierdzam, zwycięzcą jest aplikacja draw.io. Kilka argumentów: 
  - praca z draw.io nie wymaga konta / rejestracji
  - działa w przeglądarce 
  - diagramy są zapisywane w formacie XML
  - bardzo dobra paleta szablonów 
  - bardzo prosta obsługa  
- Pliki procesów w formacie draw.io XML są dostępne tutaj [dokumentacja/procesy/] (dokumentacja/procesy/)

Adam 3: Odpowiadam za pull requesty do mojego repozytorium
- Wszystko zintegrowane

Adam 4: Doodle na nadchodzący tydzień
- Zrobiony przez Marcina Fabrykowskiego

Adam 5: Kontakt z Markiem - analiza przetargu
- Nie udało się.

Adam 6: Kontakt z Przemkiem - analiza przetargu
- Przedyskutowane. Rezultat jest tutaj: [/dokumentacja/analiza-adam/] (/dokumentacja/analiza-adam/Moduly%20PW2.md)

Przemek: Przygotuje ciąg wyborczy na lata 2015 i 2016
- Przygotowany. Wrzucony tutaj: https://github.com/Tirramisu/przemekjodkowski-openpkw

Dodatkowe prace Przemka: 
- Jak ma działać kalkulator: https://github.com/Tirramisu/przemekjodkowski-openpkw/blob/master/oper_kalkulator.md
- Walidacja: https://github.com/Tirramisu/przemekjodkowski-openpkw/blob/master/walidacja_podstawy.md
- Opis bazy KBW: http://ext.kbw.gov.pl/plt/baza-zw.pdf

Marek: Wykona analizę przetargu + tel. z Adamem
- Nie udało się.

Sebastian 1: Skontaktować się z Tomkiem W. i poprosić o programistów front-end do prac nad prototypem w HTML.
- Tomek przygotował listę ludzi, ale chce to skoordynować z OpenProjectem, który na razie leży.
- Plan B. napisać do wszystkich programistów i skierować ich do Sebastiana.
- Sebastian zachęca kolegę, żeby został frontendowcowcem.

Dodatkowy prace Tomka W:
- Próbuje złapać kontakt z Kamilem. Jak się nie uda, to sam przejmie administrację.

Sebastian 2: Skontaktować się z Tomkiem W. i poprosić o zdobycie z PKW reguł walidacji dla komisji obwodowych i komisji okręgowych dla najbliższych wyborów prezydenckich.
- Część reguł dał Przemek. Reszta: Tomek W. zwróci się do KBW

Sebastian 3: Skontaktować się z Tomkiem W. i poprosić o pomoc w zdobyciu u Kamila dwóch serwerów: serwer, na którym wystawimy prototyp HTML, serwer Continuous Integration.
- Jeszcze nie zrobione.
- Sebastian ma wysłać Tomkowi W. specyfikację maszyn.

Sebastian 4 (bonus): Preprojektować prototyp w HTML tak, aby odzwierciedlał formularz dla najbliższych wyborów prezydenckich.
- Zrobione, dostępne tutaj: http://54.173.158.97:8080/openpkw/.

Sebastian 5 (bonus): Przeprojektować prototyp w HTML tak, aby walidował dane podczas ich wprowadzania, a nie po naciśnięciu przycisku ,,Waliduj''.
- Nie zrobione.

Rafał może nas skontaktować z posłami i z Komitetem Obrony Wyborów.

**Dyskusja**
- Jak przedstawić dane wprowadzone do formularza w formacie XML.
- Jak przesłać formularz w postaci elektronicznej na serwer OpenPKW.
- Jak wygenerować MD5 dla formularza.
- Jak wygenerować barcode dla formularza.

**Ustalenia**
- Tomek 1: Zdobyć w PKW informację gdzie i kiedy generowany jest barcode dla formularzy? Czy w kalkulatorze czy na serwerze.
- Tomek 2: Zdobyć w PKW wszystkie pliki KLK na najbliższe wybory prezydenckie. Zarówno pliki KLK zawierające dane komisji i listy kandydatów, jak i pliki KLK z regułami walidacji.
- Sebastian 1: Zaimplementować zapis formularza do formatu XML.
- Sebastian 2: Zaimplementować generowanie sumy MD5.
- Sebastian 3: Zaimplementować generowanie PDFa z wypełnionym formularzem i barcodem (współpraca wszystkich zainteresowanych bardzo mile widziana).
- Rafał: Porozmawiać z kierownikiem referatu informatyki z Ursynowa w celu nawiązania stosunków i spytania na jakie problemy techniczne możemy się natknąć.


## 2015.02.25 20:00
Format: Telekonferencja / Skype<br/>
Czas: 2h+ <br/>
Obecni: Sebastian Celejewski, Adam Kowalewski, Marcin Fabrykowski, Bartłomiej Kokoszka, Przemek Jodkowski, Marek Piotrów

**Postanowienia:**
* brak

**ToDo:**
* Adam 1: Kontakt z Tomkiem - namiary na ludzi zainteresowanych technologią Java / Java EE
* Adam 2: Wykonam modele procesów w OpenOffice Impress
* Adam 3: Odpowiadam za pull requesty do mojego repozytorium
* Adam 4: Doodle na nadchodzący tydzień
* Adam 5: Kontakt z Markiem - analiza przetargu
* Adam 6: Kontakt z Przemkiem - analiza przetargu
* Przemek: Przygotuje ciąg wyborczy na lata 2015 i 2016 
* Marek: Wykona analizę przetargu + tel. z Adamem 
* Sebastian 1: Skontaktować się z Tomkiem W. i poprosić o programistów front-end do prac nad prototypem w HTML.
* Sebastian 2: Skontaktować się z Tomkiem W. i poprosić o zdobycie z PKW reguł walidacji dla komisji obwodowych i komisji okręgowych dla najbliższych wyborów prezydenckich.
* Sebastian 3: Skontaktować się z Tomkiem W. i poprosić o pomoc w zdobyciu u Kamila dwóch serwerów:
  * serwer, na którym wystawimy prototyp HTML
  * serwer Continuous Integration
* Sebastian 4 (bonus): Preprojektować prototyp w HTML tak, aby odzwierciedlał formularz dla najbliższych wyborów prezydenckich.
* Sebastian 5 (bonus): Przeprojektować prototyp w HTML tak, aby walidował dane podczas ich wprowadzania, a nie po naciśnięciu przycisku ,,Waliduj''.

**Dyskusja:**
* Aktualny status projektu tzn. lista ToDo vs realia
* Tożsamość grupy: czy to jest grupa analityczna czy całość OpenPKW i nie ma nikogo innego?
* Omawiamy proces komisji obwodowej, kolejność kroków.
* Omawiamy tematykę brudnopisu (poranny, wieczorny, kod kreskowy).
* Pojęcia błędu twardego i miękkiego.
* Kalkulator OpenPKW w wyborach prezydenckich powinien być użyty równolegle do obowiązującego kalkulatora

## 2015.02.18 20:00
Format: Telekonferencja / Skype<br/>
Czas: 90 min<br/>
Obecni: Sebastian Celejewski, Adam Kowalewski, Tomasz Klasa, Adam Mańczuk, Bartłomiej Kokoszka, Przemek Jodkowski, Tomasz Woźniak, Marcin Fabrykowski, Marek Piotrów 

**Postanowienia:**
* Idziemy dwutorowo- jednocześnie tworzymy prototyp i analizę.
* Zaczynamy od tworzenia kalkulatora.
* Przeprowadzamy regularne spotkania (umowne co środę o 20).
* Dokument ze spotkań będzie w głównym repozytorium projektu.
* Dokumentację spisujemy w formacie md.
* Prototyp formularza będzie tworzony w html+js.
* Prototyp formularza posłuży do spisania historii użytkowników, wymagań i zapotrzebowań.

**ToDo:**
* Adam przygotuje plik protokołów
* Tomasz Woźniak- zorganizuje grupę "frontendowów" HTML+JS+CSS do tworzenia formularza.

**Dyskusja:**
Przeprowadzono test konferencji na Tox. Spotkanie miało charakter określenie zakresu prac, poznania się i zakreślenia metodyki dalszej pracy.

## 2015.02.11 18:00
Format: Telekonferencja / Skype<br/>
Czas: 90 min<br/>
Obecni: Sebastian Celejewski, Tomasz Klasa, Adam Kowalewski

Było to pierwsze spotkanie. Ogólna dyskusja m.in. na następujące tematy: sytuacja na github, proces wyborczy, jak wyobrażamy sobie dalszą współpracę. Sprawdzamy Webex jak i Skype. 


**Postanowienia:**
* zaczynamy pracę z OpenProject 
* nawiązujemy dalsze kontakty i zaciśniamy współpracę 

**ToDo:**
* Adam i Sebastian wykonają pierwszą wersję Roadmap
* Sebastian zorganizuje kolejną telekonferencję 


## 2014.12.06 
Format: Spotkanie inicjujące we Wrocławiu <br/>

**Interesujące informacje**
* W Polsce mamy około 27 000 komisji obwodowych. 
* W samej tylko Warszawie mamy około 800 okregów wyborczych.
* Kalkulator nie może liczyć za ludzi [http://youtu.be/gdmSWaz_lP8?t=1h21m45s]
* Kalkulator musi być zdolny do pracy offline. Nie wszystkie komisje mają dostęp do internetu. 
* Kryteria walidacji są określone ustawowo. 
* Testy wyborcze 
1. 	na 3 tyg przed wyborami
2. 	na 1/2 tyg przed wyborami
