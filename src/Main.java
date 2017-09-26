import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter length of rectangle (positive integer):");
        int lengthRec=scnr.nextInt();
        System.out.println("Enter width of rectangle (positive integer):");
        int widthRec=scnr.nextInt();
        System.out.println("Now enter the radius of the circle (positive integer):");
        int radiusCircle=scnr.nextInt();
        System.out.println("Now enter the base of the triangle (positive integer):");
        int base=scnr.nextInt();
        System.out.println("Enter the height of the triangle (positive integer):");
        int heightTri=scnr.nextInt();
        System.out.println("Enter one other side of the triangle (positive integer):");
        int side1=scnr.nextInt();
        System.out.println("Enter another side of the triangle (positive integer):");
        int side2=scnr.nextInt();
        int perimeterRectangle= 2*(lengthRec+widthRec);
        int areaRectangle=lengthRec*widthRec;
        double circumference= 2*Math.PI*radiusCircle;
        double areaCircle= Math.PI*radiusCircle*radiusCircle;
        int perimeterTriangle=base+side1+side2;
        double areaTriangle= heightTri*base*.5;
        System.out.println("Area of rectangle: "+ areaRectangle);
        System.out.println("Area of circle: "+ (((int)((areaCircle+.005)*100))/100.0));
        System.out.println("Area of triangle: "+ areaTriangle);
        System.out.println("Perimeter of rectangle: "+ perimeterRectangle);
        System.out.println("Circumference of circle: "+ (((int)((circumference+.005)*100))/100.0));
        System.out.println("Perimeter of triangle: "+ perimeterTriangle);

        System.out.println("Enter radius of sphere (positive integer):");
        int radiusSphere=scnr.nextInt();
        System.out.println("Enter diameter of rectangluar prism (positive integer):");
        int diameterPrism=scnr.nextInt();
        System.out.println("Enter height of rectangluar prism (positive integer):");
        int heightPrism=scnr.nextInt();
        System.out.println("Now enter width of rectangluar prism (positive integer):");
        int widthPrism=scnr.nextInt();
        System.out.println("Now enter the height of cylinder (positive integer):");
        int heightCylinder=scnr.nextInt();
        System.out.println("Enter radius of cylinder (positive integer):");
        int radiusCylinder=scnr.nextInt();
        double surfaceAreaSphere= 4 * Math.PI * radiusSphere * radiusSphere;
        double volumeSphere= 4.0 * Math.PI * Math.pow((double)radiusSphere, 3.0) / 3.0;
        double surfaceAreaPrism=2.0*((heightPrism*diameterPrism)+(heightPrism*widthPrism)+(widthPrism*diameterPrism));
        double volumePrism= heightPrism*widthPrism*diameterPrism;
        double surfaceAreaCylinder= 2*Math.PI*radiusCylinder*heightCylinder+2*Math.PI*radiusCylinder*radiusCylinder;
        double volumeCylinder= Math.PI*radiusCylinder*radiusCylinder*heightCylinder;
        System.out.println("The surface area of the sphere is: "+ (((int)(100*(surfaceAreaSphere+.005)))/100.0));
        System.out.println("The volume of the sphere is: "+ (((int)(100*(volumeSphere+.005)))/100.0));
        System.out.println("The surface area of the rectangluar prism is: "+ surfaceAreaPrism);
        System.out.println("The volume of the rectangular prism is: "+ volumePrism);
        System.out.println("The surface area of the cylinder is: "+ (((int)(100*(surfaceAreaCylinder+.005)))/100.0));
        System.out.println("The volume of the cylinder is: "+ (((int)(100*(volumeCylinder+.005)))/100.0));

        return;
    }
}
