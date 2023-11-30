package builder;

import org.junit.Test;

/**
 * ClassName: BuilderTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/14 0014
 * @since JDK 11
 */
public class BuilderTest {
    @Test
    public void builderTest(){
        MilkTea pearl = new MilkTea.Builder("原味")
                .size("中杯")
                .ice(true)
                .pearl(true)
                .build();
        System.out.println(pearl.toString());
    }
}
