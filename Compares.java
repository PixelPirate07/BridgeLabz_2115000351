public class Compares{
    public static void main(String[] args) {
        int iterations=1000000;
        long startTime=System.nanoTime();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<iterations;i++){
            stringBuffer.append("hello");
        }
        long bufferTime=System.nanoTime()-startTime;
        startTime=System.nanoTime();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<iterations;i++){
            stringBuilder.append("hello");
        }
        long builderTime=System.nanoTime()-startTime;
        System.out.println("StringBuffer time in ns "+bufferTime);
        System.out.println("StringBuilder time in ns "+builderTime);
    }
}
