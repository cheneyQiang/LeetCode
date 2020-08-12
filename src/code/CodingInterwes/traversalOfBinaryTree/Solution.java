package code.CodingInterwes.traversalOfBinaryTree;

public class Solution {
    private static boolean flag=false;  //数据正确与错误的标志,true代表数据错误
    //定义一个内部节点类
    public static class Node<E>{
        public Node left;
        public Node right;
        public E e;
        public Node(E e) {
            this.e = e;
        }
    }
    public static Node<Integer> reBuild_BinaryTree(int[] preOrder, int preStart, int preEnd,
                                                   int[] midOrder, int midStart, int midEnd){
        //增加鲁棒性
        if(preOrder==null||midOrder==null)
            throw new RuntimeException("Null point Exception");
        if(preOrder.length!=midOrder.length||preOrder.length==0||midOrder.length==0)
            throw new RuntimeException("date not correct");
        //递归结束标志
        if(midStart > midEnd && preStart > preEnd){
            return null;
        }
        //等于说明遍历到了最后一个节点
        if(midStart == midEnd && preStart == preEnd){
            //此时midStart和preStart理应是同一个数字,但是如果不是呢?那就说明数据不正确
            if(preOrder[preStart]!=midOrder[midStart]){
                System.out.println("该数据不是一个正确的二叉树的先序遍历和中序遍历");
                flag=true; //
                return null;
            }
            return new Node(midOrder[midEnd]);
        }
        int rootData = preOrder[preStart];
        Node head = new Node(rootData);
        //根据头结点的数据，找到中序中根节点的位置
//        int rootIndex = findIndexMidArray(midOrder,rootData,midStart,midEnd);
        int rootIndex ;
        for ( rootIndex = midStart; rootIndex < midEnd; rootIndex++) {
            if (midOrder[rootIndex] == rootData) {
                break;
            }
        }
        //如果输入的数据不正确,应该输出提示
        if(rootIndex==midOrder.length){
            System.out.println("该数据不是一个正确的二叉树的先序遍历和中序遍历");
            flag=true; //
            return null;
        }
        //找出先序遍历中左子树的结束位置
        int offSet = preStart + (rootIndex - midStart);
        //构建左子树
        head.left =  reBuild_BinaryTree(preOrder,preStart+1, offSet,
                                        midOrder,midStart, rootIndex - 1);
        //构建右子树
        head.right = reBuild_BinaryTree(preOrder,offSet + 1,preEnd,
                                        midOrder,rootIndex + 1,midEnd);
        return head;
    }

//    private static int findIndexMidArray(int[] midOrder, int rootData, int midStart, int midEnd){
//        for (int i = midStart; i < midEnd; i++) {
//            if(midOrder[i] == rootData){
//                return i;
//            }
//        }
//        System.out.println("test");
//        return -1;
//    }

    public static void postOrderPrint(Node head){
        if(flag)return;//数据错误,直接返回
        if(head == null){
            return;
        }
        postOrderPrint(head.left);
        postOrderPrint(head.right);
        System.out.println(head.e);
    }

    public static void main(String[] args) {
        int[] preOrder = {1,3,5,7};
        int[] midOrder = {3,1,7,5};
        Node<Integer> head = reBuild_BinaryTree(preOrder,0,preOrder.length-1,midOrder,0,midOrder.length - 1);
        postOrderPrint(head);
    }

}
