public class UserOfSpeakers {
    
    public static void main(String[] args) {
        Retriever golden = new Retriever();
        Animal doggo = golden;
        System.out.println(doggo.speak());
    }

}
