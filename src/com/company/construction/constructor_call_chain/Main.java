package com.company.construction.constructor_call_chain;

/**
 * Конструирование объектов
 * 1. У каждого объекта ВСЕГДА есть конструктор.
 * 2. Если мы не создаем конструктор - его добавят в момент компиляции
 * 3. Если в классе уже существует конструктор (любой) - то не добавят автоматически
 *
 *
 * 4. У каждого класса всегда есть предок
 * (любой класс всегда наследуется от кого-то).
 * 5. Если мы не объявляем класс предок - в момент компиляции автоматически
 * добавят наследование от класса Object (папа всех объектов).
 *
 *
 * 6. Каждый конструктор ОБЯЗАТЕЛЬНО должен вызывать конструктор предка.
 * 7. Если мы не указали, что нужно вызвать конструктор предка (super();),
 * то super() добавят в момент компиляции
 *
 * 8. Конструктор класса может первой строчкой вызвать другой конструктор
 * класса. НО, в итоге, должен вызваться конструктор предка.
 * Иначе - ошибка компиляции
 *
 *
 *
 * 9. Зона видимости - это
 * "какие методы можно вызывать из данного экземпляра класса"
 *
 * 10. Зона видимости методов определяется по предку (если у предка нету метода,
 * то его нельзя вызвать)
 *
 * A instance = new C();
 * ----------------------
 * A имеет 3 метода
 * С имеет 10 методов
 * -------------------
 * В сумме методов 13 (доступных из класса C)
 *
 * Из переменной instance можно вызвать только 3 метода (которые есть у предка)
 * ------------------
 * C instance = new C();
 * Можно вызвать все 13 (которые есть у класса A + все, которые есть с класса С)
 *
 * Если в А метод существует, то его "видно" и можно вызвать
 *
 * 11. Реализация методов берем из C
 */
public class Main {
    public static void main(String[] args) {
    }
}


class Parent {
    public Parent() {
    }

    public Parent(String name) {
        this();
    }
}

class Child extends Parent {

    public Child(String name) {
//        super("");
        this(name, 0, false);

    }

    public Child(String name, Integer age, boolean hasDriverLicence) {

    }
}