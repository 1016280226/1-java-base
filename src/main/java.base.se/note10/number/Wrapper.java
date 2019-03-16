package note10.number;

/**
 * 包装器
 */
public class Wrapper {

    public Integer binningInt(int i){
        Integer integer = new Integer(i);
        System.out.println(
                new StringBuilder("装箱操作:")
                        .append("使用new Integer(传入int参数),得出数据类型为Integer数为")
                        .append(integer)
                        .toString()
        );
        return integer;
    }


   public int bavenning(Integer i){
       int i1 = i.intValue();
       System.out.println(
               new StringBuilder("拆箱操作:")
               .append("使用intValue(),使得拆箱操作")
               .append(i)
               .toString()
       );
       return i;
   }

   public void autoBinningAndBavenningOfJava5After(){
        int i = 5;
        Integer i1 = i; // 自动装箱
        i= i1;  // 自动拆箱
   }
}
