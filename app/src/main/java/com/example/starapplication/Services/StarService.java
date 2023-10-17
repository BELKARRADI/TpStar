package com.example.starapplication.Services;

import com.example.starapplication.Dao.IDao;
import com.example.starapplication.entities.Star;

import java.util.ArrayList;
import java.util.List;

public class StarService  implements IDao<Star> {
    private  List<Star> stars;



    private static StarService instance;
    private StarService() {
        this.stars = new ArrayList<>();
    }
    public static StarService getInstance() {
        if(instance == null)
            instance = new StarService();
        return instance;
    }




    @Override
    public boolean create(Star o) {
        return stars.add(o);
    }

    @Override
    public boolean update(Star o) {
        for(Star p : stars){
            if(p.getId() == o.getId()) {
                p.setName(o.getName());
                p.setStar(o.getStar());
                p.setImg(o.getImg());

                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Star o) {
        return stars.remove(o);
    }

    @Override
    public Star findById(int id) {

        for(Star p : stars){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public List<Star> findAll() {
        return stars;
    }
}
