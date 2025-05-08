/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan703;

/**
 *
 * @author Maria Droste
 * TGL : 8 MEI 2025
 */
    public class segiTiga extends BangunRuang{
        private int alas,tinggi;
    
    @Override
    public void hitungLuas(){
        this.luas = this.alas*this.tinggi/2;
    }
    public void setAlas (int nilai){
        this.alas = nilai;
    }
    public void setTinggi(int nilai){
        this.tinggi = nilai;
    }
    public void cetakLuas(){
        System.out.printf("Luas Segitiga dengan nilai alas= %d dan tinggi = %d adalah %.2f\n", this.alas,this.tinggi,this.luas);
                    
    }
  }
