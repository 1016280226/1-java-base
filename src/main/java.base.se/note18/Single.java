package note18;

/**
 * @Author: Calvin
 * @Date: 2019/4/3 16:41
 */
public class Single {

   private static int[] arrays = {1,90,99,7,8};

    public static void main(String[] args) {
        for(int i = 0 ; i < arrays.length; i ++ ){
            System.out.print(arrays[i]);
            for(int j=0; j<arrays.length; j++){
                if(arrays[i]<arrays[j]){
                    int temp = arrays[j];
                    arrays[j]= arrays[i];
                    arrays[i]= temp;

                }
            }
        }
        System.out.println();

        for(int i=0; i< arrays.length;i ++ ){
            System.out.println(arrays[i]);
        }


    }
}
