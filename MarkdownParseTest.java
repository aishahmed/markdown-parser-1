import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    // @Test 
    // public static void main(String[] args) throws IOException {
    //     Path fileName = Path.of("test-file.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = getLinks(content);
	//     System.out.println(links);
    //     //System.out.println("Nice this works!");
    // }

    @Test
    public void testGetLinks() throws IOException{
        //
        ArrayList<String> correct = new ArrayList<>();
        correct.add("https://something.com");
        correct.add("some-thing.html"); //expected)
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); //actual
	    //System.out.println(links);
        //System.out.println("Nice this works!");
        assertEquals(correct, links);
    }
    

}
