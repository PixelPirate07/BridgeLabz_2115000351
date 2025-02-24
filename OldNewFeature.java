class LegacyAPI{
    @Deprecated
    void oldFeature(){
        System.out.println("This is the old feature Avoid using it");
    }
    void newFeature(){
        System.out.println("This is the new and improved feature");
    }
}
public class OldNewFeature{
    public static void main(String[] args){
        LegacyAPI api=new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}

