Feature: Die Memory Funktion.

  Background: Anfang
    When Verifizieren Sie das Zeichen,dass es über Nummernblock  eingegeben wurde.
    Then Der Anwender sollte das Zeichen  auf dem Rechnerbildschirm sehen können.

  Scenario: Der Anwender sollte eine Zahl über  die Memory Funktion M+ speichern können.
    And Klickt die Memory Funktion M+-Taste

  Scenario: Der Anwender sollte eine Zahl   durch  die Memory Funktion MR sehen  können.
    And Klickt die Memory Funktion M+-Taste
    Then Keine Änderung sollte auf dem Rechnerbildschirm gesehen können
    And  Klickt die C-Taste
    Then Der Anwender sollte den Rechnerbildschirm sehen können ,wie es am Anfang war
    And Klickt die Memory Funktion MR – Taste
    Then Die gespeicherte Zahl  sollte wieder auf dem Rechnerbildschirm  gesehen werden

  Scenario:Der Anwender sollte eine Zahl   durch die Memory Funktion M+  addieren   können.
    And Klickt die Memory Funktion M+-Taste
    And  Klickt die C-Taste
    Then Der Anwender sollte den Rechnerbildschirm sehen können ,wie es am Anfang war
    And Klickt die Memory Funktion MR – Taste
    And Klickt die Plus-Taste
    Then Der Anwender sollte das Zeichen  auf dem Rechnerbildschirm sehen können5.
    And Verifizieren Sie das Ergebnis,indem  auf  = klickt
    Then Der Anwender sollte ein mathematisch korrektes Ergebnis  auf dem Rechnerbildschirm sehen können.

  Scenario:Der Anwender sollte eine Zahl   durch die Memory Funktion M-  subtrahieren   können.
    And Klickt die Memory Funktionm M- - Taste
    Then Keine Änderung sollte auf dem Rechnerbildschirm gesehen können
    And  Klickt die C-Taste
    Then Der Anwender sollte den Rechnerbildschirm sehen können ,wie es am Anfang war
    And Klickt die Memory Funktion MR – Taste
    And Klickt die Plus-Taste
    Then Der Anwender sollte das Zeichen  auf dem Rechnerbildschirm sehen können5.
    And Verifizieren Sie das Ergebnis,indem  auf  = klickt
    Then Der Anwender sollte ein mathematisch korrektes Ergebnis als minus auf dem Rechnerbildschirm sehen können.


  Scenario: Der Anwender sollte die gespeicherte   Zahl
  durch die Memory Funktion MC  freigeben    können.
    And Klickt die Memory Funktionm M- - Taste
    Then Keine Änderung sollte auf dem Rechnerbildschirm gesehen können
    And  Klickt die C-Taste
    Then Der Anwender sollte den Rechnerbildschirm sehen können ,wie es am Anfang war
    And Klickt die Memory Funktion MR – Taste
    And Klickt die Memory Funktion MC - Taste
    And  Klickt die C-Taste
    And Klickt die Memory Funktion MR – Taste
    Then Der Anwender sollte den Rechnerbildschirm sehen können ,wie es am Anfang war

