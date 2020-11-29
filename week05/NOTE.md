学习笔记
行走的机器人
https://leetcode-cn.com/problems/walking-robot-simulation/submissions/
误区点：1、结果求所有路径的最大x^x +y^y的结果而不是终点的x^x +y^y
      2、使用HashSet来存储是否包含地点，但是规则使用错了。"" + x + y -> x + "," + y
         因为有一种可能x 1  y 20 和 x 12 y 0的结果相同
         
树的遍历：
N叉数
前序
递归实现：
result.add(root.val);
for (int i = 0; i < root.children.size(); i++) {
    preorder(root.children.get(i));
}
辅助栈的实现：
while(!stack.empty()) {
    root = stack.pop();
    result.add(root.val);
    for (int i = root.children.size() - 1; i >= 0; i--) {
       stack.push(root.children.get(i));
    }
}

后序
递归实现
addChildValue(root);
result.add(root.val);
public void addChildValue(Node root){
   for (int i = 0 ; i < root.children.size(); i++) {
        addChildValue(root.children.get(i));
        result.add(root.children.get(i).val);
   }
}
