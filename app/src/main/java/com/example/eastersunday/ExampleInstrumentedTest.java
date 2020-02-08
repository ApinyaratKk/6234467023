package com.example.eastersunday;

public class ExampleInstrumentedTest {

    private int year ;

    public ExampleInstrumentedTest(String year) {
        this.year = Integer.parseInt(year) ;

    }
    public String getEasterDay(){
        int a = year/19 ;
        int b = year/100 ;
        int c = year%100 ;
        int d = b/4 ;
        int e = b%4 ;
        int g = (8*b+13)/25 ;
        int h = (19*a+b-d-g+15)%30 ;
        int j = c/4 ;
        int k = c%4 ;
        int m = (a+11*h)/319 ;
        int r = (2*e*2*j-k-h+m+32)%7 ;
        int n = (h-m+r+90)/25 ;
        int p = (h-m+r+n+19)%32 ;
        return (textFormat(n,p)) ;

    }

    private static String textFormat(int month,int date) {
        String monthText = null, dateText = Integer.toString(date) ;
        switch (month) {
            case 1:
                monthText = "January";
                break;
            case 2:
                monthText = "February";
                break;
            case 3:
                monthText = "March";
                break;
            case 4:
                monthText = "April";
                break;
            case 5:
                monthText = "May";
                break;
            case 6:
                monthText = "June";
                break;
            case 7:
                monthText = "July";
                break;
            case 8:
                monthText = "August";
                break;
            case 9:
                monthText = "September";
                break;
            case 10:
                monthText = "October";
                break;
            case 11:
                monthText = "November";
                break;
            case 12:
                monthText = "December";
                break;
        }
        return (monthText + " " + dateText + ".");
    }
}
