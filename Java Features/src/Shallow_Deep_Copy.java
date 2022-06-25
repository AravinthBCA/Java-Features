import java.util.HashMap;
import java.util.Map;

public class Shallow_Deep_Copy implements Cloneable {
    private String name;                // immutable field
    private int age;                    // primitive field
    
    public Shallow_Deep_Copy(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public Shallow_Deep_Copy shallowCopy(Shallow_Deep_Copy obj) {
    	Shallow_Deep_Copy obj1 = obj;
    	return obj1;
    }
    
    public Shallow_Deep_Copy deepCopy(Shallow_Deep_Copy obj) {
    	Shallow_Deep_Copy obj1 = new Shallow_Deep_Copy(obj.name,obj.age);
    	return obj1;
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
    	Shallow_Deep_Copy obj = new Shallow_Deep_Copy("aravinth",20);
    	Shallow_Deep_Copy shallow = obj.shallowCopy(obj);
    	Shallow_Deep_Copy deep = obj.deepCopy(obj);
    	System.out.println(obj==shallow);
    	obj.name="ruban";
    	System.out.println(shallow.name);
    	System.out.println(obj==deep);
    	System.out.println(deep.name);
    }
}
