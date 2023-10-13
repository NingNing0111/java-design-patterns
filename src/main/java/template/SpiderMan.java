package template;

/**
 * ClassName: SpiderMan <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class SpiderMan extends AbstractFight{
    private String name;
    public SpiderMan(String name){
        this.name = name;
    }
    @Override
    public void initData() {
        System.out.println(name+"'s data loading finished!");
    }

    @Override
    public void fightWithBoss() {
        System.out.println(name+" is fighting through his webbing!");
    }

    @Override
    public void killBoss() {
        System.out.println(name+" killed the Boss!");
    }

    @Override
    public void gameSettlement() {
        System.out.println(name+ " won!");
    }
}
