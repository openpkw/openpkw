# Protokoły spotkań


## Agenda na najbliższe spotkanie 
Zbieramy tematy na najbliższą telekonferencje. Będę wdzięczny za akceptację schematu **autor: treść**
* Adam: Strona internetowa openpkw.pl, grupa jak i Fanpage na Facebook nadal milczą, proponuje nawiązać kontakt z administratorami i wyznaczyć 2-3 osoby odpowiedzialne za ową domenę.
* Adam: Tematyka NIWA CI(Continuous Integration). Proponuje wysłać zapytanie do NIWA czy mogliby nam udostępnić serwer CI, najlepiej Jenkins, jak i doświadczonego administratora - czyli osobę która zna tematykę CI jak i Jenkinsa jak własną kieszeń.
* Adam: IMHO na dzień dzisiejszy jesteśmy zbyt roz-forkowani. Powinniśmy ASAP usprawnić proces synchronizacji z głównym repozytorium.
* Sebastian: Kilka spraw deweloperskich (powitanie członków zespołu deweloperskiego, postępy w prototypie).

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
brak

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
* Pojęcia błędu twardego i miękkiego .

<br/><br/><br/>
brudnopis poranny
brudnopis po 21:00
————————————
Jeżeli brudnopis poranny = brudnopis po 21 -> wprowadzamy brudnopis poranny 
Jeżeli brudnopis poranny (różny) brudnopis po 21 -> wypełniamy brudnopis po 21 i wprowadzamy do systemu

sposób wpisywania do systemu:
- pierwsze wprowadzanie danych z brudnopisu (z góry do dołu) 
- drugie wpisywanie danych z brudnopisu (z dołu do góry)
———————————————————————————————————
podczas każdego wpisywania danych następuje weryfikacja:
- błąd twardy: system uniemożliwia wpisanie dalszych informacji
- błąd miękki: system umożliwia wpisanie dalszych danych

Kalkulator OpenPKW w wyborach prezydenckich powinien być użyty równolegle do obowiązującego kalkulatora

## 2015.02.18 20:00
Format: Telekonferencja / Skype<br/>
Czas: 90 min<br/>
Obecni: Sebastian Celejewski, Adam Kowalewski, Tomasz Klasa, Adam Mańczuk, Bartłomiej Kokoszka,Przemek Jodkowski, Tomasz Woźniak, Marcin Fabrykowski, Marek Piotrów 

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
