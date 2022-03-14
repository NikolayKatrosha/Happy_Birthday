package birthday;

import java.util.Scanner;

public class Input {
    TextAnimation textAnimation = new TextAnimation();

    Scanner scanner = new Scanner(System.in);

    boolean checkInput(String s) {

        String input = scanner.nextLine();

        if (input.equals(s)) {
            return true;
        }

        else {
            System.out.println("Неправильный ввод! Попробуйте еще раз");
            checkInput(s);
        }
        return true;
    }

    boolean getInput(String s) {
        String input = scanner.nextLine();

        if (input.equals(s)) {
            return true;
        } else {
            System.out.println("Команда не распознана");
            getInput(s);
        }
        return true;
    }

    boolean chooseInput(String s, String s1) throws InterruptedException {
        String input = scanner.nextLine();

        if (input.equals(s)) {

            return true;
        } else if (input.equals(s1)) {
            textAnimation.getAnimation("Вы вышли из бортового компьютера. Вряд-ли вы что-то поймете без него. Нажмите \"F\" чтобы войти в бортовой компьютер");
            getInput("F");
            textAnimation.getAnimation("Нажмите \"M\",чтобы зайти в меню, или \"E\", чтобы выйти из бортового компьютера");
            chooseInput("M", "E");
            return true;
        } else {
            System.out.println("Команда не распознана");
            chooseInput(s, s1);
        }
        return true;
    }

    boolean enterRoom(String s) throws InterruptedException {
        String input = scanner.nextLine();

        if (input.equals(s)) {
            return true;
        } else {
           textAnimation.getAnimation("Отказано в доступе! Нужен спец-допуск");
            getInput(s);
        }
        return true;
    }
}
