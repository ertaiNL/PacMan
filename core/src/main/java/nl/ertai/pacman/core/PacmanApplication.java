/*
 * This file is part of The Ertai Pacman Project. It is subject to the license terms in the LICENSE file found in the
 * top-level directory of this distribution. No part of Ertai Pacman Project, including this file, may be copied,
 * modified, propagated, or distributed except according to the terms contained in the LICENSE file.
 */
package nl.ertai.pacman.core;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class PacmanApplication {

    private static final int SCREEN_WIDTH = 1280;
    private static final int SCREEN_HEIGHT = 720;

    public static void main (String[] arg) {
        new LwjglApplication(new Pacman(), getConfiguration());
    }

    private static LwjglApplicationConfiguration getConfiguration() {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.height = SCREEN_HEIGHT;
        config.width = SCREEN_WIDTH;
        return config;
    }

}
