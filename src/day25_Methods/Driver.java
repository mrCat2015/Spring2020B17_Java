package day25_Methods;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */

public class Driver {
    public static void main(String[] args) {
        String str = getDriver1("fireFox");
        System.out.println(str);

        String str3 = getDriver3("chrome");
        System.out.println(str3);
    }
    public static String getDriver1(String Browser){
        String result = "";

        switch(Browser.toLowerCase()){
            case "chrome":
                result = "Chrome Driver";
                break;
            case "firefox":
                result = "FireFox Driver";
                break;
            case "id":
                result = "Id Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;

            default:
                result ="Invalid Driver";
        }
        return result;

    }

    public static String getDriver3(String browser){
        browser = browser.toLowerCase();
        String result = (browser.equals("chrome"))? "Chrome Driver" :
                (browser.equals("firefox"))? "Fire Fox" :
                        (browser.equals("safari"))? "Safari Driver" :
                                (browser.equals("edge"))? "Edge Driver" :
                                        (browser.equals("opera"))? "Opera Driver" : "Invalid Driver" ;

        return result;

    }
}
