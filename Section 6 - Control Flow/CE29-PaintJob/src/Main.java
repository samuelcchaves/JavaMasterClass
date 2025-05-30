public class Main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.print(getBucketCount(2.75, 3.25, 2.5, 1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double areaCoveredWithoutBuying = areaPerBucket * extraBuckets;
        double totalArea = width * height;
        int bucketCount = 0;
        if(totalArea > areaCoveredWithoutBuying){
            totalArea -= areaCoveredWithoutBuying;
            do {
                totalArea -= areaPerBucket;
                bucketCount++;
            }while(totalArea > 0);
        }

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double totalArea = width * height;
        int bucketCount = 0;
            do {
                totalArea -= areaPerBucket;
                bucketCount++;
            }while(totalArea > 0);

        return bucketCount;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int bucketCount = 0;
        do {
            area -= areaPerBucket;
            bucketCount++;
        }while(area > 0);



        return bucketCount;
    }
}