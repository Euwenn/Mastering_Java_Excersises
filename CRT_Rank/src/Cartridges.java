// Class representing a vape cartridge, with details like name, strain, price, store, etc.
public class Cartridges
{
    //Attributes to store cartridge details
    private String name;
    private String strain;
    private double price;
    private String store;
    private String description;
    private boolean wouldBuyAgain;
    private String tierList;
    private int stars;
    private int numericRank;
    private String userRank;

    //Create Constructor to initialize all fields
    public Cartridges(String name, String strain, double price, String store, String description,
                      boolean wouldBuyAgain, String tierList, int stars, int numericRank, String userRank)
    {
        this.name = name;
        this.strain = strain;
        this.price = price;
        this.store = store;
        this.description = description;
        this.wouldBuyAgain = wouldBuyAgain;
        this.tierList = tierList;
        this.stars = stars;
        this.numericRank = numericRank;
        this.userRank = userRank;
    }

    //Tostring to Convert cartridge details to a string for easy storage in a file
    @Override
    public String toString() {
        return name + "," + strain + "," + price + "," + store + "," + description + "," + wouldBuyAgain +
                "," + tierList + "," + stars + "," + numericRank + "," + userRank;
    }


    //Static method to parse a line from the file and return a Cartridge object
    public static void parseLine() {
        //come back here
    }

}
