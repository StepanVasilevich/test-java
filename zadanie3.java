import java.util.Scanner;

public class NodNok {

    public int  nod(int x, int y) {
        if (y == 0)
            return x;
        return nod(y, x % y);
    }
        int nok(int t, int q) {
        return q * t/ nod(q, t);
    }
    public static void main(String [] args){


      NodNok d = new NodNok();
      NodNok c = new NodNok();

        Scanner s = new Scanner(System.in);
        System.out.print("������� ��� ����� ��� ���: " );
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("��� ������  "  + d.nod(a,b) + "\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("������� ��� ����� ���  ���: ");
        int q = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("HOK ����� " + c.nok(q ,t ));

}
}