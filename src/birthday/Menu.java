package birthday;

import java.util.Scanner;

public class Menu {
    TextAnimation textAnimation = new TextAnimation();
    Input input = new Input();
    Scanner scanner = new Scanner(System.in);

    void functional() throws InterruptedException {
      textAnimation.getAnimation("Приветствуем вас в меню бортового компьютера Кайдзен-85");
        textAnimation.getAnimation("Чтобы получить отчет, нажмите \"Q\"");
        if (input.getInput("Q") == true) {
            information();
        }
            System.out.println();
            System.out.println();
            get();
            textAnimation.getAnimation("Ваша задача, №451, доставить оборудование на Марс.");
            System.out.println();
            doors();

    }

    void information() throws InterruptedException {
        textAnimation.getAnimation("02.03.2091                  Загрузка корабля провизией и топливом прошла успешна");
        textAnimation.getAnimation("04.03.2091                  Зарегистрировано 8 новых пользователей");
        textAnimation.getAnimation("05.03.2091                  Пользователь №310 получил доступ к управлению корабля");
        textAnimation.getAnimation("07.03.2091                  Пользователь №310 разрешил загрузку оборудования MarsLink в грузовой отсек корабля");
        textAnimation.getAnimation("09.03.2091                  Запущен режим ожидания");
        textAnimation.getAnimation("13.03.2091                  Warning! Обнаружено облако астероидов на маршруте корабля!");
        textAnimation.getAnimation("14.03.2091                  !;№%?%#@%!%*^# Нарушена герметичность обшивки! Повреждена часть корабля");
    }

    void goal() throws InterruptedException {
        textAnimation.getAnimation("Цель научной экспедиции:");
        textAnimation.getAnimation("1.Доставить научное оборудование на кампус лагеря G124 поверхности");
        textAnimation.getAnimation("2.Доставить научный персонал в капмус");
        textAnimation.getAnimation("3.Запустить техно-спутник MediaLink на орбиту Марса");
        textAnimation.getAnimation("4.Ожидать следующих указаний в сортировочном центре");
    }

    void get() throws InterruptedException {
        textAnimation.getAnimation("Чтобы получить отчет нажмите \"Q\", чтобы узнать цель миссии, нажмите \"E\"");
        String s = scanner.nextLine();
        if (s.equals("Q") == true) {
            information();
            System.out.println();
            textAnimation.getAnimation("Чтобы узнать цель миссии, нажмите \"E\"");
            input.checkInput("E");
            goal();
        } else if (s.equals("E") == true) {
            goal();
        } else {
            System.out.println("Команда не распознана");
            get();
        }

    }

    void doors() throws InterruptedException {
        textAnimation.getAnimation("Пройдите на мостик капитана корабля, для дальнейших указаний:");
        System.out.println();
        System.out.println();
        textAnimation.getAnimation("Выберите комнату, в которую хотите войти");
        textAnimation.getAnimation("Комната механика, нажмите:                         D2");
        textAnimation.getAnimation("Комната  борт-инженера, нажмите:                   D1");
        textAnimation.getAnimation("Комната биолога, нажмите:                          D9");
        textAnimation.getAnimation("Ваша комната, нажмите:                             D7");
        textAnimation.getAnimation("Комната помощника капитана, нажмите:               D3");
        textAnimation.getAnimation("Мед-кабинет, нажмите:                              D13");
        textAnimation.getAnimation("Комната капитана, нажмите:                         D8");
        textAnimation.getAnimation("Капитанский мостик, нажмите:                       D11");
    }
}


