public class Hamming {
    public static int getdistance(String simhash1,String simhash2){
        int distance=0;
        for (int i=0;i<simhash1.length();i++){
            if(simhash1.charAt(i)!=simhash2.charAt(i)){
                distance++;
            }
        }
        return distance;
    }
    public static double getsimilarity(String simhash1,String simhash2){
        int distance=getdistance(simhash1,simhash2);
        double similarity=1.0-(double) distance/256;
        return similarity;
    }
}
