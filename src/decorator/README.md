# Decorator 🪆

## Obbiettivo

Decorator è un **structural design pattern** che consente di associare nuovi comportamenti agli oggetti posizionando
questi oggetti all'interno di oggetti wrapper speciali che contengono i comportamenti.

## UML

L'UML (Unified Modeling Language) del pattern decorator è il seguente:

![decorator.png](..%2Fpersistence%2Fdecorator.png)

## Pro

* Puoi estendere il comportamento di un oggetto senza creare una nuova sottoclasse;
* È possibile aggiungere o rimuovere responsabilità da un oggetto in fase di runtime;
* Puoi combinare diversi comportamenti racchiudendo un oggetto in più decoratori; 
* Rispetta il principio di responsabilità unica.

## Contro

* È difficile rimuovere un wrapper specifico dallo stack dei wrapper.
* È difficile implementare un decoratore in modo tale che il suo comportamento non dipenda dall’ordine nello stack dei decoratori.
* Il codice di configurazione iniziale dei livelli potrebbe sembrare piuttosto brutto.