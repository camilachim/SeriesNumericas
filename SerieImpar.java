package org.SucesionImpar;

public class SerieImpar implements Successionable {

    @Override
    public int[] getSerieImpar(int n) {
        int[] Serie = new int[n];
        for (int i = 0; i < n; i++) {
            Serie[i] = 2 * (i + 1) - 1;
        }
        return Serie;
    }
}
