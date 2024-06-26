package StaticClassesEnumsExceptions;

import org.example.Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static StaticClassesEnumsExceptions.Calculator.logger;

public class main {

    public static void main(String[] args) {


//        double result = Calculator.calculate(2, 3, Calculator.Type.MULTIPLICATION);
//        System.out.println("result:" + result);

        double result = Calculator.calculate(2, 3, Calculator.Type.MULTIPLICATION);
        Logger logger = null;
        logger.info ("result: " + result);

        //   try {
//            result = Calculator.calculate(22, 3,null);
//            System.out.println("result is: " + result);
        //   }
        //   catch(Exception err){
        //   System.out.println("Something bad has happend :" );

        //   }


//        result = Calculator.calculate(55, 3, Calculator.Type.DIVISION);
//        System.out.println("result:" + result);

        result = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
        logger.info("result:" + result);

        result = Calculator.calculate(33, 3, Calculator.Type.DIVISION);
        logger.info("result:" + result);

    }
}
