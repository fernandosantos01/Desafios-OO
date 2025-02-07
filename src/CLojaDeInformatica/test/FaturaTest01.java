package CLojaDeInformatica.test;

import CLojaDeInformatica.dominio.Fatura;

public class FaturaTest01 {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("446545646546", "PC GAMER", 15, 15000);
        Fatura fatura01 = new Fatura("455445686546", "CAIXAS DE SOM", 0, 15000);
        Fatura fatura02 = new Fatura("455445686546", "FONES DE OUVIDO", 0, 0);
        Fatura fatura03 = new Fatura("455445686546", "VENTILADORES", 5, 0);
        System.out.println(fatura);
        System.out.println(fatura01);
        System.out.println(fatura02);
        System.out.println(fatura03);
        System.out.println(fatura.getTotalFatura());
        System.out.println(fatura01.getTotalFatura());
        System.out.println(fatura02.getTotalFatura());
        System.out.println(fatura03.getTotalFatura());
    }
}
