/*
public class MatrizAdyacencia {
    private int n;
    private int[][] matriz;

    public MatrizAdyacencia(int n) {
        this.n = n;
        matriz = new int[this.n][this.n]; //se inicializa matriz en 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public void agregar(int i, int j) {
        matriz[i][j] += 1;
    }

    public void remover(int i, int j) {
        if (matriz[i][j] > 0)
            matriz[i][j] -= 1;
    }

    public void imprimir() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MatrizAdyacencia matriz = new MatrizAdyacencia(5);

        matriz.agregar(0, 1);
        matriz.agregar(0, 1);
        matriz.agregar(0, 2);
        matriz.agregar(0, 3);

        matriz.agregar(1, 0);
        matriz.agregar(1, 0);
        matriz.agregar(1, 4);

        matriz.agregar(2, 0);
        matriz.agregar(2, 3);
        matriz.agregar(2, 4);

        matriz.agregar(3, 0);
        matriz.agregar(3, 2);

        matriz.agregar(4, 1);
        matriz.agregar(4, 2);
        matriz.agregar(4, 4);
        matriz.agregar(4, 4);

        matriz.imprimir();
    }
}

*/