class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return result;
        }
        int srow=0;
        int erow=matrix.length-1;
        int scol=0;
        int ecol=matrix[0].length-1;

        while(srow<=erow && scol<=ecol){
            
        for(int i=scol;i<=ecol;i++){
            result.add(matrix[srow][i]);
        }
        srow++;
        
        for(int j=srow;j<=erow;j++){
            result.add(matrix[j][ecol]);
        }
        ecol--;

        if(srow<=erow){
        for(int i=ecol;i>=scol;i--){
            result.add(matrix[erow][i]);
        }
        erow--;}

        if(scol<=ecol){
        for(int j=erow;j>=srow;j--){
            result.add(matrix[j][scol]);
        }
        scol++;}

        }
        return result;
    }
}