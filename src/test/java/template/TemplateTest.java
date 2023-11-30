package template;

import org.junit.Test;

/**
 * ClassName: TemplateTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class TemplateTest {
    @Test
    public void templateTest(){
        AbstractFight ning = new IronMan("NingNing0111");
        ning.fight();
        AbstractFight peter = new SpiderMan("Peter Parker");
        peter.fight();
    }
}
