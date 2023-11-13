import java.util.LinkedHashSet;

public class a {

    	 public static void main(String[] args) {
    	       String s="wwwpriteew";
    	    LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
    	    for(int i=0;i<s.length();i++)
    	    {
    	        hs.add(s.charAt(i));
    	    }
    	    System.out.println(hs);
    	    for(Character ch:hs)
    	    {
    	        int count=0;
    	        for(int i=0;i<s.length();i++)
    	        {
    	             if(ch==s.charAt(i))
    	             {
    	                 count++;
    	             }
    	        }
    	        System.out.print(ch+" "+count);
    	    }
     }
}
