package main;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Apple extends Entity {
    public Apple(Point pos, Field field) {
        position = pos;
        this.field = field;
    }

    private final static List<BiFunction<Point, Field, Apple>> appleTypes =
            new ArrayList<BiFunction<Point, Field, Apple>>(){{
                add(Apple::new);
                add(AppleBig::new);
            }};

    public static Apple randomApple(Random random, Point pos, Field field) {
        int choice = random.nextInt(appleTypes.size());
        return appleTypes.get(choice).apply(pos, field);
    }

    protected Field field;

    public void eatEffect(Snake snake) {
        snake.setGrowth(snake.getGrowth() + 1);
        field.setPoints(field.getPoints() + 1);
    }

    public void tick() {

    }

    @Override
    public Sprite createSprite() {
        return new AppleSprite(this);
    }
}