package builder;

import iterator.Book;

/**
 * ClassName: MilkTea <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/14 0014
 * @since JDK 11
 */
public class MilkTea {

    private String type;
    private String size;
    private boolean pearl;
    private boolean ice;

    private MilkTea(){}

    public String getType(){
        return type;
    }
    public String getSize(){
        return size;
    }
    public boolean getPearl(){
        return pearl;
    }
    public boolean getIce(){
        return ice;
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", pearl=" + pearl +
                ", ice=" + ice +
                '}';
    }

    private MilkTea(Builder builder){
        this.type = builder.type;
        this.ice = builder.ice;
        this.pearl = builder.pearl;
        this.size = builder.size;
    }
    public static class Builder{
        private final String type;
        private String size = "中杯";
        private boolean pearl = true;
        private boolean ice = false;
        public Builder(String type){
            this.type = type;
        }
        public Builder size(String size){
            this.size = size;
            return this;
        }
        public Builder pearl(boolean pearl){
            this.pearl = pearl;
            return this;
        }
        public Builder ice(boolean ice){
            this.ice = ice;
            return this;
        }
        public MilkTea build(){
            return new MilkTea(this);
        }
    }
}
