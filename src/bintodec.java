import java.util.Scanner;

public class bintodec {
    public static void main(String args[] ){
                double dec;
                double decimal=0;
                int l=0;
                int j;
                int k;
                int i;
                System.out.println("ENTER THE BINARY NUMBER");
                Scanner SC=new Scanner(System.in);
                int bin=SC.nextInt();
                String temp =Integer.toString(bin);
                int  numbers[]=new int[temp.length()];
                for(i=0;i<temp.length();i++){
                    numbers[i]=temp.charAt(i)-'0';
                }
                System.out.println(i-1);
                for(j=0;j<temp.length();j++) {
                    if (numbers[j] != 0 && numbers[j] != 1) {
                        System.out.println("enter a valid binary number");
                        break;
                    }
                }
                        for( k=i-1;k>=0;k--,l++){
                            dec= numbers[k]*(Math.pow(2,l));
                            decimal=decimal+dec;
                }
                    System.out.println(decimal);
    }}




