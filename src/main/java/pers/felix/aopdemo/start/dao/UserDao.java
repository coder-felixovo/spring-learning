package pers.felix.aopdemo.start.dao;

// 目标接口和实现类作为Target，即要被代理的对象
public interface UserDao {
    public void add();
    public void delete();
    public void update();
    public void select();
}
