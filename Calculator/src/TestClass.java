
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashankbajaru
 */
public class TestClass {
    public static void main(String args[]) throws ScriptException{
        ScriptEngineManager mgr=new ScriptEngineManager();
        ScriptEngine engine=mgr.getEngineByName("JavaScript");
        String s="0.5+0.6+88.23-45";
        int l=s.length();
        System.out.println(s.substring(0,7));
        int a=7+99/8;
        CalFrame frame = new CalFrame();
        frame.setVisible(true);
        System.out.println(engine.eval(s));
    }
    
}
