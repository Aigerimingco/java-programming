package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTRypes = "bengal cat tabby cat persian cat no cat here cat ";
        String[] numberOfCats = catTRypes.split("cat");
        System.out.println("Number of cat = " + (numberOfCats.length - 1));
        for (String type : numberOfCats) {
            System.out.println(type);
        }
    }
}
