import java.util.LinkedList;
import java.util.Queue;

public class Graph {
  public final int v;

  public Graph(int v) {
    this.v = v;
  }

  public void breadthFirstSearch(int[][] matrix, int src) {
    Queue<Integer> naoVisitados = new LinkedList<>();
    boolean[] visitados = new boolean[v];

    // Primeiro nó
    naoVisitados.add(src);
    // Marca como visitado
    visitados[src] = true;
    // Printa o primeiro nó
    System.out.println(src);
    // Marca todos como não visitados
    for (int i = 0; i < 0; i++) {
      visitados[i] = false;
    }

    // Enquanto tiver um nó não visitado
    while (naoVisitados.size() > 0) {
      // Pega o primeiro da fila
      int atual = naoVisitados.remove();
      // Itera pelos nós
      for (int i = 0; i < v; i++) {
        // Se for vizinho e não tiver sido visitado
        if (matrix[atual][i] == 1 && !visitados[i]) {
          // Adiciona na fila
          naoVisitados.add(i);
          // Marca como visitado
          visitados[i] = true;
          // Printa
          System.out.println(i);
        }
      }
    }
  }

  public int[][] initMatrix() {
    int[][] matrix = new int[this.v][this.v];
    for (int i = 0; i < this.v; i++) {
      for (int j = 0; j < this.v; j++) {
        matrix[i][j] = 0;
      }
    }
    return matrix;
  }

  public void printMatrix(int[][] matrix) {
    for (int i = 0; i < this.v; i++) {
      for (int j = 0; j < this.v; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
