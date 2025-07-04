Per la creazione del progetto biblioteca, ho pensato di strutturare il progetto creando il diagramma allegato, seguendo
la seguente logica: una classe padre con attributi in comune con le due classi figlie (libri e riviste) che hanno un re
lazione OneToOne tra il padre ed il singolo figlio. Poi creo la classe Utente e la classe Prestito creando una relazione
ManyToMany tra Utente e Prestito (bidirezionale) poichè un Utente può avere più prestiti mentro lo specifico Prestito fa
riferimento ad un solo Utente. Poi una relazione OneToMany tra padre e Prestito. Ho inizialmente pensato
di usare una strategia SINGLE.TABLE per avere tutti i dati sia di Libri sia di Riviste in un'unica tabella lato db anche
perchè gli attributi per cui si differenziano Libri e Riviste sono relativamente pochi ma vorrei evitare i campi null,
quindi userò una JOINED.
