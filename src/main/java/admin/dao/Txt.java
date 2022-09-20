package admin.dao;

import admin.bean.Fiction;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

@Repository
public class Txt {
    public String getmethod(List<Fiction>list){
        try {
            File writename = new File("D:\\xie\\syy.txt");
            writename.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            for(Fiction a:list){
                out.write(a.getId()+" "+a.getFictionname()+" "+a.getAuthors()+" "+a.getStatus()+" "+a.getClassify()+" "+a.getWord()+" "
                        +a.getAlrecommend()+" "+a.getHits()+" "+a.getWerecommend()+" "+a.getSupport());
                out.newLine();
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "generated/generated_data";
    }
}
