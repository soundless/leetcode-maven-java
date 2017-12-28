/*
 * [284] Peeking Iterator
 *
 * https://leetcode.com/problems/peeking-iterator
 *
 * algorithms
 * Medium (35.51%)
 * Total Accepted:    48.9K
 * Total Submissions: 137.8K
 * Testcase Example:  '[1,2,3,4]\n[0,1,1,2,2,1,1,2,0,1,0,2,0]'
 *
 * Given an Iterator package algorithms.leetcode.median.m_284_peeking_iterator;

class interface with methods: next() and hasNext(), design
 * and implement a PeekingIterator that support the peek() operation -- it
 * essentially peek() at the element that will be returned by the next call to
 * next().
 * 
 * 
 * Here is an example. Assume that the iterator is initialized to the beginning
 * of the list: [1, 2, 3].
 * 
 * Call next() gets you 1, the first element in the list.
 * 
 * Now you call peek() and it returns 2, the next element. Calling next() after
 * that still return 2.
 * 
 * You call next() the final time and it returns 3, the last element. Calling
 * hasNext() after that should return false.
 * 
 * 
 * Follow up: How would you extend your design to be generic and work with all
 * types, not just integer?
 * 
 * Credits:Special thanks to @porker2008 for adding this problem and creating
 * all test cases.
 */
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
package alg.median.m_284_peeking_iterator;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return null;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return null;

    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
