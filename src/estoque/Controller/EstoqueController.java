/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.Controller;

import estoque.Model.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueController {
    
    private File arquivo = new File("TabelaLP.txt");
    
    public void Criar(Produto p) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader( fr );
                   
        ArrayList<String> salvar = new ArrayList();
        
        Scanner in = new Scanner(new FileReader(arquivo));
        while (in.hasNextLine()) {
            salvar.add(in.nextLine()); 
        }
        
        br.close();
        fr.close();     
        
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter( fw );
        
        for(int i = 0; i<salvar.size(); i++){
            bw.write(salvar.get(i));
            bw.newLine();
        }
        bw.write(p.toString());
        bw.close();
        fw.close();
        in.close();
    }   
    
    public void Atualizar(Produto p, Integer cod) throws FileNotFoundException, IOException{
        
        Deletar(cod);
        Criar(p);        
    }   
    
    public void Deletar(Integer cod) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader( fr );
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        int count = 0;
        Scanner in = new Scanner(new FileReader(arquivo));
        while (in.hasNextLine()) {
            String array[] = new String[2];
            array = linha.split(":");
            
            if(array[0] != "código" && array[1].replace("\n", "") != cod.toString() && count != 0){
                salvar.add(linha);
            }
            else{
                
                count++;
                if (count == 11){
                    count = 0;
                }
            }     
        }
        while(linha != null){
                   
        }
        
        br.close();
        fr.close();
        
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter( fw );
        for(int i = 0; i<salvar.size(); i++){
            bw.write(salvar.get(i));
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    
    public void Ler(Integer cod) throws FileNotFoundException, IOException{
    
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader( fr );
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        int count = 0;
        Scanner in = new Scanner(new FileReader(arquivo));
        while (in.hasNextLine()) {
            String array[] = new String[2];
            array = linha.split(":");
            
            if(array[0] == "código" && array[1].replace("\n", "") == cod.toString() && count != 0){
                
            }
            else{                
                System.out.println(in.nextLine());
                count++;
                if (count == 11){
                    count = 0;
                    return;
                }
            }          
        }

        
        br.close();
        fr.close();   
        in.close();
    }

    public void Criar(Integer codigo, String data_entrada, String local_Compra, String tipo, String marca, String caracteristica, String tamanho, String cor, Double v_etiqueta, Double v_pago, Double preco_sugerido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Atualizar(Integer codigo, String data_entrada, String local_Compra, String tipo, String marca, String caracteristica, String tamanho, String cor, Double v_etiqueta, Double v_pago, Double preco_sugerido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
