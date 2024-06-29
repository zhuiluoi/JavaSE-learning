import java.util.ArrayList;
import java.util.List;


public class Test {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        ret.add(list);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);

            for (int j = 1; j < i; j++) {
                List<Integer> preRow = ret.get(i-1);
                int x1 = preRow.get(j);
                int x2 = preRow.get(j-1);

                curRow.add(x1 + x2);
            }

            curRow.add(1);
            ret.add(curRow);
        }

        return ret;
    }
}
