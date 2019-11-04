public class Floyds {

    public void floyd(int n, int W[][], int D[][], int P[][]) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                P[i][j] = -1;
            }
        }

        for(int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (D[i][k] + D[k][j] < D[i][j]) {
                        P[i][j] = k;
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
    }

    public void path(int q, int r, int P[][]) {
        if (P[q][r] != -1) {
            path(q, P[q][r], P);
            System.out.println("v" + P[q][r]);
            path(P[q][r], r, P);
        }
    }
}