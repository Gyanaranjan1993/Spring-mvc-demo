package com.gyana.collections.demo;

import java.util.HashSet;
import java.util.Set;

/*
 * Collections:
 * 
 * 		Group of interfaces and classes that makes storing and processing data efficiently
 *      Reduced development effort by using core collection classes rather than implementing our own collection classes.
 *      Code quality is enhanced with the use of well tested collections framework classes.
 *      
 *------------------------------------------------------------------------------------------------------------------------------
 * List Interface: -
 *
 * 1. Cares about which position each object is in.
 * 2. Allows duplicate values.
 * 
 * Implementations of List :
 * 
 * 1. ArrayList - Since Java 1.2 
 * 
 * 	  Faster in traversing through the list
 *    slower when we have multiple inserts and deletes	
 *    is not synchronized  
 *    Ordered collection, maintains the order of insertion of objects.
 *    
 * 
 * 2. LinkedList - Since Java 1.2
 * 
 * 	  Elements are doubly linked - each index contains the value, index of previous, index of next element
 *    Linked list is slow while trying to traverse through it
 *    faster for insertion and deletion of values.
 * 	  
 * 
 * 3. Vector - Since Java 1.0
 * 
 *    Vector is synchronized which makes it thread safe.
 *    Can be used when when we are changing data in a list through multiple threads.
 *    
 *------------------------------------------------------------------------------------------------------------------------------- 
 * Set Interface:
 * 
 * 1. Its a collection that does not allow duplicates.
 * 
 * Implementations of set
 * 
 * 1. HashSet : Since Java 1.2
 * 	  
 * 	  Does not maintain any order. Values can be returned in random order.
 * 	  Does not allow duplicates , if duplicate values are entered then old value is overwritten.
 *    its not synchronized.
 *    
 * 	  HashTable : Similar to HashMap  
 * 
 * 2. LinkedHashset
 * 
 * 	  Maintains insertion order. Elements are sorted based on the order they are added to the set
 *    ordered version of hashSet that uses doubly linked list to keep the insertion order
 * 
 * 3. TreeSet :
 * 
 * 	  Implements SortedSet Interface.
 *    Maintains natural ordering. elements are sorted by keys.
 *    Implementation of binary search tree like Red-Black tree. Therefore operations like add, remove, search takes time. 
 *    Its not thread Safe.
 *    Does not allow null values.
 *    
 *-------------------------------------------------------------------------------------------------------------------------------  
 *    
 * Map Interface:
 * 
 *    1. Map is an object that maps keys to values. 
 *    2. It can not contain duplicate keys
 *    
 *    
 * HashMap :
 *  
 *   1. Does not maintain the order of the map.i.e. It does not return the keys and values in the same order they are inserted. 
 *   2. Permits nulls (null values and null key). 
 * 
 * TreeMap :
 * 
 *   1. Red-Black Tree based navigable map implementation.
 *   2. Sorted according to the natural ordering of keys
 *   3. Ordered collection.
 *   4. not synchronized.
 *   
 * LinkedHashMap:
 * 
 *   1. Maintains insertion order.
 *   2. maintains doubly linked list running through all of its entries.
 * -------------------------------------------------------------------------------------------------------------------------------    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 */

public class CollectionsKnowledgeBytes {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet();
		set.add(10);
		set.add(15);
		set.add(25);
		System.out.println(set.toString());
	}

}
