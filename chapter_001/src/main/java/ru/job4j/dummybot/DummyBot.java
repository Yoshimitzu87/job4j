package ru.job4j.dummybot;

/**
 * Dummy.
 *
 * @author Anton Frolov (spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";

        if ("Привет, Бот.".equals(question)) {
            rsl = ("Привет, умник.");

        } else if ("Пока.".equals(question)) {
            rsl = ("До скорой встречи.");
        }
        return rsl;
    }
}
