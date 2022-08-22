package itheima.javapro.interface01;

//实现类
public class PingPangMan implements SportMan{

    private String name;
    public PingPangMan(String name){
        this.name = name;
    }
    @Override
    public  void run(){
        System.out.println(name + "必须跑步训练~~~");
    }
    @Override
    public  void competition(){
        System.out.println(name + "必须参加比赛，为国争光~~~");
    }

}
