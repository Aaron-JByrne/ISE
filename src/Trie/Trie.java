package Trie;

// Simplified Trie following the exercise requirements
import java.util.*;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
}

public class Trie {
    private final TrieNode root = new TrieNode();

    // Insert a word into the trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Delete a word (remove only the end marker)
    public void delete(String word) {
        deleteHelper(root, word, 0);
    }

    private boolean deleteHelper(TrieNode node, String word, int depth) {
        if (node == null) return false;

        if (depth == word.length()) {
            if (!node.isEndOfWord){
                return false;
            }
            node.isEndOfWord = false;
            return hasNoChildren(node);
        }

        int index = word.charAt(depth) - 'a'; //gets ascii values to get index of char in alphabet
        TrieNode child = node.children[index]; //gets child node at index

        boolean shouldDeleteChild = deleteHelper(child, word, depth + 1);

        if (shouldDeleteChild) {
            node.children[index] = null;
            return !node.isEndOfWord && hasNoChildren(node);
        }

        return false;
    }

    private boolean hasNoChildren(TrieNode node) {
        for (TrieNode child : node.children) if (child != null) return false;
        return true;
    }

    // Search all words with a given prefix
    public List<String> search(String prefix) {
        List<String> results = new ArrayList<>();
        TrieNode node = root;

        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) return results;
            node = node.children[index];
        }

        collect(node, new StringBuilder(prefix), results);
        return results;
    }

    private void collect(TrieNode node, StringBuilder path, List<String> results) {
        if (node.isEndOfWord) {
            results.add(path.toString());
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                path.append((char)('a' + i));
                collect(node.children[i], path, results);
                path.deleteCharAt(path.length() - 1);
            }
        }
    }

    // Demonstration
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("car");
        trie.insert("cart");
        trie.insert("dog");
        trie.insert("dove");

        System.out.println("Search 'ca': " + trie.search("ca"));

        trie.delete("car");
        System.out.println("After deleting 'car'");
        System.out.println("Search 'ca': " + trie.search("ca"));

        System.out.println("Search 'do': " + trie.search("do"));
    }
}
