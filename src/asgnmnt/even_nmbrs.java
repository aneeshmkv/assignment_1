package asgnmnt;
import javax.swing.*;

import java.util.*;
/**
 * Created by aneesh on 8/12/16.
 */
public class even_nmbrs {



        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = reader.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(" even numbers: " + i);

            }

        }
}

