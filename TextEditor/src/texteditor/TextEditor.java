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
public class TextEditor {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Text x = new Text("C:\\Users\\cma\\Documents\\NetBeansProjects\\TrainingTasks\\TextEditor\\src\\texteditor\\test.txt");
        
        ArrayList<Character> content = new ArrayList();
        content = x.getContent();
         for(int j = 0; j < content.size(); j++){
            System.out.print( content.get(j));
        }
    }     
}