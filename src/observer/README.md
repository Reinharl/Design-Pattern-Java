# Observer 🔍

## Obbiettivo

Observer è un **behavioral design pattern** che consente di definire un meccanismo di sottoscrizione per notificare a più oggetti eventuali eventi che si verificano all'oggetto che stanno osservando.

## UML
L'UML (Unified Modeling Language) del pattern observer è il seguente:

![observer.png](..%2Fpersistence%2Fobserver.png)

## Pro
* Rispetta il principio aperto/chiuso. Puoi introdurre nuove classi di osservatori senza dover modificare il codice dell'osservato;
* È possibile stabilire relazioni tra oggetti in fase di runtime.

## Contro
* Gli osservatori vengono informati in ordine casuale.