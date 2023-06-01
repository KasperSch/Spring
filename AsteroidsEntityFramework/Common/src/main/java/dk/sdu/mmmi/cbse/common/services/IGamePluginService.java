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
public interface IGamePluginService {

    /**
     * <p>
     *     The 2 methods, start and stop both return void and takes 2 paramters of the type, GameData and World
     * </p>
     * <p>
     *     start method is used to create the player, while stop remove the player or the entity that class has created
     *     that implements the method.
     * </p>
     * <p>
     *     Preconditions for the method is that GameData and World is not null.
     *     Other preconditions will be tbd in the implementation of the method and not in the interface.
     * </p>
     * @param gameData
     * @param world
     * @author Kasper Schäffer
     */
    void start(GameData gameData, World world);

    void stop(GameData gameData, World world);
}
