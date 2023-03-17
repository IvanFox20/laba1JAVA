public class Main
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal(5,"Biba","gray","female");
        Animal animal2 = new Animal(5,"Boba","red","male");
        String animal1Info = animal1.toString();
        String animal2Info = animal2.toString();
        System.out.println(animal1Info);
        System.out.println(animal2Info);
    }
}