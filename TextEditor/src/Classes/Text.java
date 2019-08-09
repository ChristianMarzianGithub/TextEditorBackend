package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Text {
    public ArrayList<Character> content;
    
    
    public Text(String path){
        loadText(path);
    }
    
    public ArrayList<Character> getContent(){
        return content;
    }
    
    private int loadText(String path){
        int retVal = 0;        
        
        
        content = new ArrayList();
        InputStream inputStream = null;        
        File file = new File(path);
        
        int i;
        char c;
        
        
        
        try{
            
            inputStream = new FileInputStream(file);
            
            while( (i = inputStream.read()) != -1){
                content.add((char)i);//Byte in Zeichen umwandeln                
            }
            
        }catch(Exception e){
            
        }finally{
            
            try {
                inputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        
        
       
        
        
        
        
        return retVal;
    }
}
