/*
 * This file is part of The Ertai Pacman Project. It is subject to the license terms in the LICENSE file found in the
 * top-level directory of this distribution. No part of Ertai Pacman Project, including this file, may be copied,
 * modified, propagated, or distributed except according to the terms contained in the LICENSE file.
 */
package nl.ertai.pacman.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Pacman extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture img;

    @Override
    public void create () {
        batch = new SpriteBatch();
        img = new Texture("gfx/bgIntro.png");
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        img.dispose();
    }
}
