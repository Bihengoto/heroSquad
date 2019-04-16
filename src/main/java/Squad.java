import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String name;
    private int max_size;
    private String cause;
    private int id;

    private static List<Squad> instances = new ArrayList<Squad>();
    private List<Hero> heroes;

    public Squad(String name, int max_size, String cause) {
        this.name = name;
        this.max_size = max_size;
        this.cause = cause;
        this.id = id;
        this.heroes = heroes;
        instances.add(this);
        id = instances.size();
        heroes = new ArrayList<Hero>();
    }

    public String getName() {
        return name;
    }

    public int getMax_size() {
        return max_size;
    }

    public String getCause() {
        return cause;
    }

    public static List<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId() {
        return id;
    }

    public static List<Squad> getInstances() {
        return instances;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public static Squad find(int id) {
        return instances.get(id - 1);
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }


}
