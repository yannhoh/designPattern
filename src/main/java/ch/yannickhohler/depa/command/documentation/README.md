## Command Pattern

```text
Das Command-Muster verkapselt einen Auftrag in
einem Objekt und ermöglicht es dadurch, andere Objekte mit verschiedenen Aufträgen zu parametrisieren,
Aufträge in Warteschlangen einzureihen oder zu protokollieren oder das Rückgängigmachen von Operationen
zu unterstützen.
```
<img src="img/commands.png" width="500px" />

<img src="img/diagramm.png" width="700px" />

<img src="img/sequence_diagram.png" width="700px" />

### Makro Commands
Makro-Befehle sind eine einfache
Erweiterung des Command-Musters, mit dem mehrere Befehle
aufgerufen werden können. Auch für
Makro-Befehle lässt sich leicht eine
Unterstützung für undo() implementieren

### Protokollieren
<img src="img/store_load.png" width="250px" />

<img src="img/restore.png" width="1000px" />

### Command & Observer Pattern combined
<img src="img/oberserver_command.png" width="700px" />

### Undo & Redo
<img src="img/undo_redo.png" width="700px" />

<img src="img/undo_redo_stacks.png" width="700px" />

Falls ein neuer Command dem Undo-Stack hinzugefügt wird, muss der
Redo-Stack gelöscht werden. (Nichts zu wiederholen da wir nicht
zurückgegangen sind) 
