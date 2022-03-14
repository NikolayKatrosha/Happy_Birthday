package birthday;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Texts {
    Input input = new Input();

    void introductionWelcome() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        TextAnimation textAnimation = new TextAnimation();
        Menu menu = new Menu();
        newLine();
        newLine();
        newLine();
        newLine();
        newLine();
        newLine();
        newLine();
        newLine();
        newLine();
      /* textAnimation.getAnimation("@(%@_%(_#%(*%#(*^#%&@!$#");
        newLine();
        sleep(3000);
        textAnimation.getAnimation("Downl.#@#*$ing....");
        newLine();
        sleep(3000);
        textAnimation.getAnimation("Где-то в просторах космоса, недалеко от Земли... ");
        newLine();
        textAnimation.getAnimation("Потерянный во тьме путник старается понять, что произошло с его полуразрушенным кораблем");
        newLine();
        sleep(3000);
        textAnimation.getAnimation("№?,*$#@%&#@!@");
        newLine();
        textAnimation.getAnimation("Ошибка в доступе... Поврежденные файлы......");
        textAnimation.getAnimation("WARNING!!! Повреждена герметичность корпуса корабля");
        newLine();
        sleep(3000);
        textAnimation.getAnimation("Нажмите \"E\" чтобы поговорить с бортовым компьютером");
        textAnimation.getAnimation("(PS: Бортовой компьютер понимает только английский ввод):");
        newLine();
        input.checkInput("E");
        textAnimation.getAnimation("Добро пожаловать на борт, №451! Робот помощник Кайдзен-85 приветствует вас!");
        sleep(3000);
        textAnimation.getAnimation("Ваша квартира - Ваш корабль...");
        textAnimation.getAnimation("Нажмите \"F\", чтобы войти поговорить с бортовым компьютером:");
        input.getInput("F");
        textAnimation.getAnimation("Нажмите \"M\",чтобы зайти в меню, или \"E\", чтобы выйти из бортового компьютера");
input.chooseInput("M","E");
menu.functional();*/
    }


    void newLine() {
        System.out.println();
    }
}
