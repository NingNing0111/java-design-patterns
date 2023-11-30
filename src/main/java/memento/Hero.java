package memento;

/**
 * ClassName: Hero <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class Hero {
    // 生命值
    private int life;
    // 魔法值
    private int magic;

    public Hero(){
        this.life = 100;
        this.magic = 100;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void fightWithBoss(){
        life -= 100;
        magic -= 100;
        if(life <= 0){
            System.out.println("英雄死亡！");
        }
        System.out.println(this);
    }

    public Memento saveState(){
        System.out.println(this);
        return new Memento(this);
    }

    public void restoreState(Memento memento){
        this.life = memento.getLife();
        this.magic = memento.getMagic();
        System.out.println(this);
    }

    public String toString(){
        return "英雄生命值：" + life + ",魔法值：" + magic + ".";
    }
}
