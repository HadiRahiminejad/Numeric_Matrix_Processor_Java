import java.text.DecimalFormat;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        float ffv = sc.nextInt();
        float fsv = sc.nextInt();
        float sfv = sc.nextInt();
        float ssv = sc.nextInt();
        float v1V2 = (ffv * sfv) + (fsv * ssv);
        float v1 = (float) Math.sqrt(Math.pow(ffv , 2) + Math.pow(fsv, 2));
        float v2 = (float) Math.sqrt(Math.pow(sfv, 2) + Math.pow(ssv, 2));
        float re;
              re = v1V2 / (v1 * v2);
        DecimalFormat df = new DecimalFormat("#.####");
        String formatted = df.format(re);
        System.out.println(Math.toDegrees(Math.acos((ffv * sfv + fsv * ssv) / (Math.hypot(ffv, fsv) * Math.hypot(sfv, ssv)))));

        int p;
        /*System.out.println(v1V2);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(formatted);
        if (formatted.equals("0.7071")) {
            p = 4;
            System.out.print(180 / p);
        } else if ( re == 0) {
            p = 2;
            System.out.print(180 / p);
        } else if (re == -0.59846006905) {
            p = 1;
            System.out.print(180 / p);
        } else if (re ==0.5) {
            p = 3;
            System.out.print(180 / p);
        } else if (re == 1) {

            System.out.print(0);
        } else if (formatted.equals("0.8660")) {
            p = 6;
            System.out.print(180 / p);

        }
*/
    }
}
