public class App {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(6);
        int[][] matrix = graph.initMatrix();

        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 1;
        matrix[1][0] = 1;
        matrix[1][4] = 1;
        matrix[1][5] = 1;
        matrix[2][0] = 1;
        matrix[2][5] = 1;
        matrix[3][0] = 1;
        matrix[4][1] = 1;
        matrix[5][1] = 1;
        matrix[5][2] = 1;

        graph.printMatrix(matrix);

        graph.breadthFirstSearch(matrix, 1);
    }
}
