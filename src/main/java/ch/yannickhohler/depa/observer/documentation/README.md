# Observer Pattern
## Formal Definition 


## Different update versions
- **update()** - ohne Parameter | Nur Pull-Modell. Extrem einfach. Der geänderte Zustand muss vom Observer beim Observable abgefragt
werden. 
- **update(Observable s, Color c)** - mit Absender (s) und/oder - Information über neuen Zustand | Einfach. Problematisch zu erweitern falls Argumente einzeln als Parameter auftreten 
- **update(Observable s, Object args)** - mit Absender (s) und/oder - Information über Änderung (args) | Einfach. Über das Objekt args kann die Änderung beschrieben werden oder der neue Zustand kann
übermittelt werden. Sehr gut erweiterbar
- **update(Event e) / update(Message msg)** - mit einem Meldungsparameter | Ein einziges Objekt kapselt alle notwendigen Informationen. Im Code etwas umständlicher zu
programmieren. Sehr gut erweiterbar. 

## Notes 


<img src="img/observer_pattern.png" width="1000">
