package thuhanh2;

public class Static {

    private String name;
    private  String engine;
    public static int numberOfcars;
    public Static(String name ,String engine){
        this.name = name;
        this.engine = engine;
        numberOfcars++;
        System.out.println("a yêu em ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Static {" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
