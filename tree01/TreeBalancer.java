// TreeBalancer.java
import java.util.ArrayList;
import java.util.List;

// Балансировщик дерева
class TreeBalancer<T> {
    
    // Главный метод балансировки
    public Node<T> balance(Node<T> root) {
        if (root == null) return null;
        
        // Собираем все элементы
        List<T> list = new ArrayList<>();
        collect(root, list);
        
        // Строим новое дерево
        return build(list, 0, list.size() - 1);
    }
    

    private void collect(Node<T> node, List<T> list) {
        if (node == null) return;
        collect(node.left, list);
        list.add(node.data);
        collect(node.right, list);
    }
    
    // Построить сбалансированное дерево
    private Node<T> build(List<T> list, int start, int end) {
        if (start > end) {
            return null;
        }
        
        // Берём средний элемент
        int middle = (start + end) / 2;
        
        // Создаём узел
        Node<T> node = new Node<>(list.get(middle));
        
        // Левая часть
        node.left = build(list, start, middle - 1);
        // Правая часть
        node.right = build(list, middle + 1, end);
        
        return node;
    }
}