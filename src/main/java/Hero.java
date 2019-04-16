import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int Id;

    private static List<Hero> instances = new ArrayList<Hero>();

    public Hero(String name, int age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        Id = instances.size();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public static List<Hero> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId()
    {
        return Id;
    }

    public static Hero find(int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static boolean findHeroByName(String name)
    {
        boolean isAvailable = false;
        for (int i =0; i<instances.size(); i++)
        {
            if (name.equalsIgnoreCase(instances.get(i).name) )
            {
                isAvailable = true;
            }
        }

        return isAvailable;
    }

}
