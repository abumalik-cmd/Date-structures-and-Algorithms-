// Бинарное дерево поиска
class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    
    // Добавить элемент
    public void add(T data) {
        root = addNode(root, data);
    }
    
    private Node<T> addNode(Node<T> current, T data) {
        if (current == null) {
            return new Node<>(data);
        }
        
        if (data.compareTo(current.data) < 0) {
            current.left = addNode(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = addNode(current.right, data);
        }
        
        return current;
    }
    
    
    public boolean find(T data) {
        return findNode(root, data);
    }
    
    private boolean findNode(Node<T> current, T data) {
        if (current == null) {
            return false;
        }
        
        if (data.compareTo(current.data) == 0) {
            return true;
        }
        
        if (data.compareTo(current.data) < 0) {
            return findNode(current.left, data);
        } else {
            return findNode(current.right, data);
        }
    }
    

    public void remove(T data) {
        root = removeNode(root, data);
    }
    
    private Node<T> removeNode(Node<T> current, T data) {
        if (current == null) {
            return null;
        }
        
        if (data.compareTo(current.data) < 0) {
            current.left = removeNode(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = removeNode(current.right, data);
        } else {
          
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }
            
          
            T minValue = getMinValue(current.right);
            current.data = minValue;
            current.right = removeNode(current.right, minValue);
        }
        
        return current;
    }
    
    private T getMinValue(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }
    
    // Балансировка дерева
    public void balance() {
        TreeBalancer<T> balancer = new TreeBalancer<>();
        root = balancer.balance(root);
    }
    
    // Показать элементы (in-order обход)
    public void show() {
        showNodes(root);
        System.out.println();
    }
    
    private void showNodes(Node<T> node) {
        if (node == null) return;
        showNodes(node.left);
        System.out.print(node.data + " ");
        showNodes(node.right);
    }

 
    

}