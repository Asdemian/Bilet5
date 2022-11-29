public class Main {
    public static void main(String[] args) {
        String[][] bookAndAuthors = new String[5][2]; // объявили массив и проинициализировалли
        bookAndAuthors[0][0] = "Золотой ключик"; // Заполнили нужными значениями
        bookAndAuthors[0][1] = "Алексей толстой";
        bookAndAuthors[1][0] = "Стальная крыса";
        bookAndAuthors[1][1] = "Гэнри Дэмпси";
        bookAndAuthors[2][0] = "Неукротимая планета";
        bookAndAuthors[2][1] = "Гэнри дэмпси";
        bookAndAuthors[3][0] = "Мир смерти";
        bookAndAuthors[3][1] = "Гэнри Дэмпси";
        bookAndAuthors[4][0] = "Запад Эдема";
        bookAndAuthors[4][1] = "Гэнри Дэмпси";
        for (int i = 0; i < bookAndAuthors.length; i++) {   //  идем по строкам
            for (int j = 0; j < bookAndAuthors[0].length; j++) {  // идем по столбцам
                if (j == 0) {
                    System.out.print("<<" + bookAndAuthors[i][j] + ">>"); // вывод книги
                } else
                    System.out.println(" " + bookAndAuthors[i][j] + " "); // вывод элемента
            }
            System.out.println();  // перенос строки
        }
    }
}