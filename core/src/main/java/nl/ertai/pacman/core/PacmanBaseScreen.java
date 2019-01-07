package nl.ertai.pacman.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public abstract class PacmanBaseScreen implements Screen {

    protected final Pacman game;

    public PacmanBaseScreen(final Pacman game) {
        this.game = game;
    }

    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(0, 0, 0.2F, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

}
