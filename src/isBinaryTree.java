/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }

    boolean checkBST(Node root) {
            boolean ans = true;
            if( root == null ) {
            ans = false;
            }

            if( root.left.data < root.data && root.right.data > root.data) {
        return ans;
        }  else if ( root.left.data > root.data || root.right.data < root.data){
        ans = false;
        } else {

        }
        checkBST(root.left);
        checkBST(root.right);

        return ans;
        }

 */