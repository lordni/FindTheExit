import java.util.ArrayList;
import java.util.List;

/**
 * Created by lordni on 3/31/16.
 */
public class Player {

    private Cube positionCube;
    private MazeHolder mh = new MazeHolder();
    private List<Cube> history = new ArrayList<>();

    public Player(){
        positionCube = getCubeFromMaze();
        // Cube 0
        history.add(new Cube(1, 1, 1, 1));
    }

    public Cube getCubeFromMaze(){
        return mh.cube1;
    }

    public void moveToNextCube(){
        for (boolean b: mh.cube1.getWalls())
        if (!b && !(history.get(history.size()-1).getName().equalsIgnoreCase(positionCube.getName()))){
            history.add(positionCube);
            positionCube = mh.cube2;
        } else {
            positionCube = history.get(1);
        }
    }
}
