public class Main {
    public static void main(String[] args){
        Cock cock = new Cock();
        Hen hen = new Hen();
        Chick chick = new Chick();
        int x, y, z;

        System.out.println("You can 100 of them, each have or more, by the following:");
        for(x = 100/ cock.cost(5); x >= 0; x--)
        {
            for(y = 100/ hen.cost(3); y >= 0; y--)
            {
                //z = 100 - x - y;
                //if((x*5) + (y*3) + z/3 == 100 && x+y+z == 100) System.out.println("You can buy " + x + " Cocks, " + y + " Hens, and " + z + " Chickens with 100 yuan");
                for(z = 100 * chick.cost(3); z >= 0; z=z-3 )
                {
                    //z = 100 - x - y;
                    if(x+y+z == 100 && x > 0 && y > 0 && z > 0)
                        System.out.println("You can buy " + x + " Cocks, " + y + " Hens, and " + z + " Chickens with 100 yuan");
                }
            }
        }

    }
}
