public interface ICrud <T> {

    void create(T person);
    T read(int index);
    void update(T person, int index);
    void delete(int index);

}
