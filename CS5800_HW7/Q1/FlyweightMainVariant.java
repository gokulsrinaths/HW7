package Q1;
public class FlyweightMainVariant {
    public static void main(String[] args) {
        FlyweightFactory styleFactory = new FlyweightFactory();
        Document textDocument = new Document();

        // Add characters with slightly different properties
        textDocument.addCharacter('H', styleFactory.getFlyweight("Arial", "Crimson", 12));
        textDocument.addCharacter('e', styleFactory.getFlyweight("Calibri", "Navy", 14));
        textDocument.addCharacter('l', styleFactory.getFlyweight("Verdana", "Ebony", 16));
        textDocument.addCharacter('l', styleFactory.getFlyweight("Arial", "Crimson", 12));
        textDocument.addCharacter('o', styleFactory.getFlyweight("Calibri", "Navy", 14));
        textDocument.addCharacter('W', styleFactory.getFlyweight("Verdana", "Ebony", 16));
        textDocument.addCharacter('o', styleFactory.getFlyweight("Arial", "Crimson", 12));
        textDocument.addCharacter('r', styleFactory.getFlyweight("Calibri", "Navy", 14));
        textDocument.addCharacter('l', styleFactory.getFlyweight("Verdana", "Ebony", 16));
        textDocument.addCharacter('d', styleFactory.getFlyweight("Arial", "Crimson", 12));
        textDocument.addCharacter('C', styleFactory.getFlyweight("Calibri", "Navy", 14));
        textDocument.addCharacter('S', styleFactory.getFlyweight("Verdana", "Ebony", 16));
        textDocument.addCharacter('5', styleFactory.getFlyweight("Arial", "Crimson", 12));
        textDocument.addCharacter('8', styleFactory.getFlyweight("Calibri", "Navy", 14));
        textDocument.addCharacter('0', styleFactory.getFlyweight("Verdana", "Ebony", 16));
        textDocument.addCharacter('0', styleFactory.getFlyweight("Arial", "Crimson", 12));

        textDocument.save("helloWorldDocument.txt");
    }
}
