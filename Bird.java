public class Bird {

    public int x;
    public int y;
    public int width;
    public int height;
    public int gravity;

    public Bird () {
        x = 100;
        y = 300;
        width = 40;
        height = 40;
    }

    //method that causes bird to fall
    public void gravity{
        gravity = -2;

        while (y >= 0){
            y += gravity;
        }
    }
}