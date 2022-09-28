import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Input:
        *   Nhap so phan tu mang, khoi tao mang
        *   Nhap gia tri phan tu can xoa
        * Output:
        *   Xoa tat ca cac phan tu co gia tri nhap vao
        * */
        //B1. Nhap so phan tu va khoi tao mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int[n];
        System.out.println("NHAP GIA TRI CAC PHAN TU CUA MANG");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("old[%d]=",i);
            old[i] = Integer.parseInt(sc.nextLine());
        }
        //B2. In ra cac gia tri phan tu cua mang truoc khi xoa
        System.out.println("Gia tri cac phan tu trong mang truoc khi xoa: ");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("%d\t",old[i]);
        }
        System.out.printf("\n");
        //B3. Nhap vao gia tri can xoa trong mang
        System.out.println("Nhap vao gia tri can xoa trong mang: ");
        int deleteValue = Integer.parseInt(sc.nextLine());
        //B4. Xoa phan tu co gia tri la deleteValue trong mang
        //B4.1. Khoi tao mot mang moi arrNew de chua cac phan tu sau khi xoa
        //-----Dem so phan tu co gia tri la deleteValue trong mang old
        int cnt = 0;
        for (int i = 0; i < old.length; i++) {
            if (old[i]==deleteValue){
                cnt++;
            }
        }
        //------Khoi tao mang moi arrNew voi so phan tu la old.length - cnt
        int[] arrNew = new int[old.length-cnt];
        //------copy toan bo cac phan tu khong bi xoa tu old sang arrNew
        int index=0;
        for (int i = 0; i < old.length; i++) {
            if (old[i]==deleteValue){
                //Dang o phan tu can xoa o mang old
                continue;
            }else{
                //Dang o phan tu can copy sang mang arrNew
                arrNew[index] = old[i];
                index++;
            }
        }
        //B5. In gia tri cac phan tu mang moi
        System.out.println("Gia tri cac phan tu trong mang sau khi xoa: ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t",arrNew[i]);
        }
        System.out.printf("\n");
    }
}