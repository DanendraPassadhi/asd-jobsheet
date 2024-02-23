public class Dragon {
    boolean isError = false;
    int x, y, width = 10, height = 10;

    void moveLeft() {
        x -= 1;
        detectCollision(x, y);
    }

    void moveRight() {
        x += 1;
        detectCollision(x, y);
    }
    
    void moveUp() {
        y -= 1;
        detectCollision(x, y);
    }
    
    void moveDown() {
        y += 1;
        detectCollision(x, y);
    }

    void printPosition() {
        System.out.printf("x = %d, y = %d\n\n", x, y);
    }

    void detectCollision(int x, int y) {
        if (x < 0 || x > width) {
            isError = true;
            System.out.println("\nGame Over...\n");
        } else if(y < 0 || y > height) {
            isError = true;
            System.out.println("\nGame Over...\n");
        }
    }
}
