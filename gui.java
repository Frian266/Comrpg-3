import java.util.*;

public class gui {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 2 , num = 1;
        String[][] list = new String[10][2];
       // furiyan
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter name and Contact number: (count " + num + ")");
            list[i][0] = sc.nextLine();
            for (int j = 1; j < a; j++) {
                list[i][j] = sc.nextLine(); num ++;
            }  
        }
        int in = 0, i = 0;
        System.out.println("Search a Name: ");
        String com1 = sc.nextLine();
            for (i = 0; i < list.length; i++) {
                for (int j = 1; j < a; j++) {
                    char arrChar = list[i][0].charAt(0);
                    String listChar = Character.toString(arrChar);
                    if (com1.equals(listChar)) {
                        in = i;
                        System.out.println(list[in][0] + " is found with a contact number of " + list[in][j]);
                    } else if (com1.equals(list[i][0])) {
                        System.out.println(com1 + " is found with a contact number of " + list[i][j]);
                    }
                }
            } 
    }    
}