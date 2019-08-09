package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Text {
    public ArrayList<Character> content;
    private File file;
    
    public Text(String path){
        loadText(path);
    }
    
    public ArrayList<Character> getContent(){
        return content;
    }
    
    private void loadText(String path){
        content = new ArrayList();
        InputStream inputStream = null;        
        file = new File(path);
        
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
    }
    
    public void saveText(String path)   {
        OutputStream out = null;
        try{
            out = new FileOutputStream(file);            
            for(int i = 0; i < content.size(); i++){
                out.write((int)content.get(i));
            }
        }catch(Exception e){
            
        }finally{
            
        }
    }
}