Problema: Elaboracion de productos Lasagna y Ravioli para cocinar y envasar productos en Restaurant SoloPastas.
Patron: Estrutural Bridge
Con este patron de diseño aplicado a la solucion del Restaurant SoloPastas, en este caso existen dos implementaciones comunes (Cocinar y Elaborar) que se utilizarán tanto en ElaborarLasagna como en ElaborarRavioli (el proceso a seguir es diferente en cada caso). Al tratarse de métodos comunes, no es necesario dividirlos en clases, asi evitamos que se produzcan determinadas jerarquías de clases que al extenderse, añadiendo nuevas clases, perderían su lógica y no resultarían mantenibles, por crearse demasiada interdependencia entre ellas.


run:
Preparando raviolis...
Alimento cocinado
Preparando raviolis...
Alimento envasado
-------------
Preparando lasagna...
Alimento cocinado
Preparando lasagna...
Alimento envasado
BUILD SUCCESSFUL (total time: 0 seconds)
