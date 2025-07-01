class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(numRows);
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            
            // First element is always 1
            row.add(1);
            
            // Calculate middle elements
            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            
            // Last element is always 1 (except for first row)
            if (i > 0) {
                row.add(1);
            }
            
            triangle.add(row);
        }
        
        return triangle;
    }
}