/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.View;

import estoque.Model.Produto;
import estoque.Controller.EstoqueController;
import java.io.IOException;
import java.util.Scanner;

public class EstoqueLP {
    

    public static void main(String[] args) throws IOException{
        
        EstoqueController e = new EstoqueController();
        Scanner ler = new Scanner(System.in);

        Integer codigo;
        String data_entrada;
        String local_Compra;
        String tipo;
        String marca;
        String caracteristica;
        String tamanho;
        String cor;
        Double v_etiqueta;
        Double v_pago;
        Double preco_sugerido;
        String opcao;

        System.out.println("Digite a opção desejada: L=Ler, C=Criar, D=Deletar, A=Atualizar: ");
        opcao = ler.nextLine();
        if (opcao == "L"){
            System.out.println("Digite o código do item: ");
            codigo = ler.nextInt();
            e.Ler(codigo);
        }
        if (opcao == "D"){
            System.out.println("Digite o código do item: ");
            codigo = ler.nextInt();
            e.Ler(codigo);
        }
        if (opcao.equals("C")){
        
            System.out.println("Digite o código do item: ");
            codigo = ler.nextInt();

            System.out.println("Digite a Data de Entrada: ");
            data_entrada = ler.nextLine();

            System.out.println("Digite o Local da Compra: ");
            local_Compra = ler.nextLine();

            System.out.println("Digite o Tipo: ");
            tipo = ler.nextLine();

            System.out.println("Digite a Marca: ");
            marca = ler.nextLine();

            System.out.println("Digite as Caracteristicas: ");
            caracteristica = ler.nextLine();

            System.out.println("Digite o Tamanho: ");
            tamanho = ler.nextLine();

            System.out.println("Digite a Cor: ");
            cor = ler.nextLine();

            System.out.println("Digite o valor de Etiqueta na Compra: ");
            v_etiqueta = ler.nextDouble();

            System.out.println("Digite o valor pago na Compra: ");
            v_pago = ler.nextDouble();

            System.out.println("Digite o preço Sugerido: ");
            preco_sugerido = ler.nextDouble();
            
            e.Criar(codigo, data_entrada, local_Compra, tipo, marca,
                caracteristica, tamanho, cor, v_etiqueta, v_pago, preco_sugerido);
        }
        if (opcao == "C"){

         System.out.println("Digite o código do item: ");
         codigo = ler.nextInt();

         System.out.println("Digite a Data de Entrada: ");
         data_entrada = ler.nextLine();

         System.out.println("Digite o Local da Compra: ");
         local_Compra = ler.nextLine();

         System.out.println("Digite o Tipo: ");
         tipo = ler.nextLine();

         System.out.println("Digite a Marca: ");
         marca = ler.nextLine();

         System.out.println("Digite as Caracteristicas: ");
         caracteristica = ler.nextLine();

         System.out.println("Digite o Tamanho: ");
         tamanho = ler.nextLine();

         System.out.println("Digite a Cor: ");
         cor = ler.nextLine();

         System.out.println("Digite o valor de Etiqueta na Compra: ");
         v_etiqueta = ler.nextDouble();

         System.out.println("Digite o valor pago na Compra: ");
         v_pago = ler.nextDouble();

         System.out.println("Digite o preço Sugerido: ");
         preco_sugerido = ler.nextDouble();

         e.Atualizar(codigo, data_entrada, local_Compra, tipo, marca,
             caracteristica, tamanho, cor, v_etiqueta, v_pago, preco_sugerido);
        }
    }
}
