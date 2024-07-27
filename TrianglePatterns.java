import java.util.*;

public class TrianglePatterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        trianglePatternOne(n);
        System.out.println();
        trianglePatternTwo(n);
        System.out.println();
        trianglePatternThree(n);
        System.out.println();
        trianglePatternFour(n);
        System.out.println();
        rhombus(n);
        System.out.println();
        trianglePatternFive(n);
        System.out.println();
        trianglePatternSix(n);
        System.out.println();
        hillPattern(n);
        System.out.println();
        reverseHillPattern(n);
        System.out.println();
        kite(n);
    }

    public static void trianglePatternOne(int n){
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void trianglePatternTwo(int n){
        for(int  i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void trianglePatternThree(int n){
        for(int  i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int  i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void trianglePatternFour(int n){
        for(int  i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void rhombus(int n){
        for(int  i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void trianglePatternFive(int n){
        for(int  i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void trianglePatternSix(int n){
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<=n;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void hillPattern(int n){
        for(int  i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<i;k++){
                System.out.print(" *");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void reverseHillPattern(int n){
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<n;k++){
                System.out.print(" *");
            }
            for(int k=i;k<=n;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void kite(int n){
        for(int  i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<i;k++){
                System.out.print(" *");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<n;k++){
                System.out.print(" *");
            }
            for(int k=i;k<=n;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }


}