class Node:
    def __init__(self,val):
        self.val = val
        self.left = None
        self.right = None

def build_tree(arr,i=0):
    if i>=len(arr) or arr[i] is None:
        return None
    root = Node(arr[i])
    root.left = build_tree(arr, 2*i+1)
    root.right = build_tree(arr, 2*i+2)
    return root

def preorder(root):
    if root is None:
        return []
    return [root.val] + preorder(root.left) + preorder(root.right)

def inorder(root):
    if root is None:
        return []
    return inorder(root.left) + [root.val] + inorder(root.right)

def postorder(root):
    if root is None:
        return[]
    return postorder(root.left) + postorder(root.right) + [root.val]

def main():
    userinputs = input("Enter items separated by spaces: ")
    values = list(map(int, userinputs.split()))
    treevalues = list(dict.fromkeys(map(int, userinputs.split())))
    print("Insertion List: ", values)
    root = build_tree(treevalues)
    print("Preorder:", preorder(root))
    print("Inorder:", inorder(root))
    print("Postorder:", postorder(root))

if __name__ == "__main__":
    main()