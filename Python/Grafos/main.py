import networkx as nx
import graphviz

G = nx.Graph()  # crear un grafo

# Añadir nodos
G.add_node("Kevin Bacon")
G.add_node("Tom Hanks")
G.add_nodes_from(["Meg Ryan", "Parker Posey", "Lisa Kudrow"])

# Añadir aristas
G.add_edge("Kevin Bacon", "Tom Hanks")
G.add_edge("Kevin Bacon", "Meg Ryan")
G.add_edges_from([("Tom Hanks", "Meg Ryan"), ("Tom Hanks", "Parker Posey")])
G.add_edges_from([("Parker Posey", "Meg Ryan"), ("Parker Posey", "Lisa Kudrow")])

print(len(G.nodes))
print(len(G.edges))
print(G.nodes)
print(G.edges)



A = nx.nx_agraph.to_agraph(G)
A.layout('dot')
A.draw('salida.png') # guardar como png

graphviz.Source(A.to_string())  # mostrar en jupyter