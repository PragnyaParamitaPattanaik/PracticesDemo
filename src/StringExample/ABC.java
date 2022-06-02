package StringExample;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class ABC {
    public static void main(String[]args){
        StringBuffer s=new StringBuffer("I am a JAVA developer");
        s.append("Thanks");
        System.out.println(s);
        int index=s.lastIndexOf("JAVA");
        System.out.println(index);
    }
}
