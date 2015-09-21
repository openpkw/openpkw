# Słownik pojęć wyborczych  

**Błędy twarde** – informacje przekazywane przez system  lub program Kalkulator wyborczy (po -> **Walidacji**), członkom obwodowej komisji wyborczej o ewidentnych błędach obliczeniowych powstałych w trakcie tworzenia protokołu obwodowego. W systemie komunikaty o błędach twardych są sygnalizowane na czerwono. Protokołu z błedami twardymi nie można zatwierdzić (podpisać), wysłać na serwer centralny ani wydrukować. Drukowane jest jedynie -> **Zestawienie błędów**.  
Może się zdarzyć, że to co program bierze za **błąd twardy** wystąpiło w rzeczywistości i należy z takim błędem wysłać protokół – w takim przypadku należy skontaktować się gminnym pełnomocnikiem (informatykiem). Trzeba będzie podać kod błędu oraz wyjaśnienie dlaczego taki błąd wystąpił. Te informacje przekazywane są do Okręgowej Komisji Wyborczej i po analizie możemy (lub nie) otrzymać kod odblokowujący. Kod przekazany operatorowi, umożliwia wysyłkę protokołu pomimo błędu.   

**Błędy miękkie** - patrz -> **Ostrzeżenia.**

**Brudnopis protokołu (Komisja Obwodowa)**
Jest to wydruk oficjalnego szablonu protokołu wyborczego wypełnionego danymi Obwodowej Komisji Wyborczej, listą kandydatów i listą członków obwodowej Komisji Wyborczej - brakuje jedynie liczb z wynikami. Po zamknięciu urn, komisja sprawdza czy brudnopis dostarczony wraz z innymi materiałami wyborczymi nadal jest aktualny. Jeżeli w ciągu dnia wyborczego doszło do zmiany w protokole (np. komitet wyborczy lub konkretny kandydat zrezygnował z kandydowania) to centralnie aktualizowany jest szablon (lub należy pobrać nowy -> **Plik KLK** i wgrać go do systemu lokalnego) i można wydrukować nowy już aktualny szablon/brudnopis. Natępnie członkowie komisji najpierw wypełniają ręcznie brudnopis i przekazują go do -> **Operatora obwodowego**, po czym dane z brudnopisu wpisywane są do Kalkulatora Wyborczego.

**Dane uwierzytelniające** – login i hasło umożliwiające zalogowanie się użytkownikom do programu.

**Frekwencja wyborcza** - jest to stosunek stosunek liczby osób uprawnionych do głosowania do tych które wzięły udział w danym głosowaniu (np. wyborach czy referendum).

**Godziny sprawozdawcze** - Obwodowe komisje wyborcze przekazują PKW, w trakcie głosowania, dane o liczbie osób uprawnionych
do głosowania oraz o liczbie wyborców, którym wydano karty do głosowania w stałych obwodach głosowania (stan na godz. 12:00 oraz 17:00).

**Komisja wyborcza** - różnych szczebli patrz -> [tutaj] (https://github.com/openpkw/openpkw/blob/master/dokumentacja/Struktura_komisji_wyborczych.md)  

**Koordynator gminny** – osoba upoważniona do wsparcia informatycznego obwodów głosowania na terenie gminy.

**Lista kodów jednorazowych** – lista kodów umożliwiających -> **Osobom funkcyjnym** zatwierdzenie protokołów obwodowych w systemie.

**Meldunek przedwyborczy** - Osoba upoważniona na poziomie gminy generuje (w piątek przed dniem wyborów meldunek ostateczny)  meldunek wyborczy, na który składają się:  
•	dane adresowe wszystkich aktualnych obwodów głosowania,   
•	typ i rodzaj obwodu głosowania,  
•	dane liczbowe określające obwody głosowania,  
•	inne dane liczbowe określające gminy.  
Edytować te dane mogą tylko i wyłącznie osoby upoważnione do pracy z meldunkiem wyborczym na poziomie gmin, komisji okręgowych, PKW oraz delegatur KBW.

**Obwód głosowania** - jest to część obszaru gminy utworzona przez Radę Gminy/Miasta na podstawie Kodeksu Wyborczego w celu przeprowadzenia wyborów i referendów.

**Operator obwodowy** – osoba zajmująca się wprowadzaniem danych do systemu/programu lokalnego w -> **Obwodzie głosowania**. 

**Osoba funkcyjna** – osoba pełniąca funkcję przewodniczącego lub zastępcy w Obwodowej Komisji Wyborczej lub konsul.

**Ostrzeżenia** (błędy miękkie) – informacje przekazywane przez program (po -> **Walidacji**) członkom Obwodowej Komisji wyborczej, w celu ułatwienia sporządzania protokołu obwodowego. Ostrzeżenia mogą (ale nie muszą) wskazywać na niepoprawność wprowadzonych danych. Należy się do nich odnieść w -> **Raporcie ostrzeżeń** (w niektórych przypadkach musi to być też opisane w protokole obwodowym). W systemie komunikaty o ostrzeżeniach są sygnalizowane na niebiesko, a na wydruku protokołu obwodowego jest pogrubiany numer obwodu głosowania w nagłówku.

**Pełnomocnik ds. informatyki okręgowej komisji wyborczej** – osoba upoważniona do nadzorowania pracy w systemie przez okręgową -> **komisję wyborczą**.

**Pliki KLK** - pliki definicyjne dla Kalkulatora wyborczego przygotowywane przez KBW dla obwodowej komisji wyborczej w jednym pliku). Do tej pory był to skompresowany plik .xml, obecnie PKW wprowadza również format **JSON**.  
Pliki zawierają aktualne informacje z:
  * z meldunku wyborczego,  
  * o kandydatach,  
  * oraz inne dane potrzebne do działania systemu.  
Zmiana którejkolwiek z tych informacji jest natychmiast automatycznie wprowadzana do **plików KLK** i wymaga pobrania i wczytania do programu nowej wersji tych plików. W wersji HTML pliki zmieniane są na serwerze - nie ma potrzeby wczytywania przez -> **operatorów obwodowych**.

**Protokół obwodowy** – dokument tworzony przez Obwodową -> **Komisję Wyborczą**, zawierający wyniki głosowania w obwodzie, wywieszany do publicznej wiadomości oraz przekazywany do Okręgowej -> **Komisji Wyborczej** w celu weryfikacji i obliczenia wyników wyborów w okręgu.

**Raport frekwencji** - patrz -> **Godziny sprawozdawcze**

**Raport ostrzeżeń** – dokument zawierający informacje o ostrzeżeniach powstałych w trakcie wprowadzania wyników głosowania do programu (-> **Walidacja**). Musi być przekazany wraz z protokołami do okręgowej komisji wyborczej.

**Referendum** - szczegóły patrz -> [tutaj] (https://github.com/openpkw/openpkw/blob/master/dokumentacja/Referendum.md)  

**Referendum ważne** – oznacza, iż referendum zostało przeprowadzone zgodnie z prawem, co każdorazowo stwierdza Sąd Najwyższy. Ważność nie zależy wobec tego od ilości głosujących oraz od tego, czy oddali swoje głosy poprawnie (zgodnie z instrukcją zamieszczoną na kartach do głosowania).  

**Referendum wiążące** – zgodnie z art. 66 ustawy z dnia 14 marca 2003 r. o referendum ogólnokrajowym wynik referendum jest wiążący, jeżeli wzięła w nim udział więcej niż połowa uprawnionych do głosowania.  
Wymóg frekwencji dotyczy referendum w sprawach o szczególnym znaczeniu dla państwa oraz w sprawie wyrażenia zgody 
na ratyfikację umowy międzynarodowej.  
Wiążący wynik oznacza, że referendum staje się podstawą wydania odpowiednich regulacji prawnych i nakłada na organy państwa 
obowiązek ich wydania bądź nakazuje tym organom powstrzymanie się od ingerencji w sferę, co do której suweren opowiedział 
się za pozostawieniem jej bez zmian. W drugim przypadku próba regulacji tej materii wbrew głosującym będzie naruszeniem 
Konstytucji.  
Jeżeli w głosowaniu weźmie udział mniej niż połowa uprawnionych, wówczas jest ono ważne, jednak traktuje się je jedynie 
jako referendum opiniodawcze. Oznacza to, że organy państwowe mogą wziąć jego wynik pod uwagę, jednak nie muszą.  

**Referendum rozstrzygające** – z wynikiem rozstrzygającym referendum mamy do czynienia wtedy, gdy było ono ważne oraz gdy za określoną opcją opowiedziała się większość głosujących (w głosowaniu na "Tak" lub "Nie"). W przypadku referendów, w których możliwe jest wybranie jednego z zaproponowanych wariantów rozwiązań (jest ich więcej niż dwa), wynik uważa się za rozstrzygający, gdy na którąś z opcji oddano najwięcej głosów. Bierze się w obu tych przypadkach jedynie ważnie oddane głosy.  Zatem referendum może nie być rozstrzygające, gdy głosy na dwie opcje oddano najwięcej i dokładnie po tyle samo głosów.  

**Stany protokołu** - 
  * wprowadzony - dokument wypełniony przez operatora komisji obwodowej nastąpił wydruk -> **Zestawienie błędów**
  * gotowy - dokument sprawdzony, poprawiony/brak błędów, gotowy do uwierzytelnienia/podpisania
  * uwierzytelniony	–	dokument uwierzytelniony za pomocą hasła/certyfikatu/kodu jednorazowego przez przewodniczącego, zastępcę lub konsula;
  * wysłany	–	dokument przesłany  przez operatora na serwer centralny;
  * zweryfikowany –	dokument zweryfikowany przez operatora okręgowej komisji wyborczej;
  * zatwierdzony – dokument zatwierdzony przez pełnomocnika ds. informatyki okręgowej komisji wyborczej;
  * odrzucony	-	dokument, który został wysłany niepoprawnie lub z niepoprawnych plików klk lub zawiera błędy uniemożliwiające przyjęcie protokołu. 
      * wariant 1: Protokół wraca do stanu **wprowadzony** w obwodowej komisji wyborczej, można w nim nanieść poprawki.
      * wariant 2: W Obwodowej Komisji Wyborczej stan "czysty" tak jak przed rozpoczęciem pracy/wprowadzania danych. Wymagane wprowadzenie wszystkich danych od początku. Odrzucony protokół jest zablokowany i nie można wprowadzić w nim poprawek. Na nowym protokole w prawym górnym rogu pierwszej strony pojawia sie adnotacja **KOREKTA**.

**Systemy wyborcze** - sposoby głosowania i liczenia głosów, szczegóły patrz -> [tutaj] (https://github.com/openpkw/openpkw/blob/master/dokumentacja/systemy_wyborcze.md)  

**Użytkownik gminny lub okręgowy** – osoba upoważniona do pracy w systemie w gminie, dzielnicy, konsulacie, Okręgowej Komisji Wyborczej lub Krajowym Biurze Wyborczym. 

**Walidacja** - sprawdzenie wprowadzonych wartości liczbowych (oraz sum tych wartości) do protokołu z zasadami poprawności ustalonymi wcześniej i wprwadzonymi na stałę w systemie komputerowym. W wyniku **walidacji** pojawiają się patrz -> **Ostrzeżenia** i patrz -> **Błędy twarde**

**Weryfikacja protokołu**  - polega na dokładnym (organoleptycznym) porównaniu wydruku protokołu obwodowego z wartościami i tekstem wprowadzonym przez komisję obwodową do systemu (np. na podstawie -> **brudnopisu protokołu**). 

**Zestawienie błędów** – dokument pomocniczy Obwodowej -> **Komisji wyborczej** zawierający informacje o błędach i ostrzeżeniach (błędach miękkich) powstających w trakcie wprowadzania protokołu obwodowego. Nie jest przekazywany do Okręgowej -> **Komisji Wyborczej**.
