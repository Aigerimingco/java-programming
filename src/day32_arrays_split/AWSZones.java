package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("-----Starting deployment of etsy app to AWS zones-----");
        String[] number = zones.split(",");
        for (String each : number) {
            System.out.println("Deploying [" + app + "] to " + each + "...");
            System.out.println("Deployment completed for "+each+"...");
        }
        System.out.println("Number of comas- " + (number.length - 1));

    }
}
