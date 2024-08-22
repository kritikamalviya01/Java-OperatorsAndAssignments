public class StringConcatination {
    public static void main(String[] args) {

        String s1 = "Kritika";
        String s2 = "Malviya";

        System.out.println("Using + Operator");
        System.out.println(s1+s2);

        System.out.println();

        System.out.println("Using Concat Method");
        System.out.println(s1.concat(" ").concat(s2));

        System.out.println();

        System.out.println("Using StringBuilder");
        StringBuilder t1 = new StringBuilder();
        t1.append(s1);
        t1.append(" ");
        t1.append(s2);
        System.out.println(t1);

        System.out.println();

        System.out.println("Using StringBuffer");
        StringBuffer t2 = new StringBuffer();
        t2.append(s1);
        t2.append(s2);
        System.out.println(t2);

        System.out.println();

        System.out.println("using String join");
        String result = String.join(" ", s1,s2);
        System.out.println(result);

    }
}
