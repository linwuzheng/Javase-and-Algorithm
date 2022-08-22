package itheima.java.arraylist;

//创建一个电影对象放入集合并操作集合
public class Movie {
    private String name;
    private double score;
    private String actor;

    public Movie (){

    }

    public Movie (String name,double score,String actor){
        this.name = name;
        this.score = score;
        this.actor = actor;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
