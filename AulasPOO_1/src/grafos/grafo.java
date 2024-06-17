package grafos;

public class grafo 
{
    private int num_vertice;
    private int[][] ligacao_aresta;
    
    public grafo(int v, int[][] m)
    {
        num_vertice = v;
        ligacao_aresta = m;
    }
    
    public int vertices_vizinhos(int i, int j)
    {
        if(ligacao_aresta[i][j] == 1 || ligacao_aresta[i][j] == 1)
        {
            return 1;
        }
        else return 0;
    }
    
    public int[] lista_vizinhos(int x)
    {
        int[] vetor;
        int size = 0;
        int pos = 0;
        for(int i = 0; i < ligacao_aresta.length; i++)
        {
            if(ligacao_aresta[x][i] == 1)
            {
                size++;
            }
        }
        
        vetor = new int[size];
        
        for(int i = 0; i < ligacao_aresta.length; i++)
        {
            if(ligacao_aresta[x][i] == 1)
            {
                vetor[pos] = i;
                pos++;
            }
        }
        return vetor;
    }
    
    public int num_vertice()
    {
        return num_vertice;
    }
    
    public void matriz_adjacencia()
    {
        for (int[] ligacao_aresta1 : ligacao_aresta) {
            for (int i = 0; i < ligacao_aresta1.length; i++) {
                System.out.print("[" + ligacao_aresta1[i] + "]");
            }
        }
    }
    
}