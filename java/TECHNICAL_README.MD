### Instalacja
**Podstawowa instalacja komponentów serwera Wildfly**

W katalogu openpkw-etc/src/main/etc/wildfly znajdują się polecenia CLI
konfigurujące podstawowe usługi serwera wymagane przez aplikację.  
W pierwszym kroku należy uruchomić serwer (instrukcja w dokumentacji producenta).
Kolejny krok to wykonanie poleceń przy pomocy narzędzia jboss-cli.bat(sh).  
Przykładowe wywołanie na lokalnym środowisku:  
*jboss-cli.bat --connect --file=ścieżka_do_pliku_cli*

Pliki \*_database.cli odpowiadają za instalację datasource. Prefiks oznacza wersję bazy danych.  
UWAGA!!! Należy zwrócić uwagę na parametry połączenia zdefiniowane w plikach. Należy je dostosować
do swojego środowiska.   
Plik openpkw-queue.cli odpowiada za założenie kolejki zgodnej z JMS do przesyłania komunikatów

### Biblioteki
Przy dodawaniu odpowiednich dependency do pom-ów proszę korzystać z głównego pom-a, gdzie większość została zawarta. W projektach dziedziczących należy dodać do pom-ów tylko groupId i artifactId - wersja i scope zostaną odziedziczone z parenta.
Gdy będzie potrzeba dodania nowej biblioteki do projektu prosiłbym o zgłaszanie do luk.franczuk@gmail.com.  Chciałbym abyśmy zachowali spójność używanych bibliotek
