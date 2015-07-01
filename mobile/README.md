
# OpenPKW Mobile

OpenPKW Mobile  w skrócie OPM, to oprogramowanie typu Service Oriented Architecture (SOA) przeznaczone  m.in. na telefony komórkowe w postaci aplikacji mobilnych dla systemów Android, iOS oraz  Windows Phone. Podstawowym celem OPM jest niezależna i obiektywna weryfikacja wyników Wyborów za pomocą aplikacji mobilnych. Aplikacje te, przeznaczone są dla ok 27816 ochotników będących mężami zaufania w obwodowych komisjach wyborczych. Użytkownicy Ci, mają za zadanie za pomocą aplikacji mobilnych przesłać dane z protokołow wyborczych wraz ze zdjeciami tychże protokołów, które udostępnione są publicznie w komisjach obwodowych na koniec dnia wyborczego. Zważywszy na fakt, iż obecnie aplikacja w fazie projektowania i implementacji nie spełnia przyjętych kryteriów OpenPKW
 * OpenPKW dąży do pełnej zgodności z polskim prawem wyborczym
 * Aplikacja mobilna, w proponowanej wersji, przesyła tylko część protokołu komisji, nie spełnia ona powyższego wymagania
 
główne jej repozytorium zostaje wydzielone do odrębnego pod projektu. Docelowo jednak po zaimplementowaniu pełnej funkcjonalnośći zgodnej z Prawem Polskim  przewiduje się ze repozytorium zostanie włączone w główny nurt OpenPKW. Obecnie OpenPKW Mobile  **tworzy dodatkową funkcjonalność nie sprecycowaną dotychczas przez Panstwową Komisje Wyborczą**.  
 

# Członkowie w porzadku alfabetycnzym 

| Członek  | Rola  |
| ------------- | ------------- |
|Bartek_S | Developer Android, BackEnd |
|Dagna_S | Developer Windows Phone|
|Kamil_S | Developer Android  |
|Lukasz_S|  Developer iOs |
|Marcin_N | Developer Tester Android  |
|Mariusz_W | Developer Windows Phone, BackEnd|
|Marzena Z_I| Media, www|
|Mateusz_A | Developer Windows Phone  |
|Mateusz_J | Developer iOs |
|Mateusz_P | Developer Android,BackEnd  |
|Michal_U | Developer Android  |
|Michal_K | Developer Android  |
|Piotr_T | Developer iOs  |
|Przemek_J | Weryfikacja, Analiza  |
|Przemek_K | Developer Android  |
|Radek_M | Developer Windows Phone  |
|Rafal_M | Prawnik  |
|Rafal_R | Architektura, Organizacja  |
|Robert_P  |Weryfikacja, Analiza   |
|Slawek_P  |Weryfikacja, Analiza   |
|Wojciech_R | Developer Android  |


**Jak do nas dołączyć?**  
Aby do nas dołączyć skontaktuj się z nami poprzez E-Mail i Skype. 

Kontakt:
  - Rafał Reguła: <rafal.regula@openpkw.pl>
  - Skype: rafal.regula
  
## Informacje o projekcie OpenPKW / Mobile

Strona główna projektu: https://openpkw.pl/ 

GitHub: https://github.com/OpenPKW-Mobile/O_Projekcie



# Oranizacja pracy i linki
- Do modelowania Paper Browser wykorzystujemy Draw.io
- Do zmian w dokumentacji wykorzystujemy  Dillinger.io oraz GitHub
- Do zadań wykorzystujemy Trello bądź/i OpenProject
- Wszyscy developerzy mają pełny dostęp do repozytorium
- Każdy feature implementowany jest na branchu. Przed mergem do mastera deweloperzy spotykają się i omawiają propozycje zmian
- Wykorzystujemy metodologie Agile i spotykamy sie w sprinatch co poniedziałek i czwartek
- Jesli zajdzie potrzeba spotykamy się częsciej komunikując sie na Skype (grupa OpenPKW Mobile) bądz przez liste mailingową ( mobilki@openpkw.pl ) 


| Element  | Link  |
| ------------- | ------------- |
| Tablica Trello Android | https://trello.com/b/G0qEJ9M5/openpkw-android|
| Tablica Trello WindowsPhone |    https://trello.com/b/XlP5rmVb/openpkw-windowsphone|
| Tablica Trello iOS |   https://trello.com/b/lzuEMRP3/openpkw-ios |
|  Draw.io |    https://www.draw.io  |
| Dillinger.io  |  http://dillinger.io |
|  GitHub  |  https://github.com/OpenPKW-Mobile|
|  Mailing List|http://openpkw.pl/mailman/listinfo/mobilki|
|Wiki / Kontakty|https://github.com/OpenPKW-Mobile/iOS/wiki/The-Team|


**Aktualnie poszukujemy!**  

1. Doświadczonych (bądz tez nie - ale pełnych zapału) developerów iOS, Android oraz WindowsPhone
2. Programiste API + JSon do pomocy nad BackEnd

# Wizja Systemu
**Opis:**

1.  Za pomocą aplikacji mobilnej użytkownicy (mężowie zaufania), przesyłają dane z protokółow wyborczych z obwodowych komisji
2.  Dane z obwodowej komisji i protokołu wraz ze zdjecięm przesyłane są do BackEndowego systemu
3.  System odbiera dane i zapisuje niezbędne informacje wraz ze zdjeciami zapisanym w oddzielnym katalogu i linkami do zdjęc w samym SQL
4.  System umożliwia przetwarzanie tych danych a także ich weryfikacje przez operatorów 
5.  System udostępnia zweryfikowane dane za pomocą strony www i wykresów, wyspecyfikowanym grupom użytkowników (docelowo wszystkim wyborcom) 


# Proces
**Perspektywa Administratora / Przygotowanie do wyborów** (Backend)

1. Administrator zakłada konta użytkownikom (mężom zaufania)
2. Administrator rozsyła hasła użytkowikom 
3. Administrator zbiera dane użytkownika bądź/i importuje je  z XLS  (Imie, nazwisko, mail , telefon, nr komisji) 
4. System automatycznie wysyła link do aktywacji kont, login i hasło użytkownikom na podany adres e-mail
5. Administrator systemu ma możliwość edycji i weryfikacji kont użytkownków wraz ich danymi (duża fluktuacja użytkownków przed wyborami)
6. Administrator ma możliwość weryfikacji i podglądu listy użytkownikow, ktorzy odebrali hasła i poprawnie przesli procedurę testowego logowania do systemu


 **Perspektywa Użytkownika / Dzień Wyborczy** (Aplikacje Mobilne)

1. Użytkownik uwierzytelnia się w aplikacji mobilnej za pomocą uprzednio otrzymanego loginu i hasła od Administratora
2. Po poprawnym uwierzytelnieniu się system rozpoznaje użytkownika i przypisuje mu automatycznie wczesniej przydzielony numer obwodowej komisji do której się zgłosił mąż zaufania
3. Użytkownik przesyła dane recznie wprowadzajac je do aplikacji mobilnej z protokołu wyborczego wywieszonego publicznie w obwodowej komisji wyborczej. Przekazuje następujące dane:   
 * Ilość uprawnionych do głosowania
 * Ilość wydanych kart do głosowania
 * Ilość kart ważnych
 * Ilość głosów nieważnych
 * Ilość głosów ważnych
 * Ilość głosów dla poszczególnych kandydatow
 
4.  Użytkownik ma rowniez możliwość wysłania informacji z innych dodatkowych komisji wyborczych po przez zmiane okregu, do którego jest automatycznie przypisany ( po przez nacisniećie przycisku Inna Komisja )
5. Użytkownik otrzymuje informacje zwrotną o poprawnym dostarczeniu danych do Systemu BackEnd oraz gratulacje za dobrze wypełnioną "misje" dotyczącą obrony demokracji w PL


# Specyfikacja

## Grupy użytkowników 
1. Administrator Systemu (admin)
2. Użytkownik Aplikacji (user)
3. Operator  Systemu (operator)
3. Gość (guest)

## Atrakcyjna, zachęcająca grafika - Paper Browser :)


![Wygląd PaperBrowser dla Mobile Apps](http://openpkw.nazwa.pl/mobilki.png)

## Risk & Issue Logs
1. Wysyłanie protokołów i zakonczenie liczenia głosów w 25000 komisjach zazwyczaj konczy się o tej samej porze +/- 15 min w przypadku prostych wyborów jakimi są Wybory Prezydenckie.Potrzebna Analiza wydajnosciowa serwerów  w tym (SQL, Moc Obliczeniowa maszyny oraz sama przepustowość łącza i-net). Zastanowić się nad modułem synchronizacji otrzymywania wyników.

2.  W przypadku gdy usługa będzie cieszyć sie bardzo dużą popularnoscią, Goście (wyborcy), którzy będą chcieli sprawdzić niezależne wyniki wyborów na stronie www - mogą spowodować problemy wydajnosciowe i/lub zawieszenie sie serwerów. Do rozważenia wprowadzenie modułu logowania na gości i ograniczenie ilości połaczeń dla danego gościa.   

## Appendix Features:

  
  
##Wymagane oprogramowanie, środowiska DEV oraz technologie

### Mobile
1. Android 4.x - Lolipop
2. Ios 7.xx
3. WindowsPhone 8.x


### Backend (Przewidziana Architektura)
1. Java EE 7 (GlassFish 4, JPA2, CDI, EJB, JSF 2.2 (PrimeFaces 5.1), JAX-RS, JAAS, JavaMail)
2. MySQL 5.5 (UTF8, InnoDB, MySQL Workbench)
3. REST
4. HTML5 
5. CSS3
6. Maven 3
7. Json 2.0 (revised verson)

### Frontend 
1. HTML5
2. JavaScript (AngularJS)
3. CSS3
4. Bootstrap 



## Roadmap
Plan implementacji:

### Wersja 0.1 
* UI - Draw.io Mockup [Done]
* Paper Browser [WiP]

### Wersja 0.2 
* API Concept
* Json Conector Concept

### Wersja 0.3
* API Implementation
* Json Implementation 

### Wersja 0.4
* Prototype Apps
* SQL Sychronization 


### Wersja 0.5
* Bug Fixing 
* Code Review


### Wersja 0.6
* Beta Release
* Apps Testing


### Wersja 0.7
* Bug Fixing 
* Code Review (Niebezpiecznik, HackerSpace)

### Wersja 1.0
* Final Release
