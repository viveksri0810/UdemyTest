package Basic;

public class PaintJob {
    // write your code here
    public static void main(String[] args) {
        int result=getBucketCount(3.4,2.1,1.5);
        System.out.println(result);
    }
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBucket){
        if(width<=0 || height <=0 ||areaPerBucket<=0 || extraBucket<0){
            return -1;
        }

        double area=width*height;
        double areaLeft=area-(areaPerBucket*extraBucket);
        int bucketRequired=(int)(Math.ceil(areaLeft/areaPerBucket));
        return bucketRequired;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0 || height <=0 ||areaPerBucket<=0){
            return -1;
        }

        double area=width*height;
        double areaLeft=area-areaPerBucket;
        double bucketRequired=areaLeft/areaPerBucket;
        double bucketRequiredRound=Math.ceil(areaLeft/areaPerBucket);
        int bucketRequiredInt=(int)bucketRequiredRound;
        return bucketRequiredInt;

    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 ||areaPerBucket<=0){
            return -1;
        }

        double areaLeft=area-areaPerBucket;
        int bucketRequired=(int)(Math.ceil(areaLeft/areaPerBucket));

        return bucketRequired;

    }
}