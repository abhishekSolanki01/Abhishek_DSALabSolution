package driver;
import java.util.*;

import service.IsBalanced;

public class Driver {

    public static void main(String[] args) {
        IsBalanced isBalanced = new IsBalanced();
        Scanner scn = new Scanner(System.in);
        String expr = scn.next();

        if (isBalanced.isBalanced(expr))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}
