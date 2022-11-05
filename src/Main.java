public class Main {
    static double P0(int K, int N) {
        double p = 1;
        for (int i = K; i <= N; i++) {
            p *= (Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1. / i), 2)) / i * i;
        }
        return p;
    }

    static double P1(int K, int N, int i) {
        if (i > N) {
            return 1;
        } else {
            return ((Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1. / i), 2)) / i * i) * P1(K, N, i + 1);
        }
    }

    static double P2(int K, int N, int i) {
        if (i < K) {
            return 1;
        } else {
            return ((Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1. / i), 2)) / i * i) * P2(K, N, i - 1);
        }
    }

    static double P3(int K, int N, int i, double t) {
        t = t * ((Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1. / i), 2)) / i * i);
        if (i >= N) {
            return t;
        } else {
            return P3(K, N, i + 1, t);
        }
    }

    static double P4(int K, int N, int i, double t) {
        t = t * ((Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1. / i), 2)) / i * i);
        if (i <= K) {
            return t;
        } else {
            return P4(K, N, i - 1, t);
        }
    }

    public static void main(String[] args) {
        int i = 1;
        int n = 15;
        System.out.println("(iter): " + P0(i, n));
        System.out.println("(rec up ++): " + P1(i, n, i));
        System.out.println("(rec up --): " + P2(i, n, n));
        System.out.println("(rec down ++): " + P3(i, n, i, 1));
        System.out.println("(rec down --): " + P4(i, n, n, 1));
    }
}
