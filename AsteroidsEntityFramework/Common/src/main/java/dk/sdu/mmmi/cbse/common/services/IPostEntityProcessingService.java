package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * <p>
 * IGamePluginService defines methods that a class that implements this interface has to include
 * </p>
 * <p>
 * IGamePluginService is implemented in the class, PlayerPlugin.
 * </p>
 */
public interface IPostEntityProcessingService  {
        void process(GameData gameData, World world);
}
