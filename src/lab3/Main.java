package lab3;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            ChomskyNormalForm chomsky = new ChomskyNormalForm(new File(
                    "C:\\Users\\Malii Antonela\\IdeaProjects\\Lab3LFPC\\src\\lab3\\VAR22.txt"));
            chomsky.to_chomsky();
        }
        catch (FileNotFoundException e){
            System.out.print(e.toString());
        }
    }
}
