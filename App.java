/**
 * App
 */
public class App {

    public static void main(String[] args) {
        App app = new App();

        if (app.handle(args[0])){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }

    public boolean handle(String str){
        String[] letters = str.split("");

        for (String checkedLetter : letters){
            int counter = 0;

            for (String letter : letters){
                if (checkedLetter.equals(letter)){
                    counter++;
                }
            }
            
            if (counter >1){
                return false;
            }
        }
        return true;
    }
}