package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.composite.Company;
import com.troytan.structure.composite.ConcreateCompany;
import com.troytan.structure.composite.FinanceDepartment;
import com.troytan.structure.composite.ITDepartment;

/**
 * 组合模式:复用了基本对象(叶子节点)，通过基本对象(树形结构)组合成组合对象，并一致对待两者，达到层层组合成大型复杂功能的对象
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class CompositeTest {

    @Test
    public void compositeTest() {
        Company sgm = new ConcreateCompany("上汽通用");
        Company sgmIT = new ITDepartment("IT部门");
        Company sgmFinance = new FinanceDepartment("财务部门");

        Company patac = new ConcreateCompany("子公司泛亚");
        Company patacIT = new ITDepartment("泛亚IT部门");
        Company patacFinance = new FinanceDepartment("泛亚财务部门");

        sgm.add(sgmIT);
        sgm.add(sgmFinance);
        sgm.add(patac);
        patac.add(patacIT);
        patac.add(patacFinance);

        System.out.println("-----组织架构-----");
        sgm.display(0);
        System.out.println("-----组织职能-----");
        sgm.performDuty();
    }
}
