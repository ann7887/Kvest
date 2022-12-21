import java.util.InputMismatchException;
import java.util.Scanner;
public class Quiz {
    private String name;
    private Question[] questions;
    private int number_of_question;
    private int score = 0;

    public Quiz(String name, Question[] questions) {
        this.name = name;
        this.questions = questions;
    }
    public void start() {
        System.out.println("Приветствую в новогодней викторине!");
        System.out.println(name);
        number_of_question = 0;
    }
    public void c(Question[] question,Answer[] answer){
        System.out.print(question[number_of_question].vopros);
        System.out.println(" Выберите вариант ответа:");
        System.out.println("1) " + answer[0].value);
        System.out.println("2) " + answer[1].value);
        System.out.println("3) " + answer[2].value);
        System.out.println("Введите номер выбранного варианта ответа");
        try{
            Scanner in  = new Scanner(System.in);
            int opinion = in.nextInt();
            if (number_of_question == 2){
                answer[0].correct = false;
                answer[1].correct = true;
                answer[2].correct = false;
            }
            if (answer[opinion - 1].correct){
                System.out.println("Верно!");
                score++;
            }
            else {
                //if (answer[opinion - 1].value.equals("Правда")){
                 //   System.out.println("Ха-ха-ха, обманули дурака на четыре кулака!");
                //}
                if (answer[opinion - 1].value.equals("Хороший вопрос! Не знаю")){
                    if (answer[0].correct){
                        System.out.println("Это " + answer[0].value);
                    }
                    else if (answer[1].correct){
                        System.out.println("Это " + answer[1].value);
                    }
                    else {
                        System.out.println("Это " + answer[2].value);
                    }
                }
                else {
                    System.out.println("Не угадали!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            System.out.println("Введен неверный номер ответа!");
        }
        number_of_question++;
    }
    public void play(Question[] question1,Answer[] answer1, int kolvo_voprosov, Quiz game1){
        int counter = 0;
        Scanner in  = new Scanner(System.in);
        while (counter < kolvo_voprosov){
            game1.c(question1, answer1);
            counter++;
        }
    }
    public void byebye(){
        System.out.println("Спасибо за игру! Ваш результат:\n ... \n Ой, забыли посчитать... Давайте еще раз! \n " +
                "... \n Ладно, не очень-то и хотелось. Ваш результат:" + score);
        if (score == 3){
            System.out.println("Принимайте поздравления! Безоговорочная победа!");
        }
    }
}



