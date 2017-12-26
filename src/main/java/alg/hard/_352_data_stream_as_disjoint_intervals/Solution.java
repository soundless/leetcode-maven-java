/*
 * [352] Data Stream as Disjoint Intervals
 *
 * https://leetcode.com/problems/data-stream-as-disjoint-intervals
 *
 * algorithms
 * Hard (40.64%)
 * Total Accepted:    15.5K
 * Total Submissions: 38.1K
 * Testcase Example:  '["SummaryRanges","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals"]\n[[],[1],[],[3],[],[7],[],[2],[],[6],[]]'
 *
 * Given a data stream input of non-negative integers a1, a2, ..., an, ...,
 * summarize the numbers seen so far as a list of disjoint intervals.
 *
 * For example, suppose the integers from the data stream are 1, 3, 7, 2, 6,
 * ..., then the summary will be:
 *
 * [1, 1]
 * [1, 1], [3, 3]
 * [1, 1], [3, 3], [7, 7]
 * [1, 3], [7, 7]
 * [1, 3], [6, 7]
 *
 *
 * Follow up:
 * What if there are lots of merges and the number of disjoint intervals are
 * small compared to the data stream's size?
 *
 *
 * Credits:Special thanks to @yunhong for adding this problem and creating most
 * of the test cases.
 */
/**
 * Definition for an interval.
 * public package algorithms.leetcode.hard._352_data_stream_as_disjoint_intervals;
 * <p>
 * class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
package alg.hard._352_data_stream_as_disjoint_intervals;

import util.Interval;

import java.util.List;

class SummaryRanges {

    /** Initialize your data structure here. */
    public SummaryRanges() {

    }

    public void addNum(int val) {

    }

    public List<Interval> getIntervals() {
        return null;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(val);
 * List<Interval> param_2 = obj.getIntervals();
 */
