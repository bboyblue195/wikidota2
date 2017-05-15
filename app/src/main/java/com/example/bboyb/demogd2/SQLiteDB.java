package com.example.bboyb.demogd2;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;

import com.example.bboyb.demogd2.bean.Heroes;
import com.example.bboyb.demogd2.bean.Items;
import com.example.bboyb.demogd2.bean.News;
import com.example.bboyb.demogd2.bean.Skills;
import com.example.bboyb.demogd2.lib.SQLiteDataController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bboyb on 01/05/2017.
 */

public class SQLiteDB extends SQLiteDataController {

    public SQLiteDB(Context con) {
        super(con);
    }

    public ArrayList<Heroes> getListHeroes() {
        ArrayList<Heroes> listHeroes = new ArrayList<>();
        // mo ket noi
        try {
            openDataBase();
            Cursor cs = database.rawQuery("select * from hero", null);
            Heroes heroes;
            while (cs.moveToNext()) {
                heroes = new Heroes(cs.getString(1), cs.getString(0), cs.getString(2), cs.getString(3),cs.getString(4),cs.getBlob(5),cs.getString(6),cs.getString(7),cs.getString(8),cs.getString(9));
                listHeroes.add(heroes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return listHeroes;
    }

    public ArrayList<Items> getListItems() {
        ArrayList<Items> listItems = new ArrayList<>();
        // mo ket noi
        try {
            openDataBase();
            Cursor cs = database.rawQuery("select * from item", null);
            Items items;
            while (cs.moveToNext()) {
                items = new Items(cs.getString(1), cs.getString(0), cs.getInt(2), cs.getString(3),cs.getString(4),cs.getBlob(5));
                listItems.add(items);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return listItems;
    }

    public ArrayList<News> getListNews() {
        ArrayList<News> listNews = new ArrayList<>();
        // mo ket noi
        try {
            openDataBase();
            Cursor cs = database.rawQuery("select * from news", null);
            News news;
            while (cs.moveToNext()) {
                SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                Date date=null;
                try {
                    date= sdf.parse(cs.getString(5));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                news = new News(cs.getString(0), cs.getString(1), cs.getString(2), cs.getString(3),date,cs.getBlob(4));
                listNews.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return listNews;
    }

    public ArrayList<Skills> getSkills(String idHero) {
        ArrayList<Skills> listSkills = new ArrayList<>();
        // mo ket noi
        try {
            openDataBase();
            Cursor cs = database.rawQuery("select * from skill where IDHero= '"+idHero+"'", null);
            Skills skills;
            while (cs.moveToNext()) {
                skills = new Skills(cs.getString(1), cs.getString(0), cs.getString(2), cs.getBlob(5));
                listSkills.add(skills);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return listSkills;
    }

    public Heroes getHero(String idHero) {
        Heroes hero = new Heroes();
        // mo ket noi
        try {
            openDataBase();
            Cursor cs = database.rawQuery("select * from hero where IDHero= '"+idHero+"' limit 1", null);
            Skills skills;
            while(cs.moveToNext()) {
                hero = new Heroes(cs.getString(1), cs.getString(0), cs.getString(2), cs.getString(3), cs.getString(4), cs.getBlob(5), cs.getString(6), cs.getString(7), cs.getString(8), cs.getString(9));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return hero;
    }
}
