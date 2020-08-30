package com.gyana.collections.demo;

/*
 * Iterator - An interface which provide methods to traverse through an iterator. 
 * can be created by calling iterator() method of any collection implementation.
 * Iterator allows removal of elements in a collection and does not throw any concurrent modification exception.
 * Iterator interface does not declare any implementations and it leaves everything to individual Collection implementations.
 * In this way, the individual collection classes can determine if they want to do fail-fast or fail design
 * 
 * e.g. CopyOnWriteArrayList iterator is fail-safe
 *      ArrayList iterator is fail-fast and does not allow modification while traversing
 **
 *	
 *  Iterator and Map : 
 *  
 *  Map can not be traversed using Iterator because its not a collection. Visit below link to see how to iterate over a map
 *  
 *  https://www.geeksforgeeks.org/iterate-map-java/
 *
 *
 *  By Default Iterator implementations in java.util package are fail-fast
 *  Where as Iterator implementations in java.util.concurrent and fail-safe
 *  Some of the examples are ConcurrentHashMap and CopyOnWriteArrayList
 *
 *
 */
public class IteratorKnowledgeBytes {

}
