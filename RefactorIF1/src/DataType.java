public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    static int[] dateCode = {702, 1082, 1083, 1114, 1184, 1266, 12403};
    static int[] numericCode = {21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3734, 3769, 12396};

    public static String gd(int code){

        for (int i : dateCode) {
            if (i == code){
                return "DATE";
            }
        }

        for (int i : numericCode) {
            if (i == code){
                return "NUMERIC";
            }
        }
        return "STRING";
    }
}