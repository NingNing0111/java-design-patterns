package memento;

import org.junit.Test;

/**
 * ClassName: MementoTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/21 0021
 * @since JDK 11
 */
public class MementoTest {
    @Test
    public void mementoTest(){
        // 创建一个英雄
        Hero hero = new Hero();
        // 创建一个存档
        Memento memento = hero.saveState();
        // 打Boss
        hero.fightWithBoss();
        // 打Boss失败了，读取存档进行复活
        hero.restoreState(memento);
    }
}
