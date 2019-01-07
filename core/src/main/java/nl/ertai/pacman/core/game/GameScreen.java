package nl.ertai.pacman.core.game;

import com.badlogic.gdx.graphics.Texture;
import nl.ertai.pacman.core.Pacman;
import nl.ertai.pacman.core.PacmanBaseScreen;

public class GameScreen extends PacmanBaseScreen {

    private Texture img;

    public GameScreen(final Pacman game) {
        super(game);
    }

    @Override
    public void show() {
        this.img = new Texture("gfx/fields/default.png");
    }

    @Override
    public void render(float v) {
        game.getBatch().begin();
        game.getBatch().draw(img, 0, 0);
        game.getBatch().end();

    }

    @Override
    public void dispose() {

    }
}
