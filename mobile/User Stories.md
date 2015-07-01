# User story - kompletna lista 
Rozróżniamy trzy warianty aplikacji OpenPKW Mobile:

 * Wariant na wybory prezydenckie 2015
 * Wariant rozrzerzony  Wybory prezydenckie 2015
 * Wariant docelowy - Dowolne Wybory Prezydenckie zgodne z uchwalami PKW i Ordynacją Wyborczą 


Pojedyncze user story organizujemy z perspektywy użytkownika 

Legenda Perspektyw: U-User, A-Admin , O-Operator , K-Koordynator

Schemant nazewnictwa: OPM-{perspektywa}-{numer}. 


## Wariant Prezydent 2015 
Jest to lista minimalnych wymagań by obsłużyć nadchodzące wybory

### Użytkownik 

* OPM-U-1 : Jako użytkownik na stronie tytułowej widzę Logo (OpenPKW) oraz link do polityki prywatnośći i zasad korzystania z aplikacji wraz z informacją o akceptacji ww. jesli chce korzystac z Apk 
* OPM-U-2 : Jako użytkownik mogę się zalogować do aplikacji przy pomocy loginu i hasła otrzymanego od Administratora w postaci maila wraz z dalszymi komunikatami
* OPM-U-3 : Jako użytkownik mogę z pozycji aplikacji poprosić o przypomnienie hasła w postaci maila
*  OPM-U-4 : Jako użytkownik widzę w górnej częsci ekrany komunikat dotyczący Komisji Wyborczej do której jestem przypisany i z której będe przekazywał dane liczbowe i zdjęcia 
*  OPM-U-7 : Jako użytkownik widzę po wybraniu danej komisji w górnej częsci ekranu informacje: Detaliczne dane komisji tj nr, nr,teryt, Nazwa, Adres. A ponizej Uproszczony formularz liczb wyborczych oraz Listę kandydatów ( scroll list )
* OPM-U-8 : Jako użytkownik otrzymuje automatycznie listę kandydatów biorących udział w I jak i II turze wyborów (API). Uproszczony Formularz liczb wyborczych nie zmienia się
* OPM-U-9 : Jako użytkownik mogę zmienić/wybrać inną komisje po przez nacisnęcie przycisku "INNA KOMISJA"
* OPM-U-10 : Jako użytkownik mogę wpisać dane liczbowe z protokołu wyborczego: do uproszczonego formularza liczb wyborczych i listy kandydatów
* OPM-U-11 :  Jako użytkownik otrzymuje bezpośrednią walidację błędów twardych w aplikacji wraz z widocznymi komunikatami o błedach bądź też komunikatem o poprawnośći wpisanych danych
* OPM-U-12 :  Jako użytkownik mam możliwość wykonania zdjęć każdej pojedynczej stronie protokołu wyborczego bez względu na jego ilość stron
* OPM-U-13 :  Jako użytkownik mam możliwość zweryfikowania i podgladu zrobionego zdjęcia każdej strony protokołu wyborczego tak aby było ostre, wyraźne i wykadrowane
* OPM-U-14 : Jako użytkownik nawiguję po aplikacji za pomocą buttonów ( przycisków )
* OPM-U-15 :Jako użytkownik dostaje podgląd zdjęc protokołu wyborczego w postaci posortowanych Thumbals, które zamierzam wysłać
* OPM-U-16 : Jako użytkownik mam możliwość uploadowania na serwer danych liczbowych z protokołu wyborczego oraz wykonanych przeze mnie zdjęc samego protokołu
* OPM-U-17 : Jako użytkownik widzę w postaci ProgressBar - czas uploadowania danych wyborczych i zdjęć do serwera 
* OPM-U-18 : Jako użytkownik dostaje komunikat o poprawnym przesłaniu danych na serwer bądz też kłopotach z tym związanych
*  OPM-U-19 : Jako użytkownik dostaje podziekowania za wysłanie danych w postaci komunikatu i przyjemnej animacji GIF
* OPM-U-20 : Jako użytkownik mogę zamknąc aplikacje bądź wybrać kolejną komisje dla której chce przekazać dane
* OPW-U-21 : Jako użytkownik mam możliwość zarejestrowania się po przez aplikacje.  Podając
 * imie
 * nazwisko
 * mail
*  OPM-U-24: Jako użytkownik i dla mojej wygody zostanie wprowadzona funkcja - Zapisz i wyślij zdjęcia  póżniej - w sposób wpełni automatyczny podczas braku połączenia I-net
* OPM-U-28 : Jako użytkownik widzę na każdej stronie aplikacji textowe info dotyczące miejsca w którym sie obecnie znajduje w całym procesie przekazywania danych
* OPM-U-29 : OPM-U-29 : Jako użytkownik po wpisaniu Kodu Terytorialnego Gminy (KOD TERYT) i  nr Obwodu wyświetli mi się unikalna pojedyncza komisja z której będę przekazywał dane 
* OPM-U-30 : Google Analitycs
* OPM-U-31 : Fabric

## Wariant rozszerzony
Jest to lista maximum wymagań by obsłużyć nadchodzące wybory

* OPM-U-22 : Jako użytkownik mam możliwość z pozycji samej aplikacji do uaktualnienia/dodawania do listy komisji - ich numerów w danej lokalizacji, ustalanej za pomocą GPS 
* OPM-U-23 :Numery komisji wyborczych z danych lokazliacji ustalanych za pomocą GPS wyswietlają się w postaci scroll listy - obciętej do 8 pozycji i w zasięgu np do 10 km od lokalizacji telefonu 


## Wariant docelowy
Jest to lista docelowa wymagań by obsłużyć  w  przyszlosci wybory prezydenckie zgodnie z ordynacja wyborczą i wszystkimi uchwalami PKW
* OPM-U-25: Jako użytkownik mam możliwość autentyfikacji i potwierdzenia swojej osoby w postaci certyfikatów autentyfikujących
* OPM-U-26: Jako użytkownik mam możliwość przesyłania danych w pełni bezpiecznie za pomocą enkryptowanego protokołu np TSL
* OPM-U-27: Jako użytkownik i dla mojej wygody wszelkie informacje z protokołu wyborczego przekazywane będą do serwera w postaci automatycznej za pomocą OCR bądz kod QR
* OPM-U-5 : Jako użytkownik widzę po zalogowaniu się listę moich komisji obwodowych do, których jestem automatycznie przypisany ( lista scroll )
* OPM-U-6 : Jako użytkownik mogę wybrać i zaznaczyć z listy komisję z, której będę przekazywał dane liczbowe i zdjęcia ( opcja wyboru komisji check box )
