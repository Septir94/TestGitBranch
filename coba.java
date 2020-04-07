import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// create application to save new hero, at first the application is running, it will ask add new hero ? Then choose y or no, if y, then create new hero,  the detail is name, class, healt point, atk, def.
// After program save then print data, and ask again, create new hero ?
// We can save many hero when the application is running, but the data will destroy when the application is closed. 

// If hero > 1 then print like bellow

// Ruby Fighter 10000 3000 1500
// Jawhead Fighter 9500 3250 1250

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kondisi = false;
        List<String> list = new ArrayList<>();
        String [][] arr = new String[5];
        do {
            System.out.print("New Hero?[y/no]:");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("y")) {
                System.out.print("name : ");
                    String name = sc.nextLine();
                    System.out.print("class : ");
                    String c = sc.nextLine();
                    System.out.print("healt point : ");
                    String healt = sc.nextLine();
                    System.out.print("atk : ");
                    String atk = sc.nextLine();
                    System.out.print("def : ");
                    String def = sc.nextLine();
                    arr[0]=name;arr[1]=c;arr[2]=healt;arr[3]
                    String z= name + " " + c + " " + healt + " " + atk + " " + def;
                    list.add(z);
            } else if (input.equalsIgnoreCase("no")) {
                for (String string : list) {
                    System.out.println(string.toString());
                }
                System.out.println("Byee");
                kondisi = true;
            }
          
        } while (kondisi==false);
    }
}