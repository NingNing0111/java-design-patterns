package template;

/**
 * ClassName: AbstractFight <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public abstract class AbstractFight {
    public abstract void initData();
    public abstract void fightWithBoss();
    public abstract void killBoss();
    public abstract void gameSettlement();
    // 这里定义的就是打Boss的整个流程，也就是算法逻辑
    public void fight(){
        initData();
        for (int i = 0; i < 5; i++) {
            fightWithBoss();
        }
        killBoss();
        gameSettlement();
    }
}
