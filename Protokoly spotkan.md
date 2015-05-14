# Protokoły spotkań

## Agenda na najbliższe spotkanie
Zbieramy tematy na najbliższą telekonferencje tj. 13 maja 2015. Będę wdzięczny za akceptację schematu:   
**data [autor] [status] [treść]**  

### Stałe tematy 
* Status implementacji
  * [openpkw-kalkulator-obwodowy-web](https://github.com/openpkw/openpkw-kalkulator-obwodowy-web) - Marcin T.
  * [openpkw-dokument-generator](https://github.com/openpkw/openpkw-dokument-generator) - Sebastian C.
* Analiza jak i nowości z PKW [Przemek, Robert] 
* [Przemek] [Permanent] Kontynuacja analizy OpenPKW oraz analiza działania państwowych systemów wyborczych. Budowa Systemu Wyborczego OpenPKW.  
Linki: [**tutaj**]  (https://github.com/openpkw/openpkw/blob/master/dokumentacja/System_OpenPKW.md) i tutaj: [**katalog DOKUMENTACJA**] (https://github.com/openpkw/openpkw/blob/master/dokumentacja) oraz aktualizowany spis plików i ich zawartość
w [**README.md**] (https://github.com/openpkw/openpkw/blob/master/dokumentacja/README.md)  

### Dodatkowe tematy
* 2015.05.03 [Rafał Malujda] [new] System do przeprowadzenia głosowania: wybór budżetu obywatelskiego m.Szczecin.  
* 2015.04.05 [Adam] Proces integracji kontrybutorów. OpenProject pozwala na zakładanie konta ale co dzieje się z tymi ludźmi? Czy nowi użytkownicy mogą sami dopisać się do zespołów? 

## Aktualna lista ToDo: 
Aktuala lista ToDo zawiera wszystkie aktualnie otwarte pozycje.   
Nazewnictwo: **data-nr: [odpowiedzialny] [status ], [opis]**. 

* 2015.03.25-0 [Tomek] [Pending] Przekazac namiary na Java Developers. 
* 2015.03.25-9 [Tomek, Rafał Malujda] [Pending] Dokończyć temat prawny ws AGPL i kodu systemu dla openPKW.

## 2015.05.13 20:00
Format: Telekonferencja / Skype  
Czas: 120 min.  
Obecni: Piotr Tobolski, Sebastian Celejewski, Adam Kowalewski, Przemek Jodkowski, Rafał Reguła, Kacper Jasiński

### Przebieg dyskusji
* Rozliczenie zadań z ostatnich dwóch tygodni.
* Stan implementacji:
  * openpkw-kalkulator-obwodowy-web - widoczne postępy w walidacji, poprawione błędy
  * openpkw-dokument-generator - dodane generowanie kodów QR dla OpenPKW Mobile
* Nowości z PKW
  * Nowy system wyborczy działa dobrze, użytkownicy go zaakceptowali.
* Analiza Przemka
  * Kończy analizę referendum.
* Proces integracji kontrybutorów
  * Nie było Tomka.
  * Nie bardzo wiadomo jak się sprawy mają.
* Merge OpenPKW Mobile do OpenPKW
  * Wrócimy do tematu po drugiej turze.
* Jak najlepiej zarządzać projektami OpenPKW?
  * Model 'silnego lidera' działa doskonale.
  * Model 'samoorganizacji' nie działa wcale.
* Czy kontynuujemy prace nad OpenPKW, skoro nowy system PKW działa dobrze?
  * Tak, nawet jeśli prace będą posuwać się do przodu bardzo powoli.
* Nastąpi integracja aplikacji mobilnej OpenPKW Mobile z BackEnd OPW w celu osiągniecia wspólnie sukcesu. Dane liczbowe przekazane przez userów via Mobile wpadną na serwer OPW, zdjęcia na serwer Open-PKW

Zrealizowane TODO:
* 2015.04.15-5 [Adam & Sebastian] [Obsolete] Omówić temat konfiguracji serwara CI. 
* 2015.04.22-2 [Marcin] [Done] Wysłać Przemkowi co już zrobił w zipie lub wystawić na Dobromirze ręcznie
* 2015.04.22-3 [Sebastian] [Done] Wywalić credentials JBossa z pom.xml

## 2015.05.06 20:00
Format: Telekonferencja / Skype  
Czas: 15 min.  
Obecni: Kacper Jasiński, Przemek Jodkowski, Rafał Reguła

Odpowiedzialny za protokół: Rafał 


### Przebieg dyskusji
* Nie udało sie rozliczyć wiekszosci tasków z poprzedniego tygodnia, gdyż było za mało osób na Telco
* Zostały przekazane informacje odnosnie aplikacji mobilnych i ich statusu gotowości wraz z podanymi wtępnymi terminami i funkcjonalnościami
* Nad Aplikacjami mobilnymi pracuje obecnie 15 do 18 developerów mobilnych
* Rafał stwierdził, iż pomimo prawdopodobnej gotowości aplikacji na zblizające sie tury wyborów nie ma jeszcze całego BackEnd co stanowi realny problem odebrania danych z aplikacji mobilnych
* Rafał stwierdził, iż nikną drastycznie szanse na zbudowanie BackEnd po stronie OpenPKW
z powodu m.in Todos ---> 2015.03.25-0. Innym problemem jest pojedyncza maszyna Dobromir, która najprawdopodobniej nawet jak by powstał na niej serwer odbierania danych mogła by nie podołałać wydajnościowo 
* Została podniesiona ponownie kwestia maila z dnia 24.04.15 wyslanego na liste dyskusyjną srodowcy odnosnie integracji z organizacją OPW wraz z podaniem konkretnych rozwiązań umożliwiających osiągniecie sukcesu dla obu organizacji
* Kwestia ta została podniesiona z powodu braku odpowiedzi na mail przez wiekszość adresatów i zainteresowanych do których mail był skierowany 
*  Mamy stały i dynamiczny progres w rozwoju oprogramowania w OpenPKW. Przejawia się on np w nawiązaniu kontaktu z PKW w celu upowrzechnienia idei przejrzystosci wyborów i pokazaniu gotowego rozwiazania będącego w posiadaniu OpenPKW-Mobile (aplikacji mobilnych). Rozwiązanie te zostanie przedstawione na robocznym spotkaniu z PKW zaplanowanym na nastepny tydzień 
* Wszyscy obecni wyrazili ubolewanie z powodu absensji wiekszosci kontrybutorów OpenPKW na konferencji

### Todo zrealizowane
2015.04.15-3 [Rafal Malujda] Wysłanie pisma do PKW w sprawie spisu Obwodowych Komisji Wyborczych w trybie dostępu do informacji publicznej (plik csv)

## 2015.04.29 20:00
Format: Telekonferencja / Skype  
Czas: 70 min.  
Obecni: Marcin Fabrykowski, Kacper Jasiński, Adam Kowalewski, Sebastian Celejewski, Przemek Jodkowski, Paweł (pwl), Marcin Tokarski, Rafał Reguła

Odpowiedzialny za protokół: Sebastian

### Przebieg
* Rozliczenie zadań z poprzedniego spotkania.
* Stan implementacji
  * infrastruktura - przygotowane skrypty tworzące serwer Continuous Delivery oraz serwer dla kalkulatora obwodowego
  * openpkw-kalkulator-obwodowy-web - rozpoczęte prace nad walidacją formularza
  * openpkw-dokument-generator - brak postępów
* Połączenie repozytoriów OpenPKW i OpenPKW Mobile
  * Problem: W rzeczywistości mamy strukturę trzypiętrową: organizacja OpenPKW, pod nią dwa systemy (OpenPKW i OpenPKW Mobile), poniżej poszczególne moduły tych systemów. W GitHubie natomiast są tylko dwa poziomy: organizacje i projekty.
* Plany dotyczące OpenPKW Mobile
  * Najprawdopodobniej nie uda się ukończyć aplikacji na pierwszą turę wyborów prezydenckich 2015, ale jest szansa zdążyć na drugą turę.
* Plany dotyczące złożenia obywatelskiego projektu ustawy "e-wyborów" i technicznych aspektów niezbędnych do ich przeprowadzenia za pomocą systemu Open Source  - Rafał
* Plany dotyczące zebrania i weryfikacji namiarów na męzów zaufania OpenPKW Mobile - Rafał

### Todo zrealizowane
* [Tomek, Przemek] Napisanie pisma do PKW w sprawie spisu Obwodowych Komisji Wyborczych
* 2015.04.22-1 [Sebastian] [New] Dostować serwis do dokumentów do nowego JSONa
* 2015.04.22-4 [Sebastian] [New] Posprzątać stary projekt PocKalkulatorWyborczyHtml

## 2015.04.22 20:00
Format: Telekonferencja / Skype  
Czas: 90 min.  
Obecni: Adam Kowalewski, Sebastian Celejewski, Tomasz Woźniak, Przemek Jodkowski, Sławek Pietrasiewicz, Rafał Reguła, Marcin Tokarski

Odpowiedzialny za protokół: Sebastian

### Przebieg
* Status kalkulatora
  * Zakończone jest przerabianie kodu na AngularJS.
  * Rozpoczęte są prace nad walidacją oraz dodawaniem i usuwaniem członków komisji.
* Architektura OpenPKW
  * Adam przedstawił propozycję docelowej [architektury OpenPKW](#20150417-2000-architektura-openpkw)
  * Projekt PocKalkulatorWyborczyHtml został rozbity na dwa projekty: 
    * `openpkw-kalkulator-obwodowy-web` 
    * `openpkw-dokument-generator`
  * Projekty dla następnych modułów będziemy tworzyć w momencie, kiedy rozpoczną się prace nad tymi modułami.
* Wizja prac nad OpenPKW
  * Pytanie Przemka: Czy skupiamy się na jednym komponencie (Kalkulatorze Obwodowym), czy też realizujemy pełny zestaw komponentów OpenPKW ([diagram](https://www.draw.io/?url=https%3A%2F%2Fraw.githubusercontent.com%2Fopenpkw%2Fopenpkw%2Fmaster%2Fdokumentacja%2Fprocesy%2FPlatforma_Wyborcza_OpenPKW.xml)).
  * Omówiliśmy sprawę pod kątem zasobów OpenPKW, sensowności budowania jednego lub wielu komponentów, organizacji pracy itd.
  * Zdecydowaliśmy, że spróbujemy rozszerzyć prace na następne komponenty. Nie na wszystkie, tylko może jeden lub dwa nowe komponenty oprócz Kalkulatora Wyborczego.
* Nowości z PKW
  * PKW może przyjąć oprogramowanie z zewnątrz. Do tej pory PKW raczej nie była zainteresowana jakimkolwiek oprogramowaniem z zewnątrz, teraz to się zmieniło. Być może jest sens zbudować jakiś komponent inny od tego, co już ma PKW, który PKW mogłaby wykorzystać.
* Wprowadzenie project managerów do OpenPKW
  * Problem zasadniczy w OpenPKW: brak czasu osób najbardziej zaangażowanych. W konsekwencji kuleje organizacja pracy, koordynacja zadań, komunikacja itd.
  * Pomysł Tomka: wprowadzić do OpenPKW osób odpowiedzialnych tylko za organizację pracy.
  * Ustalenia: Tomek zaprosi PMO do projektu, będziemy się z nimi spotykać w środy, wspólnie ustalimy jakie komponenty wezmą na warsztat w pierwszej kolejności i jak zbudują swoje zespoły.
* Pismo do PKW
  * Wyślemy do PKW pismo z prośbą o udostępnienie spisu Obwodowych Komisji wyborczych.
* Relacje pomiędzy OpenPKW a OpenPKW Mobile
  * Do tej pory OpenPKW oznaczało zarówno organizację, jak i produkt (OpenPKW jako system do wspomagania wyborów przeznaczony dla konkretnego klienta: PKW).
  * Pod egidą organizacji OpenPKW mogą powstawać różne projekty, m. in. system OpenPKW.

### Todo zrealizowane
* 2015.04.15-1 [Sebastian] [New] Wydzielić backend z projektu PocKalkulatorWyborczyHTML do nowego projektu - serwisu generujcego rozmaite protokoly na podstawie szablonów
* 2015.04.15-2 [Adam] Edycja pliku README.md w głównym repozytorium. Dodane zostaną rozdziały *Kontakt* i *OpenPKW w liczbach*
* 2015.04.15-4 [Adam & Sebastian] Omówić i pozakładać odpowiednie repozytoria dla modułów w github. 
* 2015.04.17-1 [Wojtek] Definicja nowych repozytoriów dla Kalkulatora Wyborczego. 

##2015.04.17 20:00 (Architektura OpenPKW)
Format: Telekonferencja / Skype  
Czas: 60 min.  
Obecni: Adam Kowalewski, Sebastian Celejewski, Wojtek Szostak  
Odpowiedzialny za protokół: Adam 

**SOA**  
Przedyskutowaliśmy tematykę architektury SOA z perspektywy migracji prototypu Kalkulatora Wyborczego do nowych repozytoriów. Zdefiniowaliśmy następujący schemat nazewnictwa `vendor-product-variant`. Przy czym jako `product` preferujemy obiekty domeny jak np. dokument.

Konkretne przykłady dla Kalkulatora Obwodowego  
`openpkw-kalkulator-obwodowy-web`  
`openpkw-kalkulator-obwodowy-desktop`  
`openpkw-kalkulator-obwodowy-mobile`  
  
Konkretne przykłady dla serwisu dokumentów  
`openpkw-dokument-service`  
`openpkw-dokument-generator`   
`openpkw-dokument-repository`  
`openpkw-dokument-archive`  

Kolejne repozytoria będą zakładane stopniowo, w ramach postępów  implementacji. Pierwszy krok jest udokumentowany w ToDo [2015.04.17-1]


##2015.04.15 20:00
Format: Telekonferencja / Skype  
Czas: 120 min.  
Obecni: Adam Kowalewski, Przemek Jodkowski, Rafał Reguła, Sebastian Celejewski, Kacper Jasiński, Marcin Marzec.  
Odpowiedzialny za protokół: Adam   

**Dyskusja**  
* SOA [Adam]  
  * Przedyskutowaliśmy temat proponowanej architektury SOA ([Service-Oriented Architecture](http://pl.wikipedia.org/wiki/Architektura_zorientowana_na_us%C5%82ugi)) dla OpenPKW, czyli podziału systemu na wpełni niezależne moduły. Jesteśmy również zgodni co do pierwszych kroków które podejmiemy w tym właśnie kierunku. Pierwszym z nich będzie rozbicie repozytorium prototypu kalkulatora na:
    * Moduł 1: Serwer drukowania formularzy
    * Moduł 2: Kalkulator Wyborczy Web-AngularJS
      * Prototyp kalkulatora staje się tym samym pełnowartościową częścią - modułem - platformy OpenPKW.
  * Kolejnym niezależnym krokiem będzie natomiast realizacja:
    * Moduł 3: Serwer archiwizacja plików binarnych
* Kalkulator [Sebastian]
  * Aktualnie mamy 2 aktywnych programistów AngularJS. 
  * Sprzątanie kodu powoli dobiega końca. 
  * Separacja frontend od backend nastąpi na dniach. ToDo 2015.04.15-1 i 2015.04.15-4
* Mobile [Rafał]
  * W poniedziałek odbyła się pierwsza telekonferencja z potencjalnymi programistami aplikacji mobilnych. Zgłosiło się kilka doświadczonych osób. Rafał widzi duże szanse na wydanie pierwszej stabilnej wersji jeszcze przed nadchodzącymi wyborami Prezydenta RP. 
Przedyskutowaliśmy również aktualne szkice (paper browser) interfejsu aplikacji mobilnej i zidentyfikowaliśmy następujące punkty: 
    * OpenPKW dąży do pełnej zgodności z polskim prawem wyborczym. 
    * Jako że aplikacja mobilna, w proponowanej wersji, przesyła tylko część protokołu komisji, nie spełnia ona powyższego wymagania. 
    * Jesteśmy za dokładniejszym opracowaniem paper browser w którym uwzględniony będzie pełen protokół komisji obwodowej. 
  * Aktualnie widzimy tutaj 2 możliwości / aplikacje
    * Aplikacja mobilna robiąca zdjęcie pojedynczych stron protokołu komisji obwodowej i wgrywania ich do modułu archiwizacji plików binarnych. Zdjęcia wgrane do tego modułu mogą być udostępnione innym aplikacjom / modułom. 
    * Aplikacja mobilna walidująca protokół komisji obwodowej z funkcjonalnością OCR. Wykonuje zdjęcie protokołu, OCR odczytuje liczby z pól po czym wykonuje pełną walidację protokołu. Całość odbywa się bezpośrednio na telefonie, komunikacja z serwerem jako opcja dodatkowa.     
  * Temat będzie omawiany w tygodniu. 
* Dostęp do informacji publicznej [Przemek & Adam]
  * PKW powołała już obwody na nadchodzące wybory Prezydenta RP. Jest to lista ostateczna. Dlatego też powinniśmy jak najszybciej wystosować odpowiednie pismo do PKW. ToDo [2015.04.15-3]
* Aktualna sytuacja w PKW [Przemek]
  * Nowy system PKW jest odbierany przez gminy jak i koordynatorów bardzo pozytywnie. Aktualnie odbywają się szkolenia. Architektura jak i system muszą się jednak sprawdzić. Podczas nadchodzących wyborów Prezydenta RP nowy system nie będzie aktywnie wspomagał pracy komisji obwodowych. W dniu wyborów nowy system będzie jedynie testowany. 
* Integracja / rekrutacja nowych kontrybutorów
  * Aktualna rekrutacja poprzez skrzynkę E-Mail działa kiepsko, głownie ze względu na konieczność ręcznego przesyłania danych a co za tym idzie opóźnienia. 
Kacper zaproponował lepsze wykorzystania mediów społecznościowych takich jak Facebook. Sprecyzowane wpisy adresowane bezpośrednio do odpowiednich grup np. grupa użytkowników AngularJS. Jesteśmy pozytywnie nastawieni do tej propozycji. 
  * Integracja - Brakuje dokumentacji typu quickstart dla nowych kontrybutorów. Patrz ToDo [2015.04.15-2]

**ToDo zrobione** 
* 2015.03.25-5 [Adam] [DONE] Posprzątać do końca wiki.  
* 2015.04.08-1 [Adam, Sebastian, Maciek] [Done] Zorganizować spotkanie na temat infrastruktury.
* 2015.04.08 [Brygada RR + Przemek] [Done] Co dalej w temacie nowego systemu informatycznego w PKW/KBW? Jakie nowe wieści?
* 2015.04.08. [Przemek] [Done] **Omówienie Systemu WOW (Wsparcie Organów Wyborczych) tworzonego przez PKW.** [**Plan działania PKW do 10.05.2015.**] (https://github.com/openpkw/openpkw/blob/master/dokumentacja/PKW_pracuje.md)

##2015.04.08 20:00
Format: Telekonferencja / Skype  
Czas: 110 min  
Obecni: Adam Kowalewski, Przemek Jodkowski, Rafał Reguła, Sebastian Celejewski, Bartłomiej Kokoszka, Marzena Zasińska-Igła, Maciek Strzelecki, Marcin Tokarski.  
Odpowiedzialny za protokół: Sebastian.

**Dyskusja**
* Przywitanie nowych osób.
* Co się będzie działo kiedy ukończymy OpenPKW? Czy PKW wdroży OpenPKW? Czy ktoś inny wykorzysta OpenPKW?
* Rozpoczęcie prac nad trzecim projektem w ramach OpenPKW - aplikacja mobilna do weryfikacji zdjęć protokołów.
* Perturbacje po wypuszczeniu wiadomości o postępach prac i komentowaniu kodu źródłowego. Ogólnie: efekt był bardzo pozytywny, parę osób zainteresowało się projektem, Adam i Sebastian posprzątali kod Kalkulatora OpenPKW w GitHubie.
* Rozdział siły roboczej programistów pomiędzy Kalkulator OpenPKW i Otwartą Platformę Wyborczą. OPW jest bardziej atrakcyjną aplikacją, więc nastąpiło wyssanie programistów z Kalkulatora. Ustalamy, że realizujemy dalej oba systemy. W piątek będzie spotkanie zespołu programistycznego, na którym mają się pojawić nowe osoby. Może wystarczy obsady na oba systemy.
* Sytuacja w KBW/PKW. Przeprowadzenie wyborów z wykorzystaniem systemu informatycznego versus instrukcje KBW. Podobno dzisiaj odbyły się szkolenia koordynatorów, ale brak szczegółów.
* Kwestia otwartości projektu OpenPKW czy też jej braku. Jak ludzie z zewnąrz mają się udzielać w OpenPKW? Projektowi brakuje otwartości. Jedyne narzędzie to lista mailingowa. Niektóre osoby nie chcą korzystać z listy mailingowej i chciałyby, aby powstało forum.
* Brak adminów. Maszyny wirtualne - czy możemy zrobić porządek na Dobromirze? Dołączył do nas Maciek Strzelecki i ma parę konkretnych propozycji. Zrobimy spotkanie administratorów.
* Propozycja Przemka dotycząca spisywania głównych założeń dla OpenPKW - przyjęta przez wszystkich. Dyskusja o tym czy kontynuować analizę bez prac programistycznych, wraz z pracami programistycznymi, czy jakoś inaczej. Chcemy dojść do tego, że prototypowanie dogoni prace analityczne.
* Wzorce dokumentacji. Rafał i Przemek przejrzą propozycje, przykłady, wzory.
* Status implementacji
  * Kalkulator OpenPKW - porządne uporządkowanie kodu, powolne odtwarzanie zespołu deweloperskiego.
* Czy chcemy grafika do OpenPKW? Tak!
* Przywitanie nowej rzeczniczki OpenPKW - Marzeny. Jakie mamy konta w serwisach społecznościowych? Co będziemy na ten konta wrzucać? Jaka będzie procedura przygotowywania newsów do wrzucenia w kanały mediów społecznościowych? W jaki sposób Marzena będzie zbierać informacje o tym, co się dzieje w projekcie?
* Sprzątanie na wiki - zostało jeszcze trochę rzeczy do wyrzucenia.
* Pomoc z NIWY w sprawie organizowania zespołu.
* Dla Kalkulatora OpenPKW chcemy skorzystać z domeny openpkw.pl, niezależnie od tego jak długo będzie trwało ustawianie tego.

**ToDo zrobione** 
* 2015.04.01-1 [Tomek] [Done] Konfiguracja OP i maila, żeby działały prawidłowo.
* 2015.04.01-2 [Tomek] [Done] Konfiguracja Jenkins/AZURE w lepszej specyfikacji do A3 z A0.
* 2015.04.01-3 [Tomek] [Done] Przekazanie sudo/ssh Admin dla Marcina, Sebastiana, Adama.
* 2015.04.01-4 [Marzena] [Done] Działanie PR na Fan Page - pokazanie w komunikacie linka do POC Kalkulator i naszej dokumentacji na GitHub.
* 2015.03.25-2 [Marcin, Sebastian, Adam] [Done] Definicja zadań (user story) dla kontrybutorów POC.
* 2015.03.25-6 [Rafał] [Done] Zaproponować dokumenty Project Office (dokumentacja projektowa) + wewnetrzna komunikacja (kontakty do nas wszytkich).

##2015.04.01 20:00 
Format: Telekonferencja / Skype  
Czas: 110 min  
Obecni: Adam Kowalewski, Tomasz Woźniak, Przemek Jodkowski, Rafał Reguła, Marcin Fabrykowski   
Odpowiedzialny za protokół: Rafał 

**Dyskusja**
* Rozmowa dotycząca starej platformy wyborczej wykorzystywanej w wyborach samorządowych 2014
* Rozmowa dotyczaca przyszłosci OP - patrz ToDo [2015.04.01-1]
* Rozmowa dotycząca Konfiguracji Azure - patrz ToDo [2015.04.01-2]
* Przekazanie ssh/sudo admin dla marcina, adama , sebastiana - Patrz ToDo [2015.04.01-3]
* Rozmowa ws potrzeby działania PR od naszej Pani rzecznik i komunikacji na zewnatrz w projekcie - Patrz ToDo [ 2015.04.01-4]
* Rafał Zobligował sie ze po wystawieniu komunikatu przez Pania rzecznik na Fun Page ze mamy działajay kalkulator i szukamy ludzi do pomocy - bedzie koordynował nabór programistów i przekazywał info Tomkowi o statusie z tym procesem zwiazanym.
* Na poswietach pomysl Tomka dotyczacy Vloga do zrealizowania w przyszłosci. 

**ToDo zrobione** [data],[autor],[status], [opis]
* 2015.03.25-6: [ADAM], [DONE] : Pozamykać Jurasic Ticket 
* 2015.04.01 [Sebastian] [CLOSED]: Czy OPW powstaje w ramach OpenPKW czy obok OpenPKW z wykorzystaniem ludzi związanych z OpenPKW? Pytam, bo to może być sprawa konfliktogenna. Chciałbym, aby sytuacja była klarowna  [OPW powstaje równolegle z OpenPKW]
*  2015.03.31 [Rafal] [CLOSED] : Raport NIK ws Majowych wyborów i rekomendacja liczenia głosów ręcznie. Problemy po stronie PKW. Czy starać się zmobilizować polityków zeby nagłosnili mocniej temat. [Co my mozemy zrobić - nic] 
* 2015.03.25-3: [Robert, Rafał]  [CLOSED], Gromadzenie informacji na temat reguł walidacji i plików  KLK. [Jak sie pojawi info od PKW ze KLK będą wykorzystywana to temat powróci]


##2015.03.25 20:00 
Format: Telekonferencja / Skype  
Czas: 120 min  
Obecni: Adam Kowalewski, Sebastian Celejewski, Tomasz Woźniak, Przemek Jodkowski, Rafał Reguła, Marcin Tokarski, Robert Postek, Rafał Malujda  
Odpowiedzialny za protokół: Rafał 

**Dyskusja**
* Adam: Aktualna sytuacja na wiki - musimy tam posprzątać. 
  * Patrz ToDo [2015.03.25-5]
* Adam: Aktualna sytuacja w issues - same jurrasic tickets.
  * Patrz ToDo [2015.03.25-6]
* Rafał Reguła: Brak koordynacji w projekcie oraz hierarchicznej struktury organizacyjnej projektu z podziałem na role członków OpenPKW. Potrzeba ustematyzowanie tasków i obowiazków w odniesieniu do ról. Issue do zamknecia. Problem rozwiazany. 
*  Sebastian: Potrzeba zaangazowania wiekszej ilosci programistów JavaScript [pending]
 *  Patrz ToDo Tomek 
* Rafał - Zaproponuje dokumenty odnosnie Project Office i dokumenatcji [pending]
* Rafal Malujda. Dołaczył do telekonferencji, nakresił w czym moze i jak pomóc. Zaproponował zeby tematy prawnicze wysłac do niego. Opisał zasady licencjonowania AGPL dla openPKW. Zobligował sie ze w ramach mozliwosci bedzie starał sie byc cyklicznie na telekonferencjach od 21 godziny.  

**ToDo zrobione** [data],[autor],[status], [opis]
*  [Adam, Sebastian] [Done] Czy tutaj omówimy jakie mamy maszyny wirtualne i co na nich już stoi? Np. Jenkins na GlassFishu, prototyp kalkulatora na JBossie. [Omówione]
*  2015.03.25 [Przemek] [Analiza Wstepna] [Done] najnowsze zasady poprawności protokołów dla wyborów prezydenckich:  [walidacja](https://github.com/Tirramisu/openpkw/blob/master/walidacja_2015_prezydent.md) 
*  2015.03.25 [Adam] [Done] Aktualna infrastruktura OpenPKW (kontynuacja z ubiegłego tygodnia)
*  2015.03.25[Adam], [Done], Odnowi kontakt z NIWA. Tematyka infrastruktury i CI. Postara się zaprosić kogoś z NIWA do udziału w jednej z nadchodzących telekonferencji [Nie ma potrzeby, mamy obecnie infrastrukture serwerowa] 
*  2015.03.25  [Tomasz Woźniak], [Done], Zdobyć w PKW informację gdzie i kiedy generowany jest barcode dla formularzy? Czy w kalkulatorze czy na serwerze. SC: Ja bym to uznał za zamknięte, bo wiemy, że dotychczas barcode był generowany w kliencie.
*  2015.03.25  [Tomasz Woźniak], [Done] Aktualizacja kontaktów na openpkw.pl
 


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
