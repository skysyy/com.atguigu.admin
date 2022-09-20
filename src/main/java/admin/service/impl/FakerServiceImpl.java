package admin.service.impl;

import admin.bean.Fiction;
import admin.dao.Txt;
import admin.service.FakerService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Service
public class FakerServiceImpl implements FakerService {
    @Autowired
    public Txt txt;
    public String getmethod(int count){
        Faker faker = new Faker(Locale.CHINA);
        List<Fiction>list=new ArrayList<>();
        String []status={"连载中","已完结"};
        String []classify={"奇幻玄幻","武侠仙侠","历史军事","都市娱乐","竞技同人","科幻游戏","悬疑灵异","二次元"};
        for (int i=1;i<=count;i++){
            Fiction fiction=new Fiction();
            Random random=new Random(System.currentTimeMillis());
            int classifyindex=random.nextInt(classify.length-1);
            int statusindex= random.nextInt(status.length);
            String statusname = status[statusindex];
            String classifyname = classify[classifyindex];
            fiction.setFictionname(faker.book().title());
            fiction.setAuthors(faker.book().author());
            fiction.setStatus(statusname);
            fiction.setClassify(classifyname);
            fiction.setId("0"+String.valueOf(i));
            fiction.setWord(faker.random().nextInt(100000,50000000));
            fiction.setAlrecommend(faker.random().nextInt(0,20000));
            fiction.setHits(faker.random().nextInt(0,570000));
            fiction.setWerecommend(faker.random().nextInt(0,200));
            fiction.setSupport(faker.random().nextInt(0,150));
            list.add(fiction);
        }
        return txt.getmethod(list);

    }


}
