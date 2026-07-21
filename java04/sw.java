package java04;


//Java 14 features

public class sw {
    public static void main(String[] args) {
        String day="Monday";
        boolean isWeekend=switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"->false;
            case "Saturday","Sunday"->true;
            default-> throw new IllegalStateException("Day is not in a weekend");
        };

        //System.out.println(isWeekend);`

        String mline="""
        My name is Jane Done,
        I am from Australia!""";
        
        //System.out.println(mline);


    }
}
