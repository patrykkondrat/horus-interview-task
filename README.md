## Analiza:

Interfejs `Structure` zawiera trzy metody:
* findBlockByColor - zwraca pierwszy blok o podanym kolorze
* findBlocksByMaterial - zwraca listę bloków o podanym materiale
* count - zwraca liczbę wszystkich bloków w strukturze

_wszystkie metody uwzględniają bloki zagnieżdżone w CompositeBlock_

Klasa `Wall` implementuje interfejs `Structure` i przechowuje listę bloków w zmiennej `blocks`.

Interfejs `Block` zawiera metody: `getColor()` zwracającą kolor bloku i 
`getMaterial()` zwracającą materiał bloku.

Interfejs `CompositeBlock` rozszerza interfejs `Block` i zawiera metodę 
`getBlocks()` zwracającą listę bloków w bloku zagnieżdżonym.

Do implementacji metody `findBlockByColor` używamy for-each, 
aby przejrzeć każdy blok w liście blocks. 
Jeśli kolor bloku zgadza się z podanym kolorem, 
to metoda zwraca ten blok jako wynik. 
W przeciwnym razie metoda kontynuuje iterację po pozostałych blokach. 
Jeśli w liście blocks nie ma bloku o podanym kolorze, 
to metoda zwraca pusty `Optional`.

Metoda `findBlocksByMaterial` zwraca listę bloków wykonanych z danego materiału,
w tym również składników bloków złożonych. 
W celu znalezienia bloków wykonanych z danego materiału, 
należy przejrzeć każdy blok w liście blocks i sprawdzić, 
czy jego materiał zgadza się z podanym materiałem. 
Jeśli tak, to dodajemy ten blok do wynikowej listy.

Dla Blocków zagnieżdżonych (tj. `CompositeBlock`) otwierany jest strumień 
(stream) do przeglądania bloków wewnątrz bloku zagnieżdżonego.
