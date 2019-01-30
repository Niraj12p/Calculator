package service.impl;

import dao.CalculatorDao;
import dao.impl.CalculatorDaoImpl;
import service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    CalculatorDao calculatorDao=new CalculatorDaoImpl();
    public int addition(int a, int b) {
        return calculatorDao.addition(a,b) ;
    }

    public int subtraction(int a, int b) {
        return calculatorDao.subtraction(a,b);
    }

    public int multiplication(int a, int b) {
        return calculatorDao.multiplication(a,b);
    }

    public int division(int a, int b) {
        return calculatorDao.division(a,b);
    }
}
