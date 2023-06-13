class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1)
            return intervals;

        ArrayList<int[]> arrList = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals){
            if(i[0] <= end){
                end = Math.max(end, i[1]);
            } else {
                arrList.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        arrList.add(new int[]{start, end});
        return arrList.toArray(new int[0][]);
    }
}
