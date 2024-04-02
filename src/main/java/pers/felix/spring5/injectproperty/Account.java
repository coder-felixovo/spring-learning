package pers.felix.spring5.injectproperty;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.config.ListFactoryBean;

import java.util.List;

/**
 * @author felixovo
 * @date 2023-06-07 22:21:26
 * @description
 */
public class Account {
    private List<String> orderList;
    public void setOrderList(List<String> orderList) {
        this.orderList = orderList;
    }
    @Override
    public String toString() {
        return "Account{" +
                "orderList=" + orderList +
                '}';
    }
}
