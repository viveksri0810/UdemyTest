package Basic;

class SplitDemo {

    public static void main(String[] args) {
        String str=" ";

        String[] str1=str.trim().split("[ !,?._'@]+");
        System.out.println(str1.length);
        for (String s:str1){
            System.out.println(s);
        }

    }
}
