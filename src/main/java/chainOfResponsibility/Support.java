package chainOfResponsibility;

/**
 * ClassName: Support <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
public abstract class Support {
    private String name;
    private Support next;
    public Support(String name){
        this.name = name;
    }
    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    public String toString(){
        return "[" + name + "]";
    }

    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if (next != null){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);
    private void done(Trouble trouble){
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved.");
    }
}
