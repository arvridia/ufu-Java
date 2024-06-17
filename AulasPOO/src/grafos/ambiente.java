package grafos;

import java.util.Scanner;

public class ambiente {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CRIACAO DE GRAFOS ===");
        System.out.println("Para criar o grafo desejado, insira a quantidade de vértices e depois a de arestas");
        int v = 0;
        System.out.println("Quantos vértices deseja inserir no grafo? (Máximo 10): ");
        v = sc.nextInt();
        if(v < 0){
            System.out.println("Insira ao menos um grafo ou o deixe vazio...");
        }
        int[] qnt_arestas = new int[v];
        for(int i = 0; i < v; i++){
            System.out.println("Insira a quantidade de arestas do vértice " + (i+1) + ": ");
            qnt_arestas[i] = sc.nextInt();
            if(qnt_arestas[i] > v){
                System.out.println("Não é possível inserir essa quantidade de arestas nesse vértice...");
                if(v == 0){
                    qnt_arestas[i] = 0;    
                }
                if(v == 1){
                    qnt_arestas[i] = 1;    
                }
                if(v == 2){
                    qnt_arestas[i] = 2;    
                }
                if(v != 0 && v != 1 && v != 2){
                    System.out.println("Não é possível inserir essa quantidade de arestas nesse vértice...");
                }
            } 
        }
    }
}
