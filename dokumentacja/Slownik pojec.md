# Słownik pojęć 
Jest to plik nadrzędny w którym gromadzone są definicje pojęć. Sortujemy alfabetycznie. W podrzędnych plikach MD takich jak np. analizy bądź protokoły linkujemy bezpośrednio do definicji w słowniku.

**Błędy twarde** – informacje przekazywane przez system lub program Kalkulator wyborczy, członkom obwodowej komisji wyborczej o ewidentnych błędach obliczeniowych powstałych w trakcie tworzenia protokołu obwodowego. W systemie komunikaty o błędach twardych są sygnalizowane na czerwono. Protokołu z błedami twardymi nie można zatwierdzić (podpisać), wysłać na serwer centralny ani wydrukować. Drukowane jest jedynie - patrz **Zestawienie błędów**.

**Błędy miękkie** - patrz **Ostrzeżenia.**

**Brudnopis protokołu (Komisja Obwodowa)**
Jest to wydruk oficjalnego szablonu protokołu wyborczego wypełnionego danymi Obwodowej Komisji Wyborczej, lista kandydatów i listą członków obwodowej Komisji Wyborczej - brakuje jedynie liczb z wynikami. Po zamknięciu urn, komisja sprawdza czy brudnopis dostarczony wraz z innymi materiałami wyborczymi nadal jest aktualny. Jeżeli w ciągu dnia wyborczego doszło do zmiany w protokole (np. komitet wyborczy ABC lub konkretny kandydat zrezygnował z kandydowania) to aktualizowany jest szablon i można wydrukować nowy brudnopis. Natępnie członkowie komisji najpierw wypełniają ręcznie brudnopis po czym dane z brudnopisu wpisywane są do Kalkulatora Wyborczego.

**Dane uwierzytelniające** – login i hasło umożliwiające zalogowanie się użytkownikom do programu.

**Koordynator gminny** – osoba upoważniona do wsparcia informatycznego obwodów głosowania na terenie gminy.

**Lista kodów jednorazowych** – lista kodów umożliwiających osobom funkcyjnym zatwierdzenie protokołów obwodowych w systemie.

**Operator obwodowy** – osoba zajmująca się wprowadzaniem danych do programu w obwodzie głosowania. 

**Osoba funkcyjna** – osoba pełniąca funkcję przewodniczącego lub zastępcy w obwodzie głosowania lub konsul.

**Ostrzeżenia** (błędy miękkie) – informacje przekazywane przez program członkom obwodowej komisji wyborczej, w celu ułatwienia sporządzania protokołu obwodowego. Ostrzeżenia mogą (ale nie muszą) wskazywać na niepoprawność wprowadzonych danych. Należy się do nich odnieść w raporcie ostrzeżeń (w niektórych przypadkach musi to być też opisane w protokole obwodowym). W systemie komunikaty o ostrzeżeniach są sygnalizowane na niebiesko, a na wydruku protokołu obwodowego jest pogrubiany numer obwodu głosowania w nagłówku.

**Pełnomocnik ds. informatyki okręgowej komisji wyborczej** – osoba upoważniona do nadzorowania pracy w systemie przez okręgową komisję wyborczą.

**Pliki .klk** - pliki definicyjne dla Kalkulatora wyborczego przygotowywane przez KBW dla obwodowej komisji wyborczej w jednym pliku). Do tej pory był to skompresowany plik .xml, obecnie PKW wprowadza format **JSON**.
Pliki zawierają aktualne informacje z:
    •	z meldunku wyborczego,
    •	o kandydatach,
    •	oraz inne dane potrzebne do działania systemu.
Zmiany którychkolwiek z tych informacji jest natychmiast automatycznie wprowadzane do plików KLK i wymaga pobrania i wczytania do programu nowej wersji tych plików.  

**Protokół obwodowy** – dokument tworzony przez obwodową komisję wyborczą, zawierający wyniki głosowania w obwodzie, wywieszany do publicznej wiadomości oraz przekazywany do okręgowej komisji wyborczej w celu weryfikacji i obliczenia wyników wyborów w okręgu.

**Raport ostrzeżeń** – dokument zawierający informacje o ostrzeżeniach powstałych w trakcie wprowadzania wyników głosowania do programu. Musi być przekazany wraz z protokołami do okręgowej komisji wyborczej.

**Stany protokołu** - 
  * wprowadzony - dokument wypełniony przez operatora komisji obwodowej nastąpił wydruk -> **Zestawienie błędów**
  * gotowy - dokument sprawdzony, poprawiony/brak błędów, gotowy do uwierzytelnienia/podpisania
  * uwierzytelniony	–	dokument uwierzytelniony za pomocą hasła/certyfikatu/kodu jednorazowego przez przewodniczącego, zastępcę lub konsula;
  * wysłany	–	dokument przesłany  przez operatora na serwer centralny;
  * zweryfikowany –	dokument zweryfikowany przez operatora okręgowej komisji wyborczej;
  * zatwierdzony – dokument zatwierdzony przez pełnomocnika ds. informatyki okręgowej komisji wyborczej;
  * odrzucony	-	dokument, który został wysłany niepoprawnie lub z niepoprawnych plików klk lub zawiera błędy uniemożliwiające przyjęcie protokołu. 
      * wariant 1: Protokół wraca do stanu **wprowadzony** w obwodowej komisji wyborczej, można w nim nanieść poprawki.
      * wariant 2: W obwodowej Komisji Wyborczej stan "czysty" tak jak przed rozpoczęciem pracy/wprowadzania danych. Wymagane wprowadzenie wszystkich danych od początku. Odrzucony protokół jest zablokowany i nie można wprowadzić w nim poprawek.

**Użytkownik gminny lub okręgowy** – osoba upoważniona do pracy w systemie w gminie, dzielnicy, konsulacie, Okręgowej Komisji Wyborczej lub Krajowym Biurze Wyborczym. 

**Zestawienie błędów** – dokument pomocniczy obwodowej komisji wyborczej zawierający informacje o błędach i ostrzeżeniach (błędach miękkich) powstających w trakcie wprowadzania protokołu obwodowego. Nie jest przekazywany do okręgowej komisji wyborczej.
