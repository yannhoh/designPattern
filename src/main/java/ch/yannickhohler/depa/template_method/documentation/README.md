## Template Pattern

```text
Das Template Method-Muster definiert in einer Methode
das Grundgerüst eines Algorithmus und überlässt einige Schritte
den Subklassen. Dabei dürfen Subklassen bestimmte Schritte des
Algorithmus neu definieren, ohne dabei die Struktur des Algorithmus zu ändern.
```
<img src="img/template_uml.png">

### Hook
Ist eine Methode mit leerem Body welche in der abstrakten Klasse definiert ist.
Subklassen können diese Methode überschreiben, müssen aber nicht.
