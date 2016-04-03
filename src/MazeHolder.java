/**
 * Created by lordni on 4/3/16.
 */
public class MazeHolder {

    Cube[][] maze = new Cube[2][2];

    // int left, int top, int right, int bottom
    Cube cube1 = new Cube(1,0,1,0);
    Cube cube2 = new Cube(1,1,0,0);
    Cube cube3 = new Cube(0,1,1,0);
    Cube cube4 = new Cube(1,0,0,1);

    public MazeHolder(){
        maze[0][0] = cube1;
        maze[0][1] = cube2;
        maze[1][1] = cube3;
        maze[1][0] = cube4;
    }

    public Cube[][] getMaze() {
        return maze;
    }
}
