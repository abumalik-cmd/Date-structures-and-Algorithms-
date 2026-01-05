// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тестирование бинарного дерева поиска ===\n");
        
       
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        
      
        System.out.println("1. Добавляем элементы: 5, 3, 7, 2, 4, 6, 8");
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        
        System.out.print("Дерево (in-order): ");
        tree.show();
        
        // Тест 2: Поиск элементов
        System.out.println("\n2. Поиск элементов:");
        System.out.println("   Найти 4: " + tree.find(4));
        System.out.println("   Найти 10: " + tree.find(10));
        
    
        
        
        // Тест 5: Удаление
        System.out.println("\n5. Удаляем 3 и 7:");
        tree.remove(3);
        tree.remove(7);
        System.out.print("   Дерево после удаления: ");
        tree.show();
        
        
        System.out.println("\n6. Тест балансировки:");
                BinarySearchTree <Integer> unbalancedTree = new     BinarySearchTree <>();
        System.out.println("   Добавляем элементы 1, 2, 3, 4, 5, 6, 7 (в таком порядке)");
        
      
        
        System.out.print("   Дерево до балансировки: ");
        unbalancedTree.show();
        
        unbalancedTree.balance();
        System.out.print("   Дерево после балансировки: ");
        unbalancedTree.show();
        
        System.out.println("\n=== Тестирование завершено ===");
    }
}