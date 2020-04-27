public class Book2{

    public static void main(String[] args){

        Book one = new Book("The Ultimate Hitchhiker's Guide","Douglas Adams","978-1447297017",1979);
        one.increment();

        Book two = new Book("Around the World in Eighty Days","Jules Verne","978-8422642138",1872);
        two.increment();

        Book three = new Book("The Little Prince","Antoine de Saint-Exupéry","979-1187192596",1943);
        three.increment();
        
        Book four = new Book("The Little Prince","Antoine de Saint-Exupéry","979-1187192596",1943);
        three.increment();
        
        one.setPublisher("Pan Books");
        two.setPublisher("Pierre-Jules Hetzel");
        three.setPublisher("Reynal & Hitchcock");
        four.setPublisher("Reynal & Hitchcock");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        System.out.println("The total amount of books is "+four.getAmountofBooks());

        //--------------------------------------------------------------------------------------------------------

        System.out.println("\nAre books three and four the same? " + three.equals(four));
        System.out.println("Are books one and three the same? "+ one.equals(three));

        if(three.getAmountofBooks()==four.getAmountofBooks()&&three.getPublisher()==four.getPublisher()){
            System.out.println("\nBooks #3 & #4 have the same publisher");
        } else {
            System.out.println("\nBooks #3 & #4 do not have the same publisher");
        }

        if(one.getAmountofBooks()==three.getAmountofBooks()&&one.getPublisher()==three.getPublisher()){
            System.out.println("\nBooks #1 & #3 have the same publisher");
        } else {
            System.out.println("\nBooks #1 & #3 do nothave the same publisher");
        }
    }  
}