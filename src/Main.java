import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Answer[] answer1 = new Answer[3];
        answer1[0] = new Answer("Правда", true);
        answer1[1] = new Answer("Обман чистой воды", false);
        answer1[2] = new Answer("Хороший вопрос! Не знаю", false);
        int kolvo_voprosov = 3;
        int counter = 0;

        Question[] question1 = new Question[kolvo_voprosov];
        question1[0] = new Question("Снег бывает не только белым. Черный снегопад шокировал жителей Швеции в 1969 году, " +
                "а в США в 1955 году люди увидели зеленый снег. \n" +
                "Он также бывает и розовым, и фиолетовым, и синим. " +
                "Причина вовсе не в загрязнениях, такие чудеса природа творит сама. \n" +
                "Разные цвета у снега создают особые арктические бактерии. \nОни распространяются на большие территории " +
                "и окрашивают снег.", answer1);
        question1[1] = new Question("Первая в мире поздравительная открытка, появившаяся в середине XIX века, была " +
                "рождественской: \nна ней был изображен рождественский ужин и подписаны слова поздравления.", answer1);
        question1[2] = new Question("В Италии каждую новогоднюю ночь у камина люди оставляют чашечку кофе для своего " +
                "Баббо Натале,\nкоторому очень нужны силы, чтобы приносить людям подарки через печную трубу.", answer1);

        Quiz game1 = new Quiz("Угадайте правда или ложь!",question1);
        game1.start();
        Scanner in  = new Scanner(System.in);
        while (counter < kolvo_voprosov){
            game1.c(question1, answer1);
            counter++;
        }
        game1.byebye();
    }
}
