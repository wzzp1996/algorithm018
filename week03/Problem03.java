/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/8 20:19
 * @Description: 组合
 * @Link: https://leetcode-cn.com/problems/combinations/
 * @Thinking: 回溯
 * @TimeSpaceComplexityExplain:
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
            list.addLast(i);
            combine(n, ++start, k, list);
            list.removeLast();        
        }
    }
}