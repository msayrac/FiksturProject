
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Galatasaray");
        list.add("Bursaspor");
        list.add("Fenerbah�e");
        list.add("Be�ikta�");
        list.add("Ba�ak�ehir");
        list.add("Trabzonspor");
        FixtureGenerator fixtureGenerator = new FixtureGenerator();
        List<List<Match>> all= fixtureGenerator.getFixtures(list);
        fixtureGenerator.print(all);

    }
}