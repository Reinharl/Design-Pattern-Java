# Singleton 🏆

## Obbiettivo

Singleton è un **creational design pattern** che assicura un univoca istanza per una determinata classe inoltre
mette a disposizione un punto di accesso globale
a quella istanza.

## UML

L'UML (Unified Modeling Language) del pattern singleton è il seguente:

![singleton.png](..%2Fpersistence%2Fsingleton.png)

## Pro

* Assicura un univoca istanza per la classe;
* Mette a disposizione un punto di accesso globale per l'istanza;
* L'istanza è inizializzata solo quando è richiesto per la prima volta.

## Contro

* Viola il principio di singola responsabilità;
* Il pattern a bisogno di essere rivisto in un ambiente multi-thread;
* Potrebbe essere difficile eseguire l'unit test del codice client a seconda del framework utilizzato.