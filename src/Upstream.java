import java.util.ArrayList;

public class Upstream{
    String name;
    ArrayList<String> servers;
    public Upstream(String upstream_name){
        name=upstream_name;
        servers=new ArrayList<String>();
    }
}
