public class StringConcatenation{
    public static void main(String[] args){
        int[] counts={1000,10000,1000000};
        for(int count:counts){
            long startTime=System.nanoTime();
            String result="";
            for(int i=0;i<count;i++){
                result+="a";
            }    
            long endTime = System.nanoTime();
            System.out.println("String concatenation for "+count+" is "+(endTime-startTime)/1000000.0);
            startTime=System.nanoTime();
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0;i<count;i++){
                stringBuilder.append("a");
            }
            endTime=System.nanoTime();
            System.out.println("StringBuilder concatenation for "+count+" is "+(endTime-startTime)/1000000.0);
            startTime=System.nanoTime();
            StringBuffer stringBuffer=new StringBuffer();
            for(int i=0;i<count;i++){
                stringBuffer.append("a");
            }
            endTime=System.nanoTime();
            System.out.println("StringBuffer concatenation for "+count+" is "+(endTime-startTime)/1000000.0);
        }
    }
}
