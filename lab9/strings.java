package lab9;

public class strings 
{
    String To_strings()
    {
        System.out.println("good morning");
        return "GOOD MORNING";

    }
   
    public static void main(String[] args)
    {
        strings obj= new strings();

        char arr[]={'a','b','c','d','e','f'};
        String str= new String(arr,2,3);

        System.out.println(str);
        
        
        String str1,str2;
        str1="hello world "; str2="bms college";
        str= str1+str2;
        System.out.println(str);

         obj.To_strings();


         str1.replace(str1.charAt(2), '_');
         System.out.println(str1);


         char temp[]=str1.toCharArray();
         System.out.println("chararray:- "+temp);



         String s1,s2,s3;
         s1="hello world";
         s2="hello world";
         s3="bms college";
         
         if(s1==s2)
         {
            System.out.println(" s1==s2");
         }
         else{
            System.out.println(" s1!=s2");
         }
         if(s1==s3)
         {
            System.out.println(" s1==s3");
         }
         else{
            System.out.println(" s1!=s3");
         }
         if(s1.equals(s2))
         {
            System.out.println(" s1 equals s2");
         }
         else{
            System.out.println(" s1 not equals s2");
         }
         if(s1.equals(s3))
         {
            System.out.println(" s1 equals s3");
         }
         else{
            System.out.println(" s1 not equals s3");
         }
         if(s1.compareTo(s2)==1)
         {
            System.out.println(" s1 equals s2 compared function");
         }
         else{
            System.out.println(" s1 not equals s2 compared function");
         }
         if(s1.compareTo(s3)==1)
         {
            System.out.println(" s1 equals s3 compared function");
         }
         else{
            System.out.println(" s1 not equals s3 compared function");
         }



         String s ="good morning";
         String s11="morning has started";

         if(s.contains("good"))
         {
            System.out.println(s+" contains good");
         }
         else
         {
            System.out.println(s+" does not contains good");
         }



         String s12= str.substring(2,5);
         System.out.println(s12+" substring of"+str);


         String s111=new String("hello world");
         System.out.println("\n"+s111+" before replacing");
         
         System.out.println(s111.replace("hello", "Hello1233")+" after replacing");


         String s112=new String("hello BMSCE Good morning");
         System.out.println("\n"+s112+" before eliminating spaces");
         
         System.out.println(s112.replace(" ", "")+" after eliminating spaces");


         String email = "abc@gmail.com";
         String ph = "1245768930";
         String s9 = "xyz24";
 
         System.out.println("EMAIL: "+ email);
         System.out.println("PHONE NUMBER: "+ ph);
         System.out.println("MODIFIED EMAIL: "+ email.concat(s9.substring(0,3)));
         System.out.println("MODIFIED PHONE NUMBER: "+ ph.concat(s9.substring(3)));
 




    }
}
