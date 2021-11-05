package be.wikiformatter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WikiFormatterTest {
    @Test
    void empty(){
        String[] arr = {};
        String result = new WikiFormatter().format(arr);
        assertEquals("", result);
    }
    @Test
    void simpleP1(){
        String[] arr = {"aap"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>aap</p>", result);
    }
    @Test
    void simpleP2(){
        String[] arr = {"aap", "beer"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>aap</p><p>beer</p>", result);
    }
    @Test
    void bold(){
        String[] arr = {"*aap*"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p><b>aap</b></p>", result);
    }
    @Test
    void boldOnlyStarting(){
        String[] arr = {"*aap"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p><b>aap</b></p>", result);
    }
    @Test
    void boldPartOfSentence(){
        String[] arr = {"hallo *aapje*"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>hallo <b>aapje</b></p>", result);
    }
    @Test
    void boldFirstPartOfSentence(){
        String[] arr = {"*heee* hoe gaat het"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p><b>heee</b> hoe gaat het</p>", result);
    }
    @Test
    void boldMiddleOfSentence(){
        String[] arr = {"hallo hola *heee* hoe gaat het"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>hallo hola <b>heee</b> hoe gaat het</p>", result);
    }
    @Test
    void bold2Parts(){
        String[] arr = {"hallo *hola* heee *echt waar* hoor je"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>hallo <b>hola</b> heee <b>echt waar</b> hoor je</p>", result);
    }
    @Test
    void bold5Parts(){
        String[] arr = {"hallo *een* ha *twee* ho *drie* jo *vier* ja *vijf*"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>hallo <b>een</b> ha <b>twee</b> ho <b>drie</b> jo <b>vier</b> ja <b>vijf</b></p>", result);
    }
    @Test
    void bold2PartsNoEnding(){
        String[] arr = {"hallo *hola* heee *echt waar hoor je"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>hallo <b>hola</b> heee <b>echt waar hoor je</b></p>", result);
    }
    @Test
    void adjacentStars(){
        String[] arr = {"hallo ** heee"};
        String result = new WikiFormatter().format(arr);
        assertEquals("<p>hallo <b></b> heee</p>", result);
    }
}
