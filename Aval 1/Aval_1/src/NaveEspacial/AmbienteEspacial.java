package NaveEspacial;

import java.util.Scanner;

public class AmbienteEspacial {
    
    public static void main(String a[]) {
        
        Scanner sc = new Scanner(System.in);
        NaveEspacial[] v = new NaveEspacial[10];
        int op = 0;
        
        do {
            System.out.println("=== AMBIENTE ESPACIAL ===");
            System.out.println("1) Inserir nave");
            System.out.println("2) Mostrar naves");
            System.out.println("3) Mostrar naves mais rápidas.");
            System.out.print("OPCAO: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("- Nome da nave: ");
                    String s = sc.nextLine();
                    v[NaveEspacial.getCt()] = new NaveEspacial(s);
                    System.out.println("Escolha o tipo de nave: 1) Espaçonave ");
                    System.out.println("2) Foguete ");
                    System.out.println("3) Onibus espacial ");
                    System.out.println("O tipo de nave determina as possiveis condicoes da nave: pode escolher uma nave mais rapida mas com menos defesa e suprimentos ");
                    System.out.println("Ou uma mais lenta mas com mais condicoes favoraveis ");
                    int tip = sc.nextInt();
                    v[NaveEspacial.getCt()].tipoNave(tip);
                    System.out.println("Escolha a quantidade de suprimentos e combustivel (um unico numero inteiro) ");
                    int sup = sc.nextInt();
  
                    if(sup <= 3000){
                        v[NaveEspacial.getCt()].passageirosSuprimentos(sup);
                    }
                    if(sup > 3000 && sup <= 5000 && (tip == 2 || tip == 3) ){
                        v[NaveEspacial.getCt()].passageirosSuprimentos(sup);
                    }
                    if(sup > 5000 && tip == 3){
                        v[NaveEspacial.getCt()].passageirosSuprimentos(sup);
                    } 
                    else
                        System.out.println("O tipo da nave nao suporta essa quantidade de suprimentos");
                    System.out.println("Escolha o armamento da nave: 1) Defesa");
                    System.out.println("2) Ataque");
                    System.out.println("3) Onda de choque");
                    int DA = sc.nextInt();
                    v[NaveEspacial.getCt()].defesaAtaque(DA);
                    System.out.println("Determine a distancia do destino desejado (numero inteiro positivo)");
                    int dis = sc.nextInt();
                    v[NaveEspacial.getCt()].distancia(dis);
                    break;
                case 2:
                    for (int i=0;i<NaveEspacial.getCt();i++)
                        v[i].mostrarNave();
                    break;
                case 3:
                    for (int i=0;i<NaveEspacial.getCt();i++)
                        for (int j=0;j<NaveEspacial.getCt();j++)
                            if (v[i].naveMaisRapida(v[j])) {
                                System.out.println(v[j].getNome()+" é mais rápida que "+v[i].getNome());
                            }
                    break;    
            }
            
        }while (op != 4);
        
    }
    
}
