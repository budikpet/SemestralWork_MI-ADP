package cz.cvut.fit.miadp.mvcgame.bridge;

import cz.cvut.fit.miadp.mvcgame.model.Position;

/**
 * Part of bridge pattern. Implements "interface" for functionality that is
 * needed in the game.
 */
public class GameGraphics implements IGameGraphics {
    protected IGameGraphicsImplementor implementor;

    public GameGraphics(IGameGraphicsImplementor impl) {
        this.implementor = impl;
    }

    @Override
    public void drawImage(String path, Position pos) {
        this.implementor.drawImage(path, pos);
    }

    @Override
    public void drawText(String text, Position pos) {
        this.implementor.drawText(text, pos);
    }

    @Override
    public void drawRectangle(Position leftTop, Position rightBottom) {
        this.implementor.drawLine(leftTop, new Position(rightBottom.getX(), leftTop.getY()));
        this.implementor.drawLine(new Position(rightBottom.getX(), leftTop.getY()), rightBottom);
        this.implementor.drawLine(rightBottom, new Position(leftTop.getX(), rightBottom.getY()));
        this.implementor.drawLine(new Position(leftTop.getX(), rightBottom.getY()), leftTop);
    }

    @Override
    public void clear() {
        this.implementor.clear();
    }

}
