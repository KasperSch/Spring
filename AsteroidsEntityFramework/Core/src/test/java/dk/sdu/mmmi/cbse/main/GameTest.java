package dk.sdu.mmmi.cbse.main;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.playersystem.PlayerPlugin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GameTest {

    @Test
    void initiatePlayer() {
        PlayerPlugin pp = new PlayerPlugin();

        GameData gd = new GameData();
        World w = new World();

        //Testing if entity list is empty
        assertTrue(w.getEntities().isEmpty());
        //Testing if a player is added to the entity list - list contains a player etc.
        //dk.sdu.mmmi.cbse.playersystem.Player@5d20e46 if added.
        pp.start(gd,w);
        assertNotNull(w.getEntities());
    }
}