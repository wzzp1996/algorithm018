/**
 * @Author: zhangzhipeng
 * @Date: 2020/11/8 20:19
 * @Description: 从前序与中序遍历序列构造二叉树
 * @Link: https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @Thinking: 根据前序、中序结果重组二叉树；前序 根->左->右、 中序 左->根->右
 *            从前序取根元素值，判断在中序的位置，进而得到根节点左右元素的个数
 *            将前中序左节点的所有元素，继续递找根节点，直到根节点左右元素为空。根节点右边元素也进行同样处理
 * @TimeSpaceComplexityExplain: T: (n/2)*log(n)   S:O(n - 1 + n - 2 + n - 3 + ...+ n - n = 1 + ... + n - 1= (n-1)*(n-2)/2)
 */
class Problem02 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null ||preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            return root;
        }
        int rootValue =  preorder[0];
        int split = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (rootValue == inorder[i]) {
                split = i;
                break;
            }
        }
        int[] leftPreArray = new int[split];
        System.arraycopy(preorder, 1, leftPreArray, 0, split);
        int[] leftInArray = new int[split];
        System.arraycopy(inorder, 0, leftInArray, 0, split);
        int[] rightPreArray = null;
        int[] rightInArray = null;
        if (split != inorder.length - 1) {
            rightPreArray = new int[inorder.length - split - 1];
            System.arraycopy(preorder, split + 1, rightPreArray, 0, preorder.length - split - 1);
            rightInArray = new int[inorder.length - split -1];
            System.arraycopy(inorder, split + 1, rightInArray, 0, inorder.length - split - 1);
        }
        root.left = buildTree(leftPreArray, leftInArray);
        root.right = buildTree(rightPreArray, rightInArray);
        return root;
    }
}