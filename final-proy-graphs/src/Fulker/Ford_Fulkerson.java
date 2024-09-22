
package Fulker;

import Colas.*;
import java.util.ArrayList;

public class Ford_Fulkerson {
    
    private int V, min = Integer.MAX_VALUE;

    public Ford_Fulkerson(int V) { //Número de vertices en nuestra red
        this.V = V;
    }
 
    /* Este método devuelve VERDADERO si existe un camino desde la fuente al sumidero*/
    private boolean bfs(int rGraph[][], int s, int t, int parent[])
    {
        // Se crea un arreglo y se marcan comono visitados
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; ++i){
            visited[i] = false;
        }
        
        // Se crea una cola, se encola la fuente y se marca como visitado
        Cola<Integer> queue = new Cola<>();
        queue.encolar(new Nodo<>(s));
        visited[s] = true;
        parent[s] = -1;
 
        // Verificamos todos los posibles caminos de la fuente al sumidero
        while (queue.getTamaño()!= 0) {
            int u = queue.decolar();
 
            for (int v = 0; v < V; v++) {
                if (visited[v] == false
                    && rGraph[u][v] > 0) {
                    // Si encontramos alún nodo conectado al sumidero
                    //devolvemos verdadero
                    if (v == t) {
                        parent[v] = u;
                        return true;
                    }
                    queue.encolar(new Nodo<>(v));
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }
 
        // Si no encontramos un camino que conecte la fuente
        // y el sumidero devolvemo falso
        return false;
    }
 
    //Devuelve el flujo maximo.
    public int fordFulkerson(int graph[][], int s, int t, ArrayList<String> vtrBottleNeck)
    {
        int u, v;
 
        // Create a residual graph and fill the residual
        // graph with given capacities in the original graph
        // as residual capacities in residual graph
 
        // Residual graph where rGraph[i][j] indicates
        // residual capacity of edge from i to j (if there
        // is an edge. If rGraph[i][j] is 0, then there is
        // not)
        int rGraph[][] = new int[V][V];
 
        for (u = 0; u < V; u++){
            for (v = 0; v < V; v++){
                rGraph[u][v] = graph[u][v];
            }
        }
 
        // This array is filled by BFS and to store path
        int parent[] = new int[V];
 
        int max_flow = 0; // There is no flow initially
 
        // Augment the flow while there is path from source
        // to sink
        while (bfs(rGraph, s, t, parent)) {
            // Se recorren todos los caminos encontrados
            // y se calcula el flujo maximo que puede pasar a travé del mismo
            int path_flow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                path_flow
                    = Math.min(path_flow, rGraph[u][v]);
            }
 
            // Se actualizan las capacidades de las aristas
            // según la cantidad de flujo que haya pasado por la misma
            // de los caminos anteriores
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] -= path_flow;
                rGraph[v][u] += path_flow;
            }
 
            // Se suma el flujo de este camino al flujo total
            max_flow += path_flow;
        }
        
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (graph[i][j] > 0 && min > graph[i][j] && rGraph[j][i] > 0) {
                    min = graph[i][j];
                    vtrBottleNeck.clear();
                    vtrBottleNeck.add(i+";"+j);
                } else if (min == graph[i][j] && rGraph[j][i] > 0) {
                    vtrBottleNeck.add(i+";"+j);
                }
                
                if(graph[i][j] != 0) {
                    graph[i][j] = rGraph[j][i];
                }
            }
        }
 
        // Return the overall flow
        return max_flow;
    }
}
