
package bai2;

public class main {
    public static void main(String[] args) {
        album DT1 = new album();
        album DT2 = new album();
        DT1.nhap();
        System.out.println("Doi tuong 1");
        System.out.println("|  Ma album  |  ten album  |     gia    |");
        DT1.xuat();
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");
        DT2.nhap();
        System.out.println("Doi tuong 2");
        System.out.println("|  Ma album  |  ten album  |     gia    |");
        DT2.xuat();
    }
}
