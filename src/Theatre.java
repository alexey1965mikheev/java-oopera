public class Theatre {
    public static void main(String[] args) {
        // Создаем актеров
        Actor actor1 = new Actor("Иван", "Павлов", Gender.MALE, 185);
        Actor actor2 = new Actor("Алексей", "Прошкин", Gender.MALE, 176);
        Actor actor3 = new Actor("Татьяна", "Кудрявцева", Gender.FEMALE, 164);
        // Создаем режиссёров
        Director director1 = new Director("Андрей", "Петров", Gender.MALE, 23);
        Director director2 = new Director("Кирилл", "Серебренников", Gender.MALE, 75);
        // Создаем автора музыки
        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);
        // Создаем хореографа
        Person choreographer = new Person("Николай", "Цискаридзе", Gender.MALE);
        // Создаем спектакли
        Show show = new Show("Обычная пьеса", 90, director2);

        String libretto1 = "Сюжет повествует о Германе, одержимом тайной трех карт, который из-за карточного азарта и "
                           + "страсти к Лизе становится причиной смерти старой Графини. В финале Герман сходит с ума.";
        Opera opera = new Opera("Пиковая дама", 180, director1, musicAuthor, libretto1, 20);

        String libretto2 = "История о смелой девочке Мари, превращении деревянной куклы в принца и победе над Мышиным "
                           + "королем.";
        Ballet ballet = new Ballet("Щелкунчик", 150, director1, musicAuthor, libretto2, choreographer);
        // Распределяем актеров по спектаклям
        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        // Для каждого спектакля выводим список актёров
        show.printActorsList();
        opera.printActorsList();
        ballet.printActorsList();
        // Пытаемся добавить дубликат актера в обычный спектакль
        show.addActor(actor1);
        // Заменяем актера на актера из другого спектакля
        opera.replaceActor("Павлов", actor3);
        opera.printActorsList();
        // Пытаемся заменить несуществующего актера в оперном спектакле
        opera.replaceActor("Несуществующий", actor3);
        // Для оперного и балетного спектакля выводим текст либретто
        opera.printLibretto();
        ballet.printLibretto();
    }
}