# Aufgabe 1 Erklaerung


## Instalation
Du kannst dieses Projekt ueber den gruenen Button mit der Aufschrift `Code` auf
deinen Laptop laden. Anschliessend kannst du die ".zip" Datei entpacken und ein 
Terminal in dem resultierenden Ordner [oeffnen](https://www.maketecheasier.com/launch-terminal-current-folder-mac/#:~:text=Open%20the%20parent%20directory%20where,shortcut%20that%20you%20assigned%20before.).

Kopiere anschliessend diesen Befehl und fuehre ihn im Terminal aus. Er dient dazu
dass Programm aus der Aufgabe laufen zu lassen.
```bash
./gradlew run
```

## Einfuehrung

Der Code in der Uebungsaufgabe besteht aus 3 Klassen. `Value`, in dieser Speichern 
wir einfach einen Zahlenwert. Mit der Klasse `ValueChanger` koennen wir besagten
Wert in einem Value Objekt aendern. Die `TestValueChanger` Klasse enthaelt dann
den eigentlich Code fuer die Aufgabe.

## Teilfrage 1: Was wird in der Konsole ausgegeben.

In diesem ersten Abschnitt erzeugen wir ein paar Variablen, aendern ihre Werte
und geben final den letzten angenommen Wert in der Konsole aus.

```java
int x = 11;
int b = x;
b = 14;
x = b;

ValueChanger.passPrimitiveType(x);
System.out.println(x);
```
Bei naeher Betrachtung koennen wir den Code folgendermassen umschreiben, da sich
der Wert der Variablen `x` sofort nach dem erzeugen aendert.
```java
int x = 14;
int b = 14;

ValueChanger.passPrimitiveType(x);
System.out.println(x);
```

Die Funktion `passPrimitiveType` macht nichts da hier ein primitiver Datentyp
`int` uebergeben wird.
Eine gute Erklaerung fuer den Unterschied zwischen primitiven und Referenztypen
findest du [hier](https://medium.com/@vaibhav0109/java-primitives-vs-wrapper-which-one-to-use-aa7d6efc024).

Entfernen wir den unoetigen Code aus der Aufgabe sehen wir dass dieser Abschnitt
nur die Zahl 14 auf die Konsole ausgibt.
```java
int x = 14;

System.out.println(x); // gibt 14 in die Konsole aus
```

Im naechsten Teilabschnitt erzeugen wir ein neues Objekt `v` vom Typ `Value`.
Anschliessend erzeugen wir eine Kopie `k` zur Speicheradresse von `v`.

```java
x = 10; // setze Variable `x` auf Wert 10

Value v = new Value(); // erzeuge neues Objekt `v`
Value k = v; // speichere Kopie zur Speicheradresse von `v` in `k`

// Achtung v.x und x sind nicht die selben Variablen. v.x bezieht sich auf das 
// `x` in der Klasse `Value` und ist somit eine Klassenvariable.
v.x = x + 3; // speichere `x` + `3` also 13 im Feld `x` von `v`.

ValueChanger.passReferenceType(v); // Die Funktion `passReferenceType` aendert
// anschliessen den wert von `v.x` auf 3

// Da `k` und `v` auf die gleiche Stelle im Speicher zeigen enthalten sie den selben
// Wert 3 (siehe) oben.
System.out.println(v.x);
System.out.println(k.x);

// anschliessend setzen wir `k.x` auf 1. Beachte dass k und v auf den gleichen 
// Speicher zeigen. Wir schreiben also gleichzeitig 1 in `v.x`
k.x = 1;

System.out.println(v.x); // gebe den Wert von `v.x` (1) auf die Konsole aus.
```

## Teilaufgabe 2: Wie viele Objekte der Klasse werden im Arbeitsspeicher abgebildet.
Wir wissen dass neue Objekt mit dem Schluesselwort `new` erzeugt werden. Da dieses
im gesamten programm nur 1 mal aufgerufen wird erzeugen wir auch nur 1 Objekt
der Klasse `Value`.
