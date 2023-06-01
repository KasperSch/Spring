package dk.sdu.mmmi.cbse.asteroidsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import static dk.sdu.mmmi.cbse.common.data.GameKeys.LEFT;
import static dk.sdu.mmmi.cbse.common.data.GameKeys.RIGHT;
import static dk.sdu.mmmi.cbse.common.data.GameKeys.UP;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityparts.MovingPart;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import org.springframework.stereotype.Component;

/**
 *
 * @author jcs
 */

public class AsteroidControlSystem implements IEntityProcessingService {

    @Override
    public void process(GameData gameData, World world) {

        for (Entity asteroid : world.getEntities(Asteroid.class)) {
            PositionPart positionPart = asteroid.getPart(PositionPart.class);
            MovingPart movingPart = asteroid.getPart(MovingPart.class);

            float randomValue = (float) Math.random();

            if(randomValue < 0.2){
                movingPart.setLeft(true);
                movingPart.setRight(false);
                movingPart.setUp(false);
            } else if(randomValue >= 0.2 && randomValue < 0.4){
                movingPart.setLeft(false);
                movingPart.setRight(true);
                movingPart.setUp(false);
            } else {
                movingPart.setLeft(false);
                movingPart.setRight(false);
                movingPart.setUp(true);
            }

            movingPart.process(gameData, asteroid);
            positionPart.process(gameData, asteroid);

            updateShape(asteroid);
        }
    }

    private void updateShape(Entity entity) {
        float[] shapex = entity.getShapeX();
        float[] shapey = entity.getShapeY();
        PositionPart positionPart = entity.getPart(PositionPart.class);
        float x = positionPart.getX();
        float y = positionPart.getY();
        float radians = positionPart.getRadians();

        shapex[0] = (float) (x - 14);
        shapey[0] = (float) (y - 14);

        shapex[1] = (float) (x + 14);
        shapey[1] = (float) (y - 14);

        shapex[2] = (float) (x + 14);
        shapey[2] = (float) (y + 14);

        shapex[3] = (float) (x - 14);
        shapey[3] = (float) (y + 14);


        entity.setShapeX(shapex);
        entity.setShapeY(shapey);
    }

}
