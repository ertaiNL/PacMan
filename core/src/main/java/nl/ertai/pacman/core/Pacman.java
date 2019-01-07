/*
 * This file is part of The Ertai Pacman Project. It is subject to the license terms in the LICENSE file found in the
 * top-level directory of this distribution. No part of Ertai Pacman Project, including this file, may be copied,
 * modified, propagated, or distributed except according to the terms contained in the LICENSE file.
 */
package nl.ertai.pacman.core;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import nl.ertai.pacman.core.menu.MainMenuScreen;

public class Pacman extends Game {
    private SpriteBatch batch;
    private BitmapFont font;

    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        setScreen(new MainMenuScreen(this));
    }

    public void render() {
        super.render();
    }

    public void dispose() {
        batch.dispose();
    }

    public SpriteBatch getBatch() {
        return batch;
    }

    public BitmapFont getFont() {
        return font;
    }
}
