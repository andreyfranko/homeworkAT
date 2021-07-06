public class HW2 {

    public static void main(String[] args){
//    starsVariant1 (10);
//    starsVariant2 (0);
    starsVariant3 (0);
    }

    public static void starsVariant1 (int count)
    {
        for(int i=0; i<count; ++i)
        {
            for(int j=0;j<i;++j)
                System.out.print("*");
            System.out.println();
        }
    }


    public static void starsVariant2 (int count)
    {
        for(int i=10; i>count; --i)
        {
            for(int j=0;j<i;++j)
                System.out.print("*");
            System.out.println();
        }
    }


    public static void starsVariant3 (int count)
    {
        for(int i=10; i>count; ++i)
        {
            for(int j=10;j<i; --j)
                System.out.print("*");
            System.out.println();
        }
    }

}


