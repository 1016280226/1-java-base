package note8.loop;

import java.util.Arrays;
import java.util.List;

/**
 * @author Calvin
 * @titile: Continue 关键字
 * @date 2019/2/27
 * @since 1.0
 * @mind continue 适用于任何循环控制结构中。
 * @effect 作用是让程序立刻跳转到下一次循环的迭代。
 * @mind1 在 for 循环中，continue 语句使程序立即跳转到更新语句。
 * @mind2 在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
 */
public class Continue {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (Integer i : integers){
          if(i == 3){
              update(i);
              continue;
          }else{
              System.out.println(i);
          }
        }
    }


    public static void update(Integer i){
        System.out.println("continue" + i);
    }

}
