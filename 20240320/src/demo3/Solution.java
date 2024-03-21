package demo3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevList = lists.get(numRows-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 0; j < prevList.size()-1; j++) {
                row.add(prevList.get(i) + prevList.get(i+1));
            }

            row.add(1);
            lists.add(row);
        }
        return lists;
    }
}
