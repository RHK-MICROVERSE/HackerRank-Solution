package Reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class ReflectionTutorial{
    public static void main(String[] args) throws Exception{
        //Creating a Cat Object
        Cat myCat = new Cat("Stella", 6);
        // printitng the object myCat Details
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());

        /* GETTING ALL THE FIELDS INSIDE THE CLASS CAT IN CAT FILE */
        // To use Reflection we need to get the class of the Object
        // We are getting all the fields of the class
        // Cat from Cat file of the object myCat
        Field[] catFields = myCat.getClass().getDeclaredFields();

        //To Catch Fields we need to iterate through the catField array
        for(Field field: catFields){
            System.out.println(field.getName());
            // Will Print
            // "name" from the Cat file
            // "age" from the Cat file
            // Remember the "name" has been declared final and private
            // So we cannot chage the name of the object myCat under any
            // Circumstances which we set to "Stela".
            // Here the REFLECTION COMES TO PLAY.
            if(field.getName().equals("name")){
                // Declaring we can accesses the field name 
                field.setAccessible(true); 
                // we will set the new name to "Jimmy McGill"
                // and to handle the exception we need to add throws Exception
                field.set(myCat, "Jimmy McGill");
            }
        }
        // Lets print out the new name
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println("---------------------------");

        /* GETTING ALL THE METHODS INSIDE THE CLASS CAT IN CAT FILE */
            Method[] catMethods = myCat.getClass().getDeclaredMethods();
            // Printing all the Method names
            for(Method method : catMethods){
                System.out.println(method.getName());
                if(method.getName().equals("meowPublicVoidMethod")){
                    // calling the method
                    System.out.println("---------------------------");
                    method.invoke(myCat);
                    System.out.println("---------------------------");
                }
                // Accessing a heyThisIsPrivateVoidMethod
                if(method.getName().equals("heyThisIsPrivateVoidMethod")){
                    method.setAccessible(true);
                    System.out.println("---------------------------");
                    method.invoke(myCat);
                    System.out.println("---------------------------");
                }
                if(method.getName().equals("thisIsPublicStaticMethod")){
                    method.setAccessible(true);
                    System.out.println("---------------------------");
                    method.invoke(null);
                    System.out.println("---------------------------");
                }
                if(method.getName().equals("thisIsPrivateStaticMethod")){
                    method.setAccessible(true);
                    System.out.println("---------------------------");
                    method.invoke(null);
                    System.out.println("---------------------------");
                }
            }       
    }
}