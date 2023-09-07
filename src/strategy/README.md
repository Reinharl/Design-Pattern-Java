# Strategy ⚔️

## Obbiettivo

Strategy è un **behavioral design pattern** che consente di definire una famiglia di algoritmi in classi distinte e
rendere le loro istanze intercambiabili.

## UML

L'UML (Unified Modeling Language) del pattern strategy è il seguente:

![strategy.png](..%2Fpersistence%2Fstrategy.png)

## Pro

* È possibile scambiare gli algoritmi utilizzati all'interno di un oggetto in fase di esecuzione.
* È possibile isolare i dettagli di implementazione di un algoritmo dal codice che lo utilizza.
* Puoi sostituire l'ereditarietà con la composizione.
* Principio aperto/chiuso. Puoi introdurre nuove strategie senza dover cambiare il contesto.

## Contro

* Se hai solo un paio di algoritmi e questi cambiano raramente, non c’è motivo reale di complicare eccessivamente il
  programma con nuove classi e interfacce che accompagnano il pattern.
* I clienti devono essere consapevoli delle differenze tra le strategie per essere in grado di selezionarne una
  adeguata.
* Molti linguaggi di programmazione moderni dispongono del supporto di tipi funzionali che consente di implementare
  diverse versioni di un algoritmo all'interno di un insieme di funzioni anonime. Quindi potresti utilizzare queste
  funzioni esattamente come avresti utilizzato gli oggetti della strategia, ma senza gonfiare il tuo codice con classi e
  interfacce extra.
