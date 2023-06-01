package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
/**
 * <p>
 * IEntityProcessingService defines a method that a class that implements this interface has to include
 * </p>
 * <p>
 * This interface is implemented by the class, PlayerControlSystem regarding movement and position in the game.
 * </p>
 */
public interface IEntityProcessingService {
    /**
     * <p>
     *     The method, process, has a return type of void and takes two parameters of the type, GameData and World,
     *     which is located "data" folder in the "common" folder.
     * </p>
     * <p>
     *     Preconditions for the method is that GameData and World is not null.
     *     Other preconditions will be tbd in the implementation of the method and not in the interface.
     * </p>
     * @param gameData
     * @param world
     * @author Kasper Schäffer
     */
    void process(GameData gameData, World world);
}
