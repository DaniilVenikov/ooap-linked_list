//2.1
public abstract class LinkedList<T> {

    public static int HEAD_NIL = 0;
    public static int HEAD_OK = 1;
    public static int HEAD_ERR = 2;

    public static int TAIL_NIL = 0;
    public static int TAIL_OK = 1;
    public static int TAIL_ERR = 2;

    public static int RIGHT_NIL = 0;
    public static int RIGHT_OK = 1;
    public static int RIGHT_ERR = 2;

    public static int PUT_RIGHT_NIL = 0;
    public static int PUT_RIGHT_OK = 1;
    public static int PUT_RIGHT_ERR = 2;

    public static int PUT_LEFT_NIL = 0;
    public static int PUT_LEFT_OK = 1;
    public static int PUT_LEFT_ERR = 2;

    public static int REMOVE_NIL = 0;
    public static int REMOVE_OK = 1;
    public static int REMOVE_ERR = 2;

    public static int ADD_TO_EMPTY_OK = 1;
    public static int ADD_TO_EMPTY_ERR = 2;

    public static int REPLACE_NIL = 0;
    public static int REPLACE_OK = 1;
    public static int REPLACE_ERR = 2;

    public static int FIND_NIL = 0;
    public static int FIND_OK = 1;
    public static int FIND_ERR = 2;

    public static int GET_NIL = 0;
    public static int GET_OK = 1;
    public static int GET_ERR = 2;

    //конструктор
    //постусловие: создан новый пустой связный список
    public abstract LinkedList<T> LinkedList();

    //команды

    //предусловие: список не пустой
    //постусловие: курсор указывает на первый узел
    public abstract void head();

    //предусловие: список не пустой
    //постусловие: курсор указывает на последний узел
    public abstract void tail();

    //предусловие: есть елемент справа
    //постусловие: курсор указывает на элемент справа от предыдущего
    public abstract void right();

    //предусловие: список не пустой
    //постусловие: новый элемент вставлен следом за текущим узлом
    public abstract void putRight(T value);

    //предусловие: список не пустой
    //постусловие: новый элемент вставлен перед текущим узлом
    public abstract void putLeft(T value);

    //предусловие: список не пустой
    //постусловие:курсор смещается к правому соседу, если он есть,в противном случае курсор смещается к левому соседу,
    //если он есть
    public abstract void remove();

    //постусловие: из списка удаляются все значения
    public abstract void clear();

    //предусловие: список пустой
    //постусловие: в список добавлен первый элемент
    public abstract void addToEmpty(T value);

    //постусловие: добавлен новый узел в конец списка
    public abstract void addTail(T value);

    //предусловие: список не пустой
    //постусловие: значение текущего узла заменено на заданное
    public abstract void replace(T value);

    //постусловие: курсор установлен на следующий узел с искомым значением, если такой узел найден
    public abstract void find(T value);

    //постусловие: из списка удаляться все узлы с заданным значением
    public abstract void removeAll(T value);


    //запросы

    //предусловие: список не пустой
    public abstract T get();

    public abstract int size();

    public abstract boolean isHead();
    public abstract boolean isTail();
    public abstract boolean isValue();

    public abstract int getHeadStatus();
    public abstract int getTailStatus();
    public abstract int getRightStatus();
    public abstract int getPutRightStatus();
    public abstract int getPutLeftStatus();
    public abstract int getRemoveStatus();
    public abstract int getAddToEmptyStatus();
    public abstract int getReplaceStatus();
    public abstract int getFindStatus();
    public abstract int getGetStatus();
}

//2.2
// Реализации операция tail через другие потребует циклов сканирования списка (сложность O(N))

//2.3
// Потому что мы можем свести её к другим атомарным операциям
