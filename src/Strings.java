public class Strings {
    public static void main(String[] args) {
        String str = "Hemraj";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,6));
        System.out.println(str.replace("r","p"));
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("raj"));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("r", 4));
        System.out.println(str.equalsIgnoreCase("hemrajgf"));

        //---------------------------------------------------------------------
        //        String nonTrimmedString = "        Hemraj       ";
        //        System.out.println(nonTrimmedString);
        //        System.out.println(nonTrimmedString.trim());
    }
}
