package com.mob.tools.gui;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class CachePoolInner<K, V> {
    private int capacity;
    private OnRemoveListener<K, V> listener;
    private LinkedList<CachePoolInner<K, V>.Node<K, V>> pool = new LinkedList<>();
    private int poolSize;

    /* loaded from: classes.dex */
    public class Node<K, V> {
        private long cacheTime;
        public K key;
        private int size;
        public V value;

        private Node() {
            CachePoolInner.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public interface OnRemoveListener<K, V> {
        void onRemove(K k10, V v10);
    }

    public CachePoolInner(int i10) {
        this.capacity = i10;
    }

    public synchronized void clear() {
        LinkedList<CachePoolInner<K, V>.Node<K, V>> linkedList = this.pool;
        if (linkedList != null && this.capacity > 0) {
            if (this.listener == null) {
                linkedList.clear();
            } else {
                while (this.pool.size() > 0) {
                    CachePoolInner<K, V>.Node<K, V> removeLast = this.pool.removeLast();
                    if (removeLast != null) {
                        this.poolSize -= ((Node) removeLast).size;
                        OnRemoveListener<K, V> onRemoveListener = this.listener;
                        if (onRemoveListener != null) {
                            onRemoveListener.onRemove(removeLast.key, removeLast.value);
                        }
                    }
                }
            }
            this.poolSize = 0;
        }
    }

    public synchronized V get(K k10) {
        CachePoolInner<K, V>.Node<K, V> node;
        if (this.pool != null && this.capacity > 0) {
            while (this.poolSize > this.capacity) {
                CachePoolInner<K, V>.Node<K, V> removeLast = this.pool.removeLast();
                if (removeLast != null) {
                    this.poolSize -= ((Node) removeLast).size;
                    OnRemoveListener<K, V> onRemoveListener = this.listener;
                    if (onRemoveListener != null) {
                        onRemoveListener.onRemove(removeLast.key, removeLast.value);
                    }
                }
            }
            Iterator<CachePoolInner<K, V>.Node<K, V>> it = this.pool.iterator();
            while (true) {
                if (!it.hasNext()) {
                    node = null;
                    break;
                }
                node = it.next();
                if (node != null && ((k10 == null && node.key == null) || (k10 != null && k10.equals(node.key)))) {
                    break;
                }
            }
            if (node != null) {
                this.pool.set(0, node);
                ((Node) node).cacheTime = System.currentTimeMillis();
                return node.value;
            }
        }
        return null;
    }

    public synchronized boolean put(K k10, V v10) {
        return put(k10, v10, 1);
    }

    public synchronized boolean put(K k10, V v10, int i10) {
        if (this.pool == null || this.capacity <= 0) {
            return false;
        }
        CachePoolInner<K, V>.Node<K, V> node = new Node<>();
        node.key = k10;
        node.value = v10;
        ((Node) node).cacheTime = System.currentTimeMillis();
        ((Node) node).size = i10;
        this.pool.add(0, node);
        this.poolSize += i10;
        while (this.poolSize > this.capacity) {
            CachePoolInner<K, V>.Node<K, V> removeLast = this.pool.removeLast();
            if (removeLast != null) {
                this.poolSize -= ((Node) removeLast).size;
                OnRemoveListener<K, V> onRemoveListener = this.listener;
                if (onRemoveListener != null) {
                    onRemoveListener.onRemove(removeLast.key, removeLast.value);
                }
            }
        }
        return true;
    }

    public void setOnRemoveListener(OnRemoveListener<K, V> onRemoveListener) {
        this.listener = onRemoveListener;
    }

    public synchronized int size() {
        return this.poolSize;
    }

    public synchronized void trimBeforeTime(long j10) {
        LinkedList<CachePoolInner<K, V>.Node<K, V>> linkedList = this.pool;
        if (linkedList != null && this.capacity > 0) {
            int size = linkedList.size() - 1;
            while (size >= 0) {
                if (((Node) this.pool.get(size)).cacheTime < j10) {
                    CachePoolInner<K, V>.Node<K, V> remove = this.pool.remove(size);
                    if (remove != null) {
                        this.poolSize -= ((Node) remove).size;
                        OnRemoveListener<K, V> onRemoveListener = this.listener;
                        if (onRemoveListener != null) {
                            onRemoveListener.onRemove(remove.key, remove.value);
                        }
                    }
                } else {
                    size--;
                }
            }
            while (this.poolSize > this.capacity) {
                CachePoolInner<K, V>.Node<K, V> removeLast = this.pool.removeLast();
                if (removeLast != null) {
                    this.poolSize -= ((Node) removeLast).size;
                    OnRemoveListener<K, V> onRemoveListener2 = this.listener;
                    if (onRemoveListener2 != null) {
                        onRemoveListener2.onRemove(removeLast.key, removeLast.value);
                    }
                }
            }
        }
    }
}
