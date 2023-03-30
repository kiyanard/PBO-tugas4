import java.util.Scanner;

public class RumusAbc {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a = "  );
        int a = input.nextInt();
        System.out.print("Masukkan nilai b = "  );
        int b = input.nextInt();
        System.out.print("Masukkan nilai c = "  );
        int c = input.nextInt();

        Rumus rumusabc = new Rumus();

        double determinan = rumusabc.getDeterminan(a, b, c);
        double akarsatu = rumusabc.getAkar1(determinan,a,b,c);
        double akardua = rumusabc.getAkar2(determinan,a,b,c);


        System.out.println("Maka Determinan nya adalah " + determinan);
        System.out.printf("Maka x1 atau akar pertama adalah %.1f\n" ,akarsatu);
        System.out.printf("Maka x2 atau akar kedua adalah %.1f\n" ,akardua);
    }
}


