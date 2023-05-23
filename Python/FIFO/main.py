# Definimos una clase Nodo para representar cada nodo del árbol
class Nodo:
    def __init__(self, valor, hijos=[]):
        self.valor = valor
        self.hijos = hijos

# Definimos una función para recorrer el árbol por anchura
def recorrido_por_anchura(raiz):
    # Creamos una cola FIFO vacía y agregamos la raíz del árbol
    cola = [raiz]
    # Mientras haya elementos en la cola
    while len(cola) > 0:
        # Obtenemos el primer elemento de la cola
        nodo_actual = cola.pop(0)
        # Imprimimos el valor del nodo actual
        print(nodo_actual.valor)
        # Agregamos los hijos del nodo actual a la cola
        for hijo in nodo_actual.hijos:
            cola.append(hijo)

# Creamos un árbol de ejemplo
arbol = Nodo(1, [
    Nodo(2, [
        Nodo(4),
        Nodo(5)
    ]),
    Nodo(3, [
        Nodo(6),
        Nodo(7)
    ])
])

# Recorremos el árbol por anchura
recorrido_por_anchura(arbol)
