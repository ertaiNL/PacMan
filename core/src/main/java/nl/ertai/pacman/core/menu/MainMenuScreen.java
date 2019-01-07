/*
 * This file is part of The Ertai Pacman Project. It is subject to the license terms in the LICENSE file found in the
 * top-level directory of this distribution. No part of Ertai Pacman Project, including this file, may be copied,
 * modified, propagated, or distributed except according to the terms contained in the LICENSE file.
 */
package nl.ertai.pacman.core.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import nl.ertai.pacman.core.Pacman;
import nl.ertai.pacman.core.PacmanBaseScreen;
import nl.ertai.pacman.core.game.GameScreen;

public class MainMenuScreen extends PacmanBaseScreen {

    private Texture img;

    public MainMenuScreen(final Pacman game) {
        super(game);
    }

    @Override
    public void show() {
        this.img = new Texture("gfx/bgIntro.png");
    }

    @Override
    public void render(float v) {
        super.render(v);

        game.getBatch().begin();
        game.getBatch().draw(img, 0, 0);
        game.getFont().draw(game.getBatch(), "Welcome to Pacman!!! ", 1, 50);
        game.getFont().draw(game.getBatch(), "Tap anywhere to begin!", 1, 40);
        game.getBatch().end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }
    }

    @Override
    public void dispose () {
        img.dispose();
    }

}
