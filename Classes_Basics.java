
    


public class Classes_Basics {
    public String str="I am a public member";
    void printfromclass(){
        System.out.println("WITHIN CLASS:-"+" "+str);
    }
    public static void main(String[] args) {
        Classes_Basics object= new Classes_Basics ();
        object.printfromclass();
        System.out.println(object.str);
        App object2=new App();
        object2.printfromoutsideclass();
        app1 object3= new app1();
        object3.printfromchildclass();

        
    }static class App{
        void printfromoutsideclass(){
            Classes_Basics object= new  Classes_Basics();
        System.out.println("Within package,Outside class:-"+" "+object.str);
        }
    }static class app1 extends Classes_Basics{//child class
        //Inherits all properties of Classes_Basics
        void printfromchildclass(){
                app1 obj3= new app1();
                System.out.println("Child class "+" "+obj3.str);
        }

    }
}
