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
 */
public class IteratorKnowledgeBytes {

}
