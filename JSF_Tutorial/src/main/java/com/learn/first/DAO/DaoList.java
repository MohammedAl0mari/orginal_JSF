package com.learn.first.DAO;

import java.util.List;

public interface DaoList<T> {

        public List<T> loadAll();
        public  T getDataById(int id);
        public int insert(T t);
        public int update(T t);
        public int delete(T t);
}
