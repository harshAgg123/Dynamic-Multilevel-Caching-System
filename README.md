# Multi-Level Cache System

## Overview
This project implements a multi-level cache system using a doubly linked list and a hashmap. The cache system is designed to store key-value pairs efficiently and handle cache eviction using a least-recently-used (LRU) strategy across multiple cache levels.

## Features
- **Doubly Linked List**: Nodes are stored in a doubly linked list for efficient addition and removal operations.
- **Multi-Level Caching**: Supports multiple cache levels, allowing for layered caching strategies.
- **Cache Capacity Management**: Each cache level has a defined capacity to manage memory usage.
- **Key-Value Storage**: Allows insertion, retrieval, updating, and removal of key-value pairs.
- **LRU Eviction Policy**: Automatically removes the least recently used items when the cache exceeds its capacity.

## Classes

### 1. `Node`
Represents an individual node in the doubly linked list.
- **Attributes**:
  - `key`: The key associated with the node.
  - `value`: The value associated with the node.
  - `next`: Pointer to the next node in the list.
  - `prev`: Pointer to the previous node in the list.

### 2. `DLL` (Doubly Linked List)
Manages the nodes in the doubly linked list.
- **Methods**:
  - `add(String key, int value)`: Adds a new node to the end of the list.
  - `remove(Node node)`: Removes a specified node from the list.
  - `getHead()`: Returns the head of the list.
  - `print()`: Displays all nodes in the list.

### 3. `Cache`
Represents a single cache level.
- **Attributes**:
  - `capacity`: Maximum number of items the cache can hold.
  - `map`: A hashmap to store key-node pairs.
  - `list`: An instance of `DLL` to maintain the order of nodes.
- **Methods**:
  - `add(String key, int value)`: Adds a key-value pair to the cache.
  - `remove(String key)`: Removes a key-value pair from the cache.
  - `getHead()`: Returns the head node of the linked list.
  - `isCacheFull()`: Checks if the cache is full.
  - `print()`: Displays all nodes in the cache.

### 4. `CacheManager`
Manages multiple cache levels.
- **Attributes**:
  - `caches`: A list of cache levels.
- **Methods**:
  - `addCache(int capacity)`: Adds a new cache level with specified capacity.
  - `put(String key, int value)`: Adds key-value pairs to the first cache level and propagates to higher levels.
  - `removeCache(int level)`: Removes a specified cache level.
  - `getValue(String key)`: Retrieves the value for a specified key.
  - `update(String key, int value)`: Updates the value for a specified key.
  - `display()`: Displays all levels of caches.

### 5. `Main`
The entry point of the application.
- Demonstrates the usage of the cache system by adding caches, inserting key-value pairs, retrieving values, updating values, and displaying the cache levels.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/harshAgg123/Dynamic-Multilevel-Caching-System.git

