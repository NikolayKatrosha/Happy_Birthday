package birthday;

import static java.lang.Thread.sleep;

public class TextAnimation {


    void getAnimation(String lines) throws InterruptedException {
        String line = lines;
        char[] array = line.toCharArray();
        for (int i = 0; i <line.length(); i++) {
            System.out.print(array[i]);
            sleep(1);
        }
        System.out.println();

    }
}
