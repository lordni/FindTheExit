/**
 * Created by lordni on 4/3/16.
 */
public class Cube {

    boolean[] walls = new boolean[4];
    private String cubeName;
    int x = 0, y = 0;

    public Cube(int left, int top, int right, int bottom, int x, int y){
        walls[0] = isWall(left);
        walls[1] = isWall(top);
        walls[2] = isWall(right);
        walls[3] = isWall(bottom);
        cubeName = makeEniqueName();
        CubePositions.moveOneRight();
    }

    public Cube(int left, int top, int right, int bottom){
        walls[0] = isWall(left);
        walls[1] = isWall(top);
        walls[2] = isWall(right);
        walls[3] = isWall(bottom);
        cubeName = makeEniqueName();
    }

    // Remember to make it private
    public String makeEniqueName(){
        return "Cube" + CubeNumbers.getCubeNumber();
    }

    public String getName(){ return cubeName; }

    public boolean[] getWalls() {
        return walls;
    }

    // Remember to make it private
    public boolean isWall(int a){
        return a == 1;
    }
}
