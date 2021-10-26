package com.troytan.structure;

import com.troytan.structure.composite.Company;
import com.troytan.structure.composite.ConcreateCompany;
import com.troytan.structure.composite.FinanceDepartment;
import com.troytan.structure.composite.ITDepartment;
import org.junit.Test;

/**
 * 组合模式:复用了基本对象(叶子节点)，通过基本对象(树形结构)组合成组合对象，并一致对待两者，达到层层组合成大型复杂功能的对象
 *
 * @author troytan
 * @date 2017年12月6日
 */
public class CompositeTest {

    @Test
    public void compositeTest() {
        Company a = new ConcreateCompany("公司A");
        Company aIT = new ITDepartment("IT部门");
        Company aFinance = new FinanceDepartment("财务部门");

        Company b = new ConcreateCompany("子公司B");
        Company bIT = new ITDepartment("B公司IT部门");
        Company bFinance = new FinanceDepartment("B公司财务部门");

        a.add(aIT);
        a.add(aFinance);
        a.add(b);
        b.add(bIT);
        b.add(bFinance);

        System.out.println("-----组织架构-----");
        a.display(0);
        System.out.println("-----组织职能-----");
        a.performDuty();
    }
}
