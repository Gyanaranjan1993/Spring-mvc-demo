package com.gyana.concurrency.basics;

/*
 * Daemon threads are low priority threads that runs in the background to perform tasks such as GC. They dont prevent he jvm from
 * exiting even when all the user threads finish their execution.
 * 
 * When all the user threads complete, JVM checks for daemon threads and terminates it before shutting down.
 */

public class DaemonThreadDemo {

}
