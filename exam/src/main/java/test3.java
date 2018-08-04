import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhao Guowei on 2018/8/4.
 */
public class test3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.print("随机生成50个小于100的数,分别为:");
        for(int i = 0;i<50;i++){
            list.add(i,(int)(Math.random()*100));
        }
        for (int i = 0 ; i < 50;i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        Map<Integer, List> map = new HashMap<Integer, List>();
        for(int i = 0;i<50;i++){
            if(map.containsKey(Integer.parseInt(list.get(i).toString())/10)){
                map.get(Integer.parseInt(list.get(i).toString())/10).add(list.get(i).toString());
            }else{
                List temp = new ArrayList();
                temp.add(list.get(i).toString());
                map.put(Integer.parseInt(list.get(i).toString())/10,temp);
            }
        }
        System.out.println("Map中的数据为:");
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
        for (List list1 : map.values()) {
            sortList(list1);
        }
        System.out.println("排序后的Map为:");
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
    public static void sortList(List list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                int a = Integer.parseInt(list.get(j).toString());
                int b = Integer.parseInt(list.get(j+1).toString());
                if(a>b){
                    list.set(j, b);
                    list.set(j+1, a);
                }
            }
        }
    }
}
