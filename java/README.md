
# OpenPKW JAVA

W obecnej chwili podstawowym celem zespołu developerów JAVA jest  zbudowanie niezależnej i obiektywnej formy weryfikacja wyników Wyborów za pomocą tworzonego backend. System ten przeznaczony będzie dla ok 27816 ochotników będących mężami zaufania w obwodowych komisjach wyborczych. Użytkownicy Ci, mają za zadanie za pomocą aplikacji mobilnych przesłać dane z protokołow wyborczych wraz ze zdjeciami tychże protokołów, które udostępnione są publicznie w komisjach obwodowych na koniec dnia wyborczego do zbiorczego systemu agregacji danych (backend). System ten prócz zbierania danych ma zadanie wizualizować pozyskane informacje w postaci diagramów wyborczych z podziałem na województwa. 
 
 

# Członkowie w porzadku alfabetycnzym 

| Członek  | Rola  |
| ------------- | ------------- |
|Adam_K  |  Developer Java  BackEnd |
|Bartek_M |  Developer Java  BackEnd |
|Grzegorz|  Developer Java  BackEnd|
|Jacek_F|   Developer Java  BackEnd|
|Lukasz_F |  Developer Java  BackEnd  |
|Mateusz_A |  Developer Java  BackEnd  |
|Piotr_T |  Developer Java  BackEnd|
|Rafal_R | Koordynacja/Organizacja  |
|Tomek |  Developer Java  BackEnd|
|Wojtek_R |  Developer Java  BackEnd |




**Jak do nas dołączyć?**  
Aby do nas dołączyć skontaktuj się z nami poprzez E-Mail i Skype. 

Kontakt:
  - Rafał Reguła: <rafal.regula@openpkw.pl>
  - Skype: rafal.regula
  
## Informacje o projekcie OpenPKW Java

Strona główna projektu: https://openpkw.pl/ 

GitHub: https://github.com/openpkw/openpkw/tree/master/java




# Oranizacja pracy i linki

- Do modelowania wykorzystujemy Draw.io
- Do zmian w dokumentacji wykorzystujemy  Dillinger.io oraz GitHub
- Do zadań wykorzystujemy Trello
- Wszyscy developerzy mają pełny dostęp do repozytorium
- Każdy feature implementowany jest na branchu. Przed mergem do mastera deweloperzy spotykają się i omawiają propozycje zmian
- Wykorzystujemy metodologie Agile i spotykamy sie w sprinatch co wtorek o 20
- Jesli zajdzie potrzeba spotykamy się częsciej komunikując sie na Skype (grupa OpenPKWJava ) bądz przez liste mailingową ( openpkw-java@openpkw.pl ) 


| Element  | Link  |
| ------------- | ------------- |
| Tablica Trello Java | https://trello.com/b/eX0kOIwp/openpkw-java|
|  Draw.io |    https://www.draw.io  |
| Dillinger.io  |  http://dillinger.io |
|  GitHub  |  https://github.com/openpkw|
|  Mailing List|http://openpkw.pl/mailman/listinfo/openpkw-java|



**Aktualnie poszukujemy!**  

1. Doświadczonych (bądz tez nie - ale pełnych zapału) developerów JAVA
2. Programiste API + JSon do pomocy nad BackEnd ( Security REST ) 



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
2. Postgress 
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


