//Ally Hassett -- CS 1410

import java.lang.Math;


public class Inside {
    public static void main(String[] args) {
        //the values we will test
        double[] ptX = {1, 2, 3, 4};
        double[] ptY = {1, 2, 3, 4};
        double[] circleX = {0, 5};
        double[] circleY = {0, 5};
        double[] circleRadius = {3, 3};
        double[] rectLeft = {-2.5, -2.5};
        double[] rectTop = {2.5, 5.0};
        double[] rectWidth = {6.0, 5.0};
        double[] rectHeight = {5.0, 2.5};

        //prints everything in order
        //rotates through point coordinates for coordinates of circle then rotates through them again different circle coordinates
        System.out.println("--- Report of Points and Circles ---\n");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++) {
                reportPoint(ptX[j], ptY[j]);
                if (isPointInsideCircle(ptX[j], ptY[j], circleX[i], circleY[i], circleRadius[i])) {
                    System.out.print("inside");
                } else {
                    System.out.print("outside");
                }
                reportCircle(circleX[i], circleY[i], circleRadius[i]);
                System.out.println();
            }
        }
        //prints everything in order
        //rotates through point coordinates for coordinates of rectangle then rotates through them again different rectangle coordinates
        System.out.println("\n--- Report of Points and Rectangles ---\n");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                reportPoint(ptX[j], ptY[j]);
                if(isPointInsideRectangle(ptX[j], ptY[j], rectLeft[i], rectTop[i], rectWidth[i], rectHeight[i])){
                    System.out.print("inside");
                } else{
                    System.out.print("outside");
                }
                reportRectangle(rectLeft[i], rectTop[i], rectWidth[i], rectHeight[i]);
                System.out.println();
            }
        }
    }

    //format to write point coordinates
    static void reportPoint(double x, double y){
        System.out.print("Point(" + x + ", " + y +") is ");
    }

    //return whether the point is inside circle
    //uses distance formula
    static boolean isPointInsideCircle(double ptX, double ptY, double circleX, double circleY, double circleRadius){
        return Math.sqrt(Math.pow(circleX - ptX, 2) + Math.pow(circleY - ptY, 2)) <= circleRadius;
    }

    //return whether the point is inside rectangle
    //uses rectangle bounds compared to point coordintes
    static boolean isPointInsideRectangle(double ptX, double ptY, double rLeft, double rTop, double rWidth, double rHeight){
        return ((rLeft <= ptX) && (ptX <= (rLeft + rWidth)) && (rTop >= ptY) && (ptY >= (rTop - rHeight)));
    }

    //format to write circle coordinates and radius size
    static void reportCircle(double x, double y, double r){
        System.out.print(" Circle(" + x + ", " + y + ") Radius: " + r);
    }

    //format to write rectangle side locations
    static void reportRectangle(double left, double top, double width, double height) {
        System.out.print(" Rectangle(" + left + ", " + top + ", " + (left + width) + ", " + (top - height) + ")");
    }
}
