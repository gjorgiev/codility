package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q){
        int[] R = new int[P.length];
        int[] A = new int[S.length()];
        int[] C = new int[S.length()];
        int[] G = new int[S.length()];
        int[] T = new int[S.length()];
        int a = 0, c = 0, g = 0, t = 0;

        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == 'A') a++;
            if (S.charAt(i) == 'C') c++;
            if (S.charAt(i) == 'G') g++;
            if (S.charAt(i) == 'T') t++;

            A[i] = a;
            C[i] = c;
            G[i] = g;
            T[i] = t;
        }

        for (int i = 0; i < P.length; i++){
            if (P[i] == Q[i]){
                if (S.charAt(P[i]) == 'A') R[i] = 1;
                else if (S.charAt(P[i]) == 'C') R[i] = 2;
                else if (S.charAt(P[i]) == 'G') R[i] = 3;
                else if (S.charAt(P[i]) == 'T') R[i] = 4;
            }
            else if(A[P[i]] < A[Q[i]] || S.charAt(P[i]) == 'A') R[i] = 1;
            else if(C[P[i]] < C[Q[i]] || S.charAt(P[i]) == 'C') R[i] = 2;
            else if(G[P[i]] < G[Q[i]] || S.charAt(P[i]) == 'G') R[i] = 3;
            else if(T[P[i]] < T[Q[i]] || S.charAt(P[i]) == 'T') R[i] = 4;
        }
        return R;
    }

    public int[] solutionBruteForce(String S, int[] P, int[] Q){
        int M = P.length;
        HashMap<Character, Integer> impactFactors = new HashMap<>();
        impactFactors.put('A', 1);
        impactFactors.put('C', 2);
        impactFactors.put('G', 3);
        impactFactors.put('T', 4);
        int[] result = new int[M];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++){
            for (int j = P[i]; j <= Q[i]; j++)
                min = Math.min(impactFactors.get(S.charAt(j)), min);
            result[i] = min;
            min = Integer.MAX_VALUE;
        }
        return result;
    }

    public static void main(String[] args) {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        String S = "CAGCCTA";
        int[] P = new int[]{2,5,0};
        int[] Q = new int[]{4,5,6};
        System.out.println(Arrays.toString(genomicRangeQuery.solution(S, P ,Q)));
    }
}
