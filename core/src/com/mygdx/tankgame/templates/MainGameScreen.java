package com.mygdx.tankgame.templates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.tankgame.TankGame;

import static com.mygdx.tankgame.TankGame.SCREEN_HEIGHT;
import static com.mygdx.tankgame.TankGame.SCREEN_WIDTH;

public class MainGameScreen implements Screen {
    private static final int BUTTON_WIDTH = 350;
    private static final int BUTTON_HEIGHT = 100;

    private static final int LEFT_WIDTH = SCREEN_WIDTH/2;
    private static final int RIGHT_WIDTH = SCREEN_WIDTH/2;
    private static final int BUTTON_RIGHT_LOCATION =  LEFT_WIDTH + (RIGHT_WIDTH/2 - BUTTON_WIDTH/2);

    TankGame game;
    Texture tank_f;
    Texture tank_t;
    Texture tank_b;
    Texture missile1;
    Texture missile2;
    Texture missile3;
    TextureRegion rMissile1;
    TextureRegion rMissile2;
    TextureRegion rMissile3;
    Texture bg;
    Texture terrain;
    Texture tank2_t;
    Texture tank2_b;
    Texture tank2_f;
    Texture kPlane;
    Texture aShip;
    Texture terrain_texture;
    Texture bomb;
    TextureRegion rbomb;
    TextureRegion rtank_f;
    TextureRegion rtank_b;
    TextureRegion rtank_t;

    TextureRegion rtank2_f;
    TextureRegion rtank2_b;
    TextureRegion rtank2_t;
    TextureRegion rkPlane;
    Texture ePole;
    Texture ePole2;
    Texture Shield;
    Texture hpBar;

    TextureRegion rtGrass;
    Texture tree1;
    Texture tree2;
    Texture tree3;

    public MainGameScreen(TankGame game){
        this.game = game;

        tank_b = new Texture("tank1back.png");
        tank_f = new Texture("tank1front.png");
        tank_t = new Texture("tank1turret2.png");
        tank2_t = new Texture("Tank2Turret.png");
        tank2_f = new Texture("Tank2Front.png");
        tank2_b = new Texture("Tank2Back.png");
        missile1 = new Texture("Weapon1.png");
        missile2 = new Texture("Weapon2.png");
        missile3 = new Texture("Weapon3.png");
        rMissile1 = new TextureRegion(missile1);
        rMissile2 = new TextureRegion(missile2);
        rMissile3 = new TextureRegion(missile3);

        hpBar = new Texture("HPBar.png");
        Shield = new Texture("Shield.png");
        bg = new Texture("bg3.png");
        terrain = new Texture("MaskedTerrain.png");
        kPlane = new Texture("Plane.png");
        aShip = new Texture("AirShip.png");
        terrain_texture = new Texture("Terrain_grass.png");
        bomb = new Texture("Bomb.png");
        rbomb = new TextureRegion(bomb);
        rtank_f = new TextureRegion(tank_f);
        rtank_b = new TextureRegion(tank_b);
        rtank_t = new TextureRegion(tank_t);
        rtank2_b = new TextureRegion(tank2_b);
        rtank2_f = new TextureRegion(tank2_f);
        rtank2_t = new TextureRegion(tank2_t);
        rkPlane = new TextureRegion(kPlane);
        ePole = new Texture("electricpole.png");
        ePole2 = new Texture("electricpole2.png");
        rtGrass = new TextureRegion(terrain_texture);
        tree1 = new Texture("tree1.png");
        tree2 = new Texture("Tree2.png");
        tree3 = new Texture("Tree3.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.44f,0.31f,0.96f, 0.5f);
        game.batch.begin();
        game.batch.draw(bg, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
        game.batch.draw(ePole, 80, 80, 398*0.2f, 798*0.2f);
        game.batch.draw(ePole2, 1200, 80, 235*0.23f, 598*0.23f);
        game.batch.draw(tree1, 400, 170, 340*0.2f, 296*0.2f);
        game.batch.draw(tree2, 700, 185, 249*0.2f, 309*0.2f);
        game.batch.draw(tree3, 850, 165, 180*0.2f, 247*0.2f);
        game.batch.draw(tree2, 100, 120, 249*0.2f, 309*0.2f);
        game.batch.draw(tree1, 20, 107, 340*0.2f, 296*0.2f);
        game.batch.draw(tree1, 1200, 106, 340*0.2f, 296*0.2f);
        game.batch.draw(terrain, -200,-295, SCREEN_WIDTH+400, 500);
        for(int i = 0; i < SCREEN_WIDTH/2; i += 6) {
            game.batch.draw(rtGrass, i, i*0.167f+94, 0, 0, 64*0.1f, 64*0.1f, 1, 1, 9f);
        }
        for(int i = SCREEN_WIDTH; i > SCREEN_WIDTH/2; i -= 6) {
            game.batch.draw(rtGrass, i-5, (SCREEN_WIDTH-i)*0.167f+95, 0, 0, 64*0.1f, 64*0.1f, 1, 1, -9f);
        }
        game.batch.draw(rtank_b, 160, 124, 0, 0, 804*0.10f, 520*0.10f, 1, 1, 9f);
        game.batch.draw(rtank_t, 162, 153, 0, 0, 1016*0.10f, 316*0.10f, 1, 1, 30f);
        game.batch.draw(rtank_f, 150, 123, 0, 0, 1008*0.10f, 516*0.10f, 1, 1, 9f);
        game.batch.draw(rtank2_b, 1104, 128, 0, 0, -844*0.10f, 662*0.10f, 1, 1, -9f);
        game.batch.draw(rtank2_t, 1085, 157, 0, 0, -858*0.10f, 166*0.10f, 1, 1, -30f);
        game.batch.draw(rtank2_f, 1117, 127, 0, 0, -848*0.10f, 618*0.10f, 1, 1, -9f);

        game.batch.draw(rkPlane, 500, 400, 0, 0, -1132*0.1f, 346*0.1f, 1, 1, 35f);
        game.batch.draw(rkPlane, 550, 470, 0, 0, -1132*0.1f, 346*0.1f, 1, 1, 35f);
        game.batch.draw(rkPlane, 620, 450, 0, 0, -1132*0.1f, 346*0.1f, 1, 1, 35f);
        game.batch.draw(aShip, 1090, 500, -1890*0.08f, 897*0.08f);
        game.batch.draw(rMissile1, 840 , 345, 0,0,-331*0.2f,156*0.2f,1,1,-20f);
        game.batch.draw(rMissile1, 850 , 320, 0,0,-331*0.2f,156*0.2f,1,1,-25f);
        game.batch.draw(rMissile1, 870 , 270, 0,0,-331*0.2f,156*0.2f,1,1,-28f);
        game.batch.draw(rMissile1, 860 , 295, 0,0,-331*0.2f,156*0.2f,1,1,-28f);
        game.batch.draw(rMissile2, (SCREEN_WIDTH -390*0.2f)/2, (SCREEN_HEIGHT - 237*0.2f)/2 - 50,390*0.2f,237*0.2f);
        game.batch.draw(rMissile3, 300 , 240, 0,0,317*0.25f,152*0.25f,1,1,28f);

        game.batch.draw(hpBar, 70, SCREEN_HEIGHT - 100, 3831*0.07f, 1072*0.07f);
        game.batch.draw(Shield,45,SCREEN_HEIGHT - 135,153*0.9f,157*0.9f);

        game.batch.draw(hpBar, 70 + 850, SCREEN_HEIGHT - 100, 3831*0.07f, 1072*0.07f);
        game.batch.draw(Shield,45 + 850,SCREEN_HEIGHT - 135,153*0.9f,157*0.9f);


        game.batch.draw(rbomb,1000,460,0,0,744*0.06f,195*0.06f,1,1,-2f);
        game.batch.draw(rbomb,1000,420,0,0,744*0.06f,195*0.06f,1,1,-8f);
        game.batch.draw(rbomb,1000,380,0,0,744*0.06f,195*0.06f,1,1,-13f);

        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {}
}