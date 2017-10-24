package main;

public class Apple extends Entity {
    private Field field;

    public Apple(Point pos, Field field) {
        position = pos;
        this.field = field;
    }

    public void tick() {

    }

    @Override
    public Sprite createSprite() {
        return new AppleSprite(this);
    }
}
