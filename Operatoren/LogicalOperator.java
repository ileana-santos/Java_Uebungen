public class LogicalOperator {
    public static void main(String[] args) {
        
        //&& und &
        int age = 50;
        if (age > 20 && age < 90 ) {
            System.out.println("OK100");
        }

        if (age > 20 & age < 90 ) {
            System.out.println("OK200");
        }

        // Unterscheid zwischen && un d &
        int a = 4;
        int b = 9;
        if(a < 1 & ++b < 50){
            System.out.println("OK300");
        }
        System.out.println("a= " + a +" b= " + b);

        a = 4;
        b = 9;
        if(a < 1 && ++b < 50){
            System.out.println("OK300");
        }
        System.out.println("a= " + a +" b= " + b);

        boolean x1 = true;
        boolean y1 = false;
        short z = 46;
        if ((z++ == 46) && (y1 == true)){ // z=47; False
            z++;
        }
        if((x1 == false) || (++z == 49)){ //z= 48; false
            z++;
        }
        System.out.println("z= " + z); // z=48
    }
}