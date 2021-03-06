package main;

import main.Sprites.Sprite;

import java.util.List;
import java.util.ArrayList;

abstract public class Entity implements Tickable {
    protected Point position;

    public Point getPosition() {
        return position;
    }

    public List<Point> allPositions() {
        List<Point> result = new ArrayList<>();
        result.add(position);
        return result;
    }

    public int getX()
    {
        return position.getX();
    }

    public int getY()
    {
        return position.getY();
    }

    abstract public void tick(Game game);

    abstract public Sprite createSprite();
}
