/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

/**
 *
 * @author CMA
 */

import Classes.Text;
import java.util.ArrayList;
import java.util.Scanner;
public class TextEditor {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        String path = "C:\\Users\\cma\\Documents\\NetBeansProjects\\TrainingTasks\\TextEditor\\src\\texteditor\\test.txt";
        
        
        
        
        
        Text x = new Text(path);
        
        ArrayList<Character> content = new ArrayList();
        content = x.getContent();
        
        
        x.content.add(x.content.size(),"a".charAt(0));
        
        x.saveText(path);
    }     
}