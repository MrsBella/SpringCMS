# Praca domowa dzień 1

## Zadanie 1

   1. Otwórz IDE a następnie utwórz w nim projekt o nazwie `SpringCMS`.
   
   2. Utwórz encje o nazwie `Category`.
   3. Encja ma zawierać następujące pola:

   * id
   * name (max 100 znaków)
   * description (może przyjmować wartość null)

## Zadanie 2

   1. Utwórz encje o nazwie `Author`.
   
   2. Encja ma zawierać następujące pola:

   * id
   * firstName
   * lastName

## Zadanie 3

   1. Utwórz encję `Article`,
   
   2. Encja ma zawierać następujące pola:

   * id
   * title (max. 200 znaków),
   * author - (powiązanie relacją do klasy `Author`) - artykuł może mieć tylko jednego autora
   * categories - (powiązanie relacją do klasy `Category`) - artykuł może należeć do wielu kategorii
   * content
   * created (wartość ma być automatycznie dodawana podczas zapisu)
   * updated (wartość ma być automatycznie zmieniana podczas edycji).

## Zadanie 4

   1. Uzupełnij ręcznie dane w bazie, lub stwórz odpowiedni skrypt, który zostanie załadowany podczas startu aplikacji.
   
   2. Utwórz klasy `ArticleDao`, `AuthorDao`, `CategoryDao`.
   3. W klasach Dao utwórz metody pozwalające na:

   * zapis encji
   * usuwanie encji
   * edycję encji

# Praca domowa dzień 2

## Zadanie 1

   1. W klasach `ArticleDao`, `AuthorDao`, `CategoryDao` dodaj metody, które przy użyciu `JPQL` umożliwią pobieranie 
   wszystkich obiektów danego typu.

## Zadanie 2

   1. Utwórz kontroler `HomePageController`,
   
   2. Utwórz akcję startową o nazwie `home()` dostępną pod adresem `/`, wyświetlającą 5 ostatnio dodanych artykułów.
   3. Wyświetlamy tytuł, datę dodania oraz zawartość danego artykułu.

**W klasie Dao utwórz wymaganą metodę, wstrzyknij Dao do kontrolera**

## Zadanie 3

   1. Utwórz kontroler `CategoryController`, utwórz w nim akcje, które pozwolą:

       * wyświetlić listę wszystkich kategorii
       * dodać kategorię
       * usunąć kategorię
       * edytować kategorię

   2. Dla akcji dodawania oraz edycji utwórz formularz.
   3. Utwórz linki nawigacyjne umożliwiające przechodzenie między akcjami - bez konieczności znania adresów URL.

## Zadanie 4

   1. Utwórz kontroler `AuthorController`, utwórz w nim akcje, które pozwolą:

       * wyświetlić listę wszystkich autorów
       * dodać autora
       * usunąć autora
       * edytować autora

   2. Dla akcji dodawania oraz edycji utwórz formularz.
   3. Utwórz linki nawigacyjne umożliwiające przechodzenie między akcjami - bez konieczności znania adresów URL.

## Zadanie 5

   1. Utwórz kontroler `ArticleController`, utwórz w nim akcje, które pozwolą:

       * wyświetlić listę wszystkich artykułów
       * dodać artykuł
       * usunąć artykuł
       * edytować artykuł

   2. Dla akcji dodawania oraz edycji utwórz formularz.
   3. Formularz tworzenia ma zawierać pola z możliwością wyboru autora.
   4. Formularz tworzenia ma zawierać pola z możliwością wyboru wielu kategorii.
   5. Dodaj konwertery dla klas Author oraz Category.
   6. Utwórz linki nawigacyjne umożliwiające przechodzenie między akcjami - bez konieczności znania adresów URL.
