class JavaStrings{
    public static void main(String[] args) {
        String firstname="Mayur";
        String lastname="Patil";

        String a="10";
        String b="20";


        System.out.println(firstname.concat(" "+lastname));
        System.out.println(firstname.length());
        System.out.println(firstname.toUpperCase());
        System.out.println(lastname.toLowerCase());
        System.out.println(firstname.indexOf('a'));

        System.out.println("\n-------- \n"+ a+b);

        System.out.println(" \" Mayur Patil \"");
        
    }
}