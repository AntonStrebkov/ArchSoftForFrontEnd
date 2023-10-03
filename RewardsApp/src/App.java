import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.CoinGenerator;
import Fabric.CopperGenerator;
import Fabric.EmeraldGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.RubyGenerator;
import Fabric.SilverGenerator;
import Fabric.StoneGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        List<ItemGenerator> generators = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 3; i++) {
            generators.add(new GemGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new SilverGenerator());
        }
        for (int i = 0; i < 40; i++) {
            generators.add(new StoneGenerator());
        }
        for (int i = 0; i < 4; i++) {
            generators.add(new RubyGenerator());
        }
        for (int i = 0; i < 5; i++) {
            generators.add(new EmeraldGenerator());
        }
        for (int i = 0; i < 8; i++) {
            generators.add(new CoinGenerator());
        }
        for (int i = 0; i < 30; i++) {
            generators.add(new CopperGenerator());
        }
        

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(120);
            generators.get(index).openReward();
        }

    }
}
