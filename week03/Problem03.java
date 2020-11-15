/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/8 20:19
 * @Description: 组合
 * @Link: https://leetcode-cn.com/problems/combinations/
 * @Thinking: 回溯，递归状态：1->(2,3,4) 2->(3,4) 3->4
 * @TimeSpaceComplexityExplain: T:O((n -1)!) S: O(n)
 */
class Problem03 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        combine(n, 1, k, new LinkedList<Integer>());
        return result;
    }
    public void combine(int n, int start, int k, LinkedList<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            // do something
            list.addLast(i);
            combine(n, ++start, k, list);
            // clear
            list.removeLast();        
        }
    }
}