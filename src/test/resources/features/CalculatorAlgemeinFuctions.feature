Feature: Algemein Functions

  Scenario Outline: Der Anwender sollte die Zahlen  über Tastatur  angeben  können
    When Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen1>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen2>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen3>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen4>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen5>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen6>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen7>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen8>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen9>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über Tastatur "<Zeihcen10>"  eingegeben wurde.
    Then Der Anwender sollte Zahlenfolgen von mindestens zehn Zeichen auf dem Rechnerbildschirm sehen können.

    Examples:
      | Zeihcen1 | Zeihcen2 | Zeihcen3 | Zeihcen4 | Zeihcen5 | Zeihcen6 | Zeihcen7 | Zeihcen8 | Zeihcen9 | Zeihcen10 |
      | =        | 7        | 6        | 3        | .        | MR       | 2        | 7        | 8        | 7         |

  Scenario Outline: Der Anwender sollte die Zahlen   über Nummernblock angeben  können
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen1>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen2>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen3>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen4>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen5>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen6>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen7>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen8>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen9>"  eingegeben wurde.
    And Verifizieren Sie das Zeichen,dass es über NummerBlok "<Zeihcen10>"  eingegeben wurde.
    Then Der Anwender sollte Zahlenfolgen von mindestens zehn Zeichen auf dem Rechnerbildschirm sehen können.
    Examples:
      | Zeihcen1 | Zeihcen2 | Zeihcen3 | Zeihcen4 | Zeihcen5 | Zeihcen6 | Zeihcen7 | Zeihcen8 | Zeihcen9 | Zeihcen10 |
      | 8        | 7        | 6        | 3        | 5        | 5        | 2        | 7        | 8        | 8         |