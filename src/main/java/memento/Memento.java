package memento;

/**
 * ClassName: Memento <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Memento {
    private int life;
    private int magic;
    public Memento(Hero hero){
        life = hero.getLife();
        magic = hero.getMagic();
    }

    public int getLife() {
        return life;
    }

    public int getMagic() {
        return magic;
    }
}
