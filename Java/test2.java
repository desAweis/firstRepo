public class test2 {
    public static void main(String[] args) {
        int t=0;
        int count = 0;
        System.out.println("101到200的素数有：");
        for(int i = 101; i <= 200; i++)
        {
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                t = i%j;
                if(t == 0)
                {
                    break;
                }
            }
            if(t!=0)
            {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("个数有："+count);    
    }

}
