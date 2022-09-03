Find first non repeating character in a given String s = “goforlearning”

Given string is s;

public static String findNonRepeatingCharacter(String input){
       HashMap<Chara
       scter,Boolean> charSet = new HashMap<>();
       for(int i=0;i<input.length();i++){
         if(charSet.get(input.charAt(i))==null){
            charSet.put(input.charAt(i),false);
       } else{
            charSet.put(input.charAt(i),true);
      }
   }

  for(int i=0;i<input.length();i++){
   if(charSet.get(input.charAt(i))){
      Return String.valueOf( input.charAt(i));   
   }
}

       
  Return null;

}


Student table

Student id, subject, marks 
A1, math , 100
A1, science 80
A2, science 100
A3, science 100

0ut put
A2, 100
A3. 100

Highest marks in sciences and studentid’s with highest marks 

Select id, marks from Student s o where s.subject = ‘science’  and s2 = (select max(sal) from Student )

Data 
<chil>[] ()

[(ngModel)]

() []


select id, marks from student s1 where  1-1 = (select count(distinct sal)) from table a2 where a2.sal<a1.sal