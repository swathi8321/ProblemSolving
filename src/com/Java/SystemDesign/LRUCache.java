package com.Java.SystemDesign;
/*146. LRU Cache
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

	Implement the LRUCache class:

	LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
	int get(int key) Return the value of the key if the key exists, otherwise return -1.
	void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
	The functions get and put must each run in O(1) average time complexity.
 */
import java.util.HashMap;
import java.util.Map;

public class LRUCache {  

  private Map<Integer, DLinkedNode> cache = new HashMap<>();
  private int size;
  private int capacity;
  private DLinkedNode head, tail;

  public LRUCache(int capacity) {
    this.size = 0;
    this.capacity = capacity;

    head = new DLinkedNode();
    // head.prev = null;

    tail = new DLinkedNode();
    // tail.next = null;

    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    DLinkedNode node = cache.get(key);
    if (node == null) return -1;

    // move the accessed node to the head;
    moveToHead(node);

    return node.value;
  }

  public void put(int key, int value) {
    DLinkedNode node = cache.get(key);

    if(node == null) {
      DLinkedNode newNode = new DLinkedNode();
      newNode.key = key;
      newNode.value = value;

      cache.put(key, newNode);
      addNode(newNode);

      ++size;

      if(size > capacity) {
        // pop the tail
        DLinkedNode tail = popTail();
        cache.remove(tail.key);
        --size;
      }
    } else {
      // update the value.
      node.value = value;
      moveToHead(node);
    }
  }
  class DLinkedNode {
	    int key;
	    int value;
	    DLinkedNode prev;
	    DLinkedNode next;
	  }

	  private void addNode(DLinkedNode node) {
	    /**
	     * Always add the new node right after head.
	     */
	    node.prev = head;
	    node.next = head.next;

	    head.next.prev = node;
	    head.next = node;
	  }

	  private void removeNode(DLinkedNode node){
	    /**
	     * Remove an existing node from the linked list.
	     */

	    node.prev.next = node.next;
	    node.next.prev = node.prev;
	  }

	  private void moveToHead(DLinkedNode node){
	    /**
	     * Move certain node in between to the head.
	     */
	    removeNode(node);
	    addNode(node);
	  }

	  private DLinkedNode popTail() {
	    /**
	     * Pop the current tail.
	     */
	    DLinkedNode res = tail.prev;
	    removeNode(res);
	    return res;
	  }
	  
	  public static void main(String args[]) {
		  LRUCache lRUCache = new LRUCache(2);
		  lRUCache.put(1, 1); // cache is {1=1}
		  lRUCache.put(2, 2); // cache is {1=1, 2=2}
		  lRUCache.get(1);    // return 1
		  lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		  lRUCache.get(2);    // returns -1 (not found)
		  lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		  lRUCache.get(1);    // return -1 (not found)
		  lRUCache.get(3);    // return 3
		  lRUCache.get(4);    // return 4
	  }
}