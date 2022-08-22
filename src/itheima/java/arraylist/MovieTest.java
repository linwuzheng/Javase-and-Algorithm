package itheima.java.arraylist;

import java.util.ArrayList;

//创建电影对象并放入集合
public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("霸王别姬",9.8,"张国荣");
        Movie m2 = new Movie("西红柿首付",9.0,"王多余");
        Movie m3 = new Movie("总国人",8.8,"西瓜");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        for (int i = 0; i < movies.size(); i++) {
            Movie m4 = movies.get(i);
            System.out.println(m4.getName());
            System.out.println(m4.getScore());
            System.out.println(m4.getActor());

        }
    }
}
