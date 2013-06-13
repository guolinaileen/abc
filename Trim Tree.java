public static TreeNode trimBST(TreeNode root, int min, int max){ 

if(root == null) return root; 

if(root.data > max)  return trimBST(root.left,min,max); 
if(root.data < min)	return trimBST(root.right,min,max); 

root.left = trimBST(root.left,min,max); 
root.right = trimBST(root.right,min,max); 

return root; 
}
